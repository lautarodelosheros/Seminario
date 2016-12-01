import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

import java.awt.Font;


public class Form {

	private JFrame frame;
	private ButtonGroup btngroup;
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
	private JTextField txtM6x;
	private JTextField txtM6y;
	private JTextField txtM6z;
	private JTextField txtM7x;
	private JTextField txtM7y;
	private JTextField txtM7z;
	private JTextField txtM8x;
	private JTextField txtM8y;
	private JTextField txtM8z;
	private JTextField txtM9x;
	private JTextField txtM9y;
	private JTextField txtM9z;
	private JTextField txtThetaD;
	private JTextField txtThetaI;
	private JButton btnSimular;
	private JButton btnExportar;
	private JRadioButton rbtn5Incog;
	private JRadioButton rbtn9Incog;
	private JTextArea txtrResultado;
	private JLabel lblAngRotIzq;
	private JLabel lblAngRotDer;
	private JLabel lblVecSIzq;
	private JLabel lblVecSDer;
	private JLabel lblThetaI;
	private JLabel lblThetaD;
	private JLabel lblVecM1;
	private JLabel lblVecM2;
	private JLabel lblVecM3;
	private JLabel lblVecM4;
	private JLabel lblVecM5;
	private JLabel lblVecM6;
	private JLabel lblVecM7;
	private JLabel lblVecM8;
	private JLabel lblVecM9;

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
		
		lblAngRotIzq = new JLabel("Versor izquierdo");
		lblAngRotIzq.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblAngRotIzq.setBounds(59, 30, 284, 19);
		frame.getContentPane().add(lblAngRotIzq);
		
		txtRxi = new JTextField();
		txtRxi.setText("rxi");
		txtRxi.setBounds(59, 50, 114, 19);
		frame.getContentPane().add(txtRxi);
		txtRxi.addFocusListener(new MiListenerText(txtRxi));
		txtRxi.setColumns(5);
		
		txtRyi = new JTextField();
		txtRyi.setText("ryi");
		txtRyi.setBounds(185, 50, 114, 19);
		frame.getContentPane().add(txtRyi);
		txtRyi.addFocusListener(new MiListenerText(txtRyi));
		txtRyi.setColumns(10);
		
		txtRzi = new JTextField();
		txtRzi.setText("rzi");
		txtRzi.setBounds(310, 50, 114, 19);
		frame.getContentPane().add(txtRzi);
		txtRzi.addFocusListener(new MiListenerText(txtRzi));
		txtRzi.setColumns(10);
		
		lblAngRotDer = new JLabel("Versor Derecho");
		lblAngRotDer.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblAngRotDer.setBounds(59, 70, 284, 19);
		frame.getContentPane().add(lblAngRotDer);
		
		txtRxd = new JTextField();
		txtRxd.setText("rxd");
		txtRxd.setColumns(5);
		txtRxd.setBounds(59, 90, 114, 19);
		txtRxd.addFocusListener(new MiListenerText(txtRxd));
		frame.getContentPane().add(txtRxd);
		
		txtRyd = new JTextField();
		txtRyd.setText("ryd");
		txtRyd.setColumns(10);
		txtRyd.setBounds(185, 90, 114, 19);
		txtRyd.addFocusListener(new MiListenerText(txtRyd));
		frame.getContentPane().add(txtRyd);
		
		txtRzd = new JTextField();
		txtRzd.setText("rzd");
		txtRzd.setColumns(10);
		txtRzd.setBounds(310, 90, 114, 19);
		txtRzd.addFocusListener(new MiListenerText(txtRzd));
		frame.getContentPane().add(txtRzd);
		
		lblVecSIzq = new JLabel("Vector ubicacion camara Izquierda");
		lblVecSIzq.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblVecSIzq.setBounds(59, 110, 284, 19);
		frame.getContentPane().add(lblVecSIzq);
		
		txtSxi = new JTextField();
		txtSxi.setText("sxi");
		txtSxi.setColumns(5);
		txtSxi.setBounds(59, 130, 114, 19);
		txtSxi.addFocusListener(new MiListenerText(txtSxi));
		frame.getContentPane().add(txtSxi);
		
		txtSyi = new JTextField();
		txtSyi.setText("syi");
		txtSyi.setColumns(10);
		txtSyi.setBounds(185, 130, 114, 19);
		txtSyi.addFocusListener(new MiListenerText(txtSyi));
		frame.getContentPane().add(txtSyi);
		
