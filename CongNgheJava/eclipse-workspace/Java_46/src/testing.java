import java.util.Iterator;

public class testing {
	public static void main(String[] args) {
		System.out.println("Test câu a: ");
		MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
		MayTinhVinaCal500 mvn500 = new MayTinhVinaCal500();
		System.out.println(" 5 + 3 = " + mfx500.cong(5, 3));
		System.out.println(" 4 * 5 = " + mvn500.nhan(4, 5));
		System.out.println(" 4 / 0 = " + mvn500.chia(4, 0));

		System.out.println("Test câu b: ");
		double[] arr = new double[] { 5, 1, 3, 2, 3, 2, 9, 5 };
		double[] arr2 = new double[] { 8, 4, 9, 2, 34, 8, 2, 5 };
		SapXepChen sxc = new SapXepChen();
		SapXepChon sxchon = new SapXepChon();
		sxchon.sapXetTang(arr);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print ( arr[i] +" ");
		}
		
		System.out.println("Test câu b: ");
		
		PhanMemMayTinh mt = new PhanMemMayTinh();
		System.out.println(mt.cong(3, 4));
		mt.sapXetGiam(arr2);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print ( arr2[i] +" ");
		}
		
	}
}
