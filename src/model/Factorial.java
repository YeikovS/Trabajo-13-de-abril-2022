package model;

import java.util.Scanner;

public class Factorial extends Thread {

	@Override
	public void run() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ejercicio 3:\n");
		System.out.println("Calcular el factorial de un número:\n");
		System.out.print("Digitar un número: ");
		int n = leer.nextInt();
		long f = 1;
		for (int i = 1; i <= n; i++) {
			f *= i;
		}
		System.out.println("El factorial de: " + n + " es: " + f);
		leer.close();
	}

}
