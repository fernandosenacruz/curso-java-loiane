package aula068;

public class MultThread {
  public static void main(String[] args) {
    ThreadRunnable threadRunnable1 = new ThreadRunnable("#1", 1000);
    // Instaciando aqui ou no constructor
    Thread runnable1 = new Thread(threadRunnable1);
    runnable1.start();

    ThreadRunnable threadRunnable2 = new ThreadRunnable("#2", 400);
    Thread runnable2 = new Thread(threadRunnable2);
    runnable2.start();

    // saída no terminal
    // #1 1
    // #2 1
    // #2 2
    // #2 3
    // #1 2
    // #2 4
    // #2 5
    // #1 3
    // Threda finalizada!
    // #1 4
    // #1 5
    // Threda finalizada!
  }
}
