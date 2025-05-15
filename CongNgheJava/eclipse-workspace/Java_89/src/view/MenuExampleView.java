package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import controller.MenuExampleController;

public class MenuExampleView extends JFrame {

	private JLabel jLabel;

	public MenuExampleView() {
		this.setTitle("Menu Example");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		MenuExampleController 	menuExampleController 	 = new MenuExampleController(this);
		
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
		
		this.setJMenuBar(jMenuBar);
		jLabel = new JLabel("Text");
		this.setLayout(new BorderLayout());
		this.add(jLabel,BorderLayout.CENTER);
		
		
		this.setVisible(true);
	}
	public void setTextJLabel(String s){
		this.jLabel.setText(s);
	}
	
	
}
