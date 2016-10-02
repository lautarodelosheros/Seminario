

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.MatrizRotacionDerecha;
import modelo.MatrizRotacionIzquierda;
import modelo.MiVector;



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

		//Prueba rotacion izquierda vector
		MatrizRotacionIzquierda mRI = new MatrizRotacionIzquierda(
				new Double(this.formulario.getTxtRxi().getText()), 
				new Double(this.formulario.getTxtRyi().getText()), 
				new Double(this.formulario.getTxtRzi().getText()));
		
		this.formulario.getTxtrResultado().setText(mRI.toString());
		
		MatrizRotacionDerecha mRD = new MatrizRotacionDerecha(
				new Double(this.formulario.getTxtRxd().getText()), 
				new Double(this.formulario.getTxtRyd().getText()), 
				new Double(this.formulario.getTxtRzd().getText()));
		
		this.formulario.getTxtrResultado().append(mRD.toString());
		
		MiVector sVectorI = new MiVector(
				new Double(this.formulario.getTxtSxi().getText()), 
				new Double(this.formulario.getTxtSyi().getText()), 
				new Double(this.formulario.getTxtSzi().getText()));
		
		this.formulario.getTxtrResultado().append(sVectorI.toString());
		
		MiVector sVectorD = new MiVector(
				new Double(this.formulario.getTxtSxd().getText()), 
				new Double(this.formulario.getTxtSyd().getText()), 
				new Double(this.formulario.getTxtSzd().getText()));
		
		this.formulario.getTxtrResultado().append(sVectorD.toString());
		
		MiVector m1Vector = new MiVector(
				new Double(this.formulario.getTxtM1x().getText()), 
				new Double(this.formulario.getTxtM1y().getText()), 
				new Double(this.formulario.getTxtM1z().getText()));
		
		this.formulario.getTxtrResultado().append(m1Vector.toString());
		
		MiVector m2Vector = new MiVector(
				new Double(this.formulario.getTxtM2x().getText()), 
				new Double(this.formulario.getTxtM2y().getText()), 
				new Double(this.formulario.getTxtM2z().getText()));
		
		this.formulario.getTxtrResultado().append(m2Vector.toString());
		
		MiVector m3Vector = new MiVector(
				new Double(this.formulario.getTxtM3x().getText()), 
				new Double(this.formulario.getTxtM3y().getText()), 
				new Double(this.formulario.getTxtM3z().getText()));
		
		this.formulario.getTxtrResultado().append(m3Vector.toString());
		
		MiVector m4Vector = new MiVector(
				new Double(this.formulario.getTxtM4x().getText()), 
				new Double(this.formulario.getTxtM4y().getText()), 
				new Double(this.formulario.getTxtM4z().getText()));
		
		this.formulario.getTxtrResultado().append(m4Vector.toString());
		
		MiVector m5Vector = new MiVector(
				new Double(this.formulario.getTxtM5x().getText()), 
				new Double(this.formulario.getTxtM5y().getText()), 
				new Double(this.formulario.getTxtM5z().getText()));
		
		this.formulario.getTxtrResultado().append(m5Vector.toString());
				
		this.formulario.getTxtrResultado().append(mRI.rotarVector(m1Vector.restar(sVectorI)).toString());
		this.formulario.getTxtrResultado().append(mRI.rotarVector(m2Vector.restar(sVectorI)).toString());
		this.formulario.getTxtrResultado().append(mRI.rotarVector(m3Vector.restar(sVectorI)).toString());
		this.formulario.getTxtrResultado().append(mRI.rotarVector(m4Vector.restar(sVectorI)).toString());
		this.formulario.getTxtrResultado().append(mRI.rotarVector(m5Vector.restar(sVectorI)).toString());
		
		this.formulario.getTxtrResultado().append(mRD.rotarVector(m1Vector.restar(sVectorD)).toString());
		this.formulario.getTxtrResultado().append(mRD.rotarVector(m2Vector.restar(sVectorD)).toString());
		this.formulario.getTxtrResultado().append(mRD.rotarVector(m3Vector.restar(sVectorD)).toString());
		this.formulario.getTxtrResultado().append(mRD.rotarVector(m4Vector.restar(sVectorD)).toString());
		this.formulario.getTxtrResultado().append(mRD.rotarVector(m5Vector.restar(sVectorD)).toString());
		
	}

}
