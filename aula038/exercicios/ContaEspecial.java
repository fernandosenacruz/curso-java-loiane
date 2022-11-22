package aula038.exercicios;

public class ContaEspecial extends ContaBancaria {
  private double limite;

  public double getLimite() {
    return limite;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  @Override
  public String toString() {
    return "Cliente: " + super.getNomeCliente() + "\n" + super.getNumConta() + "\nsaldo: R$ " + super.getSaldo()
        + "\nlimite: R$ " + limite;
  }

  public boolean sacar(double valor) {
    double saldoComLimite = this.getSaldo() + limite;

    if ((saldoComLimite - valor) >= 0) {
      this.setSaldo(this.getSaldo() - valor);
      limite -= valor;
      return true;
    }

    return false;
  }
}
