package aula014;

import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Digite um número entre 1 e 7:");

      int number = scanner.nextInt();
      var response = "Você digitou o número " + number;

      switch (number) {
        case 1:
          System.out.println(response);
          break;

        case 2:
          System.out.println(response);
          break;

        case 3:
          System.out.println(response);
          break;

        case 4:
          System.out.println(response);
          break;

        case 5:
          System.out.println(response);
          break;

        case 6:
          System.out.println(response);
          break;

        case 7:
          System.out.println(response);
          break;

        default: System.out.println(number + " não está entre 1 e 7.");
      }
    }
  }
}
