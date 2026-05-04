import java.util.Scanner;
import java.util.Locale;

public class atividade1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a medida da largura: ");
        float largura = sc.nextFloat();

        System.out.print("Digite a medida do comprimento: ");
        float comprimento = sc.nextFloat();

        System.out.print("Digite o valor do metro quadrado: ");
        float metro_Quadrado = sc.nextFloat();

        float area = largura * comprimento;
        float preco = metro_Quadrado * area;

        System.out.printf("Área do terreno: %.2f%n", area);
        System.out.printf("Valor do terreno: %.2f%n", preco);

        sc.close();
    }
}