package model;

public class ThongTinDonXuatHang {
	public String donXuatHang_maKhoHang;
	public String donXuatHang_maSanPham;
	public String donXuatHang_tenSanPham;
	public double donXuatHang_soLuongXuatKho;
	public double donXuatHang_donGia;

	public ThongTinDonXuatHang() {

	}

	public ThongTinDonXuatHang(String donXuatHang_maKhoHang, String donXuatHang_maSanPham,
			String donXuatHang_tenSanPham, double donXuatHang_soLuongXuatKho, double donXuatHang_donGia) {
		this.donXuatHang_maKhoHang = donXuatHang_maKhoHang;
		this.donXuatHang_maSanPham = donXuatHang_maSanPham;
		this.donXuatHang_tenSanPham = donXuatHang_tenSanPham;
		this.donXuatHang_soLuongXuatKho = donXuatHang_soLuongXuatKho;
		this.donXuatHang_donGia = donXuatHang_donGia;
	}

	public String getDonXuatHang_maKhoHang() {
		return donXuatHang_maKhoHang;
	}

	public void setDonXuatHang_maKhoHang(String donXuatHang_maKhoHang) {
		this.donXuatHang_maKhoHang = donXuatHang_maKhoHang;
	}

	public String getDonXuatHang_maSanPham() {
		return donXuatHang_maSanPham;
	}

	public void setDonXuatHang_maSanPham(String donXuatHang_maSanPham) {
		this.donXuatHang_maSanPham = donXuatHang_maSanPham;
	}

	public String getDonXuatHang_tenSanPham() {
		return donXuatHang_tenSanPham;
	}

	public void setDonXuatHang_tenSanPham(String donXuatHang_tenSanPham) {
		this.donXuatHang_tenSanPham = donXuatHang_tenSanPham;
	}

	public double getDonXuatHang_soLuongXuatKho() {
		return donXuatHang_soLuongXuatKho;
	}

	public void setDonXuatHang_soLuongXuatKho(double donXuatHang_soLuongXuatKho) {
		this.donXuatHang_soLuongXuatKho = donXuatHang_soLuongXuatKho;
	}

	public double getDonXuatHang_donGia() {
		return donXuatHang_donGia;
	}

	public void setDonXuatHang_donGia(double donXuatHang_donGia) {
		this.donXuatHang_donGia = donXuatHang_donGia;
	}

	@Override
	public String toString() {
		return "ThongTinDonXuatHang [donXuatHang_maKhoHang=" + donXuatHang_maKhoHang + ", donXuatHang_maSanPham="
				+ donXuatHang_maSanPham + ", donXuatHang_tenSanPham=" + donXuatHang_tenSanPham
				+ ", donXuatHang_soLuongXuatKho=" + donXuatHang_soLuongXuatKho + ", donXuatHang_donGia="
				+ donXuatHang_donGia + "]";
	}

	

}
