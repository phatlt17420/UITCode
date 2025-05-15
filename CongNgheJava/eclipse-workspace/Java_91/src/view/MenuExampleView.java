package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import controller.MenuExampleController;

public class MenuExampleView extends JFrame {

	private JLabel jLabel;

	public MenuExampleView() {
		this.setTitle("Menu Example");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		MenuExampleController menuExampleController = new MenuExampleController(this);
		this.setLayout(new BorderLayout());
		JMenuBar jMenuBar = new JMenuBar();
		JMenu jMenu_file = new JMenu("File");
		JMenuItem jMenuItem_open = new JMenuItem("Open");
		jMenuItem_open.addActionListener(menuExampleController);
		JMenuItem jMenuItem_exit = new JMenuItem("Exit");
		jMenu_file.add(jMenuItem_open);
		jMenuItem_exit.addActionListener(menuExampleController);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_exit);

		JMenu jMenu_help = new JMenu("Help");
		JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
		jMenuItem_welcome.addActionListener(menuExampleController);
		jMenu_help.add(jMenuItem_welcome);

		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_help);
		// tạo thanh công cụ
		JToolBar jToolBar = new JToolBar();
		JButton jButton_Undo = new JButton("Undo");
		jButton_Undo.addActionListener(menuExampleController);
		JButton jButton_Redo = new JButton("Redo");
		JButton jButton_Copy = new JButton("Copy");
		JButton jButton_Cut = new JButton("Cut");
		JButton jButton_Paste = new JButton("Paste");
		jToolBar.add(jButton_Undo);
		jToolBar.add(jButton_Redo);
		jToolBar.add(jButton_Copy);
		jToolBar.add(jButton_Cut);
		jToolBar.add(jButton_Paste);
		this.add(jToolBar, BorderLayout.NORTH);

		this.setJMenuBar(jMenuBar);
		jLabel = new JLabel("Text");
		
		this.add(jLabel, BorderLayout.CENTER);

		this.setVisible(true);
	}

	public void setTextJLabel(String s) {
		this.jLabel.setText(s);
	}

}
