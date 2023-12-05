package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import br.edu.ifg.Usuario;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceDadosCliente extends JFrame {

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
    // public static void main(String[] args) {
    // EventQueue.invokeLater(new Runnable() {
    // public void run() {
    // try {
    // InterfaceDadosCliente window = new InterfaceDadosCliente();
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
    public InterfaceDadosCliente(Usuario usuario) {
        initialize(usuario);
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize(Usuario usuario) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 487, 353);
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Meus dados");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblNewLabel.setBounds(10, 10, 163, 23);
        getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Nome");
        lblNewLabel_1.setBounds(44, 88, 45, 13);
        getContentPane().add(lblNewLabel_1);

        nome = new JTextField();
        nome.setColumns(10);
        nome.setBounds(148, 85, 147, 19);
        getContentPane().add(nome);

        dataNasc = new JTextField();
        dataNasc.setColumns(10);
        dataNasc.setBounds(148, 114, 147, 19);
        getContentPane().add(dataNasc);

        JLabel lblNewLabel_2 = new JLabel("Data de Nascimento");
        lblNewLabel_2.setBounds(44, 120, 94, 13);
        getContentPane().add(lblNewLabel_2);

        JLabel lblNewLabel_1_1 = new JLabel("CPF");
        lblNewLabel_1_1.setBounds(44, 143, 45, 13);
        getContentPane().add(lblNewLabel_1_1);

        cpf = new JTextField();
        cpf.setColumns(10);
        cpf.setBounds(148, 140, 147, 19);
        getContentPane().add(cpf);

        email = new JTextField();
        email.setColumns(10);
        email.setBounds(148, 163, 147, 19);
        getContentPane().add(email);

        JLabel lblNewLabel_1_1_1 = new JLabel("E-mail");
        lblNewLabel_1_1_1.setBounds(44, 166, 45, 13);
        getContentPane().add(lblNewLabel_1_1_1);

        JLabel lblNewLabel_1_1_1_1 = new JLabel("Senha");
        lblNewLabel_1_1_1_1.setBounds(44, 189, 45, 13);
        getContentPane().add(lblNewLabel_1_1_1_1);

        senha = new JTextField();
        senha.setColumns(10);
        senha.setBounds(148, 186, 147, 19);
        getContentPane().add(senha);

        endereco = new JTextField();
        endereco.setColumns(10);
        endereco.setBounds(148, 209, 147, 19);
        getContentPane().add(endereco);

        JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Endereço");
        lblNewLabel_1_1_1_1_1.setBounds(44, 212, 45, 13);
        getContentPane().add(lblNewLabel_1_1_1_1_1);

        JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Telefone");
        lblNewLabel_1_1_1_1_1_1.setBounds(44, 235, 60, 13);
        getContentPane().add(lblNewLabel_1_1_1_1_1_1);

        telefone = new JTextField();
        telefone.setColumns(10);
        telefone.setBounds(148, 232, 147, 19);
        getContentPane().add(telefone);

        JComboBox<String> sexo = new JComboBox<>();
        sexo.setModel(new DefaultComboBoxModel<>(new String[] {"Masculino", "Feminino"}));
        sexo.setBounds(148, 256, 147, 17);
        getContentPane().add(sexo);

        JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Sexo");
        lblNewLabel_1_1_1_1_1_1_1.setBounds(44, 258, 45, 13);
        getContentPane().add(lblNewLabel_1_1_1_1_1_1_1);

        JButton btnNewButton = new JButton("Salvar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
				new InterfaceTelaInicial(usuario).setVisible(true);
				String sx = sexo.getSelectedItem() == "Masculino" ? "masculino" : "feminino";
				usuario.editarUsuario(usuario.getId(), nome.getText(), cpf.getText(), dataNasc.getText(), endereco.getText(), telefone.getText(), email.getText(), sx,usuario.getPermissao() == Permissao.CLIENTE? "cliente": "proprietario", senha.getText());
        	}
        });
        btnNewButton.setBounds(362, 285, 85, 21);
        getContentPane().add(btnNewButton);
    }
}
