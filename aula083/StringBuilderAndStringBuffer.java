package aula083;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import aula055.Pessoa;
import aula055.enums.TipoDoc;
import utils.GeraCPFCNPJ;

public class StringBuilderAndStringBuffer {

  public static void main(String[] args) {

    List<Pessoa> pessoas = new ArrayList<Pessoa>();
    StringBuilder stringBuilder = new StringBuilder(); // *** Thread safe ***
    // StringBuffer stringBuffer = new StringBuffer(); // *** Thread unsafe ***

    Pessoa p1 = new Pessoa(TipoDoc.valueOf("CPF"), GeraCPFCNPJ.cpf(), "Ximira");
    Pessoa p2 = new Pessoa(TipoDoc.valueOf("CNPJ"), GeraCPFCNPJ.cpf(), "Ximira LTDA");

    pessoas.addAll(Arrays.asList(p1, p2));

    for (Pessoa pessoa : pessoas) {
      stringBuilder.append(pessoa + "\n");
      // stringBuffer.append(pessoa + "\n");
    }

    System.out.print(stringBuilder.toString());
    // System.out.println(stringBuffer.toString());

    /**
     * Ambos métodos possuem a mesma saída, entretanto o StringBuilder é possível
     * sincronizar em multThreads e por isso seu uso é preferível.
     * 
     * Ximira
     * CPF: 427.801.412-04
     * Ximira LTDA
     * CNPJ: 723.711.002-00
     */

  }
}
