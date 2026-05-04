import java.util.Scanner;
import java.util.Locale;

public class atividade7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o Nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Informe o valor recebido por hora: ");
        float valor = sc.nextFloat();

        System.out.print("Informe a Quantidade de horas trabalhadas: ");
        float quantidade = sc.nextFloat();

        float pagamento = valor * quantidade;

        System.out.printf("O(a) funcionário %s recebe %.2f por hora e trabalhou %.1f horas, logo receberá %.1f%n ", nome,
                valor, quantidade, pagamento);
        sc.close();
    }

}