package modelo;

import org.ejml.simple.SimpleMatrix;

public class MiVector {
	SimpleMatrix vector;

	public MiVector(double x, double y, double z) {
		// TODO Auto-generated constructor stub
		this.vector = new SimpleMatrix(3, 1);
		this.vector.set(0, 0, x);
		this.vector.set(1, 0, y);
		this.vector.set(2, 0, z);
	}

	public MiVector(SimpleMatrix vector) {
		// TODO Auto-generated constructor stub
		this.vector = new SimpleMatrix(3, 1);
		this.vector.set(vector);
	}

	public SimpleMatrix getOnSimpleMatrix() {
		// TODO Auto-generated method stub
		return this.vector;
	}
	
	public void imprimir() {
		this.vector.print();
	}

}
