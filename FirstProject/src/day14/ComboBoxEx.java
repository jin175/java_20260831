package day14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxEx extends JFrame {
	
	public ComboBoxEx () {
		setTitle("리스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		String [] fruits = {"apple", "banana", "kiwi", "mango", "pear",
				"peach", "berry", "strawberry", "blackberry"};
			
		JComboBox<String> comboBox = new JComboBox<String>();
		
		c.add(comboBox);
		
		
		JComboBox<String> comboBox2 = new JComboBox<String>(fruits);
		comboBox2.addItem("zzz");
		
		
		for(int i=0; i<fruits.length; i++) {
			comboBox2.addItem(fruits[i]);
		}
		
		
		c.add(comboBox2);
		
		setSize(300, 300);
		setVisible(true);
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboBoxEx();
		
	}

}
