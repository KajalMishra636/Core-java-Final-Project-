package Day_11;
//example 2 : to call current  method \
class example {
	void show() {
		System.out.println("Inside show()");
	}
	
	void display() {
		this.show();
	}
}
public class p19 {

	public static void main(String[] args) {
		example ex = new example();
		ex.display();
	}

}
