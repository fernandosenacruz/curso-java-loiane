package aula052.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio52 {
  public static void main(String[] args) {
    Agenda agenda = new Agenda();
    Contato contato = new Contato();

    menu(agenda, contato);
  }

  public static int opicao(Scanner sc) {
    sc = new Scanner(System.in);
    try {
      int opcao = sc.nextInt();
      if (opcao == 1 || opcao == 2 || opcao == 3) {
        return opcao;
      } else if (opcao != 1 || opcao != 2 || opcao != 3) {
        throw new Exception("Opção inválida!");
      }

    } catch (InputMismatchException e) {
      System.out.println("Opção inválida!");
      e.getMessage();
      e.getStackTrace();
    } catch (Exception e) {
      System.out.println("Opção inválida!");
      e.getMessage();
      e.getStackTrace();
    }
    return 0;
  }

  public static void menu(Agenda agenda, Contato contato) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Escolha uma opçao...");
      System.out.println("1 - consultar agenda\n2 - adicionar contato\n3 - sair");

      int menu = opicao(scanner);

      switch (menu) {
        case 0:
          try {
            System.out.println(agenda.listarContatos());
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          menu(agenda, contato);

        case 1:
          System.out.println("Digite o nome do contato:");
          try {
            String nome = scanner.nextLine();
            System.out.println(agenda.buscaPorNome(nome));
            menu(agenda, contato);
          } catch (NaoEncontradoException e) {
            System.out.print(e.toString());
            e.printStackTrace();
          } finally {
            menu(agenda, contato);
          }
          break;

        case 2:
          System.out.println("Digite o nome do contato:");
          contato.setNome(scanner.nextLine());
          System.out.println("Digite o telefone do contato:");
          contato.setTelefone(scanner.nextLine());
          System.out.println("Digite o e-mail do contato:");
          contato.setEmail(scanner.nextLine());

          try {
            agenda.add(contato);
            menu(agenda, contato);
          } catch (AgendaCheiaException e) {
            System.out.print(e.getMessage());
            e.printStackTrace();
          } finally {
            menu(agenda, contato);
          }
          break;

        case 3:
          System.exit(0);

        default:
          System.exit(0);

      }
    }
  }

}