package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

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
	private JTextField jTextField_result;

	public MiniCalculatorView() {
		this.miniCalculatorModel = new MiniCalculatorModel();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("Mini Calculator");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// tạo JPanel nhập dự liệu
		JPanel jPanel_IO = new JPanel(new GridLayout(3, 2,30,30));
		// tạo font
		Font font = new Font("Arial", Font.BOLD, 30);
		// tạo Label
		// tạo actionListener
		MiniCalculatorListener ac = new MiniCalculatorListener(this);
		//
		JLabel jLabel_firstValue = new JLabel("First Value");
		jLabel_firstValue.setFont(font);
				JLabel jLabel_secondValue = new JLabel("Second Value");
		jLabel_secondValue.setFont(font);
		JLabel jLabel_result = new JLabel("Result");
		jLabel_result.setFont(font);
		// tạo textField nhập dữ liệu
		jTextField_firstValue = new JTextField(50);
		jTextField_firstValue.setFont(font);
		jTextField_secondValue = new JTextField(50);
		jTextField_secondValue.setFont(font);
		jTextField_result = new JTextField(50);
		jTextField_result.setFont(font);

		// add vào JPanel
		jPanel_IO.add(jLabel_firstValue);
		jPanel_IO.add(jTextField_firstValue);
		jPanel_IO.add(jLabel_secondValue);
		jPanel_IO.add(jTextField_secondValue);
		jPanel_IO.add(jLabel_result);
		jPanel_IO.add(jTextField_result);
		// tạo JPanel các nút nhấn
		JPanel jPanel_Buttons = new JPanel(new GridLayout(2,3,20,20));

		JButton jButton_add = new JButton("+");
		jButton_add.setFont(font);
		jButton_add.addActionListener(ac);
		JButton jButton_subtract = new JButton("-");
		jButton_subtract.setFont(font);
		jButton_subtract.addActionListener(ac);
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
		// thiết lập vào jPanel_Buttons
		jPanel_Buttons.add(jButton_add);
		jPanel_Buttons.add(jButton_subtract);
		jPanel_Buttons.add(jButton_multiply);
		jPanel_Buttons.add(jButton_divide);
		jPanel_Buttons.add(jButton_mod);
		jPanel_Buttons.add(jButton_pow);

		// thiết lập vào layout chính
		this.setLayout(new BorderLayout());
		this.add(jPanel_IO, BorderLayout.CENTER);
		this.add(jPanel_Buttons, BorderLayout.SOUTH);
	}

	public void add() {
		double a = Double.valueOf( this.jTextField_firstValue.getText());
		double b = Double.valueOf( this.jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(a);
		this.miniCalculatorModel.setSecondValue(b);
		this.miniCalculatorModel.add();
		this.jTextField_result.setText(this.miniCalculatorModel.getResult()+"");
	}
	public void subtract() {
		double a = Double.valueOf( this.jTextField_firstValue.getText());
		double b = Double.valueOf( this.jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(a);
		this.miniCalculatorModel.setSecondValue(b);
		this.miniCalculatorModel.subtract();
		this.jTextField_result.setText(this.miniCalculatorModel.getResult()+"");
	}
	public void multiply() {
		double a = Double.valueOf( this.jTextField_firstValue.getText());
		double b = Double.valueOf( this.jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(a);
		this.miniCalculatorModel.setSecondValue(b);
		this.miniCalculatorModel.multiply();
		this.jTextField_result.setText(this.miniCalculatorModel.getResult()+"");
	}
	public void divide() {
		double a = Double.valueOf( this.jTextField_firstValue.getText());
		double b = Double.valueOf( this.jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(a);
		this.miniCalculatorModel.setSecondValue(b);
		this.miniCalculatorModel.devide();
		this.jTextField_result.setText(this.miniCalculatorModel.getResult()+"");
	}
	public void mod() {
		double a = Double.valueOf( this.jTextField_firstValue.getText());
		double b = Double.valueOf( this.jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(a);
		this.miniCalculatorModel.setSecondValue(b);
		this.miniCalculatorModel.mod();
		this.jTextField_result.setText(this.miniCalculatorModel.getResult()+"");
	}
	public void pow() {
		double a = Double.valueOf( this.jTextField_firstValue.getText());
		double b = Double.valueOf( this.jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirstValue(a);
		this.miniCalculatorModel.setSecondValue(b);
		this.miniCalculatorModel.pow();
		this.jTextField_result.setText(this.miniCalculatorModel.getResult()+"");
	}
}
