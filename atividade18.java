import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        largura = float(input("Digite a medida da largura: "))
        comprimento = float(input("Digite a medida do comprimento: "))
        metro_quadrado= float(input("Digite o valor do metro²: "))
        area = largura * comprimento
        preco = metro_quadrado * area
        System.out.printf("Área do terreno: " , area)
        System.out.printf("Valor do terreno: " , preco)
    sc.close();
    }
}