package aula095;

import java.util.Locale;
import java.util.ResourceBundle;

public class ReourceBundleExemplo {

	public static void main(String[] args) {
		
		System.out.println(Locale.getDefault());
		
		ResourceBundle rb = ResourceBundle.getBundle("resource-bundle-exemplo");
		
		System.out.println(rb.getString("hello") + " " + rb.getString("world"));

//		Locale.setDefault(new Locale("en", "US"));
			
		rb = ResourceBundle.getBundle("resource-bundle-exemplo", new Locale("en", "US"));
		System.out.println(Locale.getDefault());
		
		System.out.println(rb.getString("hello") + " " + rb.getString("world"));
	}

}
