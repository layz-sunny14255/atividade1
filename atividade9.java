import java.util.Scanner;
import java.util.Locale;

public class atividade9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe  a medida de A: ");
        float a = sc.nextFloat();

        System.out.print("Informe  a medida de B: ");
        float b = sc.nextFloat();

        System.out.print("Informe  a medida de C: ");
        float c = sc.nextFloat();

        float quadrado = a * a;
        float triangulo = (a * b) / 2;
        float trapezio = ((a + b) * c) / 2;

        System.out.printf("quadrado: %.4f%n triângulo: %.4f%n trapézio: %.4f%n ", quadrado, triangulo, trapezio);

        sc.close();
    }
}