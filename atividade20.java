import java.util.Scanner;
import java.util.Locale;

public class atividade20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("1°Número: ");
        double n1 = sc.nextDouble();

        System.out.print("2°Número: ");
        double n2 = sc.nextDouble();

        if (n1 % n2 == 0) {
            System.out.printf("o número %.2f é múltiplo do número %.2f%n ", n1, n2);
        } else if (n2 % n1 == 0) {
            System.out.printf("o número %.2f é múltiplo do número %.2f%n ", n2, n1);
        } else {
            System.out.printf("os números %.2f e %.2f%n não são múltiplos um do outro ", n1, n2);
        }

        sc.close();
    }
}