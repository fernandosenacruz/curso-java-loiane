package aula098;

import java.util.Random;

public class RandomExemplo {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		System.out.println(random.nextDouble(1000));
		System.out.println(random.nextInt()); // o limite é o tamanho max do int
		System.out.println(random.nextInt(101)); // com limitador
				
	}

}
