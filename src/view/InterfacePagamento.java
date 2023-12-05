package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import br.edu.ifg.Pix;
import br.edu.ifg.Reserva;
import br.edu.ifg.Usuario;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class InterfacePagamento extends JFrame {

	private JTextField valor;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField codigo;
	private JTextField reserva;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario usuario = new Usuario();
					usuario.login("gabi@gmail.com", "123");
					InterfacePagamento window = new InterfacePagamento();
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
	public InterfacePagamento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 506, 378);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pagamento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 10, 81, 20);
		getContentPane().add(lblNewLabel);
		
		JLabel lblValor = new JLabel("Valor Total");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValor.setBounds(298, 256, 81, 20);
		getContentPane().add(lblValor);
		
		 
		JButton btnNewButton = new JButton("Pagar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new InterfaceConfirmacao().setVisible(true);
			}
		});
		btnNewButton.setBounds(366, 299, 108, 29);
		getContentPane().add(btnNewButton);
		
		JLabel lblNmeroCarto = new JLabel("Número Cartão");
		lblNmeroCarto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNmeroCarto.setBounds(10, 190, 108, 20);
		getContentPane().add(lblNmeroCarto);
		
		JLabel lblDataValidade = new JLabel("Data Validade");
		lblDataValidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDataValidade.setBounds(10, 217, 101, 20);
		getContentPane().add(lblDataValidade);
		
		JLabel lblCvv = new JLabel("CVV");
		lblCvv.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCvv.setBounds(10, 248, 59, 20);
		getContentPane().add(lblCvv);
		
		JLabel lblParcelas = new JLabel("Parcelas");
		lblParcelas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblParcelas.setBounds(10, 279, 59, 20);
		getContentPane().add(lblParcelas);
		
		valor = new JTextField();
		valor.setColumns(10);
		valor.setBounds(389, 258, 85, 19);
		getContentPane().add(valor);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(142, 192, 108, 19);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(142, 222, 108, 19);
		getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(142, 250, 108, 19);
		getContentPane().add(textField_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"A vista", "1x", "2x", "3x", "4x"}));
		comboBox.setBounds(142, 281, 108, 21);
		getContentPane().add(comboBox);
		
		JLabel lblPix = new JLabel("Código");
		lblPix.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPix.setBounds(19, 70, 81, 20);
		getContentPane().add(lblPix);
		
		codigo = new JTextField();
		codigo.setColumns(10);
		codigo.setBounds(98, 72, 134, 19);
		getContentPane().add(codigo);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Pix");
		rdbtnNewRadioButton.setBounds(9, 37, 109, 23);
		getContentPane().add(rdbtnNewRadioButton);
			
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Cartão de credito");
		rdbtnNewRadioButton_1.setBounds(9, 155, 109, 23);
		getContentPane().add(rdbtnNewRadioButton_1);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbtnNewRadioButton);
		grupo.add(rdbtnNewRadioButton_1);
	
		
		JButton btnGerarCdigo = new JButton("Gerar código");
		btnGerarCdigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGerarCdigo.setBounds(10, 113, 108, 29);
		
		getContentPane().add(btnGerarCdigo);
		
		JLabel lblValor_1 = new JLabel("Reserva");
		lblValor_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValor_1.setBounds(298, 222, 81, 20);
		getContentPane().add(lblValor_1);
		
		reserva = new JTextField();
		reserva.setColumns(10);
		reserva.setBounds(389, 222, 85, 19);
		getContentPane().add(reserva);
		
				
	}
}
