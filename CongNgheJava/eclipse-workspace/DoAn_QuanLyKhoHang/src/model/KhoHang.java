package model;

public class KhoHang {
	private String maKhoHang;
	private String tenKhoHang;
	private String diaChi;

	public KhoHang() {
	}

	public KhoHang(String maKhoHang, String tenKhoHang, String diaChi) {
		this.maKhoHang = maKhoHang;
		this.tenKhoHang = tenKhoHang;
		this.diaChi = diaChi;
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

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "KhoHang [maKhoHang=" + maKhoHang + ", tenKhoHang=" + tenKhoHang + ", diaChi=" + diaChi + "]";
	}

}
