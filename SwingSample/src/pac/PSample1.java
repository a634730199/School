package pac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PSample1 extends JFrame{

	public static void main(String[] args) {
		PSample1 frame = new PSample1("タイトル");
		frame.setVisible(true);

	}
	PSample1(String title){
		setTitle(title);
		setBounds(100,100,300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1 = new JPanel();
		p1.setBackground(Color.BLUE);
		JPanel p2 = new JPanel();
		p2.setBackground(Color.ORANGE);
		Container contentpane = getContentPane();
		contentpane.add(p1,BorderLayout.NORTH);
		contentpane.add(p2,BorderLayout.SOUTH);
	}

}
