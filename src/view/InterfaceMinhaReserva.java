package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InterfaceMinhaReserva {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceMinhaReserva window = new InterfaceMinhaReserva();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfaceMinhaReserva() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 475, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMinhasReservas = new JLabel("Minhas Reservas");
		lblMinhasReservas.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblMinhasReservas.setBounds(10, 10, 187, 23);
		frame.getContentPane().add(lblMinhasReservas);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"ID Reserva", "Local"
			}
		));
		table.setBounds(10, 56, 441, 217);
		frame.getContentPane().add(table);
	}

}
