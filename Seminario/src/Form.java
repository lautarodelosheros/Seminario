import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;


public class Form {

	private JFrame frame;
	private JTextField txtRxi;
	private JTextField txtRyi;
	private JTextField txtRzi;
	private JTextField txtRxd;
	private JTextField txtRyd;
	private JTextField txtRzd;
	private JTextField txtSxi;
	private JTextField txtSyi;
	private JTextField txtSzi;
	private JTextField txtSxd;
	private JTextField txtSyd;
	private JTextField txtSzd;
	private JTextField txtM1x;
	private JTextField txtM1y;
	private JTextField txtM1z;
	private JTextField txtM2x;
	private JTextField txtM2y;
	private JTextField txtM2z;
	private JTextField txtM3x;
	private JTextField txtM3y;
	private JTextField txtM3z;
	private JTextField txtM4x;
	private JTextField txtM4y;
	private JTextField txtM4z;
	private JTextField txtM5x;
	private JTextField txtM5y;
	private JTextField txtM5z;
	private JButton btnSimular;
	private JTextArea txtrResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form window = new Form();
					window.frame.setVisible(true);
					window.btnSimular.addActionListener(new MiActionListenerButton(window));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public Form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtRxi = new JTextField();
		txtRxi.setText("rxi");
		txtRxi.setBounds(59, 30, 114, 19);
		frame.getContentPane().add(txtRxi);
		txtRxi.selectAll();
		txtRxi.setColumns(5);
		
		txtRyi = new JTextField();
		txtRyi.setText("ryi");
		txtRyi.setBounds(185, 30, 114, 19);
		frame.getContentPane().add(txtRyi);
		txtRyi.selectAll();
		txtRyi.setColumns(10);
		
		txtRzi = new JTextField();
		txtRzi.setText("rzi");
		txtRzi.setBounds(310, 30, 114, 19);
		frame.getContentPane().add(txtRzi);
		txtRzi.selectAll();
		txtRzi.setColumns(10);
		
		txtRxd = new JTextField();
		txtRxd.setText("rxd");
		txtRxd.setColumns(5);
		txtRxd.setBounds(59, 63, 114, 19);
		txtRxd.selectAll();
		frame.getContentPane().add(txtRxd);
		
		txtRyd = new JTextField();
		txtRyd.setText("ryd");
		txtRyd.setColumns(10);
		txtRyd.setBounds(185, 63, 114, 19);
		txtRyd.selectAll();
		frame.getContentPane().add(txtRyd);
		
		txtRzd = new JTextField();
		txtRzd.setText("rzd");
		txtRzd.setColumns(10);
		txtRzd.setBounds(310, 63, 114, 19);
		txtRzd.selectAll();
		frame.getContentPane().add(txtRzd);
		
		txtSxi = new JTextField();
		txtSxi.setText("sxi");
		txtSxi.setColumns(5);
		txtSxi.setBounds(59, 96, 114, 19);
		txtSxi.selectAll();
		frame.getContentPane().add(txtSxi);
		
		txtSyi = new JTextField();
		txtSyi.setText("syi");
		txtSyi.setColumns(10);
		txtSyi.setBounds(185, 96, 114, 19);
		txtSyi.selectAll();
		frame.getContentPane().add(txtSyi);
		
		txtSzi = new JTextField();
		txtSzi.setText("szi");
		txtSzi.setColumns(10);
		txtSzi.setBounds(310, 96, 114, 19);
		txtSzi.selectAll();
		frame.getContentPane().add(txtSzi);
		
		txtSxd = new JTextField();
		txtSxd.setText("sxd");
		txtSxd.setColumns(5);
		txtSxd.setBounds(59, 127, 114, 19);
		txtSxd.selectAll();
		frame.getContentPane().add(txtSxd);
		
		txtSyd = new JTextField();
		txtSyd.setText("syd");
		txtSyd.setColumns(10);
		txtSyd.setBounds(185, 127, 114, 19);
		txtSyd.selectAll();
		frame.getContentPane().add(txtSyd);
		
		txtSzd = new JTextField();
		txtSzd.setText("szd");
		txtSzd.setColumns(10);
		txtSzd.setBounds(310, 127, 114, 19);
		txtSzd.selectAll();
		frame.getContentPane().add(txtSzd);
		
		txtM1x = new JTextField();
		txtM1x.setText("m1xd");
		txtM1x.setColumns(5);
		txtM1x.setBounds(59, 158, 114, 19);
		txtM1x.selectAll();
		frame.getContentPane().add(txtM1x);
		
		txtM1y = new JTextField();
		txtM1y.setText("m1yd");
		txtM1y.setColumns(10);
		txtM1y.setBounds(185, 158, 114, 19);
		txtM1y.selectAll();
		frame.getContentPane().add(txtM1y);
		
		txtM1z = new JTextField();
		txtM1z.setText("m1zd");
		txtM1z.setColumns(10);
		txtM1z.setBounds(310, 158, 114, 19);
		txtM1z.selectAll();
		frame.getContentPane().add(txtM1z);
		
		txtM2x = new JTextField();
		txtM2x.setText("m2xd");
		txtM2x.setColumns(5);
		txtM2x.setBounds(59, 189, 114, 19);
		txtM2x.selectAll();
		frame.getContentPane().add(txtM2x);
		
