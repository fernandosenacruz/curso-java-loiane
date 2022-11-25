package aula097;

import java.math.BigDecimal;

public class BigDecimalExemplo {

	public static void main(String[] args) {
		
		double a = 0.03;
		double b = 0.04;
		double c = b - a;
		
		System.out.println(c);
		
		// saída no terminal
		// 0.010000000000000002
		
		BigDecimal d = new BigDecimal("0.03");
		BigDecimal e = new BigDecimal("0.04");
		BigDecimal f = e.subtract(d);
		BigDecimal g = d.add(e);
		
		System.out.println(f);
		System.out.println(g);
		System.out.println(d.multiply(e));
		System.out.println(e.divide(new BigDecimal(2)));
		
	}

}
