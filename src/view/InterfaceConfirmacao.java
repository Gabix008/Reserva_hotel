package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceConfirmacao extends JFrame{


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceConfirmacao window = new InterfaceConfirmacao();
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
	public InterfaceConfirmacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 526, 345);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pagamento Concluido Com Sucesso!\r\n");
		lblNewLabel.setBounds(41, 98, 438, 29);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		getContentPane().add(lblNewLabel);
		
		JLabel lblAcesseSuasReservas = new JLabel(" Acesse suas reservas para visualizar mais informações");
		lblAcesseSuasReservas.setBounds(26, 193, 453, 20);
		lblAcesseSuasReservas.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblAcesseSuasReservas);
		
		JButton btnNewButton = new JButton("Ínicio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new InterfaceTelaInicial().setVisible(true);
			}
		});
		btnNewButton.setBounds(417, 277, 85, 21);
		getContentPane().add(btnNewButton);
		
		JButton btnReservas = new JButton("Reservas");
		btnReservas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new InterfaceMinhaReserva().setVisible(true);
			}
		});
		btnReservas.setBounds(296, 277, 111, 21);
		getContentPane().add(btnReservas);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBounds(205, 277, 81, 21);
		getContentPane().add(btnSair);
	}
}
