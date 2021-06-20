import java.util.Scanner;

public class Main {

  private static int countFactorNumber(int data) {
    int count = 0;

    for (int i = 1; i <= data; i++) {
      if (data % i == 0) {
        count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input number : ");
    int data = sc.nextInt();

    int count = 0;
    for (int i = 1; i < data; i++) {
      int factorNumber = countFactorNumber(i);
      if (factorNumber == 6) {
        count++;
      }
    }

    System.out.println("Total number that has 6 factor : " + count + "\n");
  }
}
