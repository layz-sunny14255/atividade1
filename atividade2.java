import java.util.Scanner;
import java.util.Locale;

public class atividade2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da Base do Retângulo: ");
        float base = sc.nextFloat();

        System.out.print("Digite o valor da Altura do Retângulo: ");
        float altura = sc.nextFloat();

        float area = base * altura;

        float diagonal = (float) Math.sqrt((base * base) + (altura * altura));

        System.out.printf("Área do Retângulo: %.2f%n ", area);
        System.out.printf("Medida da Diagonal:  %.2f%n ", diagonal);

        sc.close();
    }
}