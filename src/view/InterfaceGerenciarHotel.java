package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class InterfaceGerenciarHotel {

	private JFrame frame;
	private JTable table;
	private JRadioButton selecionar;
	private JRadioButton selecionar_1;
	private JRadioButton selecionar_2;
	private JRadioButton selecionar_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceGerenciarHotel window = new InterfaceGerenciarHotel();
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
	public InterfaceGerenciarHotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 734, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GERENCIE AS RESERVAS DO SEU HOTEL");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(116, -2, 469, 101);
		frame.getContentPane().add(lblNewLabel);
		
		table = new JTable();
		table.setBorder(UIManager.getBorder("Button.border"));
		table.setToolTipText("");
		table.setSurrendersFocusOnKeystroke(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"ID Reserva", "Cliente", "Per\u00EDodo da Reserva", "Valor da Reserva", "Selecione"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(102);
		table.getColumnModel().getColumn(3).setPreferredWidth(89);
		table.setBounds(24, 109, 667, 69);
		frame.getContentPane().add(table);
		
		selecionar = new JRadioButton("Selecionar");
		selecionar.setForeground(Color.DARK_GRAY);
		selecionar.setBounds(573, 106, 103, 21);
		frame.getContentPane().add(selecionar);
		
		selecionar_1 = new JRadioButton("Selecionar");
		selecionar_1.setForeground(Color.DARK_GRAY);
		selecionar_1.setBounds(573, 129, 103, 21);
		frame.getContentPane().add(selecionar_1);
		
		selecionar_2 = new JRadioButton("Selecionar");
		selecionar_2.setSelected(true);
		selecionar_2.setForeground(Color.DARK_GRAY);
		selecionar_2.setBounds(573, 140, 103, 21);
		frame.getContentPane().add(selecionar_2);
		
		selecionar_3 = new JRadioButton("Selecionar");
		selecionar_3.setSelected(true);
		selecionar_3.setHorizontalAlignment(SwingConstants.RIGHT);
		selecionar_3.setForeground(Color.DARK_GRAY);
		selecionar_3.setBounds(573, 152, 103, 21);
		frame.getContentPane().add(selecionar_3);
		
		JButton Excluir = new JButton("EXCLUIR");
		Excluir.setFont(new Font("Tahoma", Font.BOLD, 10));
		Excluir.setBounds(116, 232, 108, 42);
		frame.getContentPane().add(Excluir);
		
		JButton Visualizar = new JButton("VISUALIZAR");
		Visualizar.setFont(new Font("Tahoma", Font.BOLD, 10));
		Visualizar.setBounds(401, 232, 108, 42);
		frame.getContentPane().add(Visualizar);
	}
}
