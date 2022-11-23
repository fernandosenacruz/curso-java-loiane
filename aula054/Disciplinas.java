package aula054;

public enum Disciplinas {
  MATEMATICA(1),
  QUIMICA(2),
  BIOLOGIA(3),
  FISICA(4),
  PORTUGUES(5),
  INGLES(6),
  LITERATURA(7);

  private int value;

  Disciplinas(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
