package CoreJavaQuiz1_;

/**
 * Star_Pattern
 * <p>
 * Writes a right-angled triangle star pattern of N rows.
 * Here, N is hardcoded to 5.
 */
public class Star_Pattern {

    public static void main(String[] args) {
        int i, j; // loop counters: i for rows, j for columns
        
        // 1. Star Pattern – Right-Angled Triangle
        System.out.println("1. Right Triangle Star Pattern");
        
        /*
         * number of rows (1 through 5)
         * Each row index 'i' determines how many stars to print
         */
        for (i = 1; i <= 5; i++) { // a rows
            // Inner loop: print 'i' stars for current row
            for (j = 1; j <= i; j++) { //  columns
                System.out.print("* "); // print star with a space, no newline
            }
            System.out.println(); // newline after each row is complete
        }
    }
}
