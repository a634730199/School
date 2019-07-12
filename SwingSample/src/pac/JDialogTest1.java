package pac;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JDialogTest1 extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JDialogTest1();
		frame.setSize(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private JDialog dialog;

	JDialogTest1(){
		JLabel label = new JLabel("ちょいと散歩" ,
									new ImageIcon("beetle.gif"),
									SwingConstants.CENTER
								  );
		dialog = new JDialog(this , "こんにちは" , true);
		dialog.getContentPane().add(label);

		JButton button = new JButton("どちらへ？");
		getContentPane().add(button);

		button.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				dialog.setBounds(250,100,300,200);
				dialog.setVisible(true);
			}
		});
	}

}
