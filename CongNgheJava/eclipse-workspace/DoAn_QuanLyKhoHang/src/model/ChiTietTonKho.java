package model;

public class ChiTietTonKho {
	private String maSanPham;
	private String maKhoHang;
	private double soLuongTonKho;

	public ChiTietTonKho() {
	}

	public ChiTietTonKho(String maSanPham, String maKhoHang, double soLuongTonKho) {
		this.maSanPham = maSanPham;
		this.maKhoHang = maKhoHang;
		this.soLuongTonKho = soLuongTonKho;
	}

	public String getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}

	public String getMaKhoHang() {
		return maKhoHang;
	}

	public void setMaKhoHang(String maKhoHang) {
		this.maKhoHang = maKhoHang;
	}

	public double getSoLuongTonKho() {
		return soLuongTonKho;
	}

	public void setSoLuongTonKho(double soLuongTonKho) {
		this.soLuongTonKho = soLuongTonKho;
	}

}
