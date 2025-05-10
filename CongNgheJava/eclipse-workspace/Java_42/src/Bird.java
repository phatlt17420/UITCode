
public class Bird extends Animal {

	public Bird() {
		super("Bird");

	}
	@Override
	public void eat() {
		System.out.println("chim ăn sâu");
	}

	@Override
	public void makeSound() {
		System.out.println("líu lo");
	}
}
