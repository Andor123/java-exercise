package exercise2;

class Animal2 {
	public void move() {
		System.out.println("Animals can move");
	}
	public void bark() {
		System.out.println("Not all animals can bark");
	}
}

class Dog2 extends Animal2 {
	public void move() {
		System.out.println("Dogs can walk and run");
	}
	public void bark() {
		System.out.println("Dogs can bark");
	}
}

public class TestDog {

	public static void main(String[] args) {
		Animal2 a = new Animal2();
		Animal2 b = new Dog2();
		
		a.move();
		a.bark();
		b.move();
		b.bark();
	}

}
