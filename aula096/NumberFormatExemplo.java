package aula096;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExemplo {

	public static void main(String[] args) {
		
		Double number = 1000.50;
		
		System.out.println(Locale.getDefault()); 
		
		System.out.printf("%.2f %n", number);
		
		Locale en = new Locale("en", "US");
		
		NumberFormat nf = NumberFormat.getInstance(en);
		
		System.out.println(nf.format(number));
		
		// moeda
		NumberFormat moeda = NumberFormat.getCurrencyInstance(en);
		
		String valor = moeda.format(number);
		
		System.out.println(valor);
		
		moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
		valor = moeda.format(number);
		
		System.out.println(valor);
	}

}
