import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;


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
	private JTextField txtM1xd;
	private JTextField txtM1yd;
	private JTextField txtM1zd;
	private JTextField txtM2xd;
	private JTextField txtM2yd;
	private JTextField txtM2zd;
	private JTextField txtM3xd;
	private JTextField txtM3yd;
	private JTextField txtM3zd;
	private JTextField txtM4xd;
	private JTextField txtM4yd;
	private JTextField txtM4zd;
	private JTextField txtM5xd;
	private JTextField txtM5yd;
	private JTextField txtM5zd;
	private JTextField txtM1xi;
	private JTextField txtM1yi;
	private JTextField txtM1zi;
	private JTextField txtM2xi;
	private JTextField txtM2yi;
	private JTextField txtM2zi;
	private JTextField txtM3xi;
	private JTextField txtM3yi;
	private JTextField txtM3zi;
	private JTextField txtM4xi;
	private JTextField txtM4yi;
	private JTextField txtM4zi;
	private JTextField txtM5xi;
	private JTextField txtM5yi;
	private JTextField txtM5zi;
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
		txtRxi.setColumns(5);
		
		txtRyi = new JTextField();
		txtRyi.setText("ryi");
		txtRyi.setBounds(185, 30, 114, 19);
		frame.getContentPane().add(txtRyi);
		txtRyi.setColumns(10);
		
		txtRzi = new JTextField();
		txtRzi.setText("rzi");
		txtRzi.setBounds(310, 30, 114, 19);
		frame.getContentPane().add(txtRzi);
		txtRzi.setColumns(10);
		
		txtRxd = new JTextField();
		txtRxd.setText("rxd");
		txtRxd.setColumns(5);
		txtRxd.setBounds(59, 63, 114, 19);
		frame.getContentPane().add(txtRxd);
		
		txtRyd = new JTextField();
		txtRyd.setText("ryd");
		txtRyd.setColumns(10);
		txtRyd.setBounds(185, 63, 114, 19);
		frame.getContentPane().add(txtRyd);
		
		txtRzd = new JTextField();
		txtRzd.setText("rzd");
		txtRzd.setColumns(10);
		txtRzd.setBounds(310, 63, 114, 19);
		frame.getContentPane().add(txtRzd);
		
		txtSxi = new JTextField();
		txtSxi.setText("sxi");
		txtSxi.setColumns(5);
		txtSxi.setBounds(59, 96, 114, 19);
		frame.getContentPane().add(txtSxi);
		
		txtSyi = new JTextField();
		txtSyi.setText("syi");
		txtSyi.setColumns(10);
		txtSyi.setBounds(185, 96, 114, 19);
		frame.getContentPane().add(txtSyi);
		
		txtSzi = new JTextField();
		txtSzi.setText("szi");
		txtSzi.setColumns(10);
		txtSzi.setBounds(310, 96, 114, 19);
		frame.getContentPane().add(txtSzi);
		
		txtSxd = new JTextField();
		txtSxd.setText("sxd");
		txtSxd.setColumns(5);
		txtSxd.setBounds(59, 127, 114, 19);
		frame.getContentPane().add(txtSxd);
		
		txtSyd = new JTextField();
		txtSyd.setText("syd");
		txtSyd.setColumns(10);
		txtSyd.setBounds(185, 127, 114, 19);
		frame.getContentPane().add(txtSyd);
		
		txtSzd = new JTextField();
		txtSzd.setText("szd");
		txtSzd.setColumns(10);
		txtSzd.setBounds(310, 127, 114, 19);
		frame.getContentPane().add(txtSzd);
		
		txtM1xd = new JTextField();
		txtM1xd.setText("m1xd");
		txtM1xd.setColumns(5);
		txtM1xd.setBounds(59, 158, 114, 19);
		frame.getContentPane().add(txtM1xd);
		
		txtM1yd = new JTextField();
		txtM1yd.setText("m1yd");
		txtM1yd.setColumns(10);
		txtM1yd.setBounds(185, 158, 114, 19);
		frame.getContentPane().add(txtM1yd);
		
		txtM1zd = new JTextField();
		txtM1zd.setText("m1zd");
		txtM1zd.setColumns(10);
		txtM1zd.setBounds(310, 158, 114, 19);
		frame.getContentPane().add(txtM1zd);
		
		txtM2xd = new JTextField();
		txtM2xd.setText("m2xd");
		txtM2xd.setColumns(5);
		txtM2xd.setBounds(59, 189, 114, 19);
		frame.getContentPane().add(txtM2xd);
		
		txtM2yd = new JTextField();
		txtM2yd.setText("m2yd");
		txtM2yd.setColumns(10);
		txtM2yd.setBounds(185, 189, 114, 19);
		frame.getContentPane().add(txtM2yd);
		
		txtM2zd = new JTextField();
		txtM2zd.setText("m2zd");
		txtM2zd.setColumns(10);
		txtM2zd.setBounds(310, 189, 114, 19);
		frame.getContentPane().add(txtM2zd);
		
		txtM3xd = new JTextField();
		txtM3xd.setText("m3xd");
		txtM3xd.setColumns(5);
		txtM3xd.setBounds(59, 220, 114, 19);
		frame.getContentPane().add(txtM3xd);
		
		txtM3yd = new JTextField();
		txtM3yd.setText("m3yd");
		txtM3yd.setColumns(10);
		txtM3yd.setBounds(185, 220, 114, 19);
		frame.getContentPane().add(txtM3yd);
		
		txtM3zd = new JTextField();
		txtM3zd.setText("m3zd");
		txtM3zd.setColumns(10);
		txtM3zd.setBounds(310, 220, 114, 19);
		frame.getContentPane().add(txtM3zd);
		
		txtM4xd = new JTextField();
		txtM4xd.setText("m4xd");
		txtM4xd.setColumns(5);
		txtM4xd.setBounds(59, 251, 114, 19);
		frame.getContentPane().add(txtM4xd);
		
		txtM4yd = new JTextField();
		txtM4yd.setText("m4yd");
		txtM4yd.setColumns(10);
		txtM4yd.setBounds(185, 251, 114, 19);
		frame.getContentPane().add(txtM4yd);
		
		txtM4zd = new JTextField();
		txtM4zd.setText("m4zd");
		txtM4zd.setColumns(10);
		txtM4zd.setBounds(310, 251, 114, 19);
		frame.getContentPane().add(txtM4zd);
		
		txtM5xd = new JTextField();
		txtM5xd.setText("m5xd");
		txtM5xd.setColumns(5);
		txtM5xd.setBounds(59, 282, 114, 19);
		frame.getContentPane().add(txtM5xd);
		
		txtM5yd = new JTextField();
		txtM5yd.setText("m5yd");
		txtM5yd.setColumns(10);
		txtM5yd.setBounds(185, 282, 114, 19);
		frame.getContentPane().add(txtM5yd);
		
		txtM5zd = new JTextField();
		txtM5zd.setText("m5zd");
		txtM5zd.setColumns(10);
		txtM5zd.setBounds(310, 282, 114, 19);
		frame.getContentPane().add(txtM5zd);
		
		txtM1xi = new JTextField();
		txtM1xi.setText("m1xi");
		txtM1xi.setColumns(5);
		txtM1xi.setBounds(59, 313, 114, 19);
		frame.getContentPane().add(txtM1xi);
		
		txtM1yi = new JTextField();
		txtM1yi.setText("m1yi");
		txtM1yi.setColumns(10);
		txtM1yi.setBounds(185, 313, 114, 19);
		frame.getContentPane().add(txtM1yi);
		
		txtM1zi = new JTextField();
		txtM1zi.setText("m1zi");
		txtM1zi.setColumns(10);
		txtM1zi.setBounds(310, 313, 114, 19);
		frame.getContentPane().add(txtM1zi);
		
		txtM2xi = new JTextField();
		txtM2xi.setText("m2xi");
		txtM2xi.setColumns(5);
		txtM2xi.setBounds(59, 344, 114, 19);
		frame.getContentPane().add(txtM2xi);
		
		txtM2yi = new JTextField();
		txtM2yi.setText("m2yi");
		txtM2yi.setColumns(10);
		txtM2yi.setBounds(185, 344, 114, 19);
		frame.getContentPane().add(txtM2yi);
		
		txtM2zi = new JTextField();
		txtM2zi.setText("m2zi");
		txtM2zi.setColumns(10);
		txtM2zi.setBounds(310, 344, 114, 19);
		frame.getContentPane().add(txtM2zi);
		
		txtM3xi = new JTextField();
		txtM3xi.setText("m3xi");
		txtM3xi.setColumns(5);
		txtM3xi.setBounds(59, 375, 114, 19);
		frame.getContentPane().add(txtM3xi);
		
		txtM3yi = new JTextField();
		txtM3yi.setText("m3yi");
		txtM3yi.setColumns(10);
		txtM3yi.setBounds(185, 375, 114, 19);
		frame.getContentPane().add(txtM3yi);
		
		txtM3zi = new JTextField();
		txtM3zi.setText("m3zi");
		txtM3zi.setColumns(10);
		txtM3zi.setBounds(310, 375, 114, 19);
		frame.getContentPane().add(txtM3zi);
		
		txtM4xi = new JTextField();
		txtM4xi.setText("m4xi");
		txtM4xi.setColumns(5);
		txtM4xi.setBounds(59, 406, 114, 19);
		frame.getContentPane().add(txtM4xi);
		
		txtM4yi = new JTextField();
		txtM4yi.setText("m4yi");
		txtM4yi.setColumns(10);
		txtM4yi.setBounds(185, 406, 114, 19);
		frame.getContentPane().add(txtM4yi);
		
		txtM4zi = new JTextField();
		txtM4zi.setText("m4zi");
		txtM4zi.setColumns(10);
		txtM4zi.setBounds(310, 406, 114, 19);
		frame.getContentPane().add(txtM4zi);
		
		txtM5xi = new JTextField();
		txtM5xi.setText("m5xi");
		txtM5xi.setColumns(5);
		txtM5xi.setBounds(59, 437, 114, 19);
		frame.getContentPane().add(txtM5xi);
		
		txtM5yi = new JTextField();
		txtM5yi.setText("m5yi");
		txtM5yi.setColumns(10);
		txtM5yi.setBounds(185, 437, 114, 19);
		frame.getContentPane().add(txtM5yi);
		
		txtM5zi = new JTextField();
		txtM5zi.setText("m5zi");
		txtM5zi.setColumns(10);
		txtM5zi.setBounds(310, 437, 114, 19);
		frame.getContentPane().add(txtM5zi);
		
		btnSimular = new JButton("Simular");
		btnSimular.setBounds(185, 489, 117, 25);
		frame.getContentPane().add(btnSimular);
		
		txtrResultado = new JTextArea();
		txtrResultado.setText("Resultado");
		txtrResultado.setBounds(472, 65, 300, 350);
		frame.getContentPane().add(txtrResultado);
				
	}
}
