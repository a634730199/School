package pac;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuTest extends JFrame {
	JMenuItem red,green,blue,white,large,small,draw,erase;
	JMenu colorMenu,sizeMenu;

	Color re = new Color(255,0,0);
	Color gr = new Color(255,255,0);
	Color bl = new Color(0,0,255);
	Color c = null;



	JMenuTest(){
		JMenuBar menubar = new JMenuBar();
		setJMenuBar(menubar);

		colorMenu = new JMenu(" color ");
		sizeMenu = new JMenu(" size ");
		JMenu drawMenu = new JMenu(" draw ");
		menubar.add(colorMenu);
		menubar.add(drawMenu);
		menubar.add(sizeMenu);

		red = new JMenuItem("赤");
		red.setBackground(re);
		red = new JMenuItem("緑");
		red.setBackground(gr);
		red = new JMenuItem("青");
		red.setBackground(bl);

		large = new JMenuItem("大");
		small = new JMenuItem("小");
		draw  = new JMenuItem("描画");
		erase = new JMenuItem("消去");

		colorMenu.add(red);
		colorMenu.add(green);
		colorMenu.add(blue);

		sizeMenu.add(large);
		sizeMenu.add(small);

		drawMenu.add(draw);
		drawMenu.add(erase);
	}

	public static void main(String[] args) {
		JMenuTest frame = new JMenuTest();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(10,10,300,250);
		frame.setTitle("JMenuTest");
		frame.setVisible(true);
	}

}
