package modelo;

public class VectorEcuacionCincoVariables extends VectorEcuacion {

	public VectorEcuacionCincoVariables(MatrizVector vectorUI, MatrizVector vectorUD) throws Exception {
		// TODO Auto-generated constructor stub
		super(vectorUI, vectorUD);
	}

	@Override
	protected void generarVectorEcuacion(MatrizVector vectorUI,
			MatrizVector vectorUD) {
		// TODO Auto-generated method stub
		/*
		 * beta i = vd * ui  -> ai0
		 * gamma i = -ui     -> ai1
		 * alfa d = 1        -> ai2
		 * beta d = -vi * ud -> ai3
		 * gamma d = ud      -> ai4
		 * R = vi - vd       -> ai5
		 */
		this.vectorEcuacion = new MatrizVector(
				vectorUI.getComponenteX() * vectorUD.getComponenteY(),
				vectorUI.getComponenteX() * -1,
				(vectorUI.getComponenteY() * vectorUD.getComponenteY()) + 1,
				vectorUI.getComponenteY() * vectorUD.getComponenteX() * -1,
				vectorUD.getComponenteX(),
				vectorUI.getComponenteY() - vectorUD.getComponenteY());
		
		//this.vectorEcuacion.getOnSimpleMatrix().print(10, 10);
	}

}
