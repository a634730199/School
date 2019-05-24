package pac;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LSample3 extends JFrame{

	public static void main(String[] args) {
		LSample3 frame = new LSample3("タイトル");
		frame.setVisible(true);

	}
	LSample3(String title){
		setTitle(title);
		setBounds(100,100,300,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JPanel p = new JPanel();


		JLabel label1 = new JLabel("今日の日付：");
		label1.setFont(new Font("MS ゴシック",Font.BOLD , 12));


		JLabel label2 = new JLabel("21 Sep. 2009");
		label2.setFont(new Font("Century",Font.ITALIC , 24));

		p.add(label1);
		p.add(label2);

		Container contentpane = getContentPane();
		contentpane.add(p,BorderLayout.CENTER);
	}

}