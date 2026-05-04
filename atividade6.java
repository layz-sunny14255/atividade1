import java.util.Scanner;
import java.util.Locale;

public class atividade6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do Raio: ");
        double raio = sc.nextDouble();

        double area = (raio * raio) * Math.PI;

        System.out.printf("A área do circulo é : %.3f%n " , area);
         sc.close();
    }
}
