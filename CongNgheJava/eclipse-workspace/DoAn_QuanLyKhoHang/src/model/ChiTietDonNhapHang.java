package model;

public class ChiTietDonNhapHang {
	private String maChiTietDonNhapHang;
	private double soLuong;
	private double donGia;

	public ChiTietDonNhapHang() {
	}

	public ChiTietDonNhapHang(String maChiTietDonNhapHang, double soLuong, double donGia) {
		this.maChiTietDonNhapHang = maChiTietDonNhapHang;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

	public String getMaChiTietDonNhapHang() {
		return maChiTietDonNhapHang;
	}

	public void setMaChiTietDonNhapHang(String maChiTietDonNhapHang) {
		this.maChiTietDonNhapHang = maChiTietDonNhapHang;
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
		return "ChiTietDonNhapHang [maChiTietDonNhapHang=" + maChiTietDonNhapHang + ", soLuong=" + soLuong + ", donGia="
				+ donGia + "]";
	}

}