		txtM2y = new JTextField();
		txtM2y.setText("m2yd");
		txtM2y.setColumns(10);
		txtM2y.setBounds(185, 189, 114, 19);
		txtM2y.selectAll();
		frame.getContentPane().add(txtM2y);
		
		txtM2z = new JTextField();
		txtM2z.setText("m2zd");
		txtM2z.setColumns(10);
		txtM2z.setBounds(310, 189, 114, 19);
		txtM2z.selectAll();
		frame.getContentPane().add(txtM2z);
		
		txtM3x = new JTextField();
		txtM3x.setText("m3xd");
		txtM3x.setColumns(5);
		txtM3x.setBounds(59, 220, 114, 19);
		txtM3x.selectAll();
		frame.getContentPane().add(txtM3x);
		
		txtM3y = new JTextField();
		txtM3y.setText("m3yd");
		txtM3y.setColumns(10);
		txtM3y.setBounds(185, 220, 114, 19);
		txtM3y.selectAll();
		frame.getContentPane().add(txtM3y);
		
		txtM3z = new JTextField();
		txtM3z.setText("m3zd");
		txtM3z.setColumns(10);
		txtM3z.setBounds(310, 220, 114, 19);
		txtM3z.selectAll();
		frame.getContentPane().add(txtM3z);
		
		txtM4x = new JTextField();
		txtM4x.setText("m4xd");
		txtM4x.setColumns(5);
		txtM4x.setBounds(59, 251, 114, 19);
		txtM4x.selectAll();
		frame.getContentPane().add(txtM4x);
		
		txtM4y = new JTextField();
		txtM4y.setText("m4yd");
		txtM4y.setColumns(10);
		txtM4y.setBounds(185, 251, 114, 19);
		txtM4y.selectAll();
		frame.getContentPane().add(txtM4y);
		
		txtM4z = new JTextField();
		txtM4z.setText("m4zd");
		txtM4z.setColumns(10);
		txtM4z.setBounds(310, 251, 114, 19);
		txtM4z.selectAll();
		frame.getContentPane().add(txtM4z);
		
		txtM5x = new JTextField();
		txtM5x.setText("m5xd");
		txtM5x.setColumns(5);
		txtM5x.setBounds(59, 282, 114, 19);
		txtM5x.selectAll();
		frame.getContentPane().add(txtM5x);
		
		txtM5y = new JTextField();
		txtM5y.setText("m5yd");
		txtM5y.setColumns(10);
		txtM5y.setBounds(185, 282, 114, 19);
		txtM5y.selectAll();
		frame.getContentPane().add(txtM5y);
		
		txtM5z = new JTextField();
		txtM5z.setText("m5zd");
		txtM5z.setColumns(10);
		txtM5z.setBounds(310, 282, 114, 19);
		txtM5z.selectAll();
		frame.getContentPane().add(txtM5z);
						
		btnSimular = new JButton("Simular");
		btnSimular.setBounds(185, 489, 117, 25);
		frame.getContentPane().add(btnSimular);
		
		txtrResultado = new JTextArea();
		txtrResultado.setText("Resultado");
		txtrResultado.setBounds(472, 65, 300, 350);
		txtrResultado.setEditable(false);
		//frame.getContentPane().add(txtrResultado);
		
		JScrollPane scrollPane = new JScrollPane(txtrResultado);
		scrollPane.setBounds(472, 63, 300, 350);		
		frame.getContentPane().add(scrollPane);
				
	}

	public JTextField getTxtRxi() {
		return txtRxi;
	}

	public JTextField getTxtRyi() {
		return txtRyi;
	}

	public JTextField getTxtRzi() {
		return txtRzi;
	}

	public JTextField getTxtRxd() {
		return txtRxd;
	}

	public JTextField getTxtRyd() {
		return txtRyd;
	}

	public JTextField getTxtRzd() {
		return txtRzd;
	}

	public JTextField getTxtSxi() {
		return txtSxi;
	}

	public JTextField getTxtSyi() {
		return txtSyi;
	}

	public JTextField getTxtSzi() {
		return txtSzi;
	}

	public JTextField getTxtSxd() {
		return txtSxd;
	}

	public JTextField getTxtSyd() {
		return txtSyd;
	}

	public JTextField getTxtSzd() {
		return txtSzd;
	}

	public JTextField getTxtM1x() {
		return txtM1x;
	}

	public JTextField getTxtM1y() {
		return txtM1y;
	}

	public JTextField getTxtM1z() {
		return txtM1z;
	}

	public JTextField getTxtM2x() {
		return txtM2x;
	}

	public JTextField getTxtM2y() {
		return txtM2y;
	}

	public JTextField getTxtM2z() {
		return txtM2z;
	}

	public JTextField getTxtM3x() {
		return txtM3x;
	}

	public JTextField getTxtM3y() {
		return txtM3y;
	}

	public JTextField getTxtM3z() {
		return txtM3z;
	}

	public JTextField getTxtM4x() {
		return txtM4x;
	}

	public JTextField getTxtM4y() {
		return txtM4y;
	}

	public JTextField getTxtM4z() {
		return txtM4z;
	}

	public JTextField getTxtM5x() {
		return txtM5x;
	}

	public JTextField getTxtM5y() {
		return txtM5y;
	}

	public JTextField getTxtM5z() {
		return txtM5z;
	}

	public JTextArea getTxtrResultado() {
		return txtrResultado;
	}

	public void setTxtrResultado(JTextArea txtrResultado) {
		this.txtrResultado = txtrResultado;
	}
}
