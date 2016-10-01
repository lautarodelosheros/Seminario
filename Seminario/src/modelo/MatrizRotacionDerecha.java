package modelo;

import org.ejml.simple.SimpleMatrix;

public class MatrizRotacionDerecha extends MatrizRotacion {

	public MatrizRotacionDerecha(double anguloEnX, double anguloEnY,
			double anguloEnZ) {
		super(anguloEnX, anguloEnY, anguloEnZ);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void crearMatrizRotacion(SimpleMatrix matrizRotacion,
			SimpleMatrix matrizX, SimpleMatrix matrizY, SimpleMatrix matrizZ) {
		// TODO Auto-generated method stub
		this.matrizRotacion = this.matrizY.mult(this.matrizX).mult(this.matrizZ);
	}

}
