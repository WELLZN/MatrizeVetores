package principal;
import java.util.Scanner;
public class Intervalo {

	public static void main(String[] args) {
Scanner scanner = new Scanner (System.in);
		
		int num1;
		int num2;
		
		
		System.out.println("Digite o primeiro numero:");
		num1 = scanner.nextInt();
		
		System.out.println("Digite o segundo numero:");
		num2 = scanner.nextInt();
		
		
			for (int contador = ++num1; contador < num2; contador++)
			System.out.println(contador);
			
		
			
	}
	

}
