package modelo;

public abstract class VectorEcuacion {
	protected MatrizVector vectorEcuacion;

	public VectorEcuacion(MatrizVector vectorUI, MatrizVector vectorUD) throws Exception {
		// TODO Auto-generated constructor stub
		generarVectorEcuacion(vectorUI, vectorUD);
	}
	
	public MatrizVector getVectorEcuacion() {
		return this.vectorEcuacion;
	}
	
	protected abstract void generarVectorEcuacion(MatrizVector vectorUI, MatrizVector vectorUD);

	public int getDimension() {
		// TODO Auto-generated method stub
		return this.vectorEcuacion.getDimension();
	}

}
