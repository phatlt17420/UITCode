
public abstract class PhuongTienDiChuyen {

	protected HangSanXuat hangSanXuat;
	protected String tenLoaiPhuongTien;

	public PhuongTienDiChuyen(HangSanXuat hangSanXuat, String tenLoaiPhuongTien) {
		this.hangSanXuat = hangSanXuat;
		this.tenLoaiPhuongTien = tenLoaiPhuongTien;
	}

	public String getTenLoaiPhuongTien() {
		return tenLoaiPhuongTien;
	}

	public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
		this.tenLoaiPhuongTien = tenLoaiPhuongTien;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public String layTenHangSanXuat() {
		return this.hangSanXuat.getTenHangSanXuat();
	}
	public void batDau() {
		System.out.println("Bắt đầu .....");
		
	}
	public void tangToc() {
		System.out.println("Tăng tốc ....");
	}
	public void dungLai() {
		System.out.println("Dừng lại ....");
	}
	public abstract double layVanToc();
	
}
