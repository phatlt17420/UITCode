package model;

import java.util.Objects;

public class SanPham {
	private String maSanPham;
	private String tenSanPham;
	private String donViTinh;
	private String chiTiet;

	public SanPham() {
	}

	public SanPham(String maSanPham, String tenSanPham, String donViTinh, String chiTiet) {
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SanPham other = (SanPham) obj;
		return Objects.equals(chiTiet, other.chiTiet) && Objects.equals(donViTinh, other.donViTinh)
				&& Objects.equals(maSanPham, other.maSanPham) && Objects.equals(tenSanPham, other.tenSanPham);
	}

	@Override
	public String toString() {
		return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", donViTinh=" + donViTinh
				+ ", chiTiet=" + chiTiet + "]";
	}

}
