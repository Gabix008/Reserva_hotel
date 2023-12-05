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
        setBounds(100, 100, 525, 397);

        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{96, 96, 96, 60, 104, 0};
        gridBagLayout.rowHeights = new int[]{15, 13, 132, 19, 13, 0};
        gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        getContentPane().setLayout(gridBagLayout);

        JLabel lblNewLabel = new JLabel("Olá! Seja bem vindo ao nosso sistema.");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
        gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel.gridwidth = 3;
        gbc_lblNewLabel.gridx = 0;
        gbc_lblNewLabel.gridy = 0;
        getContentPane().add(lblNewLabel, gbc_lblNewLabel);
        
        JButton btnNewButton_1 = new JButton("Meu Perfil");
        GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
        gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
        gbc_btnNewButton_1.gridx = 4;
        gbc_btnNewButton_1.gridy = 0;
        getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("Reservas");
        GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
        gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
        gbc_btnNewButton_2.gridx = 4;
        gbc_btnNewButton_2.gridy = 1;
        getContentPane().add(btnNewButton_2, gbc_btnNewButton_2);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        GridBagConstraints gbc_textField_2 = new GridBagConstraints();
        gbc_textField_2.anchor = GridBagConstraints.NORTHWEST;
        gbc_textField_2.insets = new Insets(0, 0, 5, 5);
        gbc_textField_2.gridx = 0;
        gbc_textField_2.gridy = 3;
        getContentPane().add(textField_2, gbc_textField_2);

        textField = new JTextField();
        textField.setColumns(10);
        GridBagConstraints gbc_textField = new GridBagConstraints();
        gbc_textField.anchor = GridBagConstraints.NORTHWEST;
        gbc_textField.insets = new Insets(0, 0, 5, 5);
        gbc_textField.gridx = 1;
        gbc_textField.gridy = 3;
        getContentPane().add(textField, gbc_textField);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        GridBagConstraints gbc_textField_1 = new GridBagConstraints();
        gbc_textField_1.anchor = GridBagConstraints.NORTHWEST;
        gbc_textField_1.insets = new Insets(0, 0, 5, 5);
        gbc_textField_1.gridx = 2;
        gbc_textField_1.gridy = 3;
        getContentPane().add(textField_1, gbc_textField_1);

        JButton btnNewButton = new JButton("Buscar Hotel\r\n");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Adicione aqui a lógica para lidar com o botão
            }
        });
        GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
        gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
        gbc_btnNewButton.gridx = 3;
        gbc_btnNewButton.gridy = 3;
        getContentPane().add(btnNewButton, gbc_btnNewButton);

        JLabel lblNewLabel_3 = new JLabel("Local");
        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
        gbc_lblNewLabel_3.insets = new Insets(0, 0, 0, 5);
        gbc_lblNewLabel_3.gridx = 0;
        gbc_lblNewLabel_3.gridy = 4;
        getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);

        JLabel lblNewLabel_2 = new JLabel("Check-In");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
        gbc_lblNewLabel_2.fill = GridBagConstraints.VERTICAL;
        gbc_lblNewLabel_2.insets = new Insets(0, 0, 0, 5);
        gbc_lblNewLabel_2.gridx = 1;
        gbc_lblNewLabel_2.gridy = 4;
        getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);

        JLabel lblNewLabel_2_1 = new JLabel("Check-out");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        GridBagConstraints gbc_lblNewLabel_2_1 = new GridBagConstraints();
        gbc_lblNewLabel_2_1.fill = GridBagConstraints.VERTICAL;
        gbc_lblNewLabel_2_1.insets = new Insets(0, 0, 0, 5);
        gbc_lblNewLabel_2_1.gridx = 2;
        gbc_lblNewLabel_2_1.gridy = 4;
        getContentPane().add(lblNewLabel_2_1, gbc_lblNewLabel_2_1);
    }
}
