import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.MatrizGaussReduce;
import modelo.MatrizRotacionDerecha;
import modelo.MatrizRotacionIzquierda;
import modelo.MiVector;
import modelo.ResultadoError;

public class MiActionListenerButton implements ActionListener {
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

		// Matriz de rotacion izquierda
		MatrizRotacionIzquierda mRI = new MatrizRotacionIzquierda(
				convertirARadianes(new Double(this.formulario.getTxtRxi().getText())), 
				convertirARadianes(new Double(this.formulario.getTxtRyi().getText())), 
				convertirARadianes(new Double(this.formulario.getTxtRzi().getText())));

		this.formulario.getTxtrResultado().setText(mRI.toString());

		// Matriz de rotacion derecha
		MatrizRotacionDerecha mRD = new MatrizRotacionDerecha(
				convertirARadianes(new Double(this.formulario.getTxtRxd().getText())), 
				convertirARadianes(new Double(this.formulario.getTxtRyd().getText())), 
				convertirARadianes(new Double(this.formulario.getTxtRzd().getText())));

		this.formulario.getTxtrResultado().append(mRD.toString());

		// Vector posicion de la camara izquierda
		MiVector sVectorI = new MiVector(new Double(this.formulario.getTxtSxi()
				.getText()), new Double(this.formulario.getTxtSyi().getText()),
				new Double(this.formulario.getTxtSzi().getText()));

		this.formulario.getTxtrResultado().append(sVectorI.toString());

		// Vector posicion de la camara derecha
		MiVector sVectorD = new MiVector(new Double(this.formulario.getTxtSxd()
				.getText()), new Double(this.formulario.getTxtSyd().getText()),
				new Double(this.formulario.getTxtSzd().getText()));

		this.formulario.getTxtrResultado().append(sVectorD.toString());

		// Vectores de puntos referenciales
		MiVector m1Vector = new MiVector(new Double(this.formulario.getTxtM1x()
				.getText()), new Double(this.formulario.getTxtM1y().getText()),
				new Double(this.formulario.getTxtM1z().getText()));

		this.formulario.getTxtrResultado().append(m1Vector.toString());

		MiVector m2Vector = new MiVector(new Double(this.formulario.getTxtM2x()
				.getText()), new Double(this.formulario.getTxtM2y().getText()),
				new Double(this.formulario.getTxtM2z().getText()));

		this.formulario.getTxtrResultado().append(m2Vector.toString());

		MiVector m3Vector = new MiVector(new Double(this.formulario.getTxtM3x()
				.getText()), new Double(this.formulario.getTxtM3y().getText()),
				new Double(this.formulario.getTxtM3z().getText()));

		this.formulario.getTxtrResultado().append(m3Vector.toString());

		MiVector m4Vector = new MiVector(new Double(this.formulario.getTxtM4x()
				.getText()), new Double(this.formulario.getTxtM4y().getText()),
				new Double(this.formulario.getTxtM4z().getText()));

		this.formulario.getTxtrResultado().append(m4Vector.toString());

		MiVector m5Vector = new MiVector(new Double(this.formulario.getTxtM5x()
				.getText()), new Double(this.formulario.getTxtM5y().getText()),
				new Double(this.formulario.getTxtM5z().getText()));

		this.formulario.getTxtrResultado().append(m5Vector.toString());

		// Vectores rotados
		this.formulario.getTxtrResultado().append(
				mRI.rotarVector(m1Vector.restar(sVectorI)).toString());
		this.formulario.getTxtrResultado().append(
				mRI.rotarVector(m2Vector.restar(sVectorI)).toString());
		this.formulario.getTxtrResultado().append(
				mRI.rotarVector(m3Vector.restar(sVectorI)).toString());
		this.formulario.getTxtrResultado().append(
				mRI.rotarVector(m4Vector.restar(sVectorI)).toString());
		this.formulario.getTxtrResultado().append(
				mRI.rotarVector(m5Vector.restar(sVectorI)).toString());

		this.formulario.getTxtrResultado().append(
				mRD.rotarVector(m1Vector.restar(sVectorD)).toString());
		this.formulario.getTxtrResultado().append(
				mRD.rotarVector(m2Vector.restar(sVectorD)).toString());
		this.formulario.getTxtrResultado().append(
				mRD.rotarVector(m3Vector.restar(sVectorD)).toString());
		this.formulario.getTxtrResultado().append(
				mRD.rotarVector(m4Vector.restar(sVectorD)).toString());
		this.formulario.getTxtrResultado().append(
				mRD.rotarVector(m5Vector.restar(sVectorD)).toString());

