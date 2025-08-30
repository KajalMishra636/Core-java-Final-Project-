package Day_15;

public class pp11 {
        // Program 3: Difference between string litrals and String objects create using `new`
	
	public static void main(String[] args) {
		
		//s1 refers to a string litral, which is stored in the "String Pool"
		String s1 = "Hello";
		
		//s2 also refers to the same string litrals "Hello" in the pools 
		//Since it's the same litral ,Java reuses the objects from the pool
		
		String s2 = "Hello";
		
		 // Check if s1 and s2 refer to the same object in memory
		System.out.println(s1 == s2); //output: true 
		
		
		//s3 is created using the `new ` keyword , which creates a new string object in the heap memory 
        // Even though the content is the same, s3 is not pointing to the pooled "Hello".
        String s3 = new String ("Hello");
        
        // Check reference equality — false because s1 and s3 point to different objects
        System.out.println(s1 == s3);
        
      //s4 stores the result of s3.intern()
        // intern() returns a reference from the string pool if one exists for that content.
        String s4 = s3.intern();
        
        // Now s4 refers to the same pooled object as s1
         System.out.println("s1 == s4");
         
         // ✅ Real-Time Example:
         // In large-scale systems like banking or billing software,
         // strings like "INR", "USD", "PENDING", "COMPLETED", etc., appear repeatedly.
         // Instead of creating new objects, Java reuses string literals from the pool,
         // optimizing memory and improving performance.
       /*
        String s1 = "Hello";         // ─┐
                             //  └─> [Pool] "Hello"
String s2 = "Hello";         // ─┘ (same object in pool)

String s3 = new String("Hello"); // [Heap] new "Hello"

String s4 = s3.intern();     // ─┬─> [Pool] "Hello" (same as s1/s2)

        */
         
	}

}
