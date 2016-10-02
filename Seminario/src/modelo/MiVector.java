package modelo;

import org.ejml.simple.SimpleMatrix;

public class MiVector {
	private SimpleMatrix vector;

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

	public MiVector sumar(MiVector vector) {
		return new MiVector(this.vector.plus(vector.getOnSimpleMatrix()));
	}

	public MiVector restar(MiVector vector) {
		return new MiVector(this.vector.minus(vector.getOnSimpleMatrix()));
	}

	public String toString() {
		return this.vector.toString();
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

	public MiVector dividirPorEscalar(double divisor) {
		this.vector.set(0, 0, this.vector.get(0, 0) / divisor);
		this.vector.set(1, 0, this.vector.get(1, 0) / divisor);
		this.vector.set(2, 0, this.vector.get(2, 0) / divisor);
		return this;
	}

}
