package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceTelaInicial extends JFrame {

    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    InterfaceTelaInicial window = new InterfaceTelaInicial();
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
    public InterfaceTelaInicial() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 561, 427);
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Olá! Seja bem vindo ao nosso sistema.");
        lblNewLabel.setBounds(0, 0, 307, 21);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        getContentPane().add(lblNewLabel);
        
        JButton btnNewButton_1 = new JButton("Meu Perfil");
        btnNewButton_1.setBounds(418, 0, 79, 21);
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		new InterfaceDadosCliente().setVisible(true);
        	}
        });
        getContentPane().add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Reservas");
        btnNewButton_2.setBounds(420, 26, 77, 21);
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        		new InterfaceMinhaReserva().setVisible(true);
        	}
        });
        getContentPane().add(btnNewButton_2);
        
        JButton btnNewButton_2_1 = new JButton("Sair");
        btnNewButton_2_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        	}
        });
        btnNewButton_2_1.setBounds(418, 52, 79, 21);
        getContentPane().add(btnNewButton_2_1);

        textField_2 = new JTextField();
        textField_2.setBounds(0, 210, 96, 19);
        textField_2.setColumns(10);
        getContentPane().add(textField_2);

        textField = new JTextField();
        textField.setBounds(101, 210, 96, 19);
        textField.setColumns(10);
        getContentPane().add(textField);

        textField_1 = new JTextField();
        textField_1.setBounds(202, 210, 96, 19);
        textField_1.setColumns(10);
        getContentPane().add(textField_1);
        
                JButton btnNewButton = new JButton("Buscar Hotel\r\n");
                btnNewButton.setBounds(312, 234, 89, 21);
                btnNewButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        setVisible(false);
                        new InterfaceExibirBusca().setVisible(true);
                    }
                });
                getContentPane().add(btnNewButton);

        JLabel lblNewLabel_3 = new JLabel("Local");
        lblNewLabel_3.setBounds(32, 260, 32, 17);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        getContentPane().add(lblNewLabel_3);

        JLabel lblNewLabel_2 = new JLabel("Check-In");
        lblNewLabel_2.setBounds(120, 260, 57, 17);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        getContentPane().add(lblNewLabel_2);

        JLabel lblNewLabel_2_1 = new JLabel("Check-out");
        lblNewLabel_2_1.setBounds(222, 260, 64, 17);
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        getContentPane().add(lblNewLabel_2_1);
    }
}
