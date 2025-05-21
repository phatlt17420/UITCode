package model;

public class NguoiMua {
	private String maNguoiMua;
	private String tenNguoiMua;
	private String sdt;
	private String diaChi;
	public NguoiMua() {
	}
	public NguoiMua(String maNguoiMua, String tenNguoiMua, String sdt, String diaChi) {
		this.maNguoiMua = maNguoiMua;
		this.tenNguoiMua = tenNguoiMua;
		this.sdt = sdt;
		this.diaChi = diaChi;
	}
	public String getMaNguoiMua() {
		return maNguoiMua;
	}
	public void setMaNguoiMua(String maNguoiMua) {
		this.maNguoiMua = maNguoiMua;
	}
	public String getTenNguoiMua() {
		return tenNguoiMua;
	}
	public void setTenNguoiMua(String tenNguoiMua) {
		this.tenNguoiMua = tenNguoiMua;
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
		return "NguoiMua [maNguoiMua=" + maNguoiMua + ", tenNguoiMua=" + tenNguoiMua + ", sdt=" + sdt + ", diaChi="
				+ diaChi + "]";
	}

}
