package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import br.edu.ifg.Sexo;

public class InterfaceCadastroCliente {

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
					InterfaceCadastroCliente window = new InterfaceCadastroCliente();
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
	public InterfaceCadastroCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 516, 355);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(168, 10, 94, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(10, 50, 5, 6);
		frame.getContentPane().add(label);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(90, 78, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPF");
		lblNewLabel_1_1.setBounds(90, 133, 45, 13);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("E-mail");
		lblNewLabel_1_1_1.setBounds(90, 156, 45, 13);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Senha");
		lblNewLabel_1_1_1_1.setBounds(90, 179, 45, 13);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Nascimento");
		lblNewLabel_2.setBounds(90, 110, 94, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Endereço");
		lblNewLabel_1_1_1_1_1.setBounds(90, 202, 45, 13);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Telefone");
		lblNewLabel_1_1_1_1_1_1.setBounds(90, 225, 60, 13);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Sexo");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(90, 248, 45, 13);
		frame.getContentPane().add(lblNewLabel_1_1_1_1_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(194, 75, 147, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(194, 104, 147, 19);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(194, 130, 147, 19);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(194, 153, 147, 19);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(194, 176, 147, 19);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(194, 199, 147, 19);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(194, 222, 147, 19);
		frame.getContentPane().add(textField_6);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(406, 270, 86, 38);
		frame.getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione o sexo", "Masculino", "Feminino", "Não binário"}));
		comboBox.setBounds(194, 246, 147, 17);
		frame.getContentPane().add(comboBox);
	}
}
