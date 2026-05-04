import java.util.Scanner;
import java.util.Locale;

public class atividade11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da primeira nota: ");
        float nota1 = sc.nextFloat();

        System.out.print("Informe o valor da segunda nota: ");
        float nota2 = sc.nextFloat();

        float media = (nota1 + nota2) / 2;

        if (media > 5) {
            System.out.printf("Nota 1: %.1f | Nota 2: %.1f | Média: %.1f%n", nota1, nota2, media);
            System.out.println("Status: Aprovado!");
        } else {
            System.out.printf("Média: %.1f%nStatus: Reprovado.%n", media);
        }
        sc.close();
    }
}