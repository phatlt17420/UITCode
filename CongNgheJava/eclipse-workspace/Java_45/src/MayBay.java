
public class MayBay extends PhuongTienDiChuyen {

	private String loaiNhienLieu;

	public MayBay(HangSanXuat hangSanXuat, String loaiNhienLieu) {
		super(hangSanXuat, "Máy Bay");
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}

	@Override
	public double layVanToc() {
		return 500;
	}

	public void catCanh() {
		System.out.println("Máy bay cất cánh");
	}

	public void haCanh() {
		System.out.println("Máy bay hạ cánh");
	}

}
