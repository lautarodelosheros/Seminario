import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.ejml.alg.dense.misc.RrefGaussJordanRowPivot;
import org.ejml.data.DenseMatrix64F;
import org.ejml.simple.SimpleMatrix;

import parsii.eval.Parser;
import modelo.MatrizGaussReduce;
import modelo.MatrizRotacion;
import modelo.MatrizVector;
import modelo.ResultadoError;
import modelo.VectorEcuacionCincoVariables;
import modelo.VectorEcuacionNueveVariables;

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
		try {
			// Matriz de rotacion izquierda
			MatrizRotacion mRI = new MatrizRotacion(
					new MatrizVector(
							Parser.parse(this.formulario.getTxtRxi().getText()).evaluate(), 
							Parser.parse(this.formulario.getTxtRyi().getText()).evaluate(),
							Parser.parse(this.formulario.getTxtRzi().getText()).evaluate()),
					new Double(this.formulario.getTxtThetaI().getText()));
	
			this.formulario.getTxtrResultado().setText(mRI.toString());
	
			// Matriz de rotacion derecha
			MatrizRotacion mRD = new MatrizRotacion(
					new MatrizVector(
							Parser.parse(this.formulario.getTxtRxd().getText()).evaluate(), 
							Parser.parse(this.formulario.getTxtRyd().getText()).evaluate(),
							Parser.parse(this.formulario.getTxtRzd().getText()).evaluate()),
					new Double(this.formulario.getTxtThetaD().getText()));
	
			this.formulario.getTxtrResultado().append(mRD.toString());
	
			// Vector posicion de la camara izquierda
			MatrizVector sVectorI = new MatrizVector(
					Parser.parse(this.formulario.getTxtSxi().getText()).evaluate(), 
					Parser.parse(this.formulario.getTxtSyi().getText()).evaluate(),
					Parser.parse(this.formulario.getTxtSzi().getText()).evaluate());
	
			this.formulario.getTxtrResultado().append(sVectorI.toString());
	
			// Vector posicion de la camara derecha
			MatrizVector sVectorD = new MatrizVector(
					Parser.parse(this.formulario.getTxtSxd().getText()).evaluate(), 
					Parser.parse(this.formulario.getTxtSyd().getText()).evaluate(),
					Parser.parse(this.formulario.getTxtSzd().getText()).evaluate());
	
			this.formulario.getTxtrResultado().append(sVectorD.toString());
			
			// Vectores de puntos referenciales
			MatrizVector m1Vector = new MatrizVector(
					Parser.parse(this.formulario.getTxtM1x().getText()).evaluate(),					
					Parser.parse(this.formulario.getTxtM1y().getText()).evaluate(),
					Parser.parse(this.formulario.getTxtM1z().getText()).evaluate());
	
			this.formulario.getTxtrResultado().append(m1Vector.toString());
	
			MatrizVector m2Vector = new MatrizVector(
					Parser.parse(this.formulario.getTxtM2x().getText()).evaluate(), 
					Parser.parse(this.formulario.getTxtM2y().getText()).evaluate(),
					Parser.parse(this.formulario.getTxtM2z().getText()).evaluate());
	
			this.formulario.getTxtrResultado().append(m2Vector.toString());
	
			MatrizVector m3Vector = new MatrizVector(
					Parser.parse(this.formulario.getTxtM3x().getText()).evaluate(), 
					Parser.parse(this.formulario.getTxtM3y().getText()).evaluate(),
					Parser.parse(this.formulario.getTxtM3z().getText()).evaluate());
	
			this.formulario.getTxtrResultado().append(m3Vector.toString());
	
			MatrizVector m4Vector = new MatrizVector(
					Parser.parse(this.formulario.getTxtM4x().getText()).evaluate(), 
					Parser.parse(this.formulario.getTxtM4y().getText()).evaluate(),
					Parser.parse(this.formulario.getTxtM4z().getText()).evaluate());
	
			this.formulario.getTxtrResultado().append(m4Vector.toString());
	
			MatrizVector m5Vector = new MatrizVector(
					Parser.parse(this.formulario.getTxtM5x().getText()).evaluate(), 
					Parser.parse(this.formulario.getTxtM5y().getText()).evaluate(),
					Parser.parse(this.formulario.getTxtM5z().getText()).evaluate());
	
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
			
			MatrizGaussReduce mGR;
			if (this.formulario.isCincoIncognitas()) {
				mGR = new MatrizGaussReduce(5, 5);
			
				mGR.agregarVectorEcuacion(new VectorEcuacionCincoVariables(
						mRI.rotarVector(m1Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m1Vector.restar(sVectorI)).getComponenteZ()), 
						mRD.rotarVector(m1Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m1Vector.restar(sVectorD)).getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionCincoVariables( 
						mRI.rotarVector(m2Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m2Vector.restar(sVectorI)).getComponenteZ()), 
						mRD.rotarVector(m2Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m2Vector.restar(sVectorD)).getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionCincoVariables(
						mRI.rotarVector(m3Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m3Vector.restar(sVectorI)).getComponenteZ()), 
						mRD.rotarVector(m3Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m3Vector.restar(sVectorD)).getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionCincoVariables(
						mRI.rotarVector(m4Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m4Vector.restar(sVectorI)).getComponenteZ()), 
						mRD.rotarVector(m4Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m4Vector.restar(sVectorD)).getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionCincoVariables(
						mRI.rotarVector(m5Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m5Vector.restar(sVectorI)).getComponenteZ()), 
						mRD.rotarVector(m5Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m5Vector.restar(sVectorD)).getComponenteZ())));
			} else {			
				mGR = new MatrizGaussReduce(9, 9);
				
				MatrizVector m6Vector = new MatrizVector(
						Parser.parse(this.formulario.getTxtM6x().getText()).evaluate(), 
						Parser.parse(this.formulario.getTxtM6y().getText()).evaluate(),
						Parser.parse(this.formulario.getTxtM6z().getText()).evaluate());
				MatrizVector m7Vector = new MatrizVector(
						Parser.parse(this.formulario.getTxtM7x().getText()).evaluate(), 
						Parser.parse(this.formulario.getTxtM7y().getText()).evaluate(),
						Parser.parse(this.formulario.getTxtM7z().getText()).evaluate());
				MatrizVector m8Vector = new MatrizVector(
						Parser.parse(this.formulario.getTxtM8x().getText()).evaluate(), 
						Parser.parse(this.formulario.getTxtM8y().getText()).evaluate(),
						Parser.parse(this.formulario.getTxtM8z().getText()).evaluate());
				MatrizVector m9Vector = new MatrizVector(
						Parser.parse(this.formulario.getTxtM9x().getText()).evaluate(), 
						Parser.parse(this.formulario.getTxtM9y().getText()).evaluate(),
						Parser.parse(this.formulario.getTxtM9z().getText()).evaluate());
				
				mGR.agregarVectorEcuacion(new VectorEcuacionNueveVariables(
						mRI.rotarVector(m1Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m1Vector.restar(sVectorI)).getComponenteZ()), 
						mRD.rotarVector(m1Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m1Vector.restar(sVectorD)).getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionNueveVariables( 
						mRI.rotarVector(m2Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m2Vector.restar(sVectorI)).getComponenteZ()), 
						mRD.rotarVector(m2Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m2Vector.restar(sVectorD)).getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionNueveVariables(
						mRI.rotarVector(m3Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m3Vector.restar(sVectorI)).getComponenteZ()), 
						mRD.rotarVector(m3Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m3Vector.restar(sVectorD)).getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionNueveVariables(
						mRI.rotarVector(m4Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m4Vector.restar(sVectorI)).getComponenteZ()), 
						mRD.rotarVector(m4Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m4Vector.restar(sVectorD)).getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionNueveVariables(
						mRI.rotarVector(m5Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m5Vector.restar(sVectorI)).getComponenteZ()), 
						mRD.rotarVector(m5Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m5Vector.restar(sVectorD)).getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionNueveVariables(
						mRI.rotarVector(m6Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m6Vector.restar(sVectorI)).getComponenteZ()), 
						mRD.rotarVector(m6Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m6Vector.restar(sVectorD)).getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionNueveVariables(
						mRI.rotarVector(m7Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m7Vector.restar(sVectorI)).getComponenteZ()), 
						mRD.rotarVector(m7Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m7Vector.restar(sVectorD)).getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionNueveVariables(
						mRI.rotarVector(m8Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m8Vector.restar(sVectorI)).getComponenteZ()), 
						mRD.rotarVector(m8Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m8Vector.restar(sVectorD)).getComponenteZ())));
				mGR.agregarVectorEcuacion(new VectorEcuacionNueveVariables(
						mRI.rotarVector(m9Vector.restar(sVectorI)).dividirPorEscalar(mRI.rotarVector(m9Vector.restar(sVectorI)).getComponenteZ()), 
						mRD.rotarVector(m9Vector.restar(sVectorD)).dividirPorEscalar(mRD.rotarVector(m9Vector.restar(sVectorD)).getComponenteZ())));
			}			
			
			this.formulario.getTxtrResultado().append(mGR.toString());
			
			mGR.resolver();
			
			this.formulario.getTxtrResultado().append(mGR.toString());
			
			this.formulario.getTxtrResultado().append("beta Izq: " + mGR.getBetaIzq() + "\n");
			this.formulario.getTxtrResultado().append("gamma Izq: " + mGR.getGammaIzq() + "\n");
			this.formulario.getTxtrResultado().append("alfa Der: " + mGR.getAlfaDer() + "\n");
			this.formulario.getTxtrResultado().append("beta Der: " + mGR.getBetaDer() + "\n");
			this.formulario.getTxtrResultado().append("gamma Der: " + mGR.getGammaDer() + "\n");
			
			ResultadoError Re = new ResultadoError(
					Math.abs(mGR.getBetaIzq()), 
					Math.abs(mGR.getGammaIzq()),
					Math.abs(mGR.getAlfaDer()),
					Math.abs(mGR.getBetaDer()),
					Math.abs(mGR.getGammaDer()),
					mRI.getOnSimpleMatrix(),
					mRD.getOnSimpleMatrix());
			
			Re.calcularAngulos();
			
			this.formulario.getTxtrResultado().append("AnguloXDer: " + Re.getAnguloXDer() + "\n");
			this.formulario.getTxtrResultado().append("AnguloYDer: " + Re.getAnguloYDer() + "\n");
			this.formulario.getTxtrResultado().append("AnguloZDer: " + Re.getAnguloZDer() + "\n");
			this.formulario.getTxtrResultado().append("AnguloXIzq: " + Re.getAnguloXIzq() + "\n");
			this.formulario.getTxtrResultado().append("AnguloYIzq: " + Re.getAnguloYIzq() + "\n");
			this.formulario.getTxtrResultado().append("AnguloZIzq: " + Re.getAnguloZIzq() + "\n");
			
			this.formulario.getTxtrResultado().append("ErrorAnguloXDer: " + Re.getErrorAnguloXDer() + "\n");
			this.formulario.getTxtrResultado().append("ErrorAnguloYDer: " + Re.getErrorAnguloYDer() + "\n");
			this.formulario.getTxtrResultado().append("ErrorAnguloZDer: " + Re.getErrorAnguloZDer() + "\n");
			this.formulario.getTxtrResultado().append("ErrorAnguloXIzq: " + Re.getErrorAnguloXIzq() + "\n");
			this.formulario.getTxtrResultado().append("ErrorAnguloYIzq: " + Re.getErrorAnguloYIzq() + "\n");
			this.formulario.getTxtrResultado().append("ErrorAnguloZIzq: " + Re.getErrorAnguloZIzq() + "\n");
			
			
			//////
			//DenseMatrix64F mGR2 = new DenseMatrix64F(9, 10);
			SimpleMatrix mGR2 = new SimpleMatrix(9, 10);
			mGR2.set(0, 0, 1);
			mGR2.set(0, 1, 2);
			mGR2.set(0, 2, 3);
			mGR2.set(0, 3, 4);
			mGR2.set(0, 4, 5);
			mGR2.set(0, 5, 6);
			mGR2.set(0, 6, 7);
			mGR2.set(0, 7, 8);
			mGR2.set(0, 8, 9);
			mGR2.set(0, 9, 0);
			mGR2.set(1, 0, 1);
			mGR2.set(1, 1, 2);
			mGR2.set(1, 2, 3);
			mGR2.set(1, 3, 4);
			mGR2.set(1, 4, 5);
			mGR2.set(1, 5, 6);
			mGR2.set(1, 6, 7);
			mGR2.set(1, 7, 8);
			mGR2.set(1, 8, 9);
			mGR2.set(2, 2, 1);
			mGR2.set(3, 3, 1);
			mGR2.set(4, 4, 1);
			mGR2.set(5, 5, 1);
			mGR2.set(6, 6, 1);
			mGR2.set(7, 7, 1);
			mGR2.set(8, 8, 1);
			mGR2.set(1, 9, 33);
			mGR2.set(2, 9, 1);
			mGR2.set(3, 9, 1);
			mGR2.set(4, 9, 1);
			mGR2.set(5, 9, 1);
			mGR2.set(6, 9, 1);
			mGR2.set(7, 9, 1);
			mGR2.set(8, 9, 1);
			
			
			mGR2.print();
			
			RrefGaussJordanRowPivot unGauss = new RrefGaussJordanRowPivot();
			unGauss.reduce(mGR2.getMatrix(), 9);
			
			mGR2.print();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
						
	}
}
