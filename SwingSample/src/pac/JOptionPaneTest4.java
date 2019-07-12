package pac;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JOptionPaneTest4 extends JFrame implements ActionListener {
	JLabel ansLabel;

	public static void main(String[] args) {
		JOptionPaneTest4 frame = new JOptionPaneTest4();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(10,10,200,150);
		frame.setTitle("InputDialog");
		frame.setVisible(true);

	}
	JOptionPaneTest4(){
		JButton infoButton = new JButton("入力");
		infoButton.addActionListener(this);

		JPanel p = new JPanel();
		p.add(infoButton);

		ansLabel = new JLabel("未入力です");
		JPanel ansPanel = new JPanel();
		ansPanel.add(ansLabel);

		getContentPane().add(p, BorderLayout.CENTER);
		getContentPane().add(ansPanel,BorderLayout.PAGE_END);
	}
	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent e) {
		Object value = JOptionPane.showConfirmDialog(this, "入力ダイアログ");
		if(value == null) {
			ansLabel.setText("取消されました");
		}else {
			ansLabel.setText((String)value);
		}

	}
}
