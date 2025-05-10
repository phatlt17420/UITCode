
public class HinhChuNhat extends Hinh {
	private double chieuRong, chieuCao;

	public HinhChuNhat(ToaDo toaDo, double chieuRong, double chieuCao) {
		super(toaDo);
		this.chieuRong = chieuRong;
		this.chieuCao = chieuCao;
	}

	@Override
	public double tinhDienTich() {
		return chieuRong*chieuCao;
	}


}
