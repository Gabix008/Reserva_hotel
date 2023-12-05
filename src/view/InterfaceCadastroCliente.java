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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceCadastroCliente extends JFrame {

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
					window.setVisible(true);
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
		setBounds(100, 100, 516, 355);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(168, 10, 94, 29);
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(10, 50, 5, 6);
		getContentPane().add(label);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(90, 78, 45, 13);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Data de Nascimento");
		lblNewLabel_2.setBounds(90, 104, 94, 13);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPF");
		lblNewLabel_1_1.setBounds(90, 130, 45, 13);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("E-mail");
		lblNewLabel_1_1_1.setBounds(90, 153, 45, 13);
		getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Senha");
		lblNewLabel_1_1_1_1.setBounds(90, 176, 45, 13);
		getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Endereço");
		lblNewLabel_1_1_1_1_1.setBounds(90, 199, 45, 13);
		getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Telefone");
		lblNewLabel_1_1_1_1_1_1.setBounds(90, 222, 60, 13);
		getContentPane().add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Sexo");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(90, 245, 45, 13);
		getContentPane().add(lblNewLabel_1_1_1_1_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(194, 75, 147, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(194, 101, 147, 19);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(194, 127, 147, 19);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(194, 150, 147, 19);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(194, 173, 147, 19);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(194, 196, 147, 19);
		getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(194, 219, 147, 19);
		getContentPane().add(textField_6);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new InterfaceTelaInicial().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(406, 270, 86, 38);
		getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecione o sexo", "Masculino", "Feminino", "Não binário"}));
		comboBox.setBounds(194, 242, 147, 17);
		getContentPane().add(comboBox);
	}
}
