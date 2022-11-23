package aula068;

public class ThreadRunnable implements Runnable {

  private String nome;
  private int tempo;

  public ThreadRunnable(String nome, int tempo) {
    this.nome = nome;
    this.tempo = tempo;

    // pode ser instanceado aqui no na classe
    // Thread runnable = new Thread(this);
    // runnable.start();
  }

  @Override
  public void run() {

    try {
      for (int i = 1; i <= 5; i++) {
        System.out.println(nome + " " + i);
        Thread.sleep(tempo);
      }
    } catch (InterruptedException e) {
      e.getStackTrace();
    } finally {
      System.out.println("Threda finalizada!");
    }
  }

}
