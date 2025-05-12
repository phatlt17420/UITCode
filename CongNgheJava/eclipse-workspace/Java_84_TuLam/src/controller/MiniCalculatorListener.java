package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MiniCalculatorView;

public class MiniCalculatorListener implements ActionListener {
	private MiniCalculatorView miniCalculatorView;

	public MiniCalculatorListener(MiniCalculatorView miniCalculatorView) {

		this.miniCalculatorView = miniCalculatorView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if (src.equals("+")) {
			this.miniCalculatorView.add();
		} else if (src.equals("-")) {
			this.miniCalculatorView.subtract();
		}else if (src.equals("*")) {
			this.miniCalculatorView.multiply();
		}else if (src.equals("/")) {
			this.miniCalculatorView.divide();
		}else if (src.equals("^")) {
			this.miniCalculatorView.pow();
		}else if (src.equals("MOD")) {
			this.miniCalculatorView.mod();
		}

	}

}
