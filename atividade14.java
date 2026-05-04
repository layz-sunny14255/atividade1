import java.util.Scanner;
import java.util.Locale;

public class atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a quantidade de minutos consumidos: ");
        double minutos = sc.nextDouble();

        double valor_Pago = 50.0;
        
        if (minutos > 100) {
            valor_Pago += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", valor_Pago);

    sc.close();
    }
}