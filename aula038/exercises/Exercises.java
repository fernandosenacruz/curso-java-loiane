package aula038.exercises;

public class Exercises {
  public static void main(String[] args) {
    ContaBancaria conta01 = new ContaBancaria();
    Conta numConta = new Conta();
    numConta.setTipo("corrente");
    numConta.setAgencina("001");
    numConta.setConta("10007-9");

    conta01.setNomeCliente("Ximira");
    conta01.setNumConta(numConta);

    saque(conta01, 50);

    conta01.depositar(100);

    consulta(conta01);

    saque(conta01, 50);

    consulta(conta01);

    // conta especial
    ContaEspecial conta02 = new ContaEspecial();
    Conta numConta2 = new Conta();
    numConta2.setTipo("especial");
    numConta2.setAgencina("001");
    numConta2.setConta("10507-1");

    conta02.setNomeCliente("Hanibal");
    conta02.setNumConta(numConta2);
    conta02.setSaldo(1500);
    conta02.setLimite(25000);

    saque(conta02, 5001);

    consulta(conta02);
  }

  private static void saque(ContaBancaria conta, double valor) {
    if (conta.sacar(valor)) {
      System.out.println("Saque resalizado!\nSaldo: " + conta.getSaldo());
    } else {
      System.out.println("Saldo insuficiente!\nSaldo: " + conta.getSaldo());
    }
  }

  private static void consulta(ContaBancaria conta) {
    System.out.println(conta);
  }
}
