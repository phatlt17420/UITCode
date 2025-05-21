package model;

public class DonNhapHang {
	private String maDonNhap;
	private String ngayTao;
	private double tongGiaTri;

	public DonNhapHang() {

	}

	public DonNhapHang(String maDonNhap, String ngayTao, double tongGiaTri) {
		this.maDonNhap = maDonNhap;
		this.ngayTao = ngayTao;
		this.tongGiaTri = tongGiaTri;
	}

	public String getMaDonNhap() {
		return maDonNhap;
	}

	public void setMaDonNhap(String maDonNhap) {
		this.maDonNhap = maDonNhap;
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
		return "DonNhapHang [maDonNhap=" + maDonNhap + ", ngayTao=" + ngayTao + ", tongGiaTri=" + tongGiaTri + "]";
	}

}
