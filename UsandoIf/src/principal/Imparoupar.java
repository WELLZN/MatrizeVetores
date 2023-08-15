package principal;

import java.util.Scanner;

public class Imparoupar {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
		
	System.out.println("Escreva um numero: " );
	int numero = scanner.nextInt();
	
	if (numero % 2 == 0){
		System.out.println("Esse numero é par");
	
	}
	else {
	System.out.println("Esse numero é impar");
}
}}
