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
	
	private MatrizVector getVectorResultado() throws Exception {
		return new MatrizVector(this.matrizGauss.extractVector(false, this.matrizGauss.numCols() - 1));
	}
	
	public double getBetaIzq() throws Exception {
		SimpleMatrix Identidad = this.matrizGauss.extractMatrix(0, nroEcuaciones, 0, nroVariables);
		
		if (Identidad.determinant() == 1	&& 
				Identidad.trace() == Identidad.numCols()) {
			MatrizVector res = getVectorResultado();
			if (res.getDimension() == 5)
				return res.getComponenteN(0);
			if (res.getDimension() == 9)
				return res.getComponenteN(6);
		}
		
		return 0;
	}
	
	public double getGammaIzq() throws Exception {
		SimpleMatrix Identidad = this.matrizGauss.extractMatrix(0, nroEcuaciones, 0, nroVariables);
		
		if (Identidad.determinant() == 1	&& 
				Identidad.trace() == Identidad.numCols()) {
			MatrizVector res = getVectorResultado();
			if (res.getDimension() == 5)
				return res.getComponenteN(1);
			if (res.getDimension() == 9)
				return res.getComponenteN(2);
		}
		
		return 0;
	}
	
	public double getAlfaDer() throws Exception {
		SimpleMatrix Identidad = this.matrizGauss.extractMatrix(0, nroEcuaciones, 0, nroVariables);
		
		if (Identidad.determinant() == 1	&& 
				Identidad.trace() == Identidad.numCols()) {
			MatrizVector res = getVectorResultado();
			if (res.getDimension() == 5)
				return res.getComponenteN(2);
			if (res.getDimension() == 9)
				return res.getComponenteN(8);
		}
		
		return 0;
	}
	
	public double getBetaDer() throws Exception {
		SimpleMatrix Identidad = this.matrizGauss.extractMatrix(0, nroEcuaciones, 0, nroVariables);
		
		if (Identidad.determinant() == 1	&& 
				Identidad.trace() == Identidad.numCols()) {
			MatrizVector res = getVectorResultado();
			if (res.getDimension() == 5)
				return res.getComponenteN(3);
			if (res.getDimension() == 9)
				return res.getComponenteN(3);
		}
		
		return 0;
	}
	
	public double getGammaDer() throws Exception {
		SimpleMatrix Identidad = this.matrizGauss.extractMatrix(0, nroEcuaciones, 0, nroVariables);
		
		if (Identidad.determinant() == 1	&& 
				Identidad.trace() == Identidad.numCols()) {
			MatrizVector res = getVectorResultado();
			if (res.getDimension() == 5)
				return res.getComponenteN(4);
			if (res.getDimension() == 9)
				return res.getComponenteN(5);
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
