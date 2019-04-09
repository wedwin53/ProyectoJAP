package forms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import notas.Notas;

import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import vendedor.Vendedor;
import vendedor.Vendedores;
import producto.Productos;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;

public class NotasForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtTotalVenta;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotasForm frame = new NotasForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NotasForm() {
		setResizable(false);
		setBackground(Color.WHITE);
		setTitle("PROYECTO JAP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 200, 707, 645);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.BOLD, 18));
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmReporteGeneral = new JMenuItem("Reporte General");
		mnMenu.add(mntmReporteGeneral);
		
		JMenuItem mntmReporteRendimiento = new JMenuItem("Reporte de Vendedores");
		mnMenu.add(mntmReporteRendimiento);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngresoDeVenta = new JLabel("INGRESO DE NOTAS DE VENTA");
		lblIngresoDeVenta.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 16));
		lblIngresoDeVenta.setBounds(208, 13, 267, 42);
		contentPane.add(lblIngresoDeVenta);
		
		JComboBox cmbVendedores = new JComboBox();
		cmbVendedores.setModel(new DefaultComboBoxModel(Vendedores.values()));
		cmbVendedores.setBounds(60, 117, 213, 22);
		contentPane.add(cmbVendedores);
		
		JLabel lblCodVendedor = new JLabel("Cod. Vendedor:");
		lblCodVendedor.setBounds(60, 97, 114, 16);
		contentPane.add(lblCodVendedor);
		
		JComboBox cboProductos = new JComboBox();
		cboProductos.setModel(new DefaultComboBoxModel(Productos.values()));
		cboProductos.setBounds(372, 117, 213, 22);
		contentPane.add(cboProductos);
		
		JLabel lblCodProducto = new JLabel("Cod. Producto:");
		lblCodProducto.setBounds(372, 97, 147, 16);
		contentPane.add(lblCodProducto);
		
		JLabel lbltotalVenta = new JLabel("$Total Venta:");
		lbltotalVenta.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbltotalVenta.setBounds(60, 193, 147, 16);
		contentPane.add(lbltotalVenta);
		
		txtTotalVenta = new JTextField();
		txtTotalVenta.setBounds(60, 222, 213, 22);
		contentPane.add(txtTotalVenta);
		txtTotalVenta.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 53, 651, 2);
		contentPane.add(separator);
		
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				// JOptionPane.showMessageDialog(null, "Guardado Exitosamente!");

				Notas nota = new Notas(cmbVendedores.getSelectedIndex(), cboProductos.getSelectedIndex(), Integer.parseInt(txtTotalVenta.getText()));
				listaVendedor.add(nota);
				mostrar();
			}
		});
		
		
		
		btnRegistrar.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnRegistrar.setBounds(372, 208, 176, 48);
		contentPane.add(btnRegistrar);
		
		table_3 = new JTable();
		table_3.setForeground(new Color(0, 0, 0));
		table_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		table_3.setBounds(12, 352, 677, 219);
		contentPane.add(table_3);
		table_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Productos", "Vendedor001", "Vendedor002", "Vendedor003", "Vendedor004"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_3.getColumnModel().getColumn(1).setPreferredWidth(116);
		table_3.getColumnModel().getColumn(2).setPreferredWidth(118);
		table_3.getColumnModel().getColumn(3).setPreferredWidth(106);
		table_3.getColumnModel().getColumn(4).setPreferredWidth(101);
		
		
	}
	
	ArrayList<Notas> listaVendedor = new ArrayList<Notas>();
	
	public void mostrar() {
		String matriz[][] = new String [listaVendedor.size()][4];
		for (int i = 0; i < listaVendedor.size(); i++) {
			matriz[i][0] = listaVendedor.get(i).getCodProducto().toString();
			matriz[i][1] = listaVendedor.get(i).getCodVendedor().toString();
			matriz[i][2] = listaVendedor.get(i).getMontoVendido().toString();
		}
		
		// cargamos los datos en la tabla
		table_3.setModel(new DefaultTableModel(
				matriz,
				new String[] {
					"Productos", "Vendedor001", "Vendedor002", "Vendedor003", "Vendedor004"
				}
		));
	}
}
