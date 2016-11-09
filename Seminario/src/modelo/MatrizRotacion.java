package modelo;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
		/*this.matrizX = new SimpleMatrix(3,3);
		
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
		this.matrizZ.set(2, 2, 1.0);*/
				
		crearMatrizRotacion(this.matrizRotacion, matrizX, matrizY, matrizZ);
	}
	
	protected abstract void crearMatrizRotacion(SimpleMatrix matrizRotacion,
			SimpleMatrix matrizX, SimpleMatrix matrizY,
			SimpleMatrix matrizZ);

	public String toString() {
		ByteArrayOutputStream sMatrizRotcion = new ByteArrayOutputStream();
		
		PrintStream salidaEstandar = System.out;
		PrintStream salidaString = new PrintStream(sMatrizRotcion);
		System.setOut(salidaString);
		this.matrizRotacion.print(10, 10);
		System.out.flush();
		System.setOut(salidaEstandar);
		
		return sMatrizRotcion.toString();
	
	}
	
	public MatrizVector rotarVector(MatrizVector vector) throws Exception {
		if (vector.getOnSimpleMatrix().numRows() > 3)
			throw new Exception("rotarVector(MiVector vector) : Dimension invalida");
		return new MatrizVector(this.matrizRotacion.mult(vector.getOnSimpleMatrix()));
	}
	
	public ArrayList<MatrizVector> rotarVectores(ArrayList<MatrizVector> vectores) throws Exception {
		ArrayList<MatrizVector> vectoresRotados = new ArrayList<MatrizVector>();
		
		Iterator<MatrizVector> itVecRot = vectores.iterator();
		
		while (itVecRot.hasNext()) {
			vectoresRotados.add(rotarVector(itVecRot.next()));
		}
				
		return vectoresRotados;
	}
	
	public double getTraza() {
		return this.matrizRotacion.trace();
	}
	
	public SimpleMatrix getOnSimpleMatrix() {
		return this.matrizRotacion;
	}

}
