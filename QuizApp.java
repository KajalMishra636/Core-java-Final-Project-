import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        int totalQuestions = 3;
        char answer;

        System.out.println("\n\t=== Welcome to the Quiz ===");

        // Question 1
        System.out.println("\n\t1. What is the capital of India?");
        System.out.println("\tA. Mumbai");
        System.out.println("\tB. New Delhi");
        System.out.println("\tC. Kolkata");
        System.out.print("\tYour answer (A/B/C): ");
        answer = scanner.next().toUpperCase().charAt(0);
        if (answer == 'B') {
            score++;
        }

        // Question 2
        System.out.println("\n\t2. Which planet is known as the Red Planet?");
        System.out.println("\tA. Earth");
        System.out.println("\tB. Mars");
        System.out.println("\tC. Venus");
        System.out.print("\tYour answer (A/B/C): ");
        answer = scanner.next().toUpperCase().charAt(0);
        if (answer == 'B') {
            score++;
        }

        // Question 3
        System.out.println("\n\t3. Who wrote the national anthem of India?");
        System.out.println("\tA. Rabindranath Tagore");
        System.out.println("\tB. Mahatma Gandhi");
        System.out.println("\tC. Subhash Chandra Bose");
        System.out.print("\tYour answer (A/B/C): ");
        answer = scanner.next().toUpperCase().charAt(0);
        if (answer == 'A') {
            score++;
        }

        // Calculate percentage
        double percentage = ((double) score / totalQuestions) * 100;

        // Display result
        System.out.println("\n\t=== Quiz Completed! ===");
        System.out.printf("\tYour Score: %d out of %d\n", score, totalQuestions);
        System.out.printf("\tPercentage: %.2f%%\n", percentage);

        scanner.close();
    }
}
