package aula071;

public class SynchronizedThread {

  public static void main(String args[]) {

    int[] arr = { 1, 5, 10 };

    new ThreadSoma("#1", arr);
    new ThreadSoma("#2", arr);

    // saída no terminal
    /*
     * #2 iniciou.
     * #1 iniciou.
     * #2 1 = 1
     * #2 5 = 6
     * #2 10 = 16
     * #1 1 = 1
     * Resultado da thread #2: 16
     * #2 finalizou.
     * #1 5 = 6
     * #1 10 = 16
     * Resultado da thread #1: 16
     * #1 finalizou.
     */

  }
}
