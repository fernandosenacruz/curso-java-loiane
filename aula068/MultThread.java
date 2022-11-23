package aula068;

public class MultThread {

  public static void multThread() {

    ThreadRunnable threadRunnable1 = new ThreadRunnable("#1", 1000);
    // Instaciando aqui ou no constructor
    Thread runnable1 = new Thread(threadRunnable1);
    runnable1.start();

    ThreadRunnable threadRunnable2 = new ThreadRunnable("#2", 400);
    Thread runnable2 = new Thread(threadRunnable2);
    runnable2.start();

    System.out.println("Processo finalizado!");
  }

  public static void waitMultThread() throws InterruptedException {

    ThreadRunnable threadRunnable1 = new ThreadRunnable("#1", 1000);
    // Instaciando aqui ou no constructor
    Thread runnable1 = new Thread(threadRunnable1);

    ThreadRunnable threadRunnable2 = new ThreadRunnable("#2", 400);
    Thread runnable2 = new Thread(threadRunnable2);

    runnable1.start();
    runnable2.start();

    runnable1.join();
    runnable2.join();

    System.out.println("Processo finalizado!");
  }

  public static void priorityMultThread() throws InterruptedException {

    ThreadRunnable threadRunnable1 = new ThreadRunnable("#1", 1000);
    // Instaciando aqui ou no constructor
    Thread runnable1 = new Thread(threadRunnable1);

    ThreadRunnable threadRunnable2 = new ThreadRunnable("#2", 400);
    Thread runnable2 = new Thread(threadRunnable2);

    runnable1.setPriority(Thread.NORM_PRIORITY);
    runnable2.setPriority(Thread.MAX_PRIORITY);

    runnable1.start();
    runnable2.start();

    runnable1.join();
    runnable2.join();

    System.out.println("Processo finalizado!");
  }

  public static void main(String[] args) {

    multThread();
    // saída no terminal
    // #1 1
    // #2 1
    // #2 2
    // #2 3
    // #1 2
    // #2 4
    // #2 5
    // #1 3
    // Thred #2 finalizada!
    // #1 4
    // #1 5
    // Thred #1 finalizada!

    try {
      waitMultThread();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // saída no terminal
    // #2 1
    // #1 1
    // #2 2
    // #2 3
    // #1 2
    // #2 4
    // #2 5
    // #1 3
    // Thred #2 finalizada!
    // #1 4
    // #1 5
    // Thred #1 finalizada!
    // Processo finalizado!

    try {
      priorityMultThread();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // saída no terminal
    /*
     * #1 1
     * #2 1
     * #2 2
     * #2 3
     * #1 2
     * #2 4
     * #2 5
     * #1 3
     * Thred #2 finalizada!
     * #1 4
     * #1 5
     * Thred #1 finalizada!
     * Processo finalizado!
     */
  }
}
