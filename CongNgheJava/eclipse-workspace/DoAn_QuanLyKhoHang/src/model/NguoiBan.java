package model;

public class NguoiBan {
	private String maNguoiBan;
	private String tenNguoiBan;
	private String sdt;
	private String diaChi;

	public NguoiBan() {
	}

	public NguoiBan(String maNguoiBan, String tenNguoiBan, String sdt, String diaChi) {
		this.maNguoiBan = maNguoiBan;
		this.tenNguoiBan = tenNguoiBan;
		this.sdt = sdt;
		this.diaChi = diaChi;
	}

	public String getMaNguoiBan() {
		return maNguoiBan;
	}

	public void setMaNguoiBan(String maNguoiBan) {
		this.maNguoiBan = maNguoiBan;
	}

	public String getTenNguoiBan() {
		return tenNguoiBan;
	}

	public void setTenNguoiBan(String tenNguoiBan) {
		this.tenNguoiBan = tenNguoiBan;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "NguoiBan [maNguoiBan=" + maNguoiBan + ", tenNguoiBan=" + tenNguoiBan + ", sdt=" + sdt + ", diaChi="
				+ diaChi + "]";
	}

}
