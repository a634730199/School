package pac;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JOptionPaneTest1 extends JFrame {

	public static void main(String[] args) {
		JOptionPaneTest1 frame = new JOptionPaneTest1();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(10,10,300,200);
		frame.setTitle("JOptionPaneTest");
		frame.setVisible(true);
	}

	JOptionPaneTest1(){
		JOptionPane op = new JOptionPane("テスト",
											JOptionPane.ERROR_MESSAGE,
											JOptionPane.YES_NO_OPTION
										 );
		JPanel p = new JPanel();
		p.add(op);
		getContentPane().add(p, BorderLayout.CENTER);
	}

}
