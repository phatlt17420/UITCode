package view;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class MyWindow extends JFrame {

	public MyWindow() {

	}
public void show() {
	this.setVisible(true);
}
	public void show (String title) {
		this.setTitle(title);
		this.setVisible(true);
	}

	public void show (String title, int width, int height) {
		this.setTitle(title);
		this.setSize(width, height);
		this.setVisible(true);
	}
	
	public show (String title, int )
	
}
