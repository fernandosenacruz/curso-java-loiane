package aula050;

import java.util.Scanner;

public class ThrowsException {
  public static double readyDouble() throws Exception {
    try (Scanner scanner = new Scanner(System.in)) {
      double number = scanner.nextDouble();

      return number;
    }
  }

  public static void main(String[] args) {
    System.out.println("Digite um número decimal separado por vírgula:");

    try {
      double number = readyDouble();

      System.out.println("O número digitado foi: " + number);
    } catch (Exception e) {
      System.out.println("Algo errado não estpa certo...\n");
      e.printStackTrace();
    } finally {
      System.out.println("Você realemente digitou um dacimal separado por vírgula?");
    }
  }
}
