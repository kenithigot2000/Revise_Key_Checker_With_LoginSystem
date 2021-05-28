package logger_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import javax.swing.border.MatteBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;






public class Key_Checker {

	private JFrame frame;
	private JTextField txtNAME_SLOT;
	private JTextField txtKEY_ID_SLOT;
	private JTextField txtDATE_BARROWED_SLOT;
	private JTextField txtDATE_RETURNED_SLOT;
	private JTextField txtSEARCHNAME;
	private JButton btnADD;
	private JButton btnCLEAR;
	private JButton btnUPDATE;
	private JButton btnDELETE;
	private JScrollPane scrollPane;
	private DefaultTableModel model;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Key_Checker window = new Key_Checker();
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
	public Key_Checker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.setBounds(100, 100, 832, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblKEY_LOG_SYSTEM = new JLabel("KEY LOG\r \r\nSYSTEM\r\r\n");
		lblKEY_LOG_SYSTEM.setBounds(309, 24, 180, 40);
		lblKEY_LOG_SYSTEM.setToolTipText("");
		lblKEY_LOG_SYSTEM.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblKEY_LOG_SYSTEM);
		
		JPanel Panel_KEY_LOG_SYSTEM = new JPanel();
		Panel_KEY_LOG_SYSTEM.setBounds(299, 24, 190, 40);
		Panel_KEY_LOG_SYSTEM.setBorder(new BevelBorder(BevelBorder.RAISED, SystemColor.textHighlight, SystemColor.textHighlight, SystemColor.textHighlight, SystemColor.textHighlight));
		frame.getContentPane().add(Panel_KEY_LOG_SYSTEM);
		
		JPanel panel_KEY_CHECKER = new JPanel();
		panel_KEY_CHECKER.setBounds(231, 69, 350, 47);
		panel_KEY_CHECKER.setBorder(new SoftBevelBorder(BevelBorder.RAISED, SystemColor.textHighlight, SystemColor.textHighlight, SystemColor.textHighlight, SystemColor.textHighlight));
		frame.getContentPane().add(panel_KEY_CHECKER);
		
		JLabel lblMR_KEY_CHECKER = new JLabel("Welcome Back Mr. Key Checker");
		panel_KEY_CHECKER.add(lblMR_KEY_CHECKER);
		lblMR_KEY_CHECKER.setVerticalAlignment(SwingConstants.TOP);
		lblMR_KEY_CHECKER.setBackground(Color.RED);
		lblMR_KEY_CHECKER.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JPanel panel_NAME = new JPanel();
		panel_NAME.setBounds(40, 151, 68, 35);
		panel_NAME.setBorder(new LineBorder(SystemColor.textHighlight));
		frame.getContentPane().add(panel_NAME);
		
		JLabel lblNAME = new JLabel("NAME");
		panel_NAME.add(lblNAME);
		lblNAME.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JPanel panel_KEY_ID = new JPanel();
		panel_KEY_ID.setBounds(178, 151, 68, 35);
		panel_KEY_ID.setBorder(new LineBorder(SystemColor.textHighlight));
		frame.getContentPane().add(panel_KEY_ID);
		
		JLabel lblKEY_ID = new JLabel("KEY ID");
		panel_KEY_ID.add(lblKEY_ID);
		lblKEY_ID.setVerticalAlignment(SwingConstants.TOP);
		lblKEY_ID.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JPanel panel_DATE_RETURNED = new JPanel();
		panel_DATE_RETURNED.setBounds(277, 151, 174, 35);
		panel_DATE_RETURNED.setBorder(new LineBorder(SystemColor.textHighlight));
		frame.getContentPane().add(panel_DATE_RETURNED);
		
		JLabel lblNewLabel = new JLabel("DATE BARROWED");
		panel_DATE_RETURNED.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JPanel panel_DATE_RETURN = new JPanel();
		panel_DATE_RETURN.setBounds(483, 151, 174, 35);
		panel_DATE_RETURN.setBorder(new LineBorder(SystemColor.textHighlight));
		frame.getContentPane().add(panel_DATE_RETURN);
		