		txtSzi = new JTextField();
		txtSzi.setText("szi");
		txtSzi.setColumns(10);
		txtSzi.setBounds(310, 130, 114, 19);
		txtSzi.addFocusListener(new MiListenerText(txtSzi));
		frame.getContentPane().add(txtSzi);
		
		lblVecSDer = new JLabel("Vector ubicacion camara Derecha");
		lblVecSDer.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblVecSDer.setBounds(59, 150, 284, 19);
		frame.getContentPane().add(lblVecSDer);
		
		txtSxd = new JTextField();
		txtSxd.setText("sxd");
		txtSxd.setColumns(5);
		txtSxd.setBounds(59, 170, 114, 19);
		txtSxd.addFocusListener(new MiListenerText(txtSxd));
		frame.getContentPane().add(txtSxd);
		
		txtSyd = new JTextField();
		txtSyd.setText("syd");
		txtSyd.setColumns(10);
		txtSyd.setBounds(185, 170, 114, 19);
		txtSyd.addFocusListener(new MiListenerText(txtSyd));
		frame.getContentPane().add(txtSyd);
		
		txtSzd = new JTextField();
		txtSzd.setText("szd");
		txtSzd.setColumns(10);
		txtSzd.setBounds(310, 170, 114, 19);
		txtSzd.addFocusListener(new MiListenerText(txtSzd));
		frame.getContentPane().add(txtSzd);
		
		lblVecM1 = new JLabel("Vector punto referencial M1");
		lblVecM1.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblVecM1.setBounds(59, 190, 284, 19);
		frame.getContentPane().add(lblVecM1);
		
		txtM1x = new JTextField();
		txtM1x.setText("m1xd");
		txtM1x.setColumns(5);
		txtM1x.setBounds(59, 210, 114, 19);
		txtM1x.addFocusListener(new MiListenerText(txtM1x));
		frame.getContentPane().add(txtM1x);
		
		txtM1y = new JTextField();
		txtM1y.setText("m1yd");
		txtM1y.setColumns(10);
		txtM1y.setBounds(185, 210, 114, 19);
		txtM1y.addFocusListener(new MiListenerText(txtM1y));
		frame.getContentPane().add(txtM1y);
		
		txtM1z = new JTextField();
		txtM1z.setText("m1zd");
		txtM1z.setColumns(10);
		txtM1z.setBounds(310, 210, 114, 19);
		txtM1z.addFocusListener(new MiListenerText(txtM1z));
		frame.getContentPane().add(txtM1z);
		
		lblVecM2 = new JLabel("Vector punto referencial M2");
		lblVecM2.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblVecM2.setBounds(59, 230, 284, 19);
		frame.getContentPane().add(lblVecM2);
		
		txtM2x = new JTextField();
		txtM2x.setText("m2xd");
		txtM2x.setColumns(5);
		txtM2x.setBounds(59, 250, 114, 19);
		txtM2x.addFocusListener(new MiListenerText(txtM2x));
		frame.getContentPane().add(txtM2x);
		
		txtM2y = new JTextField();
		txtM2y.setText("m2yd");
		txtM2y.setColumns(10);
		txtM2y.setBounds(185, 250, 114, 19);
		txtM2y.addFocusListener(new MiListenerText(txtM2y));
		frame.getContentPane().add(txtM2y);
		
		txtM2z = new JTextField();
		txtM2z.setText("m2zd");
		txtM2z.setColumns(10);
		txtM2z.setBounds(310, 250, 114, 19);
		txtM2z.addFocusListener(new MiListenerText(txtM2z));
		frame.getContentPane().add(txtM2z);
		
		lblVecM3 = new JLabel("Vector punto referencial M3");
		lblVecM3.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblVecM3.setBounds(59, 270, 284, 19);
		frame.getContentPane().add(lblVecM3);
		
		txtM3x = new JTextField();
		txtM3x.setText("m3xd");
		txtM3x.setColumns(5);
		txtM3x.setBounds(59, 290, 114, 19);
		txtM3x.addFocusListener(new MiListenerText(txtM3x));
		frame.getContentPane().add(txtM3x);
		
