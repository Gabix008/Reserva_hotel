package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

public class InterfaceExibirBusca {

	private JFrame frame;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceExibirBusca window = new InterfaceExibirBusca();
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
	public InterfaceExibirBusca() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Exibindo hotéis da pesquisa feita\r\n");
		lblNewLabel.setBounds(10, 10, 149, 13);
		frame.getContentPane().add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(57, 90, 1, 1);
		frame.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"Nome", "Local", "Pre\u00E7o", "Saiba mais"
			}
		));
		table_1.setToolTipText("");
		table_1.setBounds(10, 33, 416, 220);
		frame.getContentPane().add(table_1);
	}
}
