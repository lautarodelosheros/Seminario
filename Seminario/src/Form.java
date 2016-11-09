import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;


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
	private JLabel lblAngRotIzq;
	private JLabel lblAngRotDer;
	private JLabel lblVecSIzq;
	private JLabel lblVecSDer;
	private JLabel lblVecM1;
	private JLabel lblVecM2;
	private JLabel lblVecM3;
	private JLabel lblVecM4;
	private JLabel lblVecM5;

	/**
	 * Create the application.
	 */
	public Form() {
		initialize();
	}

	public JFrame getFrame() {
		return frame;
	}

	public JButton getBtnSimular() {
		return btnSimular;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblAngRotIzq = new JLabel("Angulos de rotacion Izquierda");
		lblAngRotIzq.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblAngRotIzq.setBounds(59, 30, 284, 19);
		frame.getContentPane().add(lblAngRotIzq);
		
		txtRxi = new JTextField();
		txtRxi.setText("rxi");
		txtRxi.setBounds(59, 50, 114, 19);
		frame.getContentPane().add(txtRxi);
		txtRxi.selectAll();
		txtRxi.setColumns(5);
		
		txtRyi = new JTextField();
		txtRyi.setText("ryi");
		txtRyi.setBounds(185, 50, 114, 19);
		frame.getContentPane().add(txtRyi);
		txtRyi.selectAll();
		txtRyi.setColumns(10);
		
		txtRzi = new JTextField();
		txtRzi.setText("rzi");
		txtRzi.setBounds(310, 50, 114, 19);
		frame.getContentPane().add(txtRzi);
		txtRzi.selectAll();
		txtRzi.setColumns(10);
		
		lblAngRotDer = new JLabel("Angulos de rotacion Derecha");
		lblAngRotDer.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblAngRotDer.setBounds(59, 70, 284, 19);
		frame.getContentPane().add(lblAngRotDer);
		
		txtRxd = new JTextField();
		txtRxd.setText("rxd");
		txtRxd.setColumns(5);
		txtRxd.setBounds(59, 90, 114, 19);
		txtRxd.selectAll();
		frame.getContentPane().add(txtRxd);
		
		txtRyd = new JTextField();
		txtRyd.setText("ryd");
		txtRyd.setColumns(10);
		txtRyd.setBounds(185, 90, 114, 19);
		txtRyd.selectAll();
		frame.getContentPane().add(txtRyd);
		
		txtRzd = new JTextField();
		txtRzd.setText("rzd");
		txtRzd.setColumns(10);
		txtRzd.setBounds(310, 90, 114, 19);
		txtRzd.selectAll();
		frame.getContentPane().add(txtRzd);
		
		lblVecSIzq = new JLabel("Vector ubicacion camara Izquierda");
		lblVecSIzq.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblVecSIzq.setBounds(59, 110, 284, 19);
		frame.getContentPane().add(lblVecSIzq);
		
		txtSxi = new JTextField();
		txtSxi.setText("sxi");
		txtSxi.setColumns(5);
		txtSxi.setBounds(59, 130, 114, 19);
		txtSxi.selectAll();
		frame.getContentPane().add(txtSxi);
		
		txtSyi = new JTextField();
		txtSyi.setText("syi");
		txtSyi.setColumns(10);
		txtSyi.setBounds(185, 130, 114, 19);
		txtSyi.selectAll();
		frame.getContentPane().add(txtSyi);
		
		txtSzi = new JTextField();
		txtSzi.setText("szi");
		txtSzi.setColumns(10);
		txtSzi.setBounds(310, 130, 114, 19);
		txtSzi.selectAll();
		frame.getContentPane().add(txtSzi);
		
		lblVecSDer = new JLabel("Vector ubicacion camara Derecha");
		lblVecSDer.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblVecSDer.setBounds(59, 150, 284, 19);
		frame.getContentPane().add(lblVecSDer);
		
		txtSxd = new JTextField();
		txtSxd.setText("sxd");
		txtSxd.setColumns(5);
		txtSxd.setBounds(59, 170, 114, 19);
		txtSxd.selectAll();
		frame.getContentPane().add(txtSxd);
		
		txtSyd = new JTextField();
		txtSyd.setText("syd");
		txtSyd.setColumns(10);
		txtSyd.setBounds(185, 170, 114, 19);
		txtSyd.selectAll();
		frame.getContentPane().add(txtSyd);
		
		txtSzd = new JTextField();
		txtSzd.setText("szd");
		txtSzd.setColumns(10);
		txtSzd.setBounds(310, 170, 114, 19);
		txtSzd.selectAll();
		frame.getContentPane().add(txtSzd);
		
		lblVecM1 = new JLabel("Vector punto referencial M1");
		lblVecM1.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblVecM1.setBounds(59, 190, 284, 19);
		frame.getContentPane().add(lblVecM1);
		
		txtM1x = new JTextField();
		txtM1x.setText("m1xd");
		txtM1x.setColumns(5);
		txtM1x.setBounds(59, 210, 114, 19);
		txtM1x.selectAll();
		frame.getContentPane().add(txtM1x);
		
		txtM1y = new JTextField();
		txtM1y.setText("m1yd");
		txtM1y.setColumns(10);
		txtM1y.setBounds(185, 210, 114, 19);
		txtM1y.selectAll();
		frame.getContentPane().add(txtM1y);
		
		txtM1z = new JTextField();
		txtM1z.setText("m1zd");
		txtM1z.setColumns(10);
		txtM1z.setBounds(310, 210, 114, 19);
		txtM1z.selectAll();
		frame.getContentPane().add(txtM1z);
		
		lblVecM2 = new JLabel("Vector punto referencial M2");
		lblVecM2.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblVecM2.setBounds(59, 230, 284, 19);
		frame.getContentPane().add(lblVecM2);
		
		txtM2x = new JTextField();
		txtM2x.setText("m2xd");
		txtM2x.setColumns(5);
		txtM2x.setBounds(59, 250, 114, 19);
		txtM2x.selectAll();
		frame.getContentPane().add(txtM2x);
		
		txtM2y = new JTextField();
		txtM2y.setText("m2yd");
		txtM2y.setColumns(10);
		txtM2y.setBounds(185, 250, 114, 19);
		txtM2y.selectAll();
		frame.getContentPane().add(txtM2y);
		
		txtM2z = new JTextField();
		txtM2z.setText("m2zd");
		txtM2z.setColumns(10);
		txtM2z.setBounds(310, 250, 114, 19);
		txtM2z.selectAll();
		frame.getContentPane().add(txtM2z);
		
		lblVecM3 = new JLabel("Vector punto referencial M3");
		lblVecM3.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblVecM3.setBounds(59, 270, 284, 19);
		frame.getContentPane().add(lblVecM3);
		
		txtM3x = new JTextField();
		txtM3x.setText("m3xd");
		txtM3x.setColumns(5);
		txtM3x.setBounds(59, 290, 114, 19);
		txtM3x.selectAll();
		frame.getContentPane().add(txtM3x);
		
		txtM3y = new JTextField();
		txtM3y.setText("m3yd");
		txtM3y.setColumns(10);
		txtM3y.setBounds(185, 290, 114, 19);
		txtM3y.selectAll();
		frame.getContentPane().add(txtM3y);
		
		txtM3z = new JTextField();
		txtM3z.setText("m3zd");
		txtM3z.setColumns(10);
		txtM3z.setBounds(310, 290, 114, 19);
		txtM3z.selectAll();
		frame.getContentPane().add(txtM3z);
		
		lblVecM4 = new JLabel("Vector punto referencial M4");
		lblVecM4.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblVecM4.setBounds(59, 310, 284, 19);
		frame.getContentPane().add(lblVecM4);
		
		txtM4x = new JTextField();
		txtM4x.setText("m4xd");
		txtM4x.setColumns(5);
		txtM4x.setBounds(59, 330, 114, 19);
		txtM4x.selectAll();
		frame.getContentPane().add(txtM4x);
		
		txtM4y = new JTextField();
		txtM4y.setText("m4yd");
		txtM4y.setColumns(10);
		txtM4y.setBounds(185, 330, 114, 19);
		txtM4y.selectAll();
		frame.getContentPane().add(txtM4y);
		
		txtM4z = new JTextField();
		txtM4z.setText("m4zd");
		txtM4z.setColumns(10);
		txtM4z.setBounds(310, 330, 114, 19);
		txtM4z.selectAll();
		frame.getContentPane().add(txtM4z);
		
		lblVecM5 = new JLabel("Vector punto referencial M5");
		lblVecM5.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblVecM5.setBounds(59, 350, 284, 19);
		frame.getContentPane().add(lblVecM5);
		
		txtM5x = new JTextField();
		txtM5x.setText("m5xd");
		txtM5x.setColumns(5);
		txtM5x.setBounds(59, 370, 114, 19);
		txtM5x.selectAll();
		frame.getContentPane().add(txtM5x);
		
		txtM5y = new JTextField();
		txtM5y.setText("m5yd");
		txtM5y.setColumns(10);
		txtM5y.setBounds(185, 370, 114, 19);
		txtM5y.selectAll();
		frame.getContentPane().add(txtM5y);
		
		txtM5z = new JTextField();
		txtM5z.setText("m5zd");
		txtM5z.setColumns(10);
		txtM5z.setBounds(310, 370, 114, 19);
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
		
		//Eliminar harcode
		txtRxi.setText("2.5");
		txtRyi.setText("1.5");
		txtRzi.setText("2");
		txtRxd.setText("1.5");
		txtRyd.setText("2");
		txtRzd.setText("2.5");
		txtSxi.setText("0");
		txtSyi.setText("0");
		txtSzi.setText("0");
		txtSxd.setText("5");
		txtSyd.setText("0");
		txtSzd.setText("0");
		txtM1x.setText("0");
		txtM1y.setText("1");
		txtM1z.setText("10");
		txtM2x.setText("1");
		txtM2y.setText("2");
		txtM2z.setText("13");
		txtM3x.setText("2");
		txtM3y.setText("1");
		txtM3z.setText("14");
		txtM4x.setText("4");
		txtM4y.setText("3");
		txtM4z.setText("12");
		txtM5x.setText("5");
		txtM5y.setText("1");
		txtM5z.setText("11");
		/*
		txtSyd.setText("6");
		txtSzd.setText("6.244");
		txtM1x.setText("5");
		txtM1y.setText("5");
		txtM1z.setText("12");
		txtM2x.setText("7");
		txtM2y.setText("4");
		txtM2z.setText("15");
		txtM3x.setText("9");
		txtM3y.setText("2");
		txtM3z.setText("13");
		txtM4x.setText("12");
		txtM4y.setText("3");
		txtM4z.setText("13");
		txtM5x.setText("16");
		txtM5y.setText("2");
		txtM5z.setText("12");*/
		
						
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
