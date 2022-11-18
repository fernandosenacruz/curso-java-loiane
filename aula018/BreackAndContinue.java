package aula018;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BreackAndContinue {
  public static void main(String[] args) {
    List<Number> pairs = new ArrayList<>();
    int count = 0;

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Digite um número inicial e um final separados por espaços para verificação de divisores:");

      int initialNumber = scanner.nextInt();
      int finalNumber = scanner.nextInt();

      for (var i = initialNumber; i <= finalNumber; i++) {
        if (i == 0) {
          // não executa este bloco
          System.out.println("continua sem incrementar o count");
          continue;
        }
        if (i % 2 == 0) {
          pairs.add(i);
          count ++;
        }
        if (i == finalNumber) {
          System.out.println("para o lopping");
        }
      }

      System.out.println("Os números pares entre " + initialNumber +" e " + finalNumber + ": " + pairs);
      System.out.println(count);
    }
  }
}
