package model;

public class ThongTinDonXuatHang {
	public String donXuatHang_maKhoHang;
	public String donXuatHang_maDonXuat;
	public String donXuatHang_tenSanPham;
	public String donXuatHang_maSanPham;
	public String donXuatHang_tenLoaiSanPham;
	public String donXuatHang_donViTinh;
	public String donXuatHang_chiTiet;
	public double donXuatHang_soLuong;
	public double donXuatHang_donGia;

	public ThongTinDonXuatHang() {

	}

	public ThongTinDonXuatHang(String donXuatHang_maKhoHang, String donXuatHang_maDonXuat,
			String donXuatHang_tenSanPham, String donXuatHang_maSanPham, String donXuatHang_tenLoaiSanPham,
			String donXuatHang_donViTinh, String donXuatHang_chiTiet, double donXuatHang_soLuong,
			double donXuatHang_donGia) {
		this.donXuatHang_maKhoHang = donXuatHang_maKhoHang;
		this.donXuatHang_maDonXuat = donXuatHang_maDonXuat;
		this.donXuatHang_tenSanPham = donXuatHang_tenSanPham;
		this.donXuatHang_maSanPham = donXuatHang_maSanPham;
		this.donXuatHang_tenLoaiSanPham = donXuatHang_tenLoaiSanPham;
		this.donXuatHang_donViTinh = donXuatHang_donViTinh;
		this.donXuatHang_chiTiet = donXuatHang_chiTiet;
		this.donXuatHang_soLuong = donXuatHang_soLuong;
		this.donXuatHang_donGia = donXuatHang_donGia;
	}

	public String getDonXuatHang_maKhoHang() {
		return donXuatHang_maKhoHang;
	}

	public void setDonXuatHang_maKhoHang(String donXuatHang_maKhoHang) {
		this.donXuatHang_maKhoHang = donXuatHang_maKhoHang;
	}

	public String getDonXuatHang_maDonXuat() {
		return donXuatHang_maDonXuat;
	}

	public void setDonXuatHang_maDonXuat(String donXuatHang_maDonXuat) {
		this.donXuatHang_maDonXuat = donXuatHang_maDonXuat;
	}

	public String getDonXuatHang_tenSanPham() {
		return donXuatHang_tenSanPham;
	}

	public void setDonXuatHang_tenSanPham(String donXuatHang_tenSanPham) {
		this.donXuatHang_tenSanPham = donXuatHang_tenSanPham;
	}

	public String getDonXuatHang_maSanPham() {
		return donXuatHang_maSanPham;
	}

	public void setDonXuatHang_maSanPham(String donXuatHang_maSanPham) {
		this.donXuatHang_maSanPham = donXuatHang_maSanPham;
	}

	public String getDonXuatHang_tenLoaiSanPham() {
		return donXuatHang_tenLoaiSanPham;
	}

	public void setDonXuatHang_tenLoaiSanPham(String donXuatHang_tenLoaiSanPham) {
		this.donXuatHang_tenLoaiSanPham = donXuatHang_tenLoaiSanPham;
	}

	public String getDonXuatHang_donViTinh() {
		return donXuatHang_donViTinh;
	}

	public void setDonXuatHang_donViTinh(String donXuatHang_donViTinh) {
		this.donXuatHang_donViTinh = donXuatHang_donViTinh;
	}

	public String getDonXuatHang_chiTiet() {
		return donXuatHang_chiTiet;
	}

	public void setDonXuatHang_chiTiet(String donXuatHang_chiTiet) {
		this.donXuatHang_chiTiet = donXuatHang_chiTiet;
	}

	public double getDonXuatHang_soLuong() {
		return donXuatHang_soLuong;
	}

	public void setDonXuatHang_soLuong(double donXuatHang_soLuong) {
		this.donXuatHang_soLuong = donXuatHang_soLuong;
	}

	public double getDonXuatHang_donGia() {
		return donXuatHang_donGia;
	}

	public void setDonXuatHang_donGia(double donXuatHang_donGia) {
		this.donXuatHang_donGia = donXuatHang_donGia;
	}

	@Override
	public String toString() {
		return "ThongTinDonXuatHang [donXuatHang_maKhoHang=" + donXuatHang_maKhoHang + ", donXuatHang_maDonXuat="
				+ donXuatHang_maDonXuat + ", donXuatHang_tenSanPham=" + donXuatHang_tenSanPham
				+ ", donXuatHang_maSanPham=" + donXuatHang_maSanPham + ", donXuatHang_tenLoaiSanPham="
				+ donXuatHang_tenLoaiSanPham + ", donXuatHang_donViTinh=" + donXuatHang_donViTinh
				+ ", donXuatHang_chiTiet=" + donXuatHang_chiTiet + ", donXuatHang_soLuong=" + donXuatHang_soLuong
				+ ", donXuatHang_donGia=" + donXuatHang_donGia + "]";
	}

	

}
