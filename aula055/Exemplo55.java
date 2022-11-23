package aula055;

import java.util.Scanner;

import aula055.enums.TipoDoc;
import utils.GeraCPFCNPJ;

public class Exemplo55 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Gerador randomizado de CPF");
    System.out.println("Digite um nome:");
    String nome1 = sc.nextLine();

    Pessoa p1 = new Pessoa(TipoDoc.valueOf("CPF"), GeraCPFCNPJ.cnpj(), nome1);

    System.out.println(p1.toString());

    System.out.println("Gerador randomizado de CNPJ");
    System.out.println("Digite um nome:");
    String nome2 = sc.nextLine();

    Pessoa p2 = new Pessoa(TipoDoc.valueOf("CNPJ"), GeraCPFCNPJ.cpf(), nome2);

    System.out.println(p2.toString());

    sc.close();
  }
}
