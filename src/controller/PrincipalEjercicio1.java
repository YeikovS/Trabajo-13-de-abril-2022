package controller;

import model.Ascendente;
import model.Descendente;

public class PrincipalEjercicio1 {
	public static void main(String[] args) {
		Ascendente a = new Ascendente();
		Descendente d = new Descendente();
		System.out.println("Contador ASCENDENTE y DESCENDETE: \n");
		a.start();
		d.start();
	}
}
