package pac;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class PSample2 extends JFrame{

	public static void main(String[] args) {
		PSample2 frame = new PSample2("タイトル");
		frame.setVisible(true);

	}
	PSample2(String title){
		setTitle(title);
		setBounds(100,100,300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());


		JPanel p1 = new JPanel();
		p1.setPreferredSize(new Dimension(100,50));
		p1.setBackground(Color.BLUE);
		JPanel p2 = new JPanel();
		p2.setPreferredSize(new Dimension(50,100));
		p2.setBackground(Color.ORANGE);

		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
		p2.setBorder(border);

		Container contentpane = getContentPane();
		contentpane.add(p1);
		contentpane.add(p2);
	}

}