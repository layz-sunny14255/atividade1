import java.util.Scanner;
import java.util.Locale;

public class atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantidade de açúcar no sangue: ");
        double glicose = sc.nextDouble();

        if (glicose<=100 ){
            System.out.printf("Normal");
        }
        else if (glicose<=140){
            System.out.printf("Elevado");
        }
        else{
            System.out.printf("Diabetes");
        }
        

    sc.close();
    }
}