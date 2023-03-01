package ciclos.forwhiledo;

public class UsoFor {
	public void cicloFor() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("El iterador --> " + i);
		}

	}
	
	/*public void letrasfor() {
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.println("---> " + i + ", " );
			char letra = (char) i;
			System.out.println();
			System.out.println("soy --->" + letra + ",");
		}
	}*/
	
	/*public void letrasfor() {
		for (int i = 'A'; i <= 'Z'; i++) {
		System.out.println("soy ---Z" + Character.toString((char)i)+ ",");
		}
	}*/
	public void letrasfor() {
		for (int i = 'A'; i <= 'Z'; i++) {
		System.out.println("soy --->" + (char)i + ",");
		}
	}
}
