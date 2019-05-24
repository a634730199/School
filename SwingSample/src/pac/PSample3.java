package pac;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PSample3 extends JFrame{

	public static void main(String[] args) {
		PSample3 frame = new PSample3("タイトル");
		frame.setVisible(true);

	}
	PSample3(String title){
		setTitle(title);
		setBounds(100,100,300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());


		JPanel p = new JPanel();
		p.setPreferredSize(new Dimension(200,100));
		p.setBackground(Color.ORANGE);

		JLabel label = new JLabel("入場者数");
		JTextField text = new JTextField(5);

		p.add(label);
		p.add(text);

		Container contentpane = getContentPane();
		contentpane.add(p);
	}

}