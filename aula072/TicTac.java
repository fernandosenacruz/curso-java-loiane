package aula072;

public class TicTac {

  boolean tic;

  synchronized void tic(boolean executing) throws InterruptedException {

    if (!executing) {
      tic = true;

      notifyAll();
      return;
    }

    System.out.print("Tic - ");
    Thread.sleep(1000);

    tic = true;
    notifyAll();

    while (tic) {
      wait();
    }
  }

  synchronized void tac(boolean executing) throws InterruptedException {

    if (!executing) {
      tic = false;

      notifyAll();
      return;
    }

    System.out.println("Tac.");
    Thread.sleep(1000);

    tic = false;
    notifyAll();

    while (!tic) {
      wait();
    }
  }
}
