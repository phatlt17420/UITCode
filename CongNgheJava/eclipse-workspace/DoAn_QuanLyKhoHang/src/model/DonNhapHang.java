package model;

import java.time.LocalDate;

public class DonNhapHang {
	private String maDonNhap;
	private LocalDate ngayTao;
	private double tongGiaTri;

	public DonNhapHang() {

	}

	public DonNhapHang(String maDonNhap, LocalDate ngayTao, double tongGiaTri) {
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

	public LocalDate getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(LocalDate ngayTao) {
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
