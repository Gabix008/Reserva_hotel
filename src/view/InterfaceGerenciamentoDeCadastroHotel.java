package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import br.edu.ifg.Hotel;
import br.edu.ifg.Usuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceGerenciamentoDeCadastroHotel extends JFrame {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario usuario = new Usuario();
					usuario.login("gabi@gmail.com", "gabi123");
					InterfaceGerenciamentoDeCadastroHotel window = new InterfaceGerenciamentoDeCadastroHotel(usuario);
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
	public InterfaceGerenciamentoDeCadastroHotel(Usuario usuario) {
		initialize(usuario);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Usuario usuario) {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblInformaesHotel = new JLabel("INFORMAÇÕES HOTEL");
		lblInformaesHotel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblInformaesHotel.setBounds(82, 10, 265, 51);
		getContentPane().add(lblInformaesHotel);
		
		JLabel lblNewLabel_1 = new JLabel("NOME:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(20, 58, 53, 17);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(122, 59, 225, 19);
		getContentPane().add(textField);
		
		JLabel lblNewLabel_2 = new JLabel("CNPJ:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(20, 85, 45, 13);
		getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(122, 84, 225, 19);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel_3 = new JLabel("CIDADE:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(20, 141, 86, 13);
		getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(122, 113, 225, 19);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel_4 = new JLabel("TELEFONE:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(20, 164, 79, 13);
		getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(122, 163, 225, 19);
		getContentPane().add(textField_3);
		
		JLabel lblNewLabel_5 = new JLabel("EMAIL:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(20, 187, 68, 13);
		getContentPane().add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(122, 186, 225, 19);
		getContentPane().add(textField_4);
		
		JButton btnNewButton = new JButton("Editar Cadastro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new InterfaceInicialHotel().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(206, 215, 110, 38);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3_1 = new JLabel("ENDEREÇO:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(20, 118, 86, 13);
		getContentPane().add(lblNewLabel_3_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(122, 140, 225, 19);
		getContentPane().add(textField_5);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Hotel hotel 
			}
		});
		
	}

}
