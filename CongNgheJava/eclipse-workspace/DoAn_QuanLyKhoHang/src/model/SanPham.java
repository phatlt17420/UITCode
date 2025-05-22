package model;

import java.util.Objects;

public class SanPham {
	private String maSanPham;
	private String tenSanPham;
	private String tenLoaiSanPham;
	private String donViTinh;
	private String chiTiet;

	public SanPham() {
	}

	public SanPham(String maSanPham, String tenSanPham, String tenLoaiSanPham, String donViTinh, String chiTiet) {
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.tenLoaiSanPham = tenLoaiSanPham;
		this.donViTinh = donViTinh;
		this.chiTiet = chiTiet;
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

}
