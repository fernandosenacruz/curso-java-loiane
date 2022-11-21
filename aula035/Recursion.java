package aula035;

public class Recursion {
  public static int factorial(int n) {
    if (n == 0) return 1;

    return n * factorial(n - 1);
  }

  public static int fibonacci(int n) {
    if (n < 2) return 1;

    return fibonacci(n -1) + fibonacci(n - 2);
  }
}
