package exercise;

class Outer_Demo2 {
	private int num = 175;
	
	public class Inner_Demo {
		public int getNum() {
			System.out.println("This is the getNum method of the inner class.");
			return num;
		}
	}
}

public class My_class2 {

	public static void main(String[] args) {
		Outer_Demo2 outer = new Outer_Demo2();
		
		Outer_Demo2.Inner_Demo inner = outer.new Inner_Demo();
		System.out.println(inner.getNum());
	}

}
