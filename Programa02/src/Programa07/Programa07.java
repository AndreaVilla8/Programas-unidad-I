package Programa07;

import java.util.Scanner;

public class Programa07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		double f;
		double c;
		System.out.println ("Ingrese temperatura en grados Fahrenheit");
		f = leer.nextInt();
		c = (f-32)/1.8;
		System.out.println ("Fahrenheit: " + f + " en centigrados, es: " + c);
	}
	}