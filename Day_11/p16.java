package Day_11;
//b) final method

class parent {
	final void show() {
		System.out.println("Final method of parent");
	}
}

class C extends Parent {
	//void show()  {} error : cannot override final method
 }

public class p16 {

	public static void main(String[] args) {
		C c = new C();
		c.show();

	}

}
