package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class InterfacePagamento {

	private JFrame frame;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfacePagamento window = new InterfacePagamento();
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
	public InterfacePagamento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 506, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pagamento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(180, 11, 81, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblValor = new JLabel("Valor Total");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValor.setBounds(14, 192, 81, 20);
		frame.getContentPane().add(lblValor);
		
		JButton btnNewButton = new JButton("Pagar");
		btnNewButton.setBounds(389, 288, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNmeroCarto = new JLabel("Número Cartão");
		lblNmeroCarto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNmeroCarto.setBounds(14, 217, 108, 20);
		frame.getContentPane().add(lblNmeroCarto);
		
		JLabel lblDataValidade = new JLabel("Data Validade");
		lblDataValidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDataValidade.setBounds(14, 247, 101, 20);
		frame.getContentPane().add(lblDataValidade);
		
		JLabel lblCvv = new JLabel("CVV");
		lblCvv.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCvv.setBounds(14, 277, 59, 20);
		frame.getContentPane().add(lblCvv);
		
		JLabel lblParcelas = new JLabel("Parcelas");
		lblParcelas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblParcelas.setBounds(14, 308, 59, 20);
		frame.getContentPane().add(lblParcelas);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(142, 195, 108, 19);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(142, 221, 108, 19);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(142, 250, 108, 19);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(142, 280, 108, 19);
		frame.getContentPane().add(textField_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A vista", "1x", "2x", "3x", "4x"}));
		comboBox.setBounds(142, 310, 108, 21);
		frame.getContentPane().add(comboBox);
		
		JLabel lblPix = new JLabel("Código");
		lblPix.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPix.setBounds(10, 82, 81, 20);
		frame.getContentPane().add(lblPix);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(142, 85, 108, 19);
		frame.getContentPane().add(textField_7);
		
		JLabel lblValor_1 = new JLabel("Valor Total");
		lblValor_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValor_1.setBounds(10, 112, 81, 20);
		frame.getContentPane().add(lblValor_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(142, 115, 108, 19);
		frame.getContentPane().add(textField);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Pix");
		rdbtnNewRadioButton.setBounds(14, 41, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
			
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Cartão de credito");
		rdbtnNewRadioButton_1.setBounds(14, 160, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnNewRadioButton);
		grupo.add(rdbtnNewRadioButton_1);
	
		
		JButton btnGerarCdigo = new JButton("Gerar código");
		btnGerarCdigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGerarCdigo.setBounds(279, 82, 108, 35);
		frame.getContentPane().add(btnGerarCdigo);
	}
}
