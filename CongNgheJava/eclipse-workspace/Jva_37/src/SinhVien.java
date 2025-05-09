
public class SinhVien {
	private int maSoSinhVien;
	private String hoVaTen;
	private Ngay ngaySinh;
	private double diemTrungBinh;
	private Lop lop;

	public SinhVien(int maSoSinhVien, String hoVaTen, Ngay ngaySinh, double diemTrungBinh, Lop lop) {

		this.maSoSinhVien = maSoSinhVien;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.diemTrungBinh = diemTrungBinh;
		this.lop = lop;
	}

	public int getMaSoSinhVien() {
		return maSoSinhVien;
	}

	public void setMaSoSinhVien(int maSoSinhVien) {
		this.maSoSinhVien = maSoSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public Ngay getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}

	public String tenKhoa() {
		return this.lop.getTenKhoa();
	}

	public boolean kiemTraThiDat() {
		return this.diemTrungBinh >= 5;
	}

	public boolean kiemTraCungNgaySinh(SinhVien sv) {
		return this.ngaySinh.equals(sv.ngaySinh);
	}

}
