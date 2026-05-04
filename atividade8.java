import java.util.Scanner;
import java.util.Locale;

public class atividade8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a Distância percorrida em km: ");
        float distancia = sc.nextFloat();

        System.out.print("Informe o total gasto de combustível: ");
        float combustivel = sc.nextFloat();

        float consumo_medio = distancia / combustivel;

        System.out.printf("O consumo médio de combustível é: %.3f ", consumo_medio);
        sc.close();
    }
}