		// Vectores rotados y dividos por la componente Z
		this.formulario.getTxtrResultado().append(
				mRI.rotarVector(m1Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m1Vector.restar(sVectorI))
										.getComponenteZ()).toString());
		this.formulario.getTxtrResultado().append(
				mRI.rotarVector(m2Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m2Vector.restar(sVectorI))
										.getComponenteZ()).toString());
		this.formulario.getTxtrResultado().append(
				mRI.rotarVector(m3Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m3Vector.restar(sVectorI))
										.getComponenteZ()).toString());
		this.formulario.getTxtrResultado().append(
				mRI.rotarVector(m4Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m4Vector.restar(sVectorI))
										.getComponenteZ()).toString());
		this.formulario.getTxtrResultado().append(
				mRI.rotarVector(m5Vector.restar(sVectorI))
						.dividirPorEscalar(
								mRI.rotarVector(m5Vector.restar(sVectorI))
										.getComponenteZ()).toString());

		this.formulario.getTxtrResultado().append(
				mRD.rotarVector(m1Vector.restar(sVectorD))
						.dividirPorEscalar(
								mRD.rotarVector(m1Vector.restar(sVectorD))
										.getComponenteZ()).toString());
		this.formulario.getTxtrResultado().append(
				mRD.rotarVector(m2Vector.restar(sVectorD))
						.dividirPorEscalar(
								mRD.rotarVector(m2Vector.restar(sVectorD))
										.getComponenteZ()).toString());
		this.formulario.getTxtrResultado().append(
				mRD.rotarVector(m3Vector.restar(sVectorD))
						.dividirPorEscalar(
								mRD.rotarVector(m3Vector.restar(sVectorD))
										.getComponenteZ()).toString());
		this.formulario.getTxtrResultado().append(
				mRD.rotarVector(m4Vector.restar(sVectorD))
						.dividirPorEscalar(
								mRD.rotarVector(m4Vector.restar(sVectorD))
										.getComponenteZ()).toString());
		this.formulario.getTxtrResultado().append(
				mRD.rotarVector(m5Vector.restar(sVectorD))
						.dividirPorEscalar(
								mRD.rotarVector(m5Vector.restar(sVectorD))
										.getComponenteZ()).toString());
		
		MatrizGaussReduce mGR = new MatrizGaussReduce(5, 5);
		mGR.agregarVectorEcuacion(
				mRI.rotarVector(m1Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m1Vector.restar(sVectorI)).getComponenteZ()), 
				mRD.rotarVector(m1Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m1Vector.restar(sVectorD)).getComponenteZ()));
		mGR.agregarVectorEcuacion(
				mRI.rotarVector(m2Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m2Vector.restar(sVectorI)).getComponenteZ()), 
				mRD.rotarVector(m2Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m2Vector.restar(sVectorD)).getComponenteZ()));
		mGR.agregarVectorEcuacion(
				mRI.rotarVector(m3Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m3Vector.restar(sVectorI)).getComponenteZ()), 
				mRD.rotarVector(m3Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m3Vector.restar(sVectorD)).getComponenteZ()));
		mGR.agregarVectorEcuacion(
				mRI.rotarVector(m4Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m4Vector.restar(sVectorI)).getComponenteZ()), 
				mRD.rotarVector(m4Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m4Vector.restar(sVectorD)).getComponenteZ()));
		mGR.agregarVectorEcuacion(
				mRI.rotarVector(m5Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m5Vector.restar(sVectorI)).getComponenteZ()), 
				mRD.rotarVector(m5Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m5Vector.restar(sVectorD)).getComponenteZ()));
		
		mGR.resolver();
		
		this.formulario.getTxtrResultado().append("beta Izq: " + mGR.getBetaIzq() + "\n");
		this.formulario.getTxtrResultado().append("gamma Izq: " + mGR.getGammaIzq() + "\n");
		this.formulario.getTxtrResultado().append("alfa Der: " + mGR.getAlfaDer() + "\n");
		this.formulario.getTxtrResultado().append("beta Der: " + mGR.getBetaDer() + "\n");
		this.formulario.getTxtrResultado().append("gamma Der: " + mGR.getGammaDer() + "\n");
		
		ResultadoError Re = new ResultadoError(mGR.getBetaIzq(), 
				mGR.getGammaIzq(),
				mGR.getAlfaDer(),
				mGR.getBetaDer(),
				mGR.getGammaDer(),
				new Double(this.formulario.getTxtRxi().getText()), 
				new Double(this.formulario.getTxtRyi().getText()), 
				new Double(this.formulario.getTxtRzi().getText()),
				new Double(this.formulario.getTxtRxd().getText()), 
				new Double(this.formulario.getTxtRyd().getText()), 
				new Double(this.formulario.getTxtRzd().getText()));
		
		Re.calcularAngulos();
		
		this.formulario.getTxtrResultado().append("AnguloXDer: " + Re.getAnguloXDer() + "\n");
		this.formulario.getTxtrResultado().append("AnguloYDer: " + Re.getAnguloYDer() + "\n");
		this.formulario.getTxtrResultado().append("AnguloZDer: " + Re.getAnguloZDer() + "\n");
		this.formulario.getTxtrResultado().append("AnguloXIzq: " + Re.getAnguloXIzq() + "\n");
		this.formulario.getTxtrResultado().append("AnguloYIzq: " + Re.getAnguloYIzq() + "\n");
		this.formulario.getTxtrResultado().append("AnguloZIzq: " + Re.getAnguloZIzq() + "\n");
		this.formulario.getTxtrResultado().append("ErrorAnguloXIzq: " + Re.getErrorAnguloXDer() + "\n");
		this.formulario.getTxtrResultado().append("ErrorAnguloYDer: " + Re.getErrorAnguloYDer() + "\n");
		this.formulario.getTxtrResultado().append("ErrorAnguloZDer: " + Re.getErrorAnguloZDer() + "\n");
		this.formulario.getTxtrResultado().append("ErrorAnguloXIzq: " + Re.getErrorAnguloXIzq() + "\n");
		this.formulario.getTxtrResultado().append("ErrorAnguloYIzq: " + Re.getErrorAnguloYIzq() + "\n");
		this.formulario.getTxtrResultado().append("ErrorAnguloZIzq: " + Re.getErrorAnguloZIzq() + "\n");
						
	}
	
	private double convertirARadianes(Double angulo) {
		return (angulo * Math.PI) / 180;
	}

}
