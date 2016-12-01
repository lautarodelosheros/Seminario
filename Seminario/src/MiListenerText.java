import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;


public class MiListenerText implements FocusListener {
	private JTextField txt;

	public MiListenerText(JTextField txt) {
		// TODO Auto-generated constructor stub
		this.txt = txt;
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		this.txt.selectAll();
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		this.txt.setCaretPosition(this.txt.getText().length());
	}

}
