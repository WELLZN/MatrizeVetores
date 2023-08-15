package principal;

import java.util.Scanner;

public class MediaDenotas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double media = 0;
		
		System.out.print("entre com a primeira nota : ");
		nota1 = leia.nextDouble();
		
		System.out.print("entre com a segunda nota : ");
		nota2 = leia.nextDouble();
		
		System.out.print("entre com a terceira nota : ");
		nota3 = leia.nextDouble();
		
		System.out.print("entre com a quarta nota : ");
		nota4 = leia.nextDouble();
		leia.close();
		
		
		media = (nota1 + nota2 + nota3 + nota4) / 4; 
		
		if (media < 6) {
			System.out.println("Aluno reprovado , parabens bobao");
		}else if (media >= 6 && media < 7 ) {
			System.out.println("Aluno de recuperação :(");
		}else if (media >= 7 && media < 10) {
			System.out.println();
		}else {
			System.out.println("Aluno aprovado , nao fez o minimo " + media);
		}
		

	}

}
