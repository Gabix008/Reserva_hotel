package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class InterfacePagamento {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pagamento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 10, 81, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(10, 55, 81, 20);
		frame.getContentPane().add(lblNome);
		
		JLabel lblHotel = new JLabel("Hotel");
		lblHotel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHotel.setBounds(10, 98, 81, 20);
		frame.getContentPane().add(lblHotel);
		
		JLabel lblQuarto = new JLabel("Quarto");
		lblQuarto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQuarto.setBounds(10, 142, 81, 20);
		frame.getContentPane().add(lblQuarto);
		
		JLabel lblValor = new JLabel("Valor Total");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValor.setBounds(10, 191, 81, 20);
		frame.getContentPane().add(lblValor);
		
		JButton btnNewButton = new JButton("Pagar");
		btnNewButton.setBounds(329, 232, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNmeroCarto = new JLabel("Número Cartão");
		lblNmeroCarto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNmeroCarto.setBounds(197, 55, 108, 20);
		frame.getContentPane().add(lblNmeroCarto);
		
		JLabel lblDataValidade = new JLabel("Data Validade");
		lblDataValidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDataValidade.setBounds(204, 98, 101, 20);
		frame.getContentPane().add(lblDataValidade);
		
		JLabel lblCvv = new JLabel("CVV");
		lblCvv.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCvv.setBounds(276, 142, 29, 20);
		frame.getContentPane().add(lblCvv);
		
		JLabel lblParcelas = new JLabel("Parcelas");
		lblParcelas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblParcelas.setBounds(246, 191, 59, 20);
		frame.getContentPane().add(lblParcelas);
		
		textField = new JTextField();
		textField.setBounds(68, 58, 108, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(68, 101, 108, 19);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(68, 145, 108, 19);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(101, 194, 108, 19);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(315, 58, 108, 19);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(315, 101, 108, 19);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(315, 143, 108, 19);
		frame.getContentPane().add(textField_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A vista", "1x", "2x", "3x", "4x"}));
		comboBox.setBounds(315, 193, 108, 21);
		frame.getContentPane().add(comboBox);
	}
}
