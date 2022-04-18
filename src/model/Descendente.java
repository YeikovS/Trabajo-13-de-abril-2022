package model;

public class Descendente extends Thread {

	@Override
	public void run() {
		for (int i = 10; i >= 1; i--) {
			try {
				Thread.sleep(1300);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Descendente: " + i);
		}
		System.out.println("Contador descendente ha finalizado");
	}
}
