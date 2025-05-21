package model;

public class DonXuatHang {
	private String maDonXuat;
	private String ngayTao; // tạm thời sử dụng string ==> sau chuyển thành Date
	private double tongGiaTri;

	public DonXuatHang() {

	}

	public DonXuatHang(String maDonXuat, String ngayTao, double tongGiaTri) {
		this.maDonXuat = maDonXuat;
		this.ngayTao = ngayTao;
		this.tongGiaTri = tongGiaTri;
	}

	public String getMaDonXuat() {
		return maDonXuat;
	}

	public void setMaDonXuat(String maDonXuat) {
		this.maDonXuat = maDonXuat;
	}

	public String getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(String ngayTao) {
		this.ngayTao = ngayTao;
	}

	public double getTongGiaTri() {
		return tongGiaTri;
	}

	public void setTongGiaTri(double tongGiaTri) {
		this.tongGiaTri = tongGiaTri;
	}

	@Override
	public String toString() {
		return "DonXuatHang [maDonXuat=" + maDonXuat + ", ngayTao=" + ngayTao + ", tongGiaTri=" + tongGiaTri + "]";
	}

}
