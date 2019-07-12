package pac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JRadioButtonTest2 extends JFrame implements ChangeListener{

	public static void main(String[] args) {
		new JRadioButtonTest2();
	}

	JRadioButton se1,se2,age1,age2,age3;
	JLabel lb1,lb2;


	JRadioButtonTest2(){
		lb1 = new JLabel();
		lb2 = new JLabel();

		Container cont = getContentPane();
		cont.setLayout(new BorderLayout());

		se1 = new JRadioButton("man");
		se2 = new JRadioButton("woman");
		JPanel pSex = new JPanel();

		pSex.setBackground(Color.cyan);
		pSex.setLayout(new FlowLayout());
		pSex.add(new JLabel("SEX"));
		pSex.add(se1);
		pSex.add(se2);

		se1.addChangeListener(this);
		se2.addChangeListener(this);

		ButtonGroup bgsex = new ButtonGroup();
		bgsex.add(se1);
		bgsex.add(se2);

		age1 = new JRadioButton("0~15");
		age2 = new JRadioButton("16~30");
		age3 = new JRadioButton("30↑");

		JPanel pAge = new JPanel();
		pAge.setBackground(Color.yellow);
		pAge.setLayout(new FlowLayout());
		pAge.add(new JLabel("AGE"));
		pAge.add(age1);
		pAge.add(age2);
		pAge.add(age3);

		age1.addChangeListener(this);
		age2.addChangeListener(this);
		age3.addChangeListener(this);

		ButtonGroup bgage = new ButtonGroup();
		bgage.add(age1);
		bgage.add(age2);
		bgage.add(age3);

		JPanel kaku = new JPanel();
		kaku.setBackground(Color.green);
		kaku.setLayout(new GridLayout(3,2));

		kaku.add(new JLabel("--->"));
		kaku.add(new JLabel("   "));
		kaku.add(new JLabel("SEX"));
		kaku.add(lb1);
		kaku.add(new JLabel("AGE"));
		kaku.add(lb2);

		cont.add("North", pSex);
		cont.add("Center", pAge);
		cont.add("South", kaku);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JRadioButtonTest");
		setSize(300,200);
		setVisible(true);

	}



	@Override
	public void stateChanged(ChangeEvent e) {
		if(se1.isSelected())	lb1.setText("Man");
		if(se2.isSelected())	lb1.setText("Woman");
		if(age1.isSelected())	lb2.setText("0~15");
		if(age2.isSelected())	lb2.setText("16~30");
		if(age3.isSelected())	lb2.setText("30↑");

	}

}