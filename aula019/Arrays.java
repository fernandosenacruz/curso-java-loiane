package aula019;

import java.util.Random;

public class Arrays {
  public static void main(String[] args) {
    int[] senasNumbers = new int[6];
    Random random = new Random();

    int randomNumber = random.nextInt(100);

    for (int i = 0; i < senasNumbers.length; i++) {
      if (randomNumber > 0 && randomNumber < 100) {
        senasNumbers[i] = randomNumber;
        randomNumber = random.nextInt(100);
      }
    }

    System.out.print("Os números sorteados foram: ");

    // for each
    for (int num : senasNumbers) {
      System.out.print(num + " ");
    }
    ;
  }

}
