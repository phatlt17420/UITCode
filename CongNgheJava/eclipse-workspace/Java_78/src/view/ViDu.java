package view;

import javax.swing.JFrame;

public class ViDu {
public static void main(String[] args) {
	JFrame jf = new JFrame();
	jf.setTitle("Vi du ve JFrame");
	jf.setSize(800, 600);	

	// gán vị trí hiển thị
	jf.setLocation(300, 300);
	
	// thoát ra khỏi chương trình khi đóng cửa sổ.
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.setVisible(true);
}
}
