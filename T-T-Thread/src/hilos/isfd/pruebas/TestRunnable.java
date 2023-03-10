package hilos.isfd.pruebas;

import hilos.isfd.formathread.Hilo2;

public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hilo2 ht = new Hilo2 ("Pedro");
		Thread st = new Thread(ht);
		st.start();
		
		new Thread(new Hilo2("Canicula")).start();
		new Thread(new Hilo2("Mariano")).start();
		

	}

}
