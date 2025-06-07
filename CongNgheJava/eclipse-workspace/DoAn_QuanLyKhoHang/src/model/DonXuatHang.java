package model;

import java.time.LocalDate;

public class DonXuatHang {
	private String maDonXuat;
	private String tenNguoiMua;
	private LocalDate ngayTao; // tạm thời sử dụng string ==> sau chuyển thành Date
	private double tongGiaTri;

	public DonXuatHang() {
	}

	public DonXuatHang(String maDonXuat, String tenNguoiMua, LocalDate ngayTao, double tongGiaTri) {
		this.maDonXuat = maDonXuat;
		this.tenNguoiMua = tenNguoiMua;
		this.ngayTao = ngayTao;
		this.tongGiaTri = tongGiaTri;
	}

	public String getMaDonXuat() {
		return maDonXuat;
	}

	public void setMaDonXuat(String maDonXuat) {
		this.maDonXuat = maDonXuat;
	}

	public String getTenNguoiMua() {
		return tenNguoiMua;
	}

	public void setTenNguoiMua(String tenNguoiMua) {
		this.tenNguoiMua = tenNguoiMua;
	}

	public LocalDate getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(LocalDate ngayTao) {
		this.ngayTao = ngayTao;
	}

	public double getTongGiaTri() {
		return tongGiaTri;
	}

	public void setTongGiaTri(double tongGiaTri) {
		this.tongGiaTri = tongGiaTri;
	}

	@Override
	public String toString() {
		return "DonXuatHang [maDonXuat=" + maDonXuat + ", tenNguoiMua=" + tenNguoiMua + ", ngayTao=" + ngayTao
				+ ", tongGiaTri=" + tongGiaTri + "]";
	}

}