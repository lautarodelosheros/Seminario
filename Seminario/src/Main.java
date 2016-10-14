import java.awt.EventQueue;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form window = new Form();
					window.getFrame().setVisible(true);
					window.getBtnSimular().addActionListener(new MiActionListenerButton(window));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}
