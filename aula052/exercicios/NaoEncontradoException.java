package aula052.exercicios;

public class NaoEncontradoException extends Exception {

  private String nomeContato;

  /**
   * @param nomeContato
   */
  public NaoEncontradoException(String nomeContato) {
    this.nomeContato = nomeContato;
  }

  @Override
  public String toString() {
    return this.nomeContato + ": não localizado.";
  }

}
