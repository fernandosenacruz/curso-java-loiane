package aula055.exercicios;

import aula055.exercicios.enums.Operacoes;

public class Calc {
  public static void main(String[] args) {
    double a = Math.ceil(Math.random() * 100);
    double b = Math.ceil(Math.random() * 100);

    for (Operacoes operacao : Operacoes.values()) {
      try {
        System.out.println(a + " " + operacao.toString() + " " + b + " = " + operacao.operacao(a, b));
      } catch (Exception e) {
        System.out.println("Operação inválida!");
        System.out.println(e.getMessage());
      }
    }
  }
}
