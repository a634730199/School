package pac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PSample4 extends JFrame{

	public static void main(String[] args) {
		PSample4 frame = new PSample4("タイトル");
		frame.setVisible(true);

	}
	PSample4(String title){
		setTitle(title);
		setBounds(100,100,300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());


		JPanel p = new JPanel();
		p.setPreferredSize(new Dimension(200,100));
		p.setBackground(Color.ORANGE);
		p.setLayout(new BorderLayout());

		JButton btn1 = new JButton("NORTH");
		JButton btn2 = new JButton("SOUTH");
		p.add(btn1,BorderLayout.NORTH);
		p.add(btn2,BorderLayout.SOUTH);

		Container contentpane = getContentPane();
		contentpane.add(p);
	}

}