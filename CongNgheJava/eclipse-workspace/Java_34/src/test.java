
public class test {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(15, 5, 2025);
		MyDate md2 = new MyDate(15, 5, 2025);
		MyDate md3 = new MyDate(17, 5, 2025);
		if (md1 == md3) {
			System.out.println("md1 = md3");
		} else {
			System.out.println("md1 != md3");
		}
		System.out.println("md1 so danh bang md2: " + md1.equals(md2));
	}
}