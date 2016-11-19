package modelo;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.ejml.simple.SimpleMatrix;



public class MatrizRotacion {
	protected SimpleMatrix matrizRotacion;
	
	public MatrizRotacion(MatrizVector vectorUx, double theta) {
		this.matrizRotacion = new SimpleMatrix(3,3);
		
		SimpleMatrix matrizA = new SimpleMatrix(3,3);		
		
		matrizA.set(0, 0, 0.0);
		matrizA.set(0, 1, vectorUx.getComponenteN(2) * -1);
		matrizA.set(0, 2, vectorUx.getComponenteN(1));
		matrizA.set(1, 0, vectorUx.getComponenteN(2));
		matrizA.set(1, 1, 0.0);
		matrizA.set(1, 2, vectorUx.getComponenteN(0) * -1);
		matrizA.set(2, 0, vectorUx.getComponenteN(1) * -1);
		matrizA.set(2, 1, vectorUx.getComponenteN(0));
		matrizA.set(2, 2, 0.0);
		
		SimpleMatrix matrizSin = new SimpleMatrix(3,3);
		matrizSin.set(0, 0, Math.sin(theta));
		matrizSin.set(1, 0, Math.sin(theta));
		matrizSin.set(2, 0, Math.sin(theta));
		matrizSin.set(0, 1, Math.sin(theta));
		matrizSin.set(1, 1, Math.sin(theta));
		matrizSin.set(2, 1, Math.sin(theta));
		matrizSin.set(0, 2, Math.sin(theta));
		matrizSin.set(1, 2, Math.sin(theta));
		matrizSin.set(2, 2, Math.sin(theta));
		
		SimpleMatrix matrizCos = new SimpleMatrix(3,3);
		matrizCos.set(0, 0, 1 - Math.cos(theta));
		matrizCos.set(1, 0, 1 - Math.cos(theta));
		matrizCos.set(2, 0, 1 - Math.cos(theta));
		matrizCos.set(0, 1, 1 - Math.cos(theta));
		matrizCos.set(1, 1, 1 - Math.cos(theta));
		matrizCos.set(2, 1, 1 - Math.cos(theta));
		matrizCos.set(0, 2, 1 - Math.cos(theta));
		matrizCos.set(1, 2, 1 - Math.cos(theta));
		matrizCos.set(2, 2, 1 - Math.cos(theta));
		
		//R = I + Asin(theta) + AxA(1 - matrizCos(theta))
		this.matrizRotacion = SimpleMatrix.identity(3).plus(matrizA.elementMult(matrizSin)).plus(matrizA.mult(matrizA).elementMult(matrizCos));
		//this.matrizRotacion = SimpleMatrix.identity(3).plus(matrizA.elementMult(matrizSin));
	}
	
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
