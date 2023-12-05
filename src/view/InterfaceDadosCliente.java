package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceDadosCliente extends JFrame {

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
                    InterfaceDadosCliente window = new InterfaceDadosCliente();
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
    public InterfaceDadosCliente() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
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

        textField = new JTextField();
        textField.setColumns(10);
        textField.setBounds(148, 85, 147, 19);
        getContentPane().add(textField);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(148, 114, 147, 19);
        getContentPane().add(textField_1);

        JLabel lblNewLabel_2 = new JLabel("Data de Nascimento");
        lblNewLabel_2.setBounds(44, 120, 94, 13);
        getContentPane().add(lblNewLabel_2);

        JLabel lblNewLabel_1_1 = new JLabel("CPF");
        lblNewLabel_1_1.setBounds(44, 143, 45, 13);
        getContentPane().add(lblNewLabel_1_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(148, 140, 147, 19);
        getContentPane().add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(148, 163, 147, 19);
        getContentPane().add(textField_3);

        JLabel lblNewLabel_1_1_1 = new JLabel("E-mail");
        lblNewLabel_1_1_1.setBounds(44, 166, 45, 13);
        getContentPane().add(lblNewLabel_1_1_1);

        JLabel lblNewLabel_1_1_1_1 = new JLabel("Senha");
        lblNewLabel_1_1_1_1.setBounds(44, 189, 45, 13);
        getContentPane().add(lblNewLabel_1_1_1_1);

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(148, 186, 147, 19);
        getContentPane().add(textField_4);

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(148, 209, 147, 19);
        getContentPane().add(textField_5);

        JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Endereço");
        lblNewLabel_1_1_1_1_1.setBounds(44, 212, 45, 13);
        getContentPane().add(lblNewLabel_1_1_1_1_1);

        JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Telefone");
        lblNewLabel_1_1_1_1_1_1.setBounds(44, 235, 60, 13);
        getContentPane().add(lblNewLabel_1_1_1_1_1_1);

        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(148, 232, 147, 19);
        getContentPane().add(textField_6);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"Masculino", "Feminino", "Não Binário"}));
        comboBox.setBounds(148, 256, 147, 17);
        getContentPane().add(comboBox);

        JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Sexo");
        lblNewLabel_1_1_1_1_1_1_1.setBounds(44, 258, 45, 13);
        getContentPane().add(lblNewLabel_1_1_1_1_1_1_1);

        JButton btnNewButton = new JButton("Salvar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
				new InterfaceTelaInicial().setVisible(true);
        	}
        });
        btnNewButton.setBounds(362, 285, 85, 21);
        getContentPane().add(btnNewButton);
    }
}
