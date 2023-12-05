package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import br.edu.ifg.Usuario;
import br.edu.ifg.Hotel;
import br.edu.ifg.Quarto;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceExibirBusca extends JFrame {

	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// InterfaceExibirBusca window = new InterfaceExibirBusca();
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
	public InterfaceExibirBusca(Usuario usuario, Map<Integer, Hotel> hoteis) {
		initialize(usuario, hoteis);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Usuario usuario, Map<Integer, Hotel> hoteis) {
		int qtd = 0;
		for (Hotel hotel : hoteis.values()) {
			qtd += hotel.getQuartos().size();
		}

		Object[][] array = new Object[qtd][3];
		int rowIndex = 0;
		for (Hotel hotel : hoteis.values()) {
			array[rowIndex][0] = hotel.getNome();
			array[rowIndex][1] = hotel.getCidade();
			for (Quarto quarto : hotel.getQuartos().values()) {
				array[rowIndex][2] = quarto.getPreco(); // Adicione mais elementos conforme necessário
				rowIndex++;
				System.out.println(rowIndex);
			}
		}
		setBounds(100, 100, 504, 352);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Exibindo hotéis da pesquisa feita\r\n");
		lblNewLabel.setBounds(10, 10, 233, 13);
		getContentPane().add(lblNewLabel);

		table_1 = new JTable();
		table_1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table_1.setToolTipText("");

		table_1.setModel(new DefaultTableModel(
				new Object[][] {},
				new String[] { "Nome", "Cidade", "Preço" }));
		DefaultTableModel model = (DefaultTableModel) table_1.getModel();
		for (Hotel hotel : hoteis.values()) {
			for (Quarto quarto : hotel.getQuartos().values()) {
				Object[] resultado = { hotel.getNome(), hotel.getCidade(), quarto.getPreco() };
				model.addRow(resultado);
			}
		}
		// model.setRowCount(qtd); // Clear existing data
		table_1.setBounds(10, 33, 470, 272);
		getContentPane().add(table_1);

		JButton btnNewButton = new JButton("Reservar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new InterfaceReserva(usuario).setVisible(true);
			}
		});
		btnNewButton.setBounds(347, 6, 113, 21);
		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Inicio");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new InterfaceTelaInicial(usuario).setVisible(true);
			}
		});
		btnNewButton_1.setBounds(223, 6, 113, 21);
		getContentPane().add(btnNewButton_1);
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JTable getTable_1() {
		return table_1;
	}

	public void setTable_1(JTable table_1) {
		this.table_1 = table_1;
	}

}
