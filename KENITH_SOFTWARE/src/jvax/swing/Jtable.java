package jvax.swing;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTable;


public class Jtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jtable table = new Jtable();
		Object [] columns = {"NAME", "KEY ID", "DATE_BARROWED", "DATE_BARROWED"};
		DefaultTableModel model = new DefaultTableModel();
		
		JFrame frame = new JFrame("WINDOW");
		frame.getContentPane().setBackground(new Color(0,0,0));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100,100,100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		
		
		

	}

}
