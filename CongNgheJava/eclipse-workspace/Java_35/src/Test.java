
public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 5, 2021);
		Ngay ngay2 = new Ngay(3, 5, 2026);
		TacGia tacgia1 = new TacGia("LeTanPhat", ngay1);
		TacGia tacgia2 = new TacGia("Le Tan Dat", ngay2);
		Sach sach1 = new Sach("Lap trinh", 35555, 2006, tacgia1);
		Sach sach2 = new Sach("Lap trinh a", 35555, 2005, tacgia2);
		sach1.inTenSach();
		System.out.println("So sanh nam xuat ban sach 1 va sach 2: " + sach1.kiemTraCungNamXuatBan(sach2));
		System.out.println(sach1.giaSauKhiGiam(10));
		
		
		
	}
}
