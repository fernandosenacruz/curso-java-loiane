package aula055.exercicios.enums;

public enum Operacoes {
  ADD("+") {
    @Override
    public double operacao(double a, double b) {
      return a + b;
    }
  },
  SUB("-") {
    @Override
    public double operacao(double a, double b) {
      return a - b;
    }
  },
  MULT("*") {
    @Override
    public double operacao(double a, double b) {
      return a * b;
    }
  },
  DIV("/") {
    @Override
    public double operacao(double a, double b) {
      return a / b;
    }
  };

  private String operador;

  Operacoes(String operdaor) {
    this.operador = operdaor;
  }

  public abstract double operacao(double a, double b);

  public String toString() {
    return this.operador;
  }
}
