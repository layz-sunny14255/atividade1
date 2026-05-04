mport java.util.Scanner;
import java.util.Locale;

public class atividade17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("1°Lançamento: ");
        double l1= sc.nextDouble();
    
        System.out.println("2°Lançamento: ");
        double l2= sc.nextDouble();

        System.out.println("3°Lançamento: ");
        double l3= sc.nextDouble();

        double maior;

        if (l1 >= l2 && l1 >= l3) {
            maior = l1;
        } else if (l2 >= l3) {
            maior = l2;
        } else {
            maior = l3;
        }

        System.out.printf("Maior distância = %.2f%n", maior);

        sc.close();
    }
}