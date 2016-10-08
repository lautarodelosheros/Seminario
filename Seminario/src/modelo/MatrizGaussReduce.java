package modelo;

import org.ejml.alg.dense.misc.RrefGaussJordanRowPivot;
import org.ejml.simple.SimpleMatrix;

public class MatrizGaussReduce {
	private SimpleMatrix matrizGauss;
	private int nroEcuaciones;
	private int maxNroEcuaciones;
	private int maxNroVariables;

	public MatrizGaussReduce(int nroEcuaciones, int nroVariables) {
		// TODO Auto-generated constructor stub
		this.matrizGauss = new SimpleMatrix(nroEcuaciones, nroVariables + 1);
		this.maxNroEcuaciones = nroEcuaciones;
		this.maxNroVariables = nroVariables;
		this.nroEcuaciones = 0;
	}
	
	public void agregarVectorEcuacion(MiVector vectorUI, MiVector vectorUD) {
		if (this.maxNroVariables == 5 && this.maxNroEcuaciones == 5)
			agregarVectorEcuacionCincoVariables(vectorUI, vectorUD);
		
		if (this.maxNroVariables == 9 && this.maxNroEcuaciones == 9)
			agregarVectorEcuacionNueveVariables(vectorUI, vectorUD);		
		
		if ((this.maxNroVariables > 9 && this.maxNroEcuaciones == 9)
				|| (this.maxNroVariables > 5 && this.maxNroEcuaciones == 5))
			System.out.println("Error public void agregarVectorEcuacion(MiVector Vector)");
		
	}
	
	public void resolver() {		
		RrefGaussJordanRowPivot unGauss = new RrefGaussJordanRowPivot();
		//this.matrizGauss.print();
		unGauss.reduce(this.matrizGauss.getMatrix(), this.maxNroVariables);
		//this.matrizGauss.print();
	}
	
	public double getBetaIzq() {
		SimpleMatrix Identidad = this.matrizGauss.extractMatrix(0, maxNroEcuaciones, 0, maxNroVariables);
		
		if (Identidad.determinant() == 1	&& 
				Identidad.trace() == Identidad.numCols()) {
			return this.matrizGauss.get(0, 5);
		}
		
		return 0;
	}
	
	public double getGammaIzq() {
		SimpleMatrix Identidad = this.matrizGauss.extractMatrix(0, maxNroEcuaciones, 0, maxNroVariables);
		
		if (Identidad.determinant() == 1	&& 
				Identidad.trace() == Identidad.numCols()) {
			return this.matrizGauss.get(1, 5);
		}
		
		return 0;
	}
	
	public double getAlfaDer() {
		SimpleMatrix Identidad = this.matrizGauss.extractMatrix(0, maxNroEcuaciones, 0, maxNroVariables);
		
		if (Identidad.determinant() == 1	&& 
				Identidad.trace() == Identidad.numCols()) {
			return this.matrizGauss.get(2, 5);
		}
		
		return 0;
	}
	
	public double getBetaDer() {
		SimpleMatrix Identidad = this.matrizGauss.extractMatrix(0, maxNroEcuaciones, 0, maxNroVariables);
		
		if (Identidad.determinant() == 1	&& 
				Identidad.trace() == Identidad.numCols()) {
			return this.matrizGauss.get(3, 5);
		}
		
		return 0;
	}
	
	public double getGammaDer() {
		SimpleMatrix Identidad = this.matrizGauss.extractMatrix(0, maxNroEcuaciones, 0, maxNroVariables);
		
		if (Identidad.determinant() == 1	&& 
				Identidad.trace() == Identidad.numCols()) {
			return this.matrizGauss.get(4, 5);
		}
		
		return 0;
	}

	private void agregarVectorEcuacionNueveVariables(MiVector vectorUI, MiVector vectorUD) {
		// TODO Auto-generated method stub
	}

	private void agregarVectorEcuacionCincoVariables(MiVector vectorUI, MiVector vectorUD) {
		/*
		 * beta i = vd * ui  -> ai0
		 * gamma i = -ui     -> ai1
		 * alfa d = -1       -> ai2
		 * beta d = -vi * ud -> ai3
		 * gamma d = ud      -> ai4
		 * R = vd - vi       -> ai5
		 */
		this.matrizGauss.set(this.nroEcuaciones, 0, 
				vectorUI.getComponenteX() * vectorUD.getComponenteY());
		this.matrizGauss.set(this.nroEcuaciones, 1, 
				vectorUI.getComponenteX() * -1);
		this.matrizGauss.set(this.nroEcuaciones, 2, -1);
		this.matrizGauss.set(this.nroEcuaciones, 3, 
				vectorUI.getComponenteY() * vectorUD.getComponenteX() * -1);
		this.matrizGauss.set(this.nroEcuaciones, 4, 
				vectorUD.getComponenteX());
		this.matrizGauss.set(this.nroEcuaciones, 5, 
				vectorUD.getComponenteY() - vectorUI.getComponenteY());
		this.nroEcuaciones++;
	}

}
