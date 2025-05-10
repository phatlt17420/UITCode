package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CounterModel;
import view.CounterView;

public class CounterListener implements ActionListener {
	private CounterView ctv;

	public CounterListener(CounterView ctv) {
		this.ctv = ctv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String scr = e.getActionCommand();
		if (scr == "UP") {
			ctv.increment();

		} else if (scr == "DOWN") {
			ctv.decrement();
		} else if (scr =="RESET") {
			ctv.reset();
		}

	}

}
