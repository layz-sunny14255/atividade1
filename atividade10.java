import java.util.Scanner;
import java.util.Locale;

public class atividade10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tempo em segundos: ");
        float segundos = sc.nextFloat();

        float minutos = segundos / 60;
        float horas = segundos / 3600;

        System.out.printf("Segundos:  %.4f%n Minutos: %.4f%n horas: %.4f%n", segundos, minutos, horas);

        sc.close();
    }
}