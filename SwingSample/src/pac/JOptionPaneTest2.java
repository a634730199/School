package pac;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JOptionPaneTest2 extends JFrame implements ActionListener {

	public static void main(String[] args) {
		JOptionPaneTest2 frame = new JOptionPaneTest2();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(10,10,300,200);
		frame.setTitle("JOptionPaneTest");
		frame.setVisible(true);

	}
	JOptionPaneTest2(){
		JButton infoButton = new JButton("情報ボタン");
		infoButton.addActionListener(this);

		JPanel p = new JPanel();
		p.add(infoButton);

		getContentPane().add(p, BorderLayout.CENTER);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		ImageIcon icon = new ImageIcon("image/fish.gif");
		JOptionPane.showMessageDialog(this,
									  "User Icon",
									  "魚",
									  JOptionPane.INFORMATION_MESSAGE,
									  icon
									  );
	}

}
