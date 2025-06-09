package model;

public class ChiTietTonKho {
	private String maKhoHang;
	private String maSanPham;
	private String tenSanPHam;
	private double soLuongTonKho;

	public ChiTietTonKho() {
	}

	public ChiTietTonKho(String maKhoHang, String maSanPham, String tenSanPHam, double soLuongTonKho) {

		this.maKhoHang = maKhoHang;
		this.maSanPham = maSanPham;
		this.tenSanPHam = tenSanPHam;
		this.soLuongTonKho = soLuongTonKho;
	}

	public String getMaKhoHang() {
		return maKhoHang;
	}

	public void setMaKhoHang(String maKhoHang) {
		this.maKhoHang = maKhoHang;
	}

	public String getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}

	public String getTenSanPHam() {
		return tenSanPHam;
	}

	public void setTenSanPHam(String tenSanPHam) {
		this.tenSanPHam = tenSanPHam;
	}

	public double getSoLuongTonKho() {
		return soLuongTonKho;
	}

	public void setSoLuongTonKho(double soLuongTonKho) {
		this.soLuongTonKho = soLuongTonKho;
	}

	@Override
	public String toString() {
		return "ChiTietTonKho [maKhoHang=" + maKhoHang + ", maSanPham=" + maSanPham + ", tenSanPHam=" + tenSanPHam
				+ ", soLuongTonKho=" + soLuongTonKho + "]";
	}


}
