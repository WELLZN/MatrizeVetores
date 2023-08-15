package principal;
import java.util.Scanner;
public class Maiornumero {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("escreva one number: ");
		int numero1 = scanner.nextInt();
		
		System.out.println("escreva other number: ");
		int numero2 = scanner.nextInt();
		

		if (numero1 > numero2){
		System.out.println("O primeiro numero informado é maior");
		}
		else {
			System.out.println("O segundo numero informado é maior");
		}}}
