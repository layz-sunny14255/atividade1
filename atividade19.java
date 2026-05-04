import java.util.Scanner;
import java.util.Locale;

public class atividade18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Código: ");
        double codigo = sc.nextDouble();

        System.out.print("Quantidade: ");
        double quantia = sc.nextDouble();

        double preco=0

        double preco = 0;

        switch (codigo) {
            case 1:
                preco = 5.00;
                break;
            case 2:
                preco = 3.50;
                break;
            case 3:
                preco = 4.80;
                break;
            case 4:
                preco = 8.90;
                break;
            case 5:
                preco = 7.30;
                break;
        }

        double valor = preco * quantidade;

            System.out.printf("Valor a pagar: R$ %.2f%n", valor);
        


        
        sc.close();
    }
}