package aula072;

public class WaitThread {

  public static void main(String[] args) {

    TicTac ticTac = new TicTac();
    ThreadTicTac tic = new ThreadTicTac("Tic", ticTac);
    ThreadTicTac tac = new ThreadTicTac("Tac", ticTac);

    try {
      tic.t.join();
      tac.t.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
