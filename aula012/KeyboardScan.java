import java.util.Scanner;

public class KeyboardScan {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Digite algo: ");

      // read line
      String line = scanner.nextLine();

      System.out.println(line + " foi o valor digitado.");

      // read specific value
      System.out.println("Digite uma palavra: ");

      // string
      String word = scanner.next();

      System.out.println("A palavra digitada foi: " + word);

      // int
      System.out.println("Digite um número: ");

      int number = scanner.nextInt();

      System.out.println("A valor digitado foi: " + number);

      // boolean
      System.out.println("Você é feliz? \n Digite true para sim e false para não.");

      boolean bool = scanner.nextBoolean();

      if (bool) {
        System.out.println("Que bom!");
      } else {
        System.out.println("Você precisa de ajuda...");
      }

    }
  }
}
