package model;

public class KhoHang {
	private String maKhoHang;
	private String tenKhoHang;
	private double soLuong;

	public KhoHang() {
	}

	public KhoHang(String maKhoHang, String tenKhoHang, double soLuong) {
		this.maKhoHang = maKhoHang;
		this.tenKhoHang = tenKhoHang;
		this.soLuong = soLuong;
	}

	public String getMaKhoHang() {
		return maKhoHang;
	}

	public void setMaKhoHang(String maKhoHang) {
		this.maKhoHang = maKhoHang;
	}

	public String getTenKhoHang() {
		return tenKhoHang;
	}

	public void setTenKhoHang(String tenKhoHang) {
		this.tenKhoHang = tenKhoHang;
	}

	public double getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(double soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return "KhoHang [maKhoHang=" + maKhoHang + ", tenKhoHang=" + tenKhoHang + ", soLuong=" + soLuong + "]";
	}

}
