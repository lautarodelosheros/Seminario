package modelo;

public class VectorEcuacionNueveVariables  extends VectorEcuacion {

	public VectorEcuacionNueveVariables(MatrizVector vectorUI, MatrizVector vectorUD) throws Exception {
		// TODO Auto-generated constructor stub
		super(vectorUI, vectorUD);
	}

	@Override
	protected void generarVectorEcuacion(MatrizVector vectorUI,
			MatrizVector vectorUD) {
		// TODO Auto-generated method stub
		/*
		 * (gammai * betad) a = -ui * ud
		 * (gammai * alfad) b = ui * vd
		 * gamma i = -ui
		 * beta d = -vi * ud
		 * (gammad * betai) c = ud * ui
		 * gamma d = ud
		 * beta i = vd * ui
		 * (alfad * betai) d = ui
		 * alfa d = 1
		 * 
		 * R = vi - vd
		 */
		this.vectorEcuacion = new MatrizVector(
				vectorUI.getComponenteX() * vectorUD.getComponenteX() * -1,
				vectorUI.getComponenteX() * vectorUD.getComponenteY(),
				vectorUI.getComponenteX() * -1,
				vectorUI.getComponenteY() * vectorUD.getComponenteX() * -1,
				vectorUI.getComponenteX() * vectorUD.getComponenteX(),
				vectorUD.getComponenteX(),
				vectorUD.getComponenteY() * vectorUI.getComponenteX(),
				vectorUI.getComponenteX(),
				1,
				vectorUI.getComponenteY() - vectorUD.getComponenteY());
		
	}

}
