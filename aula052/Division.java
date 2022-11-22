package aula052;

import java.util.Scanner;

public class Division {
  public static int getDivision(int number01, int number02) {
    try {
      if (number01 / number02 <= 0) {
        throw new CustomException(number01, number02);
      }
    } catch (CustomException e) {
      e.getMessage();
      e.printStackTrace();
    }

    return number01 / number02;
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Digite um número inteiro:");
      int number01 = scanner.nextInt();

      System.out.println("Digite um divisor:");
      int number02 = scanner.nextInt();

      int result = getDivision(number01, number02);

      System.out.println("Resultado: " + result);
    }
  }
}
