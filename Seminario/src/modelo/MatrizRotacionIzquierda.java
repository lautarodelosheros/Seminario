package modelo;

import org.ejml.simple.SimpleMatrix;

public class MatrizRotacionIzquierda extends MatrizRotacion {

	public MatrizRotacionIzquierda(double anguloEnX, double anguloEnY,
			double anguloEnZ) {
		super(anguloEnX, anguloEnY, anguloEnZ);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void crearMatrizRotacion(SimpleMatrix matrizRotacion,
			SimpleMatrix matrizX, SimpleMatrix matrizY, SimpleMatrix matrizZ) {
		// TODO Auto-generated method stub
		this.matrizRotacion = this.matrizX.mult(this.matrizZ.mult(this.matrizY)); 
		
		this.matrizRotacion.set(1, 2, 0.0);
		this.matrizRotacion.set(2, 1, 0.0);
	}
		
}
