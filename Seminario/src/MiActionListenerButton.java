import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import parsii.eval.Parser;
import modelo.MatrizGaussReduce;
import modelo.MatrizRotacion;
import modelo.MatrizVector;
import modelo.ResultadoError;
import modelo.VectorEcuacionCincoVariables;
import modelo.VectorEcuacionNueveVariables;

public class MiActionListenerButton implements ActionListener {
	private static final boolean MOSTAR_DUMP = false;
	private Form formulario;

	public MiActionListenerButton(Form formulario) {
		// TODO Auto-generated constructor stub
		this.formulario = formulario;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		botonPresionado();
	}

	private void botonPresionado() {
		// TODO Auto-generated method stub
		try {

			mostrarTexto("Versor Izquierdo");
			mostrarTexto(new MatrizVector(Parser.parse(
					this.formulario.getTxtRxi().getText()).evaluate(), Parser
					.parse(this.formulario.getTxtRyi().getText()).evaluate(),
					Parser.parse(this.formulario.getTxtRzi().getText())
							.evaluate()).toString());

			// Matriz de rotacion izquierda
			MatrizRotacion mRI = new MatrizRotacion(new MatrizVector(Parser
					.parse(this.formulario.getTxtRxi().getText()).evaluate(),
					Parser.parse(this.formulario.getTxtRyi().getText())
							.evaluate(), Parser.parse(
							this.formulario.getTxtRzi().getText()).evaluate()),
					new Double(this.formulario.getTxtThetaI().getText()));

			mostrarTextoExtra(mRI.toString());

			mostrarTexto("Versor Derecho");
			mostrarTexto(new MatrizVector(Parser.parse(
					this.formulario.getTxtRxd().getText()).evaluate(), Parser
					.parse(this.formulario.getTxtRyd().getText()).evaluate(),
					Parser.parse(this.formulario.getTxtRzd().getText())
							.evaluate()).toString());

			// Matriz de rotacion derecha
			MatrizRotacion mRD = new MatrizRotacion(new MatrizVector(Parser
					.parse(this.formulario.getTxtRxd().getText()).evaluate(),
					Parser.parse(this.formulario.getTxtRyd().getText())
							.evaluate(), Parser.parse(
							this.formulario.getTxtRzd().getText()).evaluate()),
					new Double(this.formulario.getTxtThetaD().getText()));

			mostrarTextoExtra(mRD.toString());

			// Vector posicion de la camara izquierda
			MatrizVector sVectorI = new MatrizVector(Parser.parse(
					this.formulario.getTxtSxi().getText()).evaluate(), Parser
					.parse(this.formulario.getTxtSyi().getText()).evaluate(),
					Parser.parse(this.formulario.getTxtSzi().getText())
							.evaluate());

			mostrarTextoExtra(sVectorI.toString());

			// Vector posicion de la camara derecha
			MatrizVector sVectorD = new MatrizVector(Parser.parse(
					this.formulario.getTxtSxd().getText()).evaluate(), Parser
					.parse(this.formulario.getTxtSyd().getText()).evaluate(),
					Parser.parse(this.formulario.getTxtSzd().getText())
							.evaluate());

			mostrarTextoExtra(sVectorD.toString());

			// Vectores de puntos referenciales
			MatrizVector m1Vector = new MatrizVector(Parser.parse(
					this.formulario.getTxtM1x().getText()).evaluate(), Parser
					.parse(this.formulario.getTxtM1y().getText()).evaluate(),
					Parser.parse(this.formulario.getTxtM1z().getText())
							.evaluate());

			mostrarTextoExtra(m1Vector.toString());

			MatrizVector m2Vector = new MatrizVector(Parser.parse(
					this.formulario.getTxtM2x().getText()).evaluate(), Parser
					.parse(this.formulario.getTxtM2y().getText()).evaluate(),
					Parser.parse(this.formulario.getTxtM2z().getText())
							.evaluate());

			mostrarTextoExtra(m2Vector.toString());

			MatrizVector m3Vector = new MatrizVector(Parser.parse(
					this.formulario.getTxtM3x().getText()).evaluate(), Parser
					.parse(this.formulario.getTxtM3y().getText()).evaluate(),
					Parser.parse(this.formulario.getTxtM3z().getText())
							.evaluate());

			mostrarTextoExtra(m3Vector.toString());

			MatrizVector m4Vector = new MatrizVector(Parser.parse(
					this.formulario.getTxtM4x().getText()).evaluate(), Parser
					.parse(this.formulario.getTxtM4y().getText()).evaluate(),
					Parser.parse(this.formulario.getTxtM4z().getText())
							.evaluate());

			mostrarTextoExtra(m4Vector.toString());

			MatrizVector m5Vector = new MatrizVector(Parser.parse(
					this.formulario.getTxtM5x().getText()).evaluate(), Parser
					.parse(this.formulario.getTxtM5y().getText()).evaluate(),
					Parser.parse(this.formulario.getTxtM5z().getText())
							.evaluate());

			mostrarTextoExtra(m5Vector.toString());

			// Vectores rotados
			mostrarTextoExtra(mRI.rotarVector(m1Vector.restar(sVectorI))
					.toString());
			mostrarTextoExtra(mRI.rotarVector(m2Vector.restar(sVectorI))
					.toString());
			mostrarTextoExtra(mRI.rotarVector(m3Vector.restar(sVectorI))
					.toString());
			mostrarTextoExtra(mRI.rotarVector(m4Vector.restar(sVectorI))
					.toString());
			mostrarTextoExtra(mRI.rotarVector(m5Vector.restar(sVectorI))
					.toString());

			mostrarTextoExtra(mRD.rotarVector(m1Vector.restar(sVectorD))
					.toString());
			mostrarTextoExtra(mRD.rotarVector(m2Vector.restar(sVectorD))
					.toString());
			mostrarTextoExtra(mRD.rotarVector(m3Vector.restar(sVectorD))
					.toString());
			mostrarTextoExtra(mRD.rotarVector(m4Vector.restar(sVectorD))
					.toString());
			mostrarTextoExtra(mRD.rotarVector(m5Vector.restar(sVectorD))
					.toString());

			// Vectores rotados y dividos por la componente Z
			mostrarTextoExtra(mRI
					.rotarVector(m1Vector.restar(sVectorI))
					.dividirPorEscalar(
							mRI.rotarVector(m1Vector.restar(sVectorI))
									.getComponenteZ()).toString());
			mostrarTextoExtra(mRI
					.rotarVector(m2Vector.restar(sVectorI))
					.dividirPorEscalar(
							mRI.rotarVector(m2Vector.restar(sVectorI))
									.getComponenteZ()).toString());
			mostrarTextoExtra(mRI
					.rotarVector(m3Vector.restar(sVectorI))
					.dividirPorEscalar(
							mRI.rotarVector(m3Vector.restar(sVectorI))
									.getComponenteZ()).toString());
			mostrarTextoExtra(mRI
					.rotarVector(m4Vector.restar(sVectorI))
					.dividirPorEscalar(
							mRI.rotarVector(m4Vector.restar(sVectorI))
									.getComponenteZ()).toString());
			mostrarTextoExtra(mRI
					.rotarVector(m5Vector.restar(sVectorI))
					.dividirPorEscalar(
							mRI.rotarVector(m5Vector.restar(sVectorI))
									.getComponenteZ()).toString());

			mostrarTextoExtra(mRD
					.rotarVector(m1Vector.restar(sVectorD))
					.dividirPorEscalar(
							mRD.rotarVector(m1Vector.restar(sVectorD))
									.getComponenteZ()).toString());
			mostrarTextoExtra(mRD
					.rotarVector(m2Vector.restar(sVectorD))
					.dividirPorEscalar(
							mRD.rotarVector(m2Vector.restar(sVectorD))
									.getComponenteZ()).toString());
			mostrarTextoExtra(mRD
					.rotarVector(m3Vector.restar(sVectorD))
					.dividirPorEscalar(
							mRD.rotarVector(m3Vector.restar(sVectorD))
									.getComponenteZ()).toString());
			mostrarTextoExtra(mRD
					.rotarVector(m4Vector.restar(sVectorD))
					.dividirPorEscalar(
							mRD.rotarVector(m4Vector.restar(sVectorD))
									.getComponenteZ()).toString());
			mostrarTextoExtra(mRD
					.rotarVector(m5Vector.restar(sVectorD))
					.dividirPorEscalar(
							mRD.rotarVector(m5Vector.restar(sVectorD))
									.getComponenteZ()).toString());

			MatrizGaussReduce mGR;

			if (this.formulario.isCincoIncognitas()) {
				mGR = new MatrizGaussReduce(5, 5);

				mGR.agregarVectorEcuacion(new VectorEcuacionCincoVariables(mRI
						.rotarVector(m1Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m1Vector.restar(sVectorI))
										.getComponenteZ()), mRD.rotarVector(
						m1Vector.restar(sVectorD)).dividirPorEscalar(
						mRD.rotarVector(m1Vector.restar(sVectorD))
								.getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionCincoVariables(mRI
						.rotarVector(m2Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m2Vector.restar(sVectorI))
										.getComponenteZ()), mRD.rotarVector(
						m2Vector.restar(sVectorD)).dividirPorEscalar(
						mRD.rotarVector(m2Vector.restar(sVectorD))
								.getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionCincoVariables(mRI
						.rotarVector(m3Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m3Vector.restar(sVectorI))
										.getComponenteZ()), mRD.rotarVector(
						m3Vector.restar(sVectorD)).dividirPorEscalar(
						mRD.rotarVector(m3Vector.restar(sVectorD))
								.getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionCincoVariables(mRI
						.rotarVector(m4Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m4Vector.restar(sVectorI))
										.getComponenteZ()), mRD.rotarVector(
						m4Vector.restar(sVectorD)).dividirPorEscalar(
						mRD.rotarVector(m4Vector.restar(sVectorD))
								.getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionCincoVariables(mRI
						.rotarVector(m5Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m5Vector.restar(sVectorI))
										.getComponenteZ()), mRD.rotarVector(
						m5Vector.restar(sVectorD)).dividirPorEscalar(
						mRD.rotarVector(m5Vector.restar(sVectorD))
								.getComponenteZ())));
			} else {
				mGR = new MatrizGaussReduce(9, 9);

				MatrizVector m6Vector = new MatrizVector(Parser.parse(
						this.formulario.getTxtM6x().getText()).evaluate(),
						Parser.parse(this.formulario.getTxtM6y().getText())
								.evaluate(), Parser.parse(
								this.formulario.getTxtM6z().getText())
								.evaluate());
				MatrizVector m7Vector = new MatrizVector(Parser.parse(
						this.formulario.getTxtM7x().getText()).evaluate(),
						Parser.parse(this.formulario.getTxtM7y().getText())
								.evaluate(), Parser.parse(
								this.formulario.getTxtM7z().getText())
								.evaluate());
				MatrizVector m8Vector = new MatrizVector(Parser.parse(
						this.formulario.getTxtM8x().getText()).evaluate(),
						Parser.parse(this.formulario.getTxtM8y().getText())
								.evaluate(), Parser.parse(
								this.formulario.getTxtM8z().getText())
								.evaluate());
				MatrizVector m9Vector = new MatrizVector(Parser.parse(
						this.formulario.getTxtM9x().getText()).evaluate(),
						Parser.parse(this.formulario.getTxtM9y().getText())
								.evaluate(), Parser.parse(
								this.formulario.getTxtM9z().getText())
								.evaluate());

				mostrarTextoExtra(mRI
						.rotarVector(m6Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m6Vector.restar(sVectorI))
										.getComponenteZ()).toString());
				mostrarTextoExtra(mRI
						.rotarVector(m7Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m7Vector.restar(sVectorI))
										.getComponenteZ()).toString());
				mostrarTextoExtra(mRI
						.rotarVector(m8Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m8Vector.restar(sVectorI))
										.getComponenteZ()).toString());
				mostrarTextoExtra(mRI
						.rotarVector(m9Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m9Vector.restar(sVectorI))
										.getComponenteZ()).toString());

				mostrarTextoExtra(mRD
						.rotarVector(m6Vector.restar(sVectorD))
						.dividirPorEscalar(
								mRI.rotarVector(m6Vector.restar(sVectorD))
										.getComponenteZ()).toString());
				mostrarTextoExtra(mRD
						.rotarVector(m7Vector.restar(sVectorD))
						.dividirPorEscalar(
								mRI.rotarVector(m7Vector.restar(sVectorD))
										.getComponenteZ()).toString());
				mostrarTextoExtra(mRD
						.rotarVector(m8Vector.restar(sVectorD))
						.dividirPorEscalar(
								mRI.rotarVector(m8Vector.restar(sVectorD))
										.getComponenteZ()).toString());
				mostrarTextoExtra(mRD
						.rotarVector(m9Vector.restar(sVectorD))
						.dividirPorEscalar(
								mRI.rotarVector(m9Vector.restar(sVectorD))
										.getComponenteZ()).toString());

				mGR.agregarVectorEcuacion(new VectorEcuacionNueveVariables(mRI
						.rotarVector(m1Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m1Vector.restar(sVectorI))
										.getComponenteZ()), mRD.rotarVector(
						m1Vector.restar(sVectorD)).dividirPorEscalar(
						mRD.rotarVector(m1Vector.restar(sVectorD))
								.getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionNueveVariables(mRI
						.rotarVector(m2Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m2Vector.restar(sVectorI))
										.getComponenteZ()), mRD.rotarVector(
						m2Vector.restar(sVectorD)).dividirPorEscalar(
						mRD.rotarVector(m2Vector.restar(sVectorD))
								.getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionNueveVariables(mRI
						.rotarVector(m3Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m3Vector.restar(sVectorI))
										.getComponenteZ()), mRD.rotarVector(
						m3Vector.restar(sVectorD)).dividirPorEscalar(
						mRD.rotarVector(m3Vector.restar(sVectorD))
								.getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionNueveVariables(mRI
						.rotarVector(m4Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m4Vector.restar(sVectorI))
										.getComponenteZ()), mRD.rotarVector(
						m4Vector.restar(sVectorD)).dividirPorEscalar(
						mRD.rotarVector(m4Vector.restar(sVectorD))
								.getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionNueveVariables(mRI
						.rotarVector(m5Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m5Vector.restar(sVectorI))
										.getComponenteZ()), mRD.rotarVector(
						m5Vector.restar(sVectorD)).dividirPorEscalar(
						mRD.rotarVector(m5Vector.restar(sVectorD))
								.getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionNueveVariables(mRI
						.rotarVector(m6Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m6Vector.restar(sVectorI))
										.getComponenteZ()), mRD.rotarVector(
						m6Vector.restar(sVectorD)).dividirPorEscalar(
						mRD.rotarVector(m6Vector.restar(sVectorD))
								.getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionNueveVariables(mRI
						.rotarVector(m7Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m7Vector.restar(sVectorI))
										.getComponenteZ()), mRD.rotarVector(
						m7Vector.restar(sVectorD)).dividirPorEscalar(
						mRD.rotarVector(m7Vector.restar(sVectorD))
								.getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionNueveVariables(mRI
						.rotarVector(m8Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m8Vector.restar(sVectorI))
										.getComponenteZ()), mRD.rotarVector(
						m8Vector.restar(sVectorD)).dividirPorEscalar(
						mRD.rotarVector(m8Vector.restar(sVectorD))
								.getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionNueveVariables(mRI
						.rotarVector(m9Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m9Vector.restar(sVectorI))
										.getComponenteZ()), mRD.rotarVector(
						m9Vector.restar(sVectorD)).dividirPorEscalar(
						mRD.rotarVector(m9Vector.restar(sVectorD))
								.getComponenteZ())));
			}

			mostrarTextoExtra(mGR.toString());

			mGR.resolver();

			mostrarTextoExtra(mGR.toString());

			mostrarTextoExtra("beta Izq: " + mGR.getBetaIzq() + "\n");
			mostrarTextoExtra("gamma Izq: " + mGR.getGammaIzq() + "\n");
			mostrarTextoExtra("alfa Der: " + mGR.getAlfaDer() + "\n");
			mostrarTextoExtra("beta Der: " + mGR.getBetaDer() + "\n");
			mostrarTextoExtra("gamma Der: " + mGR.getGammaDer() + "\n");

			ResultadoError Re = new ResultadoError(Math.abs(mGR.getBetaIzq()),
					Math.abs(mGR.getGammaIzq()), Math.abs(mGR.getAlfaDer()),
					Math.abs(mGR.getBetaDer()), Math.abs(mGR.getGammaDer()),
					mRI.getOnSimpleMatrix(), mRD.getOnSimpleMatrix());

			Re.calcularAngulos();

			mostrarTexto("Alfa d = " + Re.getAnguloXDer());
			mostrarTexto("Beta d = " + Re.getAnguloYDer());
			mostrarTexto("Gamma d = " + Re.getAnguloZDer());
			mostrarTexto("Alfa i = " + Re.getAnguloXIzq());
			mostrarTexto("Beta i = " + Re.getAnguloYIzq());
			mostrarTexto("Gamma i = " + Re.getAnguloZIzq());
			mostrarTexto("");

			mostrarTexto("E% (Alfa d) = " + Re.getErrorAnguloXDer());
			mostrarTexto("E% (Beta d) = " + Re.getErrorAnguloYDer());
			mostrarTexto("E% (Gamma d) = " + Re.getErrorAnguloZDer());
			mostrarTexto("E% (Alfa i) = " + Re.getErrorAnguloXIzq());
			mostrarTexto("E% (Beta i) = " + Re.getErrorAnguloYIzq());
			mostrarTexto("E% (Gamma i) = " + Re.getErrorAnguloZIzq());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void mostrarTextoExtra(String texto) {
		if (MOSTAR_DUMP)
			this.formulario.getTxtrResultado().append(texto);
	}

	private void mostrarTexto(String texto) {
		this.formulario.getTxtrResultado().append(texto + "\n");
	}
}
