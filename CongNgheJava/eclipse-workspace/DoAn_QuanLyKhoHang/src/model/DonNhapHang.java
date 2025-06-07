package model;

import java.time.LocalDate;

public class DonNhapHang {
	private String maDonNhap;
	private String maKhohang;
	private String tenNguoiBan;
	private LocalDate ngayTao;
	private double tongGiaTri;
	public DonNhapHang() {

	}
	public DonNhapHang(String maDonNhap, String maKhohang, String tenNguoiBan, LocalDate ngayTao, double tongGiaTri) {

		this.maDonNhap = maDonNhap;
		this.maKhohang = maKhohang;
		this.tenNguoiBan = tenNguoiBan;
		this.ngayTao = ngayTao;
		this.tongGiaTri = tongGiaTri;
	}
	public String getMaDonNhap() {
		return maDonNhap;
	}
	public void setMaDonNhap(String maDonNhap) {
		this.maDonNhap = maDonNhap;
	}
	public String getMaKhohang() {
		return maKhohang;
	}
	public void setMaKhohang(String maKhohang) {
		this.maKhohang = maKhohang;
	}
	public String getTenNguoiBan() {
		return tenNguoiBan;
	}
	public void setTenNguoiBan(String tenNguoiBan) {
		this.tenNguoiBan = tenNguoiBan;
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


	

}
