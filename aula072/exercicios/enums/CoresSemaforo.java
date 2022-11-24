package aula072.exercicios.enums;

public enum CoresSemaforo {

  VERDE(15000), AMARELO(1000), VERMELHO(5000);

  private int _tempo;

  CoresSemaforo(int _tempo) {
    this._tempo = _tempo;
  }

  public int get_tempo() {
    return _tempo;
  }

  // public void set_tempo(int _tempo) {
  //   this._tempo = _tempo;
  // }

}
