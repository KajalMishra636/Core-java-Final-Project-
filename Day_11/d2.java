package Day_11;
//invoking other constructor 
//lets take the square height and width

public class d2 {
 int height;
 int width;
 
 //constructor -1
 d2(int height, int width)
 {
	 this.height= height;
	 this.width = width;
 }
 
 //constructor - 2
 d2 (int side)
 {
	 this(side,side); //calling constructor
	 
 }
 public int area()
 {
	 return height*width;
 }
	public static void main(String[] args) {
		d2 obj = new d2(5);
		
		System.out.println("Area is : "+obj.area());

	}

}
