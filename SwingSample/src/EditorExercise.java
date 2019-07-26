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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EditorExercise extends JFrame{

	 JButton open,save,clear;
	 JTextArea jt;
	 JMenuBar mb;
	 JMenu file,tools;
	 JMenuItem jopen,jsave,jexit,jclear,jnew;
	 JPanel jp;
	 JScrollPane jsp;

	public static void main(String[] args) {
		new EditorExercise();
	}

	EditorExercise(){
		setBounds(400,400,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());


		open = new JButton(new FileOpenAction("開く"));
		save = new JButton(new FileSaveAction("保存"));
		clear = new JButton(new ClearAction("クリア"));


		jp = new JPanel(new GridLayout(1,1));
		jp.add(open);
		jp.add(save);
		jp.add(clear);


		jt = new JTextArea();
		jsp = new JScrollPane(jt);
		jsp.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		mb = new JMenuBar();

		file = new JMenu("ファイル");
		tools = new JMenu("ツール");

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

		c.add(jsp,BorderLayout.CENTER);
		c.add(jp,BorderLayout.SOUTH);
		c.add(mb,BorderLayout.NORTH);

		setVisible(true);

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
			putValue(Action.NAME, title);
		}
		public void actionPerformed(ActionEvent e) {
			JFileChooser filechooser = new JFileChooser();
			int result = filechooser.showSaveDialog(EditorExercise.this);

			if(result == JFileChooser.APPROVE_OPTION) {
				String pathName = filechooser.getSelectedFile().getPath();
				FileWrapper fw = new FileWrapper(pathName);
				fw.WriteFile(jt.getText());
			}

		}

	}

	class FileQuitAction extends AbstractAction{
		FileQuitAction(String title){
			putValue(Action.NAME, title);
		}
		public void actionPerformed(ActionEvent e) {
			int option = JOptionPane.showConfirmDialog(EditorExercise.this, "終了？", "Exit", JOptionPane.OK_CANCEL_OPTION);

			if(option == JOptionPane.OK_OPTION) {
				System.exit(0);
			}

		}

	}

	class ClearAction extends AbstractAction{
		ClearAction(String title){
			putValue(Action.NAME, title);
		}
		public void actionPerformed(ActionEvent e) {
				int option = JOptionPane.showConfirmDialog(EditorExercise.this, "クリア？", "Clear", JOptionPane.YES_NO_OPTION);
				if(option == JOptionPane.YES_OPTION) {
					jt.setText("");
				}
		}

	}

}

