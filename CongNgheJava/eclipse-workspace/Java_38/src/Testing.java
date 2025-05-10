
public class Testing {
	public static void main(String[] args) {
		QuocGia qg = new QuocGia(15, "USA");
		HangSanXuat hsx = new HangSanXuat("Dell", qg);
		Ngay ngay1 = new Ngay(15, 2, 2023);
		MayTinh maytinh1 = new MayTinh(hsx, ngay1, 35, 12);
		
		QuocGia qg1 = new QuocGia(84, "VietNam");
		HangSanXuat hsx1 = new HangSanXuat("Bkav", qg1);
		Ngay ngay2 = new Ngay(15, 1, 2023);
		MayTinh maytinh2 = new MayTinh(hsx1, ngay2, 40, 12);
		
		
		
		System.out.println(maytinh1.kiemTraGiaBan(maytinh2));
		System.out.println(maytinh2.tenQuocGia());
	}
}
