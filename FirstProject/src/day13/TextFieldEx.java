package day13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {

	public TextFieldEx() {
		setTitle("체크박스 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름 :"));
		c.add(new JTextField(20));
		c.add(new JLabel("주소 :"));
		c.add(new JTextField(20));
		
		c.add(new JLabel("취미 :"));
		JCheckBox game = new JCheckBox("게임");
		JCheckBox movie = new JCheckBox("영화감상");
		JCheckBox read = new JCheckBox("독서");
		JCheckBox cd = new JCheckBox("코딩");
		
		c.add(game);
		c.add(movie);
		c.add(read);
		c.add(cd);
		
		
		c.add(new JLabel("성별 :"));
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton man = new JRadioButton("남");
		JRadioButton female = new JRadioButton("여");
		
		group.add(female);
		group.add(man);
		
		c.add(female);
		c.add(man);
		
		
		JButton save = new JButton("저장");
		c.add(save);
		
		
		setSize(300, 200);
		setVisible(true);
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();
		

	}

}
