
public class Testing {
	public static void main(String[] args) {
		Lop lop1 = new Lop("Lop Toan", "Khoa Toan");
		Ngay ngay1 = new Ngay(25, 2, 2023);
		Ngay ngay2 = new Ngay(25, 2, 2023);
		SinhVien sv1 = new SinhVien(123, "Nguyen Van A", ngay1, 8.5, lop1);
		SinhVien sv2 = new SinhVien(124, "Nguyen Van A", ngay2, 8.5, lop1);
		System.out.println(sv1.tenKhoa());
		System.out.println(sv1.kiemTraThiDat());
		System.out.println(sv1.kiemTraCungNgaySinh(sv2));
		
		
		
	}
}
