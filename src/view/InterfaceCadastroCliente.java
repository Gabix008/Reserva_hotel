package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.edu.ifg.Usuario;

public class InterfaceCadastroCliente extends JFrame {

	private JFrame frame;
	private JTextField nome;
	private JTextField dataNasc;
	private JTextField cpf;
	private JTextField email;
	private JTextField senha;
	private JTextField endereco;
	private JTextField telefone;

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
	 * Initialize the contents of the 
	 */
	private void initialize() {
		setBounds(100, 100, 516, 355);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(194, 11, 94, 29);
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
		
		JLabel lblNewLabel_1_1 = new JLabel(" CPF ou CNPJ");
		lblNewLabel_1_1.setBounds(90, 133, 79, 13);
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
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Cadastrar como ");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(90, 284, 79, 13);
		getContentPane().add(lblNewLabel_1_1_1_1_1_1_1);
		
		nome = new JTextField();
		nome.setBounds(194, 75, 147, 19);
		getContentPane().add(nome);
		nome.setColumns(10);
		
		dataNasc = new JTextField();
		dataNasc.setColumns(10);
		dataNasc.setBounds(194, 104, 147, 19);
		getContentPane().add(dataNasc);
		
		cpf = new JTextField();
		cpf.setColumns(10);
		cpf.setBounds(194, 130, 147, 19);
		getContentPane().add(cpf);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(194, 153, 147, 19);
		getContentPane().add(email);
		
		senha = new JTextField();
		senha.setColumns(10);
		senha.setBounds(194, 176, 147, 19);
		getContentPane().add(senha);
		
		endereco = new JTextField();
		endereco.setColumns(10);
		endereco.setBounds(194, 199, 147, 19);
		getContentPane().add(endereco);
		
		telefone = new JTextField();
		telefone.setColumns(10);
		telefone.setBounds(194, 222, 147, 19);
		getContentPane().add(telefone);
		
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
		
		
		
		JComboBox<Object> sexo = new JComboBox<Object>();
		sexo.setModel(new DefaultComboBoxModel<Object>(new String[] {"Selecione o sexo", "Masculino", "Feminino"}));
		sexo.setBounds(194, 246, 147, 17);
		getContentPane().add(sexo);
		
		JRadioButton cliente = new JRadioButton("Cliente");
		cliente.setBounds(194, 276, 60, 29);
		cliente.setActionCommand("cliente");
		getContentPane().add(cliente);
		
		JRadioButton proprietario = new JRadioButton("Proprietario");
		proprietario.setBounds(254, 279, 126, 23);
		proprietario.setActionCommand("proprietario");
		getContentPane().add(proprietario);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(cliente);
		grupo.add(proprietario);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Sexo");
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(90, 249, 45, 13);
		getContentPane().add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario usuario = new Usuario();
				String sx = sexo.getSelectedItem() == "Masculino"? "masculino" :"feminino";
				String permissao = grupo.getSelection().getActionCommand() == "cliente" ? "cliente" : "proprietario"; 
				usuario.cadastrar(nome.getText(), cpf.getText(), dataNasc.getText(),endereco.getText(), telefone.getText(), email.getText(), sx, permissao, senha.getText());
			}
		});
	}
}
