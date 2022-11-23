package aula071;

public class Soma {

  private int sum;

  public synchronized int reduce(int[] arr) throws InterruptedException {
    sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];

      System.out.println(Thread.currentThread().getName() + " " + arr[i] + " = " + sum);

      Thread.sleep(100);
    }

    return sum;
  }
}