		txtM3y = new JTextField();
		txtM3y.setText("m3yd");
		txtM3y.setColumns(10);
		txtM3y.setBounds(185, 290, 114, 19);
		txtM3y.addFocusListener(new MiListenerText(txtM3y));
		frame.getContentPane().add(txtM3y);
		
		txtM3z = new JTextField();
		txtM3z.setText("m3zd");
		txtM3z.setColumns(10);
		txtM3z.setBounds(310, 290, 114, 19);
		txtM3z.addFocusListener(new MiListenerText(txtM3z));
		frame.getContentPane().add(txtM3z);
		
		lblVecM4 = new JLabel("Vector punto referencial M4");
		lblVecM4.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblVecM4.setBounds(59, 310, 284, 19);
		frame.getContentPane().add(lblVecM4);
		
		txtM4x = new JTextField();
		txtM4x.setText("m4xd");
		txtM4x.setColumns(5);
		txtM4x.setBounds(59, 330, 114, 19);
		txtM4x.addFocusListener(new MiListenerText(txtM4x));
		frame.getContentPane().add(txtM4x);
		
		txtM4y = new JTextField();
		txtM4y.setText("m4yd");
		txtM4y.setColumns(10);
		txtM4y.setBounds(185, 330, 114, 19);
		txtM4y.addFocusListener(new MiListenerText(txtM4y));
		frame.getContentPane().add(txtM4y);
		
		txtM4z = new JTextField();
		txtM4z.setText("m4zd");
		txtM4z.setColumns(10);
		txtM4z.setBounds(310, 330, 114, 19);
		txtM4z.addFocusListener(new MiListenerText(txtM4z));
		frame.getContentPane().add(txtM4z);
		
		lblVecM5 = new JLabel("Vector punto referencial M5");
		lblVecM5.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblVecM5.setBounds(59, 350, 284, 19);
		frame.getContentPane().add(lblVecM5);
		
		txtM5x = new JTextField();
		txtM5x.setText("m5xd");
		txtM5x.setColumns(5);
		txtM5x.setBounds(59, 370, 114, 19);
		txtM5x.addFocusListener(new MiListenerText(txtM5x));
		frame.getContentPane().add(txtM5x);
		
		txtM5y = new JTextField();
		txtM5y.setText("m5yd");
		txtM5y.setColumns(10);
		txtM5y.setBounds(185, 370, 114, 19);
		txtM5y.addFocusListener(new MiListenerText(txtM5y));
		frame.getContentPane().add(txtM5y);
		
		txtM5z = new JTextField();
		txtM5z.setText("m5zd");
		txtM5z.setColumns(10);
		txtM5z.setBounds(310, 370, 114, 19);
		txtM5z.addFocusListener(new MiListenerText(txtM5z));
		frame.getContentPane().add(txtM5z);
		
		lblVecM6 = new JLabel("Vector punto referencial M6");
		lblVecM6.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblVecM6.setBounds(59, 390, 284, 19);
		frame.getContentPane().add(lblVecM6);
		
		txtM6x = new JTextField();
		txtM6x.setText("m6xd");
		txtM6x.setColumns(5);
		txtM6x.setBounds(59, 410, 114, 19);
		txtM6x.addFocusListener(new MiListenerText(txtM6x));
		frame.getContentPane().add(txtM6x);
		
		txtM6y = new JTextField();
		txtM6y.setText("m6yd");
		txtM6y.setColumns(10);
		txtM6y.setBounds(185, 410, 114, 19);
		txtM6y.addFocusListener(new MiListenerText(txtM6y));
		frame.getContentPane().add(txtM6y);
		
		txtM6z = new JTextField();
		txtM6z.setText("m6zd");
		txtM6z.setColumns(10);
		txtM6z.setBounds(310, 410, 114, 19);
		txtM6z.addFocusListener(new MiListenerText(txtM6z));
		frame.getContentPane().add(txtM6z);

		lblVecM7 = new JLabel("Vector punto referencial M7");
		lblVecM7.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblVecM7.setBounds(59, 430, 284, 19);
		frame.getContentPane().add(lblVecM7);
		
		txtM7x = new JTextField();
		txtM7x.setText("m7xd");
		txtM7x.setColumns(5);
		txtM7x.setBounds(59, 450, 114, 19);
		txtM7x.addFocusListener(new MiListenerText(txtM7x));
		frame.getContentPane().add(txtM7x);
		
