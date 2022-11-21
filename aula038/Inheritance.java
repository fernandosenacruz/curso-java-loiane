package aula038;

import java.util.Scanner;

public class Inheritance {
  public static void main(String[] args) {

    Syndic syndic = new Syndic("1", "101", 0);
    Tenant tenantBc1Apt104 = new Tenant("1", "104", 0);
    Owner ownerBc4Apt101 = new Owner("4", "101", 0);

    syndic.setName("Ximira");

    syndic.conveneAssembly(syndic.getName());

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Nome do morador 01: ");
      tenantBc1Apt104.setName(scanner.next());
      System.out.println(tenantBc1Apt104.getName() + " confirmou presença.");

      System.out.println("Nome do morador 02: ");
      ownerBc4Apt101.setName(scanner.next());
      System.out.println(ownerBc4Apt101.getName() + " confirmou presença.");

      System.out.println(
          "O condomício deverá fazer eventos nos jogos da seleção brasileira? Sim ou não? \n Ps. Apenas proprietários podem votar.");

      System.out.println("Voto do morador " + ownerBc4Apt101.getName() + ": ");
      String vote1 = ownerBc4Apt101.vote(scanner.next());

      if (vote1 != null && vote1 == "Sim") {
        System.out.println("A assembléia decidiu que: " + vote1);
      } else {
        System.out.println("A assembléia decidiu que não.");
      }
    }

    tenantBc1Apt104.payRentAmount();
    tenantBc1Apt104.payCondoValue(350);

    System.out.println(tenantBc1Apt104.getName() + ": " + tenantBc1Apt104.payRentAmount());
    System.out
        .println(tenantBc1Apt104.getName() + " pagou o condomínio no valor de R$: " + tenantBc1Apt104.getCondoValue());

    ownerBc4Apt101.payCondoValue(350);

    System.out
        .println(ownerBc4Apt101.getName() + " pagou o condomínio no valor de R$: " + ownerBc4Apt101.getCondoValue());

  }
}
