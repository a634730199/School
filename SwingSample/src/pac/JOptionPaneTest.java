package pac;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JOptionPaneTest extends JFrame {

	public static void main(String[] args) {
		JOptionPaneTest frame = new JOptionPaneTest();

		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(10,10,270,150);
		frame.setTitle("JOptionPaneTest");
		frame.setVisible(true);
	}

	JOptionPaneTest(){
		JOptionPane op = new JOptionPane("テスト");
		JPanel p = new JPanel();
		p.add(op);
		getContentPane().add(p, BorderLayout.CENTER);
	}

}
