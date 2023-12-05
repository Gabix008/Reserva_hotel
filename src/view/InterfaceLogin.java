package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import br.edu.ifg.Usuario;

import javax.swing.JTextField;
import javax.swing.JButton;

public class InterfaceLogin extends JFrame {

	private JFrame frame;
	private JTextField email;
	private JTextField senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceLogin window = new InterfaceLogin();
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
	public InterfaceLogin() {
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
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(182, 0, 73, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("E-mail");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(85, 53, 55, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		email = new JTextField();
		email.setBounds(85, 91, 225, 19);
		frame.getContentPane().add(email);
		email.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(85, 112, 55, 39);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		senha = new JTextField();
		senha.setColumns(10);
		senha.setBounds(85, 150, 225, 19);
		frame.getContentPane().add(senha);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario usuario = new Usuario();
				usuario.login(email.getText(), senha.getText());
				setVisible(false);
		        new InterfaceTelaInicial().setVisible(true);
			}
		});
		btnNewButton.setBounds(225, 179, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Não tem uma conta? Cadastre-se aqui\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
                new InterfaceCadastroCliente().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(85, 232, 225, 21);
		frame.getContentPane().add(btnNewButton_1);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getEmail() {
		return email;
	}

	public void setEmail(JTextField email) {
		this.email = email;
	}

	public JTextField getSenha() {
		return senha;
	}

	public void setSenha(JTextField senha) {
		this.senha = senha;
	}

	
}
