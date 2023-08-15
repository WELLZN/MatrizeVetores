package principal;
import java.util.Scanner;

public class MaiorNumerodeGols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro time: ");
        String time1 = sc.nextLine();

        System.out.print("Digite o número de gols marcados pelo primeiro time: ");
        int golsTime1 = sc.nextInt();

        sc.nextLine(); // Limpar o buffer

        System.out.print("Digite o nome do segundo time: ");
        String time2 = sc.nextLine();

        System.out.print("Digite o número de gols marcados pelo segundo time: ");
        int golsTime2 = sc.nextInt();

        if (golsTime1 > golsTime2) {
            System.out.println("Vencedor: " + time1);
        } else if (golsTime2 > golsTime1) {
            System.out.println("Vencedor: " + time2);
        } else {
            System.out.println("EMPATE");
        }
    }
}