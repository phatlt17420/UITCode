
public class Testing {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(14, 3, 2022);
		Ngay ngay2 = new Ngay(18, 3, 2025);
		Ngay ngay3 = new Ngay(29, 5, 2024);
		HangSanXuat hangSanXuat1 = new HangSanXuat("Unilever", "Viet Nam");
		HangSanXuat hangSanXuat2 = new HangSanXuat("Pepsi", "USA");
		HangSanXuat hangSanXuat3 = new HangSanXuat("Cocacola", "USA");
		BoPhim boPhim1 = new BoPhim("BoGia", 2020, hangSanXuat1, 65000, ngay1);
		BoPhim boPhim2 = new BoPhim("Maui", 2020, hangSanXuat2, 100000, ngay2);
		BoPhim boPhim3 = new BoPhim("Nu hon bac ty", 2024, hangSanXuat3, 65000, ngay3);
		System.out.println(boPhim1.kiemTraGiaVeReHon(boPhim2));
		
		
	}
}
