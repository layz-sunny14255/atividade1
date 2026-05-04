import java.util.Scanner;
import java.util.Locale;

public class atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        float produto = sc.nextFloat();

        System.out.print("Digite a quantidade comprada: ");
        float quantidade = sc.nextFloat();

        System.out.print("Digite o valor pago: " );
        float valor = sc.nextFloat();
        
        float troco = valor - (quantidade * produto);

         System.out.printf("O troco que deve ser dado ao cliente é  : %.2f%n" , 
         troco)
         sc.close();
    }
}
