package principal;

import java.util.Scanner;

public class NomeVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantidade = 0;
		
		System.out.println("quantos nomes deseja cadastrar");
		quantidade= sc.nextInt();
		sc.nextLine();
		
		String[] nomes = new String[quantidade];
		
		for (int contador = 0 ;contador < nomes.length; contador++){
			System.out.println("Digite o nome :");
		nomes [contador]= sc.nextLine();
		
		for (String nome : nomes ) {
			System.out.println(nome);
		}
		}}		
	}
	
