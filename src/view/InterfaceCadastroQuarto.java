package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import br.edu.ifg.Hotel;
import br.edu.ifg.Usuario;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class InterfaceCadastroQuarto extends JFrame {
	private JTextField preco;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// Usuario usuario = new Usuario();
	// usuario.login("pedrpg5@gmail.com", "abc");
	// InterfaceCadastroQuarto window = new InterfaceCadastroQuarto(usuario);
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
	public InterfaceCadastroQuarto(Usuario usuario) {
		initialize(usuario);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Usuario usuario) {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("CADASTRO DE QUARTOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(71, 10, 278, 41);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("Cama Casal:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(25, 61, 89, 13);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Cama Solteiro:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(25, 100, 111, 13);
		getContentPane().add(lblNewLabel_3);

		JComboBox camaCasal = new JComboBox();
		camaCasal.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));
		camaCasal.setBounds(162, 57, 70, 25);
		getContentPane().add(camaCasal);

		JComboBox camaSolteiro = new JComboBox();
		camaSolteiro.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));
		camaSolteiro.setBounds(162, 96, 70, 25);
		getContentPane().add(camaSolteiro);

		JLabel lblNewLabel_1 = new JLabel("Descrição:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(25, 176, 89, 13);
		getContentPane().add(lblNewLabel_1);

		JTextArea descricao = new JTextArea();
		descricao.setLineWrap(true);
		descricao.setBounds(162, 172, 176, 41);
		getContentPane().add(descricao);

		JLabel lblNewLabel_1_1 = new JLabel(" Valor: ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(25, 140, 89, 13);
		getContentPane().add(lblNewLabel_1_1);

		preco = new JTextField();
		preco.setBounds(162, 136, 86, 25);
		getContentPane().add(preco);
		preco.setColumns(10);

		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hotel hotel = new Hotel();
				int qtdCamaCasal = Integer.parseInt((String) camaCasal.getSelectedItem());
				int qtdCamaSolteiro = Integer.parseInt((String) camaSolteiro.getSelectedItem());
				hotel.cadastrarQuarto(usuario, Double.parseDouble(preco.getText()), descricao.getText(), qtdCamaCasal,
						qtdCamaSolteiro);
				setVisible(false);
				new InterfaceInicialHotel(usuario).setVisible(true);
			}
		});

		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(162, 229, 102, 21);
		getContentPane().add(btnNewButton);
	}
}