		JLabel lblDATE_RETURNED = new JLabel("DATE RETURNED");
		panel_DATE_RETURN.add(lblDATE_RETURNED);
		lblDATE_RETURNED.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnLOGOUT = new JButton("LOGOUT");
		btnLOGOUT.addActionListener(new ActionListener()
		{private JFrame frame;
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("EXIT");
				if(JOptionPane.showConfirmDialog(frame,  "Confirm if you want to EXIT", "KEY LOG SYSTEM",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnLOGOUT.setBounds(706, 30, 89, 35);
		btnLOGOUT.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(btnLOGOUT);
		
		
		JButton btnSETTINGS = new JButton("SETTINGS");
		btnSETTINGS.setBounds(695, 81, 100, 35);
		btnSETTINGS.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(btnSETTINGS);
	
		JButton btnHOME = new JButton("HOME");
		btnHOME.setBounds(20, 40, 106, 47);
		btnHOME.setBackground(UIManager.getColor("ToolBar.dockingForeground"));
		btnHOME.setFont(new Font("Tahoma", Font.BOLD, 13));
		frame.getContentPane().add(btnHOME);
		
		txtNAME_SLOT = new JTextField();
		txtNAME_SLOT.setBounds(23, 216, 106, 29);
		frame.getContentPane().add(txtNAME_SLOT);
		txtNAME_SLOT.setColumns(10);
		
		txtKEY_ID_SLOT = new JTextField();
		txtKEY_ID_SLOT.setBounds(178, 216, 68, 29);
		frame.getContentPane().add(txtKEY_ID_SLOT);
		txtKEY_ID_SLOT.setColumns(10);
		
		txtDATE_BARROWED_SLOT = new JTextField();
		txtDATE_BARROWED_SLOT.setBounds(277, 216, 174, 29);
		frame.getContentPane().add(txtDATE_BARROWED_SLOT);
		txtDATE_BARROWED_SLOT.setColumns(10);
		
		txtDATE_RETURNED_SLOT = new JTextField();
		txtDATE_RETURNED_SLOT.setBounds(483, 216, 174, 29);
		frame.getContentPane().add(txtDATE_RETURNED_SLOT);
		txtDATE_RETURNED_SLOT.setColumns(10);
		
		
		  final Object [] row = new Object[4];
		//Button
		JButton btnADD = new JButton("ADD");
		btnADD.setBounds(667, 219, 59, 22);
		frame.getContentPane().add(btnADD);
		btnADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				row[0] = txtNAME_SLOT.getText(); 
				row[1] = txtKEY_ID_SLOT.getText();
				row[2] = txtDATE_BARROWED_SLOT.getText();
				row[3] = txtDATE_RETURNED_SLOT.getText();
				
				model.addRow(row);
			}
			
		});
		btnADD.setForeground(Color.BLACK);
		btnADD.setFont(new Font("Tahoma", Font.BOLD, 7));
		frame.getContentPane().add(btnADD);
		
		JButton btnCLEAR = new JButton("CLEAR");
		btnCLEAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNAME_SLOT.setText("");
				txtKEY_ID_SLOT.setText("");
				txtDATE_BARROWED_SLOT.setText("");
				txtDATE_RETURNED_SLOT.setText(null);
				
			}
		});
		btnCLEAR.setBounds(736, 219, 59, 22);
		btnCLEAR.setForeground(Color.BLACK);
		btnCLEAR.setFont(new Font("Tahoma", Font.BOLD, 7));
		frame.getContentPane().add(btnCLEAR);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 195, 796, 10);
		frame.getContentPane().add(separator);
		
		JPanel panel_SEARCH_NAME = new JPanel();
		panel_SEARCH_NAME.setBounds(209, 280, 344, 47);
		panel_SEARCH_NAME.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 255)));
		frame.getContentPane().add(panel_SEARCH_NAME);
		panel_SEARCH_NAME.setLayout(null);
		
		JLabel lblSEARCH_name = new JLabel("SEARCH NAME:");
		lblSEARCH_name.setVerticalAlignment(SwingConstants.TOP);
		lblSEARCH_name.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSEARCH_name.setBounds(10, 11, 182, 31);
		panel_SEARCH_NAME.add(lblSEARCH_name);
		
		JButton btnDELETE = new JButton("DELETE");
		btnDELETE.setBounds(727, 294, 68, 22);
		frame.getContentPane().add(btnDELETE);
		btnDELETE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				
				int k = table.getSelectedRow();
				if (k >= 0) {
					model.removeRow(k);
				}
				else {
					JOptionPane.showMessageDialog(frame, "DELETE ERROR");
				}
			}	
		});
		btnDELETE.setFont(new Font("Tahoma", Font.BOLD, 7));
		btnDELETE.setForeground(Color.BLACK);
		frame.getContentPane().add(btnDELETE);
		
		JButton btnUPDATE = new JButton("UPDATE");
		btnUPDATE.setBounds(649, 294, 68, 22);
		btnUPDATE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnUPDATE.setForeground(Color.BLACK);
		btnUPDATE.setFont(new Font("Tahoma", Font.BOLD, 7));
		frame.getContentPane().add(btnUPDATE);
		
		txtSEARCHNAME = new JTextField();
		txtSEARCHNAME.setBounds(143, 11, 187, 25);
		panel_SEARCH_NAME.add(txtSEARCHNAME);
		txtSEARCHNAME.setColumns(10);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 361, 785, 422);
		frame.getContentPane().add(scrollPane_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_2.setViewportView(scrollPane_1);
		scrollPane_1.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent event) {
				
			
			}

			@Override
			public void inputMethodTextChanged(InputMethodEvent event) {
				// TODO Auto-generated method stub
				
			}
		
		});
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setFont(new Font("Tahoma", Font.BOLD, 14));
		table.setBackground(Color.WHITE);
		scrollPane_1.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"NAME", "KEY ID", "DATE BARROWED", "DATE RETURNED"
			}
		));
		scrollPane_1.setViewportView(table);
		DefaultTableModel model1 = (DefaultTableModel)table.getModel();
		model = new DefaultTableModel();
		Object[] column = {"NAME","KEY ID","DATE BARROWED","DATE RETURNED"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(column);
		model.addRow(row);
	
		
		frame.revalidate();
		frame.setVisible(true);
	
	}
	protected Object parseInt(String text) {
		return null;
	}

	public JScrollPane getScrollPane_1() {
		return getScrollPane_1();
	}
}
