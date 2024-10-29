package retos1;

import retos1.Funciones1.*;
import retos1.Funciones2.*;
import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		String s2 = "";
		String s3 = "";
		do {
			System.out.println("Elige una operación:");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Par");
			System.out.println("6. Impar");
			System.out.println("7. Positivo");
			System.out.println("8. Negativo");
			System.out.println("0. Salir");
			String s1 = sc.nextLine();
			n1 = Integer.parseInt(s1);

			switch (n1) {

			case 1:
				System.out.println("Escribe el primer numero");
				s2 = sc.nextLine();
				n2 = Integer.parseInt(s2);
				System.out.println("Escibe el segundo numero");
				s3 = sc.nextLine();
				n3 = Integer.parseInt(s3);
				System.out.println(Funciones1.Sumar(n2, n3));
				break;

			case 2:

				System.out.println("Escribe el primer numero");
				s2 = sc.nextLine();
				n2 = Integer.parseInt(s2);
				System.out.println("Escibe el segundo numero");
				s3 = sc.nextLine();
				n3 = Integer.parseInt(s3);
				System.out.println(Funciones1.Restar(n2, n3));
				break;

			case 3:

				System.out.println("Escribe el primer numero");
				s2 = sc.nextLine();
				n2 = Integer.parseInt(s2);
				System.out.println("Escibe el segundo numero");
				s3 = sc.nextLine();
				n3 = Integer.parseInt(s3);
				System.out.println(Funciones2.multiplicacion(n2, n3));
				break;
			case 4:
				System.out.println("Escribe el primer numero");
				s2 = sc.nextLine();
				n2 = Integer.parseInt(s2);
				System.out.println("Escibe el segundo numero");
				s3 = sc.nextLine();
				n3 = Integer.parseInt(s3);
				System.out.println(Funciones2.division(n2, n3));
				break;
			case 5:
				System.out.println("Escribe el primer numero");
				s2 = sc.nextLine();
				n2 = Integer.parseInt(s2);
				System.out.println(Funciones1.esPar(n2));
				break;
			case 6:
				System.out.println("Escribe el primer numero");
				s2 = sc.nextLine();
				n2 = Integer.parseInt(s2);
				System.out.println(Funciones1.esImpar(n2));
				break;
			case 7:
				System.out.println("Escribe el primer numero");
				s2 = sc.nextLine();
				n2 = Integer.parseInt(s2);
				System.out.println(Funciones2.esPositivo(n2));
				break;
			case 8:
				System.out.println("Escribe el primer numero");
				s2 = sc.nextLine();
				n2 = Integer.parseInt(s2);
				System.out.println(Funciones2.esNegativo(n2));
				break;
			}

		} while (n1!=0);

	}

}
