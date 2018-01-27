package exercise;

class Animal2 {
	public void move() {
		System.out.println("Animals can move");
	}
}

class Dog2 extends Animal2 {
	public void move() {
		System.out.println("Dogs can walk and run");
	}
}

public class TestDog {

	public static void main(String[] args) {
		Animal2 a = new Animal2();
		Animal2 b = new Dog2();
		
		a.move();
		b.move();
	}

}
