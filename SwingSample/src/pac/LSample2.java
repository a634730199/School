package pac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LSample2 extends JFrame{

	public static void main(String[] args) {
		LSample2 frame = new LSample2("タイトル");
		frame.setVisible(true);

	}
	LSample2(String title){
		setTitle(title);
		setBounds(100,100,300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JPanel p = new JPanel();


		JLabel label1 = new JLabel("今日の天気：");
		label1.setForeground(Color.BLUE);
		label1.setBackground(Color.BLACK);


		JLabel label2 = new JLabel("晴れのち曇り");
		label2.setForeground(Color.ORANGE);
		label2.setBackground(Color.WHITE);
		label2.setOpaque(true);

		p.add(label1);
		p.add(label2);

		Container contentpane = getContentPane();
		contentpane.add(p,BorderLayout.CENTER);
	}

}
