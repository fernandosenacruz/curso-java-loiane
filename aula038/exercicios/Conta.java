package aula038.exercicios;

public class Conta {
  private String tipo;
  private String agencina;
  private String conta;

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getAgencina() {
    return agencina;
  }

  public void setAgencina(String agencina) {
    this.agencina = agencina;
  }

  public String getConta() {
    return conta;
  }

  public void setConta(String conta) {
    this.conta = conta;
  }

  @Override
  public String toString() {
    return "tipo: " + tipo + "\nagencina: " + agencina + "\nnúmero: " + conta;
  }
}
