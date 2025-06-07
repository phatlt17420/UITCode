package model;

public class ChiTietDonXuatHang {
	private String maDonXuat;
	private String maSanPham;
	private double soLuong;
	private double donGia;

	public ChiTietDonXuatHang() {
	}

	public ChiTietDonXuatHang(String maDonXuat, String maSanPham, double soLuong, double donGia) {
		this.maDonXuat = maDonXuat;
		this.maSanPham = maSanPham;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

	public String getMaDonXuat() {
		return maDonXuat;
	}

	public void setMaDonXuat(String maDonXuat) {
		this.maDonXuat = maDonXuat;
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
		return "ChiTietDonXuatHang [maDonXuat=" + maDonXuat + ", maSanPham=" + maSanPham + ", soLuong=" + soLuong
				+ ", donGia=" + donGia + "]";
	}

	

}
