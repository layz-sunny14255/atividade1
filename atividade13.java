import java.util.Scanner;
import java.util.Locale;

public class atividade13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Primeiro valor: ");
        int a = sc.nextInt();

        System.out.print("Segundo valor: ");
        int b = sc.nextInt();

        System.out.print("Terceiro valor: ");
        int c = sc.nextInt();

        int menor;

        if (a<=b && a<=c){
            menor=a;
        }
         else if (b<=c)
         menor=b;
         else{
            menor=c;
         }

         System.out.println("Menor= " + menor);

    sc.close();
    }
}