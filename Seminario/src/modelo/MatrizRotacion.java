package modelo;

import java.util.ArrayList;
import java.util.Iterator;

import org.ejml.simple.SimpleMatrix;



public abstract class MatrizRotacion {
	protected SimpleMatrix matrizRotacion;
	protected SimpleMatrix matrizX;
	protected SimpleMatrix matrizY;
	protected SimpleMatrix matrizZ;
	
	public MatrizRotacion(double anguloEnX, double anguloEnY, double anguloEnZ) {
		this.matrizRotacion = new SimpleMatrix(3,3);
		
		// add (fila, columna, valor)
		this.matrizX = new SimpleMatrix(3,3);
		
		this.matrizX.set(0, 0, 1.0);
		this.matrizX.set(0, 1, 0.0);
		this.matrizX.set(0, 2, 0.0);
		this.matrizX.set(1, 0, 0.0);
		this.matrizX.set(1, 1, Math.cos(anguloEnX));
		this.matrizX.set(1, 2, Math.sin(anguloEnX));
		this.matrizX.set(2, 0, 0.0);
		this.matrizX.set(2, 1, Math.sin(anguloEnX) * -1);
		this.matrizX.set(2, 2, Math.cos(anguloEnX));
		
		this.matrizY = new SimpleMatrix(3,3);
		this.matrizY.set(0, 0, Math.cos(anguloEnY));
		this.matrizY.set(0, 1, 0.0);		
		this.matrizY.set(0, 2, Math.sin(anguloEnY) * -1);
		this.matrizY.set(1, 0, 0.0);
		this.matrizY.set(1, 1, 1.0);
		this.matrizY.set(1, 2, 0.0);
		this.matrizY.set(2, 0, Math.sin(anguloEnY));
		this.matrizY.set(2, 1, 0.0);
		this.matrizY.set(2, 2, Math.cos(anguloEnY));		
		
		this.matrizZ = new SimpleMatrix(3,3);
		this.matrizZ.set(0, 0, Math.cos(anguloEnZ));
		this.matrizZ.set(0, 1, Math.sin(anguloEnZ));
		this.matrizZ.set(0, 2, 0.0);		
		this.matrizZ.set(1, 0, Math.sin(anguloEnZ) * -1);
		this.matrizZ.set(1, 1, Math.cos(anguloEnZ));
		this.matrizZ.set(1, 2, 0.0);
		this.matrizZ.set(2, 0, 0.0);
		this.matrizZ.set(2, 1, 0.0);
		this.matrizZ.set(2, 2, 1.0);
				
		crearMatrizRotacion(this.matrizRotacion, matrizX, matrizY, matrizZ);
	}
	
	protected abstract void crearMatrizRotacion(SimpleMatrix matrizRotacion,
			SimpleMatrix matrizX, SimpleMatrix matrizY,
			SimpleMatrix matrizZ);

	public void printMatrizRotacion() {
		this.matrizRotacion.print();
	}
	
	public MiVector rotarVector(MiVector vector) {
		return new MiVector(this.matrizRotacion.mult(vector.getOnSimpleMatrix()));
	}
	
	public ArrayList<MiVector> rotarVectores(ArrayList<MiVector> vectores) {
		ArrayList<MiVector> vectoresRotados = new ArrayList<MiVector>();
		
		Iterator<MiVector> itVecRot = vectores.iterator();
		
		while (itVecRot.hasNext()) {
			vectoresRotados.add(rotarVector(itVecRot.next()));
		}
				
		return vectoresRotados;
	}

}
