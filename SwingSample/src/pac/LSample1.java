package pac;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LSample1 extends JFrame{

	public static void main(String[] args) {
		LSample1 frame = new LSample1("タイトル");
		frame.setVisible(true);

	}
	LSample1(String title){
		setTitle(title);
		setBounds(100,100,300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel();
		JLabel label1 = new JLabel("今日の天気：");
		JLabel label2 = new JLabel();
		label2.setText("晴れのち曇り");
		p.add(label1);
		p.add(label2);

		Container contentpane = getContentPane();
		contentpane.add(p,BorderLayout.CENTER);
	}

}
