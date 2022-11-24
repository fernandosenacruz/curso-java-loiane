package aula072.exercicios;

public class ExercicioSemaforo {

  public static void main(String[] args) {

    ThreadSemaforo threadSemaforo = new ThreadSemaforo();

    // mudar a cor manualmente passando o tempo
    // threadSemaforo.getCoresSemaforo().set_tempo(1000);
    // threadSemaforo.mudarCor();
    // threadSemaforo.getCoresSemaforo().set_tempo(500);
    // threadSemaforo.mudarCor();
    // threadSemaforo.getCoresSemaforo().set_tempo(5000);

    for (int i = 0; i < 5; i++) {
      System.out.println(threadSemaforo.getCoresSemaforo());

      threadSemaforo.esperarMudarCor();
    }

    threadSemaforo.pararSemaforo();
  }
}
