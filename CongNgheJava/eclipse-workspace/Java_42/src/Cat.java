
public class Cat extends Animal {

	public Cat() {
		super("Cat");

	}

	@Override
	public void eat() {
		System.out.println("Mèo ăn cá");
	}

	@Override
	public void makeSound() {
		System.out.println("meow");
	}

}
