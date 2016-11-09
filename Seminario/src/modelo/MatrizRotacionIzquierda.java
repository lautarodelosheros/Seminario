package modelo;

import org.ejml.simple.SimpleMatrix;

public class MatrizRotacionIzquierda extends MatrizRotacion {
	private double aX;
	private double aY;
	private double aZ;
	
	public MatrizRotacionIzquierda(double anguloEnX, double anguloEnY,
			double anguloEnZ) {
		super(anguloEnX, anguloEnY, anguloEnZ);
		// TODO Auto-generated constructor stub
		aX = anguloEnX;
		aY = anguloEnY;
		aZ = anguloEnZ;
	}

	@Override
	protected void crearMatrizRotacion(SimpleMatrix matrizRotacion,
			SimpleMatrix matrizX, SimpleMatrix matrizR, SimpleMatrix matrizZ) {
		// TODO Auto-generated method stub
		/*this.matrizX.print();
		this.matrizY.print();
		this.matrizZ.print();*/
		
		//this.matrizRotacion = this.matrizX.mult(this.matrizZ).mult(this.matrizY).mult(this.matrizX.invert()); 
		
		/*this.matrizRotacion.set(1, 2, 0.0);
		this.matrizRotacion.set(2, 1, 0.0);*/
		
        matrizX = new SimpleMatrix(3,3);
		
		matrizX.set(0, 0, 1.0);
		matrizX.set(0, 1, (Math.sqrt(2) / 2) * -0.04);
		matrizX.set(0, 2, (Math.sqrt(2) / 2) * 0.04);
		matrizX.set(1, 0, (Math.sqrt(2) / 2) * 0.04);
		matrizX.set(1, 1, 1.0);
		matrizX.set(1, 2, 0.0);
		matrizX.set(2, 0, (Math.sqrt(2) / 2) * -0.04);
		matrizX.set(2, 1, 0.0);
		matrizX.set(2, 2, 1.0);
		
		//R = I + Asin(tita) + AxA(1 - cos(tita))
		double tita = Math.asin(Math.sqrt(Math.pow((Math.sqrt(2) / 2) * 0.04,2) + Math.pow((Math.sqrt(2) / 2) * 0.04, 2)));
		
		matrizR = new SimpleMatrix(3,3);
		matrizR = SimpleMatrix.identity(3).plus(matrizX.divide(1 / Math.sin(tita)));//.plus(matrizX.mult(matrizX).divide(1 / (1 - Math.cos(tita)))));
		
		System.out.println("tita izq orig: " + tita);
		
		this.matrizRotacion = matrizR;
	}
		
}
