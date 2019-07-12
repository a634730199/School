package pac;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JCheckBoxTest2 extends JFrame implements ChangeListener{

	JCheckBox cb1,cb2,cb3,cb4;
	JLabel lb1,lb2,lb3,lb4;
	JCheckBoxTest2(){
		Container cpane = getContentPane();
		cpane.setLayout(new GridLayout(4,2,10,10));
		ButtonGroup bg = new ButtonGroup();
		cb1 = new JCheckBox("Dog");
		cb2 = new JCheckBox("Cat");
		cb3 = new JCheckBox("Bird");
		cb4 = new JCheckBox("Fish");

		lb1 = new JLabel();
		lb2 = new JLabel();
		lb3 = new JLabel();
		lb4 = new JLabel();

		cpane.add(cb1);
		cpane.add(lb1);
		cpane.add(cb2);
		cpane.add(lb2);
		cpane.add(cb3);
		cpane.add(lb3);
		cpane.add(cb4);
		cpane.add(lb4);

		bg.add(cb1);
		bg.add(cb2);
		bg.add(cb3);
		bg.add(cb4);

		cb1.addChangeListener(this);
		cb2.addChangeListener(this);
		cb3.addChangeListener(this);
		cb4.addChangeListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JCheckBoxTest");
		setSize(200,200);
		setVisible(true);


	}
	public static void main(String[] args) {


		new JCheckBoxTest2();
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		if(cb1.isSelected()) lb1.setText("DDDDD");
		else	lb1.setText("");

		if(cb2.isSelected()) lb2.setText("CCCCC");
		else	lb2.setText("");

		if(cb3.isSelected()) lb3.setText("BBBBB");
		else	lb3.setText("");

		if(cb4.isSelected()) lb4.setText("FFFFF");
		else	lb4.setText("");

	}

}
