
public class MayTinh {
	private HangSanXuat hangSanXuat;
	private Ngay ngaySanXuat;
	private double giaBan;
	private int thoiGianBaoHanh;

	public MayTinh(HangSanXuat hangSanXuat, Ngay ngaySanXuat, double giaBan, int thoiGianBaoHanh) {

		this.hangSanXuat = hangSanXuat;
		this.ngaySanXuat = ngaySanXuat;
		this.giaBan = giaBan;
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public Ngay getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(Ngay ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public boolean kiemTraGiaBan(MayTinh mt) {
		return this.giaBan < mt.giaBan;
	}

	public String tenQuocGia() {
		return this.hangSanXuat.getQuocGia().getTenQuocGia();
	}
}
