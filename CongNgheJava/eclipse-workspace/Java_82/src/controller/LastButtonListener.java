package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.LastButtonModel;
import view.LastButtonView;

public class LastButtonListener implements ActionListener {

	private LastButtonView lastButtonView;

	private LastButtonModel lastButtonModel;

	public LastButtonListener(LastButtonView lastButtonView) {
		this.lastButtonView = lastButtonView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nguonSuKien = e.getActionCommand();
		if (nguonSuKien == "1") {
			
			this.lastButtonView.changeTo_1();
		} else if (nguonSuKien == "2") {
			
			this.lastButtonView.changeTo_2();
		} else if (nguonSuKien == "3") {
			
			this.lastButtonView.changeTo_3();
		} else if (nguonSuKien == "4") {
			
			this.lastButtonView.changeTo_4();
		}

	}

}
