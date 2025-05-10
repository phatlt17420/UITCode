package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_FlowLayout extends JFrame {
	public ViDu_FlowLayout() {
		this.setTitle("ViDU_+Settitle");
		this.setSize(800, 400);
		this.setLocationRelativeTo(null);
		// set Layout

		BorderLayout flo = new BorderLayout();
		BorderLayout flo2 = new BorderLayout(4, 4);
		// BorderLayout flo3 = new BorderLayout (4, 4, 50, 50);
		this.setLayout(flo);
		JButton jButton1 = new JButton("1");
		JButton jButton2 = new JButton("2");
		JButton jButton3 = new JButton("3");
		JButton jButton4 = new JButton("4");
		JButton jButton5 = new JButton("5");

		this.add(jButton1, BorderLayout.NORTH);
		this.add(jButton2, BorderLayout.EAST);

		/*
		 * for (int i = 0; i < 16; i++) { JButton jButton = new JButton(i +"");
		 * this.add(jButton);
		 * 
		 * }
		 */
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ViDu_FlowLayout();
	}
}
