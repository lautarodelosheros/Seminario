package modelo;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.ejml.alg.dense.misc.RrefGaussJordanRowPivot;
import org.ejml.simple.SimpleMatrix;

public class MatrizGaussReduce {
	private SimpleMatrix matrizGauss;
	private int nroEcuaciones;
	private int nroVariables;
	private int cargaGauss;

	public MatrizGaussReduce(int nroEcuaciones, int nroVariables) {
		this.matrizGauss = new SimpleMatrix(nroEcuaciones, nroVariables + 1);
		this.nroEcuaciones = nroEcuaciones;
		this.nroVariables = nroVariables;
		this.cargaGauss = 0;
	}
	
	public void agregarVectorEcuacion(VectorEcuacion vectorEcuacion) throws Exception {
		if (vectorEcuacion.getDimension() != this.nroVariables + 1)
			throw new Exception("agregarVectorEcuacion(VectorEcuacion vectorEcuacion) : dimension invalida");
		
		for (int c = 0; c < vectorEcuacion.getDimension(); c++)
			this.matrizGauss.set(this.cargaGauss, c, vectorEcuacion.getVectorEcuacion().getComponenteN(c));
		
		this.cargaGauss++;
	}
	
	public void resolver() {		
		RrefGaussJordanRowPivot unGauss = new RrefGaussJordanRowPivot();
		unGauss.reduce(this.matrizGauss.getMatrix(), this.nroVariables);
	}
	
	// cambiar estos metodo hardcode	
	public double getBetaIzq() {
		SimpleMatrix Identidad = this.matrizGauss.extractMatrix(0, nroEcuaciones, 0, nroVariables);
		
		if (Identidad.determinant() == 1	&& 
				Identidad.trace() == Identidad.numCols()) {
			return this.matrizGauss.get(0, 5);
		}
		
		return 0;
	}
	
	public double getGammaIzq() {
		SimpleMatrix Identidad = this.matrizGauss.extractMatrix(0, nroEcuaciones, 0, nroVariables);
		
		if (Identidad.determinant() == 1	&& 
				Identidad.trace() == Identidad.numCols()) {
			return this.matrizGauss.get(1, 5);
		}
		
		return 0;
	}
	
	public double getAlfaDer() {
		SimpleMatrix Identidad = this.matrizGauss.extractMatrix(0, nroEcuaciones, 0, nroVariables);
		
		if (Identidad.determinant() == 1	&& 
				Identidad.trace() == Identidad.numCols()) {
			return this.matrizGauss.get(2, 5);
		}
		
		return 0;
	}
	
	public double getBetaDer() {
		SimpleMatrix Identidad = this.matrizGauss.extractMatrix(0, nroEcuaciones, 0, nroVariables);
		
		if (Identidad.determinant() == 1	&& 
				Identidad.trace() == Identidad.numCols()) {
			return this.matrizGauss.get(3, 5);
		}
		
		return 0;
	}
	
	public double getGammaDer() {
		SimpleMatrix Identidad = this.matrizGauss.extractMatrix(0, nroEcuaciones, 0, nroVariables);
		
		if (Identidad.determinant() == 1	&& 
				Identidad.trace() == Identidad.numCols()) {
			return this.matrizGauss.get(4, 5);
		}
		
		return 0;
	}
	
	public String toString() {
		ByteArrayOutputStream sMatrizGauss = new ByteArrayOutputStream();
		
		PrintStream salidaEstandar = System.out;
		PrintStream salidaString = new PrintStream(sMatrizGauss);
		System.setOut(salidaString);
		this.matrizGauss.print(10, 10);
		System.out.flush();
		System.setOut(salidaEstandar);
		
		return sMatrizGauss.toString();
	
	}

}
