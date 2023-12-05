package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.edu.ifg.Usuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceMinhaReserva extends JFrame {

	private JTable table;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// InterfaceMinhaReserva window = new InterfaceMinhaReserva();
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
	public InterfaceMinhaReserva(Usuario usuario) {
		initialize(usuario);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Usuario usuario) {

		setBounds(100, 100, 475, 320);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblMinhasReservas = new JLabel("Minhas Reservas");
		lblMinhasReservas.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblMinhasReservas.setBounds(10, 10, 187, 23);
		getContentPane().add(lblMinhasReservas);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
						{ null, null, null },
				},
				new String[] {
						"Local", "Pre\u00E7o", "Check-In"
				}));
		table.setBounds(10, 56, 441, 217);
		getContentPane().add(table);

		JButton btnNewButton = new JButton("Inicio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new InterfaceTelaInicial(usuario).setVisible(true);
			}
		});
		btnNewButton.setBounds(344, 17, 85, 21);
		getContentPane().add(btnNewButton);
	}
}
