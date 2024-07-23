import java.util.Scanner;

public class studentgrade {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter student's name: ");
    String name = scanner.nextLine();

    System.out.print("Enter student's score (out of 100): ");
    int score = scanner.nextInt();

    char grade = calculateGrade(score);

    System.out.println("Student's name: " + name);
    System.out.println("Student's score: " + score);
    System.out.println("Student's grade: " + grade);
  }

  public static char calculateGrade(int score) {
    if (score >= 90) {
      return 'A';
    } else if (score >= 80) {
      return 'B';
    } else if (score >= 70) {
      return 'C';
    } else if (score >= 60) {
      return 'D';
    } else {
      return 'F';
    }
  }
}
