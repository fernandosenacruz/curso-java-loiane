package aula016;

import java.util.Scanner;

public class DoWhile {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Digite um número de repetições: ");

      int number = scanner.nextInt();
      int count = 0;

      while (count < number) {
        count ++;
        
        System.out.println(count);
      }

      do {
        System.out.println(count + " é igual ao valor digitado.");
      } while (count != number);
    }
  }
}
