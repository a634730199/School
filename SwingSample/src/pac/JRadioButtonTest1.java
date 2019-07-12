package pac;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButtonTest1 extends JFrame {

	public static void main(String[] args) {
		JRadioButtonTest1 frame = new JRadioButtonTest1();
		frame.setVisible(true);
	}



	JRadioButtonTest1(){
		JRadioButton rb1,rb2,rb3;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		rb1 = new JRadioButton();
		rb2 = new JRadioButton("PUSH");

		ImageIcon icon1 = new ImageIcon("car.gif");
		ImageIcon icon = new ImageIcon("house.gif");

		rb3 = new JRadioButton(icon);
		rb3 = new JRadioButton("PUSH",icon);
		rb3.setSelectedIcon(icon1);

		ButtonGroup g = new ButtonGroup();
		g.add(rb1);
		g.add(rb2);
		g.add(rb3);

		Color c = new Color(200,200,200);
		rb1.setBackground(c);
		rb2.setBackground(c);
		rb3.setBackground(c);

		JPanel panel = new JPanel(new FlowLayout());
		panel.add(rb1);
		panel.add(rb2);
		panel.add(rb3);

		add(panel);
		setTitle("JRadioButtonTest");
		setSize(300,150);
		setVisible(true);

	}

}
