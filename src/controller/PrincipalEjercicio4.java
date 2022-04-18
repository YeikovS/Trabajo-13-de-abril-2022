package controller;

import model.Leopardo1;
import model.Leopardo2;
import model.Leopardo3;
import model.Leopardo4;

public class PrincipalEjercicio4 {
	public static void main(String[] args) {
		Leopardo1 l1 = new Leopardo1("l1");
		Leopardo2 l2 = new Leopardo2("l2");
		Leopardo3 l3 = new Leopardo3("l3");
		Leopardo4 l4 = new Leopardo4("l4");
		System.out.println("Carrera de 4 Leopardos... ¿Quién ganará?: \n");
		l1.start();
		l2.start();
		l3.start();
		l4.start();
	}
}
