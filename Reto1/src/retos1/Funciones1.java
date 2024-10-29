package retos1;

public class Funciones1 {
	public static int Sumar(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int Restar(int num1, int num2) {
		return num1 - num2;
	}
	public static boolean esPar(int num1) {
		if(num1%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean esImpar(int num1) {
		if(num1%2==0) {
			return false;
		}
		else {
			return true;
		}
	}
	
}
