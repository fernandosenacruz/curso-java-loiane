package aula072.exercicios;

import aula072.exercicios.enums.CoresSemaforo;

public class ThreadSemaforo implements Runnable {

  private CoresSemaforo coresSemaforo;
  private boolean encerrar = false;
  private boolean mudouCor = false;

  public ThreadSemaforo() {
    this.coresSemaforo = CoresSemaforo.VERMELHO;

    new Thread(this).start();
  }

  public CoresSemaforo getCoresSemaforo() {
    return coresSemaforo;
  }

  private synchronized void mudarCor() {
    switch (this.coresSemaforo) {
      case VERMELHO:
        this.coresSemaforo = CoresSemaforo.VERDE;
        break;

      case VERDE:
        this.coresSemaforo = CoresSemaforo.AMARELO;
        break;

      case AMARELO:
        this.coresSemaforo = CoresSemaforo.VERMELHO;
        break;

      default:
        break;
    }

    this.mudouCor = true;
    notifyAll();
  }

  synchronized void esperarMudarCor() {
    while (!mudouCor) {
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    this.mudouCor = false;
  }

  synchronized void pararSemaforo() {
    this.encerrar = true;
  }

  @Override
  public void run() {
    while (!encerrar) {
      try {
        Thread.sleep(this.coresSemaforo.get_tempo());

        this.mudarCor();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

  }

}