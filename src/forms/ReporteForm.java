package forms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;

public class ReporteForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReporteForm frame = new ReporteForm();
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
	public ReporteForm() {
		getContentPane().setBackground(Color.WHITE);
		setResizable(false);
		setBackground(Color.WHITE);
		setTitle("PROYECTO JAP - Reporte");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 200, 758, 456);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.BOLD, 18));
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnMenu.add(mntmSalir);
		getContentPane().setLayout(null);
		
		JLabel lblReporteGeneralDe = new JLabel("Reporte General de Ventas");
		lblReporteGeneralDe.setFont(new Font("Lucida Sans", Font.BOLD, 16));
		lblReporteGeneralDe.setBounds(250, 13, 228, 29);
		getContentPane().add(lblReporteGeneralDe);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(184, 40, 347, 2);
		getContentPane().add(separator);
		
		
	}

}
