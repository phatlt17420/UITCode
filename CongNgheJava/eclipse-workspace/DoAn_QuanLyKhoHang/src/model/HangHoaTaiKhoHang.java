package model;

import java.time.LocalDate;

public class HangHoaTaiKhoHang {
	private String maKhoHang, maSanPham, tenSanPham, donViTinh;

	private double soLuongTonKho;

	public HangHoaTaiKhoHang() {

	}

	public HangHoaTaiKhoHang(String maKhoHang, String maSanPham, String tenSanPham, String donViTinh,
			double soLuongTonKho) {

		this.maKhoHang = maKhoHang;
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.donViTinh = donViTinh;
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

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public String getDonViTinh() {
		return donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	public double getSoLuongTonKho() {
		return soLuongTonKho;
	}

	public void setSoLuongTonKho(double soLuongTonKho) {
		this.soLuongTonKho = soLuongTonKho;
	}

	@Override
	public String toString() {
		return "HangHoaTaiKhoHang [maKhoHang=" + maKhoHang + ", maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham
				+ ", donViTinh=" + donViTinh + ", soLuongTonKho=" + soLuongTonKho + "]";
	}


}
