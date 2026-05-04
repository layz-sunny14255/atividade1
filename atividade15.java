import java.util.Scanner;
import java.util.Locale;

public class atividade15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Indique o preço unitário do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Informe a quantidade comprada: ");
        int quantidade = sc.nextInt();

        System.out.print("Indique o valor recebido: ");
        double dinheiro_recebido = sc.nextDouble();

        double total_compra = preco * quantidade;

        if (dinheiro_recebido >= totalCompra) {
            double troco = dinheiroRecebido - totalCompra;
            System.out.printf("troco = %.2f%n", troco);
        } else {
            double faltante = totalCompra - dinheiro_recebido;
            System.out.printf("Dinheiro insuficiente. Faltam %.2f reais%n", faltante);
        }

        sc.close();
    }
}