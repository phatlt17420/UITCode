package model;

import java.time.LocalDate;

public class HangHoaTaiKhoHang {
	private String maKhoHang, maDonNhap, TenSanPham, maSanPham, tenLoaiSanPham, donViTinh, chiTiet;
	private double donGia;
	private double soLuong;
	private LocalDate NgayTao;

	public HangHoaTaiKhoHang() {
	}

	public HangHoaTaiKhoHang(String maKhoHang, String maDonNhap, String tenSanPham, String maSanPham,
			String tenLoaiSanPham, String donViTinh, String chiTiet, double donGia, double soLuong, LocalDate ngayTao) {
		this.maKhoHang = maKhoHang;
		this.maDonNhap = maDonNhap;
		TenSanPham = tenSanPham;
		this.maSanPham = maSanPham;
		this.tenLoaiSanPham = tenLoaiSanPham;
		this.donViTinh = donViTinh;
		this.chiTiet = chiTiet;
		this.donGia = donGia;
		this.soLuong = soLuong;
		NgayTao = ngayTao;
	}

	public String getMaKhoHang() {
		return maKhoHang;
	}

	public void setMaKhoHang(String maKhoHang) {
		this.maKhoHang = maKhoHang;
	}

	public String getMaDonNhap() {
		return maDonNhap;
	}

	public void setMaDonNhap(String maDonNhap) {
		this.maDonNhap = maDonNhap;
	}

	public String getTenSanPham() {
		return TenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		TenSanPham = tenSanPham;
	}

	public String getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}

	public String getTenLoaiSanPham() {
		return tenLoaiSanPham;
	}

	public void setTenLoaiSanPham(String tenLoaiSanPham) {
		this.tenLoaiSanPham = tenLoaiSanPham;
	}

	public String getDonViTinh() {
		return donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	public String getChiTiet() {
		return chiTiet;
	}

	public void setChiTiet(String chiTiet) {
		this.chiTiet = chiTiet;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(double soLuong) {
		this.soLuong = soLuong;
	}

	public LocalDate getNgayTao() {
		return NgayTao;
	}

	public void setNgayTao(LocalDate ngayTao) {
		NgayTao = ngayTao;
	}

	@Override
	public String toString() {
		return "HangHoaTaiKhoHang [maKhoHang=" + maKhoHang + ", maDonNhap=" + maDonNhap + ", TenSanPham=" + TenSanPham
				+ ", maSanPham=" + maSanPham + ", tenLoaiSanPham=" + tenLoaiSanPham + ", donViTinh=" + donViTinh
				+ ", chiTiet=" + chiTiet + ", donGia=" + donGia + ", soLuong=" + soLuong + ", NgayTao=" + NgayTao + "]";
	}

}
