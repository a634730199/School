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
import javax.swing.JTextArea;

public class EditorExercise extends JFrame{

	 JButton open,save,clear;
	 JTextArea jt;
	 JMenuBar mb;
	 JMenu file,tools;
	 JMenuItem jopen,jsave,jexit,jclear,jnew;
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

		open = new JButton(new FileOpenAction("開く"));
		save = new JButton("保存");
		clear = new JButton("クリア");


		jp = new JPanel(new GridLayout(1,1));
		jp.add(open);
		jp.add(save);
		jp.add(clear);


		jt = new JTextArea();

		mb = new JMenuBar();

		file = new JMenu("ファイル");
		tools = new JMenu("ツール");

		jnew = new JMenuItem(new FileNewAction("新規"));
		jopen = new JMenuItem(new FileOpenAction("開く"));
		jsave = new JMenuItem(new FileSaveAction("保存"));
		jexit = new JMenuItem(new FileQuitAction("終了"));
		jclear = new JMenuItem(new ClearAction("クリア"));

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
	class FileNewAction extends AbstractAction{
		FileNewAction(String title){
			putValue(Action.NAME, title);
		}

		public void actionPerformed(ActionEvent e) {
			setTitle( "無題.txt" );
			jt.setText("");
		}
	}
	class FileOpenAction extends AbstractAction{
		FileOpenAction(String title){
			putValue(Action.NAME,title);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			JFileChooser fc = new JFileChooser();
			int selected = fc.showOpenDialog(EditorExercise.this);
			if(selected == JFileChooser.APPROVE_OPTION) {
				String pathName = fc.getSelectedFile().getPath();
				FileWrapper fw = new FileWrapper(pathName);
				jt.setText(fw.ReadFile());
			}

		}

	}

	class FileSaveAction extends AbstractAction{
		FileSaveAction(String title){
			putValue(Action.NAME,title);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自動生成されたメソッド・スタブ

		}

	}

	class FileQuitAction extends AbstractAction{
		FileQuitAction(String title){
			putValue(Action.NAME, title);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自動生成されたメソッド・スタブ

		}

	}

	class ClearAction extends AbstractAction{
		ClearAction(String title){
			putValue(Action.NAME, title);
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自動生成されたメソッド・スタブ

		}

	}

}

