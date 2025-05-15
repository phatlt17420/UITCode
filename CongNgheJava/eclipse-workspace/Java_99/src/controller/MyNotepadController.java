package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;

import view.MyNotepadView;

public class MyNotepadController implements ActionListener {
	private MyNotepadView myNotepadView;

	public MyNotepadController(MyNotepadView myNotepadView) {
		this.myNotepadView = myNotepadView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		System.out.println(command);

		JFileChooser fc = new JFileChooser();

		if (command.equals("Open")) {
			int returnVal = fc.showOpenDialog(this.myNotepadView);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				this.myNotepadView.lblNewLabel.setText(this.myNotepadView.model.getFileName());
				String fileName = file.getName();
				if (fileName.endsWith(".txt")) {
					try {
						List<String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
						String result = "";

						for (String line : allText) {
							result += line;
							result += "\n";

						}
						this.myNotepadView.model.setFileName(file.getAbsolutePath());

						this.myNotepadView.textArea.setText(result);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {

				}

			}

		} else if (command.equals("Save")) {
			if (this.myNotepadView.model.getFileName().length() > 0) {

			}
		}

	}

}
