package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

import br.edu.ifg.Usuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceInicialHotel extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario usuario = new Usuario();
					usuario.login("gabi@gmail.com", "gabi123");
					InterfaceInicialHotel window = new InterfaceInicialHotel(usuario);
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
	public InterfaceInicialHotel(Usuario usuario) {
		initialize(usuario);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Usuario usuario) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Olá! Seja bem-vindo ao nosso sistema!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 10, 325, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Acesse agora a página de: ");
		lblNewLabel_1.setFont(new Font("Leelawadee UI", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 91, 169, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Cadastro \r\nde \r\nQuarto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(true);
				new InterfaceCadastroQuarto(usuario).setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 7));
		btnNewButton.setBounds(10, 143, 123, 56);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Informações \r\nde \r\nCadastro");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(true);
				new InterfaceGerenciamentoDeCadastroHotel(usuario).setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_1.setToolTipText("");
		btnNewButton_1.setBounds(143, 143, 163, 56);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reservas");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new InterfaceGerenciarHotel().setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 7));
		btnNewButton_2.setBounds(316, 143, 109, 56);
		frame.getContentPane().add(btnNewButton_2);
	}

}
