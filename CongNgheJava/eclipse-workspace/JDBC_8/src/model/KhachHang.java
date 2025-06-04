package model;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KhachHang {
	private int id;
	private String hoVaTen;
	private LocalDate ngaySinh;
	private String diaChi;
	public KhachHang() {
	}
	public KhachHang(int id, String hoVaTen, LocalDate ngaySinh, String diaChi) {
		this.id = id;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	@Override
	public String toString() {
		return "KhachHang [id=" + id + ", hoVaTen=" + hoVaTen + ", ngaySinh=" + ngaySinh.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", diaChi=" + diaChi + "]";
	}



}
