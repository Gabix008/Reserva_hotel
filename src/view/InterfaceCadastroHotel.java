package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import br.edu.ifg.Hotel;
import br.edu.ifg.Usuario;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;

public class InterfaceCadastroHotel {

	private JFrame frame;
	private JTextField nome;
	private JTextField cnpj;
	private JTextField cidade;
	private JTextField telefone;
	private JTextField descricao;
	private JTextField endereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario usuario = new Usuario();
					usuario.login("pedrpg5@gmail.com", "abc");
					// System.out.println(usuario.toString());
					InterfaceCadastroHotel window = new InterfaceCadastroHotel(usuario);
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
	public InterfaceCadastroHotel(Usuario usuario) {
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

		JLabel lblNewLabel = new JLabel("CADASTRO HOTEL");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(106, 10, 225, 51);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("NOME:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(26, 65, 53, 17);
		frame.getContentPane().add(lblNewLabel_1);

		nome = new JTextField();
		nome.setBounds(134, 66, 225, 19);
		frame.getContentPane().add(nome);
		nome.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("CNPJ:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(26, 92, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);

		cnpj = new JTextField();
		cnpj.setBounds(134, 91, 225, 19);
		frame.getContentPane().add(cnpj);
		cnpj.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("ENDEREÇO:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(25, 121, 99, 13);
		frame.getContentPane().add(lblNewLabel_3);

		cidade = new JTextField();
		cidade.setBounds(134, 149, 225, 19);
		frame.getContentPane().add(cidade);
		cidade.setColumns(10);

		JLabel label = new JLabel("New label");
		label.setBounds(34, 156, 10, 4);
		frame.getContentPane().add(label);

		JLabel lblNewLabel_4 = new JLabel("TELEFONE:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(26, 177, 79, 13);
		frame.getContentPane().add(lblNewLabel_4);

		telefone = new JTextField();
		telefone.setBounds(134, 176, 226, 19);
		frame.getContentPane().add(telefone);
		telefone.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("DESCRIÇÃO:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(26, 200, 98, 13);
		frame.getContentPane().add(lblNewLabel_5);

		descricao = new JTextField();
		descricao.setBounds(134, 199, 225, 30);
		frame.getContentPane().add(descricao);
		descricao.setColumns(10);

		JButton btnNewButton_1 = new JButton("CADASTRAR");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBounds(311, 237, 113, 21);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel_3_1 = new JLabel("CIDADE:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(26, 150, 99, 13);
		frame.getContentPane().add(lblNewLabel_3_1);

		endereco = new JTextField();
		endereco.setColumns(10);
		endereco.setBounds(134, 120, 225, 19);
		frame.getContentPane().add(endereco);

		JCheckBox pagamentoAntes = new JCheckBox("Permitir pagamento antecipado");
		pagamentoAntes.setBounds(122, 236, 175, 23);
		frame.getContentPane().add(pagamentoAntes);

		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Hotel hotel = new Hotel();
				System.out.println(usuario.toString());
				usuario.cadastraHotel(nome.getText(), endereco.getText(), descricao.getText(), telefone.getText(),
						cidade.getText(), pagamentoAntes.isSelected());
			}
		});
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
