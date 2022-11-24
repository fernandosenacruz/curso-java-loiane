package aula072;

public class ThreadTicTac implements Runnable {

  TicTac ticTac;
  Thread t;

  final int NUMBER = 5;

  public ThreadTicTac(String name, TicTac ticTac) {
    this.ticTac = ticTac;
    t = new Thread(this, name);
    t.start();
  }

  @Override
  public void run() {

    try {
      if (t.getName().equalsIgnoreCase("Tic")) {
        for (int i = 0; i < NUMBER; i++) {
          ticTac.tic(true);
        }
        ticTac.tic(false);

      } else {
        for (int i = 0; i < NUMBER; i++) {
          ticTac.tac(true);
        }
        ticTac.tac(false);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
