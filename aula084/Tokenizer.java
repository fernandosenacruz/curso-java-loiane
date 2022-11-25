package aula084;

import java.util.StringTokenizer;

public class Tokenizer {

  public static void main(String[] args) {

    String lorenIpsum1 = "Lorem ipsum dolor sit amet consectetur adipisicing elit.";
    String lorenIpsum2 = "Maxime mollitia, molestia laborum numquam blanditiis harum quisquam eius sed odit!";
    String lorenIpsum3 = "Provident similique accusantium nemo autem.";
    String lorenIpsum4 = "Veritatis obcaecati aliquam nihil, eveniet aliquid culpa officia aut?";

    StringBuilder sb = new StringBuilder(lorenIpsum1);
    sb.append(lorenIpsum2);
    sb.append(lorenIpsum3);
    sb.append(lorenIpsum4);

    StringTokenizer st = new StringTokenizer(sb.toString(), ".!?");

    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }

    // Saída no terminal

    /*
     * Lorem ipsum dolor sit amet consectetur adipisicing elit
     * Maxime mollitia, molestia laborum numquam blanditiis harum quisquam eius sed
     * odit
     * Provident similique accusantium nemo autem
     * Veritatis obcaecati aliquam nihil, eveniet aliquid culpa officia aut
     */

  }
}
