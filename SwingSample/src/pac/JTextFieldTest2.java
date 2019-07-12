package pac;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTextFieldTest2 extends JFrame implements ActionListener {

	JTextField textfield;
	JLabel label;

	JTextFieldTest2(){

		JLabel lb = new JLabel("name :");
		textfield = new JTextField(20);
		label = new JLabel();
		label.setOpaque(true);
		label.setBackground(Color.cyan);
		label.setFont(new Font("MSゴシック",Font.BOLD,18));
		setLayout(new FlowLayout());

		add(lb);
		add(textfield);
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textfield.addActionListener(this);

		setSize(400,150);
		setVisible(true);

	}
	public static void main(String[] args) {
		new JTextFieldTest2();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = textfield.getText();
		label.setText(str + "様　毎度ありがとうございます。");
		textfield.setText("");
		textfield.setColumns(20);
	}

}
