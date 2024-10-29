package retos1;

public class Funciones2 {
	public static int multiplicacion(int num1, int num2) {
		return (num1*num2);
		
		
	}
	public static int division(int num1, int num2) {
		if(num2==0) {
			return 0;
		}
		else {
			return num1/num2;
		}
	}
	public static boolean esPositivo(int num) {
		if(num>=0) {
			return true;
		}
		else {
			return false;
		}
	
	}
	public static boolean esNegativo(int num) {
		if(num<0) {
			return true;
		}
		else {
			return false;
		}
	
	}
	
}
