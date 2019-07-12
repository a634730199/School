import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EditorExercise extends JFrame{

	 JButton open,save,clear;
	 JTextField jt;
	 JMenuBar mb;
	 JMenu file,tools;
	 JMenuItem jopen,jsave,jexit,jclear;
	 JPanel jp;

	public static void main(String[] args) {
		new EditorExercise();
	}

	EditorExercise(){
		setBounds(400,400,400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		open = new JButton("開く");
		save = new JButton("保存");
		clear = new JButton("クリア");


		jp = new JPanel(new GridLayout(1,1));
		jp.add(open);
		jp.add(save);
		jp.add(clear);


		jt = new JTextField();

		mb = new JMenuBar();

		file = new JMenu("ファイル");
		tools = new JMenu("ツール");

		jopen = new JMenuItem("開く");
		jsave = new JMenuItem("保存");
		jexit = new JMenuItem("終了	");
		jclear = new JMenuItem("保存");

		file.add(jopen);
		file.add(jsave);
		file.add(jexit);
		tools.add(jclear);

		mb.add(file);
		mb.add(tools);


		jt.setSize(200,150);

		c.add(jt,BorderLayout.CENTER);
		c.add(jp,BorderLayout.SOUTH);
		c.add(mb,BorderLayout.NORTH);

	}
}
class FileOpenAction extends AbstractAction{
	FileOpenAction(String title){
		putValue(Action.NAME,title);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser fc = new JFileChooser();
		int selected = fc.showOpenDialog();
		if(e.getActionCommand() == "開く") {
			FileWrapper fw = new FileWrapper(fc.getSelectedFile().getName(),fc.getSelectedFile().getPath());
		}

	}

}

class FileSaveAction extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

class FileQuitAction extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

}

class ClearAction extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