		txtM7y = new JTextField();
		txtM7y.setText("m7yd");
		txtM7y.setColumns(10);
		txtM7y.setBounds(185, 450, 114, 19);
		txtM7y.addFocusListener(new MiListenerText(txtM7y));
		frame.getContentPane().add(txtM7y);
		
		txtM7z = new JTextField();
		txtM7z.setText("m7zd");
		txtM7z.setColumns(10);
		txtM7z.setBounds(310, 450, 114, 19);
		txtM7z.addFocusListener(new MiListenerText(txtM7z));
		frame.getContentPane().add(txtM7z);
		
		lblVecM8 = new JLabel("Vector punto referencial M8");
		lblVecM8.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblVecM8.setBounds(59, 470, 284, 19);
		frame.getContentPane().add(lblVecM8);
		
		txtM8x = new JTextField();
		txtM8x.setText("m8xd");
		txtM8x.setColumns(5);
		txtM8x.setBounds(59, 490, 114, 19);
		txtM8x.addFocusListener(new MiListenerText(txtM8x));
		frame.getContentPane().add(txtM8x);
		
		txtM8y = new JTextField();
		txtM8y.setText("m8yd");
		txtM8y.setColumns(10);
		txtM8y.setBounds(185, 490, 114, 19);
		txtM8y.addFocusListener(new MiListenerText(txtM8y));
		frame.getContentPane().add(txtM8y);
		
		txtM8z = new JTextField();
		txtM8z.setText("m8zd");
		txtM8z.setColumns(10);
		txtM8z.setBounds(310, 490, 114, 19);
		txtM8z.addFocusListener(new MiListenerText(txtM8z));
		frame.getContentPane().add(txtM8z);
		

		lblVecM9 = new JLabel("Vector punto referencial M9");
		lblVecM9.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblVecM9.setBounds(59, 510, 284, 19);
		frame.getContentPane().add(lblVecM9);
		
		txtM9x = new JTextField();
		txtM9x.setText("m9xd");
		txtM9x.setColumns(5);
		txtM9x.setBounds(59, 530, 114, 19);
		txtM9x.addFocusListener(new MiListenerText(txtM9x));
		frame.getContentPane().add(txtM9x);
		
		txtM9y = new JTextField();
		txtM9y.setText("m8yd");
		txtM9y.setColumns(10);
		txtM9y.setBounds(185, 530, 114, 19);
		txtM9y.addFocusListener(new MiListenerText(txtM9y));
		frame.getContentPane().add(txtM9y);
		
		txtM9z = new JTextField();
		txtM9z.setText("m9zd");
		txtM9z.setColumns(10);
		txtM9z.setBounds(310, 530, 114, 19);
		txtM9z.addFocusListener(new MiListenerText(txtM9z));
		frame.getContentPane().add(txtM9z);

		lblThetaI = new JLabel("Angulo Izquierdo");
		lblThetaI.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblThetaI.setBounds(450, 30, 284, 19);
		frame.getContentPane().add(lblThetaI);
		
		txtThetaI = new JTextField();
		txtThetaI.setText("theta i");
		txtThetaI.setColumns(5);
		txtThetaI.setBounds(450, 50, 114, 19);
		txtThetaI.addFocusListener(new MiListenerText(txtThetaI));
		frame.getContentPane().add(txtThetaI);
		
		lblThetaD = new JLabel("Angulo Derecho");
		lblThetaD.setFont(new Font("Monospaced", Font.PLAIN, 9));
		lblThetaD.setBounds(450, 70, 284, 19);
		frame.getContentPane().add(lblThetaD);
		
		txtThetaD = new JTextField();
		txtThetaD.setText("thetad");
		txtThetaD.setColumns(5);
		txtThetaD.setBounds(450, 90, 114, 19);
		txtThetaD.addFocusListener(new MiListenerText(txtThetaD));
		frame.getContentPane().add(txtThetaD);
		
		rbtn5Incog = new JRadioButton();
		rbtn5Incog.setText("Sist. con 5 incognitas");
		rbtn5Incog.setFont(new Font("Monospaced", Font.PLAIN, 9));
		rbtn5Incog.setBounds(580, 50, 200, 19);
		frame.getContentPane().add(rbtn5Incog);
		
