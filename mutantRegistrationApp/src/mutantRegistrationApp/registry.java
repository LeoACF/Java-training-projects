package mutantRegistrationApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.border.CompoundBorder;
import javax.swing.JFormattedTextField;

public class registry {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registry window = new registry();
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
	public registry() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 742, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("registration");
		lblNewLabel.setFont(new Font("MesloLGMDZ Nerd Font", Font.BOLD, 22));
		lblNewLabel.setBackground(new Color(14, 167, 241));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		table = new JTable();
		table.setBackground(new Color(14, 167, 241));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBorder(new CompoundBorder());
		frame.getContentPane().add(table, BorderLayout.CENTER);
	}

}
