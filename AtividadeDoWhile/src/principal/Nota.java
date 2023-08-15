package principal;
import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        for (;;) {
            System.out.print("Informe uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                break;
            } else {
                System.out.println("Valor inválido. A nota deve estar entre 0 e 10. Tente novamente.");
            }
        }

        System.out.println("Você informou uma nota válida: " + nota);
    }
}