		rbtn9Incog = new JRadioButton();
		rbtn9Incog.setText("Sist. con 9 incognitas");
		rbtn9Incog.setFont(new Font("Monospaced", Font.PLAIN, 9));
		rbtn9Incog.setBounds(580, 90, 200, 19);
		frame.getContentPane().add(rbtn9Incog);
		
		btngroup = new ButtonGroup();
		btngroup.add(rbtn5Incog);
		btngroup.add(rbtn9Incog);		
		
		btnSimular = new JButton("Simular");
		btnSimular.setBounds(460, 550, 117, 25);
		frame.getContentPane().add(btnSimular);
		
		btnExportar = new JButton("Exportar");
		btnExportar.setBounds(610, 550, 117, 25);
		frame.getContentPane().add(btnExportar);
		
		txtrResultado = new JTextArea();
		txtrResultado.setText("RESULTADO\n\n");
		txtrResultado.setFont(new Font("Monospaced", Font.BOLD, 12));
		txtrResultado.setBounds(450, 130, 300, 350);
		txtrResultado.setEditable(false);
		//frame.getContentPane().add(txtrResultado);
		
		JScrollPane scrollPane = new JScrollPane(txtrResultado);
		scrollPane.setBounds(450, 130, 300, 350);		
		frame.getContentPane().add(scrollPane);
		
		//Eliminar harcode
		txtRxi.setText("0.0");
		txtRyi.setText("1 / sqrt(2)");
		txtRzi.setText("1 / sqrt(2)");
		txtRxd.setText("sqrt(6) / 5");
		txtRyd.setText("sqrt(6) / 5");
		txtRzd.setText("sqrt(13) / 5");
		
		txtSxi.setText("0");
		txtSyi.setText("0");
		txtSzi.setText("0");
		
		txtSxd.setText("50");
		txtSyd.setText("0");
		txtSzd.setText("0");
		
		txtM1x.setText("0");
		txtM1y.setText("10");
		txtM1z.setText("100");
		
		txtM2x.setText("5");
		txtM2y.setText("22");
		txtM2z.setText("110");
		
		txtM3x.setText("10");
		txtM3y.setText("-14");
		txtM3z.setText("125");
		
		txtM4x.setText("16");
		txtM4y.setText("-28");
		txtM4z.setText("132");
		
		txtM5x.setText("24");
		txtM5y.setText("35");
		txtM5z.setText("145");
		
		txtM6x.setText("31");
		txtM6y.setText("50");
		txtM6z.setText("130");
		
		txtM7x.setText("39");
		txtM7y.setText("-41");
		txtM7z.setText("120");
		
		txtM8x.setText("44");
		txtM8y.setText("30");
		txtM8z.setText("113");
		
		txtM9x.setText("50");
		txtM9y.setText("-50");
		txtM9z.setText("106");
		
		txtThetaI.setText("0.04");
		txtThetaD.setText("0.04");
		rbtn5Incog.setSelected(true);
		rbtn9Incog.setSelected(false);
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

	public JTextField getTxtM6x() {
		return txtM6x;
	}

	public JTextField getTxtM6y() {
		return txtM6y;
	}

	public JTextField getTxtM6z() {
		return txtM6z;
	}

	public JTextField getTxtM7x() {
		return txtM7x;
	}

	public JTextField getTxtM7y() {
		return txtM7y;
	}

	public JTextField getTxtM7z() {
		return txtM7z;
	}

	public JTextField getTxtM8x() {
		return txtM8x;
	}

	public JTextField getTxtM8y() {
		return txtM8y;
	}

	public JTextField getTxtM8z() {
		return txtM8z;
	}

	public JTextField getTxtM9x() {
		return txtM9x;
	}

	public JTextField getTxtM9y() {
		return txtM9y;
	}

	public JTextField getTxtM9z() {
		return txtM9z;
	}

	public JTextArea getTxtrResultado() {
		return txtrResultado;
	}

	public void setTxtrResultado(JTextArea txtrResultado) {
		this.txtrResultado = txtrResultado;
	}

	public JTextField getTxtThetaI() {
		return this.txtThetaI;
	}
	
	public JTextField getTxtThetaD() {
		return this.txtThetaD;
	}
	
	public boolean isCincoIncognitas() {
		return this.rbtn5Incog.isSelected();
	}
	
	public boolean isNueveIncognitas() {
		return this.rbtn9Incog.isSelected();
	}
	
}
