package aula020;

import java.util.Random;

public class Matricies {
  public static void main(String[] args) {
    int[][] matrix = new int[3][3];
    Random random = new Random();

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = random.nextInt(100);
      }
    }

    System.out.println("Os valores da matriz são: ");

    // for each
    for (int[] col : matrix) {
      for (int line : col) {
        System.out.print(line + " ");
      }
      System.out.println();
    }
  }
}
