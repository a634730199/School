package pac;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JOptionPaneTest3 extends JFrame implements ActionListener {

	JLabel ansLabel;

	public static void main(String[] args) {
		JOptionPaneTest3 frame = new JOptionPaneTest3();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(10,10,200,150);
		frame.setTitle("JOptionPaneTest");
		frame.setVisible(true);

	}
	JOptionPaneTest3(){
		JButton infoButton = new JButton("選択");
		infoButton.addActionListener(this);

		JPanel p = new JPanel();
		p.add(infoButton);

		ansLabel = new JLabel("未選択です");
		JPanel ansPanel = new JPanel();
		ansPanel.add(ansLabel);

		getContentPane().add(p, BorderLayout.CENTER);
		getContentPane().add(ansPanel,BorderLayout.PAGE_END);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int option = JOptionPane.showConfirmDialog(this, "この案に賛成ですか？");

		if(option == JOptionPane.YES_OPTION) {
			ansLabel.setText("賛成");
		}else if(option == JOptionPane.NO_OPTION) {
			ansLabel.setText("反対");
		}else if(option == JOptionPane.CANCEL_OPTION) {
			ansLabel.setText("キャンセルされました");
		}

	}

}
