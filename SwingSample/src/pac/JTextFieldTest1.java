package pac;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JTextFieldTest1 extends JFrame {

	JTextFieldTest1(){
		setLayout(new FlowLayout());
		JTextField textfield = new JTextField(20);
		textfield.setText("JTextField");
		textfield.setForeground(Color.RED);
		textfield.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel label = new JLabel("JTextFiedに書かれているのは \t"+textfield.getText()+"です。");
		add(textfield);
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(300,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTextFieldTest1();
	}

}
