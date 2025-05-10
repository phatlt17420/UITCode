package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MyColorListener;
import model.MyColorModel;

public class MyColorView extends JFrame {
	private MyColorModel myColorModel;
	private JLabel jLabel;

	public MyColorView() {
		this.myColorModel = new MyColorModel();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("My Color");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jLabel = new JLabel("TEXT");

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(2, 3));
		Font font = new Font("Arial", Font.BOLD, 30);
		Font font_text = new Font("Arial", Font.BOLD, 50);
		jLabel.setFont(font_text);
		
		ActionListener ac = new MyColorListener(this);
		
		
		
		JButton jButton_text_red = new JButton("Red Text");
		jButton_text_red.setFont(font);
		jButton_text_red.setForeground(Color.RED);
		jButton_text_red.addActionListener(ac);
		

		JButton jButton_text_yellow = new JButton("Yellow Text");
		jButton_text_yellow.setFont(font);
		jButton_text_yellow.setForeground(Color.YELLOW);
		jButton_text_yellow.addActionListener(ac);

		JButton jButton_text_green = new JButton("Green Text");
		jButton_text_green.setFont(font);
		jButton_text_green.setForeground(Color.GREEN);
		jButton_text_green.addActionListener(ac);
		
		JButton jButton_background_red = new JButton("Red Background");
		jButton_background_red.setFont(font);
		jButton_background_red.setBackground(Color.RED);
		jButton_background_red.addActionListener(ac);
		
		JButton jButton_background_yellow = new JButton("Yellow Background");
		jButton_background_yellow.setFont(font);
		jButton_background_yellow.setBackground(Color.YELLOW);
		jButton_background_yellow.addActionListener(ac);
		
		JButton jButton_background_green = new JButton("Green Background");
		jButton_background_green.setFont(font);
		jButton_background_green.setBackground(Color.GREEN);
		jButton_background_green.addActionListener(ac);
		jPanel.add(jButton_text_red);
		jPanel.add(jButton_text_green);
		jPanel.add(jButton_text_yellow);
		jPanel.add(jButton_background_red);
		jPanel.add(jButton_background_green);
		jPanel.add(jButton_background_yellow);
		this.setLayout(new BorderLayout());
		this.add(jLabel,BorderLayout.CENTER);
		this.add(jPanel,BorderLayout.SOUTH);
		
	}

	public void changeTextColor(Color color) {
		this.jLabel.setForeground(color);
		this.jLabel.setOpaque(true);
		
	}
	public void changeBackgroundColor(Color color) {
		this.jLabel.setBackground(color);
		this.jLabel.setOpaque(true);
		
	}
}
