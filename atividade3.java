import java.util.Scanner;
import java.util.Locale;

public class atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = sc.nextLine();
        System.out.print("Digite a idade da primeira pessoa: ");
        float idade1 = sc.nextFloat();

        sc.nextLine();

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = sc.nextLine();
        System.out.print("Digite a idade da segunda pessoa: ");
        float idade2 = sc.nextFloat();

        float media = (idade1 + idade2) / 2;

        System.out.println("nomes: " + nome1 + " e " + nome2);
        System.out.printf("A idade média entre eles é: %.1f%n: ", media);

        sc.close();
    }
}
