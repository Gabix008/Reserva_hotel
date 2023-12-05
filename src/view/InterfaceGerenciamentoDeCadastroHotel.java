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
import javax.swing.JCheckBox;

public class InterfaceGerenciamentoDeCadastroHotel extends JFrame {

	private JTextField nome;
	private JTextField cnpj;
	private JTextField endereco;
	private JTextField telefone;
	private JTextField descricao;
	private JTextField cidade;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// Usuario usuario = new Usuario();
	// usuario.login("gabi@gmail.com", "gabi123");
	// InterfaceGerenciamentoDeCadastroHotel window = new
	// InterfaceGerenciamentoDeCadastroHotel(usuario);
	// window.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

	/**
	 * Create the application.
	 */
	public InterfaceGerenciamentoDeCadastroHotel(Usuario usuario, Hotel hotel) {
		initialize(usuario, hotel);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Usuario usuario, Hotel hotel) {
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
		
		nome = new JTextField();
		nome.setColumns(10);
		nome.setBounds(122, 59, 225, 19);
		getContentPane().add(nome);
		
		JLabel lblNewLabel_2 = new JLabel("CNPJ:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(20, 85, 45, 13);
		getContentPane().add(lblNewLabel_2);
		
		cnpj = new JTextField();
		cnpj.setColumns(10);
		cnpj.setBounds(122, 84, 225, 19);
		getContentPane().add(cnpj);
		
		JLabel lblNewLabel_3 = new JLabel("CIDADE:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(20, 141, 86, 13);
		getContentPane().add(lblNewLabel_3);
		
		endereco = new JTextField();
		endereco.setColumns(10);
		endereco.setBounds(122, 113, 225, 19);
		getContentPane().add(endereco);
		
		JLabel lblNewLabel_4 = new JLabel("TELEFONE:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(20, 164, 79, 13);
		getContentPane().add(lblNewLabel_4);
		
		telefone = new JTextField();
		telefone.setColumns(10);
		telefone.setBounds(122, 163, 225, 19);
		getContentPane().add(telefone);
		
		JLabel lblNewLabel_5 = new JLabel("DESCRIÇÃO");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(20, 187, 86, 13);
		getContentPane().add(lblNewLabel_5);
		
		descricao = new JTextField();
		descricao.setColumns(10);
		descricao.setBounds(122, 186, 225, 31);
		getContentPane().add(descricao);
		
		JButton btnNewButton = new JButton("Editar Cadastro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new InterfaceInicialHotel(usuario).setVisible(true);
				new InterfaceInicialHotel(usuario).setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(301, 228, 110, 33);
		getContentPane().add(btnNewButton);

		JLabel lblNewLabel_3_1 = new JLabel("ENDEREÇO:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(20, 118, 86, 13);
		getContentPane().add(lblNewLabel_3_1);
		
		
		cidade = new JTextField();
		cidade.setColumns(10);
		cidade.setBounds(122, 140, 225, 19);
		getContentPane().add(cidade);
		
		JCheckBox pagamentoAntes = new JCheckBox("Permitir pagamento antecipado");
		pagamentoAntes.setBounds(120, 224, 175, 23);
		getContentPane().add(pagamentoAntes);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				hotel.editar(usuario, hotel.getId(), nome.getText(),endereco.getText(), descricao.getText(), cidade.getText(), telefone.getText(),pagamentoAntes.isSelected());
			}
		});

	}

}
