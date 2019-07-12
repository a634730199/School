package pac;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JTextAreaTest1 extends JFrame {

	JTextAreaTest1(){
		JTextArea textarea1 = new JTextArea("12345678901",4,5);
		JPanel p = new JPanel();
		textarea1.setBackground(new Color(200,240,240));
		textarea1.append("\n追加文\nabcdefg\nghijklmn");
		p.add(textarea1);
		add(p,BorderLayout.CENTER);
	}

	public static void main(String[] args) {

		JTextAreaTest1 frame = new JTextAreaTest1();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(10,10,200,140);
		frame.setTitle("JTextAreaTest");
		frame.setVisible(true);

	}

}
