package day14;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboActionEx extends JFrame{

	
	public ComboActionEx () {
		setTitle("리스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
	
		String [] fruits = {"apple", "banana", "kiwi", "mango", "pear",
				"peach", "berry", "strawberry", "blackberry"};
		
		JComboBox<String> comboBox = new JComboBox<String>(fruits);
		
		c.add(comboBox);
		
		
		// 몇번쨰 있으면서 어떤 값인지 리턴.
		
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JComboBox<String> cb = (JComboBox)e.getSource();
			System.out.println(cb.getSelectedIndex());
			System.out.println(cb.getSelectedItem());
			
			
			}
		});
		
		
		setSize(300, 300);
		setVisible(true);
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ComboActionEx();
		
	}

}
