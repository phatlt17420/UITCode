package model;

public class ChiTietDonXuatHang {
	private String maChiTietXuatHang;
	private double soLuong;
	private double donGia;

	public ChiTietDonXuatHang() {
	}

	public ChiTietDonXuatHang(String maChiTietXuatHang, double soLuong, double donGia) {
		this.maChiTietXuatHang = maChiTietXuatHang;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

	public String getMaChiTietXuatHang() {
		return maChiTietXuatHang;
	}

	public void setMaChiTietXuatHang(String maChiTietXuatHang) {
		this.maChiTietXuatHang = maChiTietXuatHang;
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
		return "ChiTietDonXuatHang [maChiTietXuatHang=" + maChiTietXuatHang + ", soLuong=" + soLuong + ", donGia="
				+ donGia + "]";
	}

}
