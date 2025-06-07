package model;

public class ChiTietDonNhapHang {
	private String maDonNhap;
	private String maSanPham;
	private double soLuong;
	private double donGia;

	public ChiTietDonNhapHang() {
	}

	public ChiTietDonNhapHang(String maDonNhap, String maSanPham, double soLuong, double donGia) {
		this.maDonNhap = maDonNhap;
		this.maSanPham = maSanPham;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

	public String getMaDonNhap() {
		return maDonNhap;
	}

	public void setMaDonNhap(String maDonNhap) {
		this.maDonNhap = maDonNhap;
	}

	public String getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}

	public double getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(double soLuong) {
		this.soLuong = soLuong;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	@Override
	public String toString() {
		return "ChiTietDonNhapHang [maDonNhap=" + maDonNhap + ", maSanPham=" + maSanPham + ", soLuong=" + soLuong
				+ ", donGia=" + donGia + "]";
	}

}
