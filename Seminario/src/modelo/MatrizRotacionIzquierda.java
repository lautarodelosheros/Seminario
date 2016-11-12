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
		
		matrizX.set(0, 0, 0.0);
		matrizX.set(0, 1, (Math.sqrt(2) / 2) * -1);// * -0.04001067435398893);
		matrizX.set(0, 2, (Math.sqrt(2) / 2));// * 0.04001067435398893);
		matrizX.set(1, 0, (Math.sqrt(2) / 2));// * 0.04001067435398893);
		matrizX.set(1, 1, 0.0);
		matrizX.set(1, 2, 0.0);
		matrizX.set(2, 0, (Math.sqrt(2) / 2) * -1);// * -0.04001067435398893);
		matrizX.set(2, 1, 0.0);
		matrizX.set(2, 2, 0.0);
		
		//R = I + Asin(tita) + AxA(1 - cos(tita))
		double tita = 0.04;//Math.asin(Math.sqrt(Math.pow((Math.sqrt(2) / 2) * 0.04001067435398893, 2)
				//+ Math.pow((Math.sqrt(2) / 2) * 0.04001067435398893, 2)));

		SimpleMatrix sin = new SimpleMatrix(3,3);
		sin.set(0, 0, Math.sin(tita));
		sin.set(1, 0, Math.sin(tita));
		sin.set(2, 0, Math.sin(tita));
		sin.set(0, 1, Math.sin(tita));
		sin.set(1, 1, Math.sin(tita));
		sin.set(2, 1, Math.sin(tita));
		sin.set(0, 2, Math.sin(tita));
		sin.set(1, 2, Math.sin(tita));
		sin.set(2, 2, Math.sin(tita));
		
		SimpleMatrix cos = new SimpleMatrix(3,3);
		cos.set(0, 0, 1 - Math.cos(tita));
		cos.set(1, 0, 1 - Math.cos(tita));
		cos.set(2, 0, 1 - Math.cos(tita));
		cos.set(0, 1, 1 - Math.cos(tita));
		cos.set(1, 1, 1 - Math.cos(tita));
		cos.set(2, 1, 1 - Math.cos(tita));
		cos.set(0, 2, 1 - Math.cos(tita));
		cos.set(1, 2, 1 - Math.cos(tita));
		cos.set(2, 2, 1 - Math.cos(tita));
		
		matrizR = new SimpleMatrix(3,3);
		matrizR = SimpleMatrix.identity(3).plus(matrizX.elementMult(sin));//.plus(matrizX.mult(matrizX).elementMult(cos));
		
		this.matrizRotacion = matrizR;
	}
		
}
