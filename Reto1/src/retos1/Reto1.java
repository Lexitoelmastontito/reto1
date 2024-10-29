package retos1;

import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n1=0;
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
			
			
		}while(n1>=0);
		

	}

}
