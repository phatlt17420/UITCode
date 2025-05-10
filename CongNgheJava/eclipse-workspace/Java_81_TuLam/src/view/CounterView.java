package view;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame {
	private CounterModel counterModel;
	private JLabel jLabel;

	public CounterView() {
		this.counterModel = new CounterModel();
		this.init();
		this.setVisible(true);
	}

	public void init() {
		this.setTitle("Counter");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ActionListener ac = new CounterListener(this);

		JButton jButton_up = new JButton("UP");
		jButton_up.addActionListener(ac);
		JButton jButton_reset = new JButton("RESET");
		jButton_reset.addActionListener(ac);
		JButton jButton_down = new JButton("DOWN");
		jButton_down.addActionListener(ac);
		jLabel = new JLabel(counterModel.getValue() + "", JLabel.CENTER);
		JPanel jPanel = new JPanel();

		jPanel.setLayout(new BorderLayout());
		jPanel.add(jButton_up, BorderLayout.EAST);
		jPanel.add(jButton_down, BorderLayout.WEST);
		jPanel.add(jLabel, BorderLayout.CENTER);
		jPanel.add(jButton_reset,BorderLayout.SOUTH);
		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);

	}

	public void increment() {
		this.counterModel.increment();
		this.jLabel.setText(this.counterModel.getValue() + "");
	}

	public void decrement() {
		this.counterModel.decrement();
		this.jLabel.setText(this.counterModel.getValue() + "");
	}

	public void reset() {
		this.counterModel.reset();
		this.jLabel.setText(0 + "");
	}
}
