package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.TimKiemActionListener;
import model.TimKiemModel;

public class TimKiemView extends JFrame {
	private TimKiemModel timKiemModel;
	private JTextArea jTextArea_vanBan;
	private JTextField jTextField_tuKhoa;
	private JLabel jLabel_ketQua;

	public TimKiemView() throws HeadlessException {
		this.timKiemModel = new TimKiemModel();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("Tìm Kiếm");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
TimKiemActionListener ac = new TimKiemActionListener(this);
		Font font = new Font("Arial", Font.BOLD, 30);
		JLabel jLabel_vanBan = new JLabel("Văn Bản");
		jLabel_vanBan.setFont(font);

		jTextArea_vanBan = new JTextArea();
		jTextArea_vanBan.setFont(font);

		JScrollPane jScrollPane = new JScrollPane(jTextArea_vanBan);
		
		
		
		
		JLabel jLabel_tuKhoa = new JLabel("Từ Khóa");
		jLabel_tuKhoa.setFont(font);

		jTextField_tuKhoa = new JTextField(50);
		jTextField_tuKhoa.setFont(font);


		
		JButton jButton_thongKe= new JButton("Thống kê");
		jButton_thongKe.addActionListener(ac);
		jButton_thongKe.setFont(font);
		jButton_thongKe.setBackground(Color.GRAY);
		jLabel_ketQua = new JLabel();
		 
		
		
		JPanel jPanel_footer = new JPanel();
		jPanel_footer.setLayout(new GridLayout(2,2));
		jPanel_footer.add(jLabel_tuKhoa);
		jPanel_footer.add(jTextField_tuKhoa);

		jPanel_footer.add(jButton_thongKe);
		jPanel_footer.add(jLabel_ketQua);
		
		
		this.setLayout(new BorderLayout());
		this.add(jLabel_vanBan,BorderLayout.NORTH);
		this.add(jScrollPane, BorderLayout.CENTER);
		this.add(jPanel_footer,BorderLayout.SOUTH);
	}
public void timKiemView () {
	this.timKiemModel.setVanBan(this.jTextArea_vanBan.getText());
	this.timKiemModel.setTuKhoa(this.jTextField_tuKhoa.getText());
	this.timKiemModel.timKiem();
	this.jLabel_ketQua.setText(this.timKiemModel.getKetQua());
}
}
