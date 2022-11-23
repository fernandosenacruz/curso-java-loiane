package aula071;

public class ThreadSoma implements Runnable {

  private String name;
  private int[] arr;
  private static Soma soma = new Soma();

  public ThreadSoma(String name, int[] arr) {
    this.name = name;
    this.arr = arr;
    new Thread(this, name).start();
  }

  @Override
  public void run() {

    System.out.println(this.name + " iniciou.");

    int reduce;
    try {
      reduce = soma.reduce(this.arr);
      System.out.println("Resultado da thread " + this.name + ": " + reduce);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println(this.name + " finalizou.");
  }

}
