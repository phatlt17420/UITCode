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
			this.miniCalculatorView.plus();
		} else if (src.equals("-")) {
			this.miniCalculatorView.minus();
		} else if (src.equals("*")) {
			this.miniCalculatorView.multifly();
		}else if (src.equals("/")) {
			this.miniCalculatorView.divide();
		}else if (src.equals("^")) {
			this.miniCalculatorView.pow();
		}else if (src.equals("MOD")) {
			this.miniCalculatorView.mod();
		}



	}

}
