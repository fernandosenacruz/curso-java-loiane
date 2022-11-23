package aula054;

public class Enum {
  public static void main(String[] args) {

    // for (int i = 0; i < Disciplinas.values().length; i++) {
    // Disciplinas disciplina = Disciplinas.values()[i];
    // System.out.println(disciplina.toString() + ": " + disciplina.getValue());
    // }

    for (Disciplinas disciplina : Disciplinas.values()) {
      System.out.println(disciplina.toString() + ": " + disciplina.getValue());
    }
  }
}
