import java.util.Scanner;
import java.util.Locale;

public class atividade4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        float numero1 = sc.nextFloat();

        System.out.print("Digite o segundo número: ");
        float numero2 = sc.nextFloat();

        float soma = numero1 + numero2;

        System.out.printf("A soma de %.1f e %.1f é  %.1f%n", numero1, numero2, soma);

        sc.close();
    }
}
