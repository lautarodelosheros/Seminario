package modelo;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.ejml.simple.SimpleMatrix;

public class MatrizVector {
	private SimpleMatrix vector;

	public MatrizVector(double x, double y, double z, double... n) {
		// TODO Auto-generated constructor stub
		int pos = 0;
		this.vector = new SimpleMatrix(3 + n.length, 1);
		this.vector.set(pos++, 0, x);
		this.vector.set(pos++, 0, y);
		this.vector.set(pos++, 0, z);
		
		for (int nPos = 0; nPos < n.length; nPos++)
			this.vector.set(pos++, 0, n[nPos]);
	}

	public MatrizVector(SimpleMatrix vector) throws Exception {
		// TODO Auto-generated constructor stub
		if (vector.isVector())
			this.vector = new SimpleMatrix(vector);
		else
			throw new Exception("MiVector(SimpleMatrix vector): No es un vector");
	}

	public SimpleMatrix getOnSimpleMatrix() {
		// TODO Auto-generated method stub
		return this.vector;
	}

	public MatrizVector sumar(MatrizVector vector) throws Exception {
		return new MatrizVector(this.vector.plus(vector.getOnSimpleMatrix()));
	}

	public MatrizVector restar(MatrizVector vector) throws Exception {
		return new MatrizVector(this.vector.minus(vector.getOnSimpleMatrix()));
	}

	public String toString() {
		ByteArrayOutputStream sVector = new ByteArrayOutputStream();
		
		PrintStream salidaEstandar = System.out;
		PrintStream salidaString = new PrintStream(sVector);
		System.setOut(salidaString);
		this.vector.print(10, 10);
		System.out.flush();
		System.setOut(salidaEstandar);
		
		return sVector.toString();
	}

	public double getComponenteX() {
		return this.vector.get(0, 0);
	}

	public double getComponenteY() {
		return this.vector.get(1, 0);
	}

	public double getComponenteZ() {
		return this.vector.get(2, 0);
	}
	
	public double getComponenteN(int nPos) {
		return this.vector.get(nPos, 0);
	}

	public MatrizVector dividirPorEscalar(double divisor) throws Exception {
		return new MatrizVector(this.vector.divide(divisor));
	}

	public double[] getOnArray() {
		// TODO Auto-generated method stub
		double[] arrayComponentes = new double[this.vector.numCols() * this.vector.numRows()];
		
		int i = 0;
		
		for (int c = 0; c < this.vector.numCols(); c++)
			for (int r = 0; r < this.vector.numRows(); r++)
				arrayComponentes[i++] = this.vector.get(r, c);
		
		return arrayComponentes;
	}

	public int getDimension() {
		// TODO Auto-generated method stub
		return this.vector.numRows();
	}

}
