package Day___17;

//9. Logging Exception 
import java.util.logging.*;
public class p23 {

	private static final Logger logger = Logger.getLogger(p23.class.getName());
	
	public static void main(String[] args) {
		try {
			int result = 10 / 0 ; //This will throw ArithmeticException
			
		}catch (ArithematicException e) {
			logger.log(Level.SEVERE, "Exception occurred: ",e);
		}

	}

}
