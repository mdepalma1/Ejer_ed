package nuevoPackage;

import java.util.Scanner;

public class Exercici_3_21 {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Introduce la temperatura en grados Fahrenheit:");
		        double fahrenheit = scanner.nextDouble();

		        double celsius = (fahrenheit - 32) * (5.0 / 9.0);

		        System.out.println("La temperatura en Celsius es de: " + celsius + " grados");
		
	}

}
