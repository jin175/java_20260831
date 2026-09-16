package day13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex1 extends JFrame {
	
	public Ex1() {
		// TODO Auto-generated constructor stub
		setTitle("마우스 모션");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		for(int i=0; i<5; i++) {
			JButton btn = new JButton("0");
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton b = (JButton) e.getSource();
					int count = Integer.parseInt(b.getText());
					b.setText((count+1)+"");
					
				}
			});

			c.add(btn);
		}
		
		
		
		
		setSize(500, 100);
		setVisible(true);
	}
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex1 ();
	
	}
}
