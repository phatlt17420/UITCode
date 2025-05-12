package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.MiniCalculatorListener;
import model.MiniCalculatorModel;

public class MiniCalculatorView extends JFrame {

	private MiniCalculatorModel miniCalculatorModel;
	private JTextField jTextField_firstValue;
	private JTextField jTextField_secondValue;
	private JTextField jTextField_answerValue;

	public MiniCalculatorView() {
		this.miniCalculatorModel = new MiniCalculatorModel();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("Mini Calculator");
		this.setSize(600, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font font = new Font("Arial", Font.BOLD, 40);
// tạo nút
		JLabel jLabel_firstValue = new JLabel("1st Value");
		jLabel_firstValue.setFont(font);
		JLabel jLabel_secondValue = new JLabel("2nd Value");
		jLabel_secondValue.setFont(font);
		JLabel jLabel_answer = new JLabel("Answer");
		jLabel_answer.setFont(font);

		// tạo khu vực nhập dữ liệu
		jTextField_firstValue = new JTextField(50);
		jTextField_firstValue.setFont(font);
		jTextField_secondValue = new JTextField(50);
		jTextField_secondValue.setFont(font);
		jTextField_answerValue = new JTextField(50);
		jTextField_answerValue.setFont(font);

		// tạo JPanel
		JPanel jPanelIO = new JPanel();
		jPanelIO.setLayout(new GridLayout(3, 2, 20, 20));
		jPanelIO.add(jLabel_firstValue);
		jPanelIO.add(jTextField_firstValue);
		jPanelIO.add(jLabel_secondValue);
		jPanelIO.add(jTextField_secondValue);
		jPanelIO.add(jLabel_answer);
		jPanelIO.add(jTextField_answerValue);

		// tạo ActionListener
		MiniCalculatorListener ac = new MiniCalculatorListener(this);

		// tạo các button nút nhấn
		JButton jButton_plus = new JButton("+");
		jButton_plus.setFont(font);
		jButton_plus.addActionListener(ac);
		JButton jButton_minus = new JButton("-");
		jButton_minus.setFont(font);
		jButton_minus.addActionListener(ac);
		JButton jButton_multiply = new JButton("*");
		jButton_multiply.setFont(font);
		jButton_multiply.addActionListener(ac);
		JButton jButton_divide = new JButton("/");
		jButton_divide.setFont(font);
		jButton_divide.addActionListener(ac);
		JButton jButton_mod = new JButton("MOD");
		jButton_mod.setFont(font);
		jButton_mod.addActionListener(ac);
		JButton jButton_pow = new JButton("^");
		jButton_pow.setFont(font);
		jButton_pow.addActionListener(ac);

		// tạo JPanel Button
		JPanel jPanel_Button = new JPanel();
		jPanel_Button.setLayout(new GridLayout(2, 3, 20, 20));
		jPanel_Button.add(jButton_plus);
		jPanel_Button.add(jButton_minus);
		jPanel_Button.add(jButton_multiply);
		jPanel_Button.add(jButton_divide);
		jPanel_Button.add(jButton_mod);
		jPanel_Button.add(jButton_pow);
		// add vào layout
		this.setLayout(new BorderLayout(20, 20));
		this.add(jPanelIO, BorderLayout.CENTER);
		this.add(jPanel_Button, BorderLayout.SOUTH);
	}

	public void plus() {
		double firstValue = Double.valueOf(this.jTextField_firstValue.getText());
		double secondValue = Double.valueOf(this.jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.plus();
		this.jTextField_answerValue.setText(this.miniCalculatorModel.getAnswer()+"");
	}

	public void minus() {
		double firstValue = Double.valueOf(this.jTextField_firstValue.getText());
		double secondValue = Double.valueOf(this.jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.minus();
		this.jTextField_answerValue.setText(this.miniCalculatorModel.getAnswer()+"");
	}

	public void multifly() {
		double firstValue = Double.valueOf(this.jTextField_firstValue.getText());
		double secondValue = Double.valueOf(this.jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.multifly();
		this.jTextField_answerValue.setText(this.miniCalculatorModel.getAnswer()+"");
	}

	public void divide() {
		double firstValue = Double.valueOf(this.jTextField_firstValue.getText());
		double secondValue = Double.valueOf(this.jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.divide();
		this.jTextField_answerValue.setText(this.miniCalculatorModel.getAnswer()+"");
	}

	public void pow() {
		double firstValue = Double.valueOf(this.jTextField_firstValue.getText());
		double secondValue = Double.valueOf(this.jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.pow();
		this.jTextField_answerValue.setText(this.miniCalculatorModel.getAnswer()+"");
	}

	public void mod() {
		double firstValue = Double.valueOf(this.jTextField_firstValue.getText());
		double secondValue = Double.valueOf(this.jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(firstValue);
		this.miniCalculatorModel.setSecondValue(secondValue);
		this.miniCalculatorModel.mod();
		this.jTextField_answerValue.setText(this.miniCalculatorModel.getAnswer()+"");
	}
}
