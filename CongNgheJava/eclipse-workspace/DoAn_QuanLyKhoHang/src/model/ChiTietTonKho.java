package model;

public class ChiTietTonKho {
	private String maChiTietTonKho;
	private String maSanPham;
	private String maKhoHang;
	private double soLuongTonKho;

	public ChiTietTonKho() {
	}

	public ChiTietTonKho(String maChiTietTonKho, String maSanPham, String maKhoHang, double soLuongTonKho) {
		this.maChiTietTonKho = maChiTietTonKho;
		this.maSanPham = maSanPham;
		this.maKhoHang = maKhoHang;
		this.soLuongTonKho = soLuongTonKho;
	}

	public String getMaChiTietTonKho() {
		return maChiTietTonKho;
	}

	public void setMaChiTietTonKho(String maChiTietTonKho) {
		this.maChiTietTonKho = maChiTietTonKho;
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
