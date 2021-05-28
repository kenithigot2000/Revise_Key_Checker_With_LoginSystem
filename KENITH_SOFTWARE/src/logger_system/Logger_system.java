package logger_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import logger_system.Key_Checker;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Logger_system {

	private JFrame frame;
	private JTextField txtUSERNAME;
	private JPasswordField txtPASSWORD;

	/**
	 * Launch the application.
	 */
	public static void main (String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logger_system window = new Logger_system();
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
	public Logger_system() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 552, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblKEY_LOG_SYSTEM = new JLabel("KEY LOG SYSTEM");
		lblKEY_LOG_SYSTEM.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblKEY_LOG_SYSTEM.setBounds(120, 50, 287, 52);
		frame.getContentPane().add(lblKEY_LOG_SYSTEM);
		
		JLabel lblUSERNAME = new JLabel("USERNAME");
		lblUSERNAME.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUSERNAME.setBounds(101, 148, 123, 45);
		frame.getContentPane().add(lblUSERNAME);
		
		JLabel lblPASSWORD = new JLabel("PASSWORD");
		lblPASSWORD.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPASSWORD.setBounds(101, 221, 123, 45);
		frame.getContentPane().add(lblPASSWORD);
		
		txtUSERNAME = new JTextField();
		txtUSERNAME.setBackground(Color.WHITE);
		txtUSERNAME.setBounds(250, 158, 194, 32);
		frame.getContentPane().add(txtUSERNAME);
		txtUSERNAME.setColumns(10);
		
		txtPASSWORD = new JPasswordField();
		txtPASSWORD.setBackground(Color.WHITE);
		txtPASSWORD.setBounds(250, 231, 194, 32);
		frame.getContentPane().add(txtPASSWORD);
		
		JButton btnLOGIN = new JButton("LOGIN");
		btnLOGIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String PASSWORD = txtPASSWORD.getText();
				String USERNAME = txtUSERNAME.getText();
				
				if(PASSWORD.contains("igot") && USERNAME.contains("kenith")){
					txtPASSWORD.setText(null);
					txtUSERNAME.setText(null);
					
					Key_Checker info = new Key_Checker();
					Key_Checker.main(null);
					
					
				}				
				else {
					JOptionPane.showMessageDialog(null,"Invalid Login Username and Password", "Login Error",JOptionPane.ERROR_MESSAGE);
					txtUSERNAME.setText(null);
					txtPASSWORD.setText(null);
				}
		}
			
		});
		btnLOGIN.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLOGIN.setBackground(Color.RED);
		btnLOGIN.setBounds(86, 317, 89, 32);
		frame.getContentPane().add(btnLOGIN);
		
		JButton btnRESET = new JButton("RESET");
		btnRESET.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUSERNAME.setText(null);
				txtPASSWORD.setText(null);
			}
		});
		btnRESET.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRESET.setBackground(Color.RED);
		btnRESET.setBounds(227, 317, 89, 32);
		frame.getContentPane().add(btnRESET);
		
		JButton btnEXIT = new JButton("EXIT");
		btnEXIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmKEY_LOG_SYSTEM = new JFrame("EXIT");
			  if (JOptionPane.showConfirmDialog(frmKEY_LOG_SYSTEM, "Confirm if you want to exit", "Login System",
				  JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
				  	System.exit(0);
			  }
			}
		});
		btnEXIT.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnEXIT.setBackground(Color.RED);
		btnEXIT.setBounds(374, 317, 89, 32);
		frame.getContentPane().add(btnEXIT);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(36, 292, 456, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(36, 113, 456, 2);
		frame.getContentPane().add(separator_1);
	}
}
