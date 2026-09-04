// Lucas Sales Martins dos Anjos
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite sua primeira nota");
        double nota1 = entrada.nextDouble();
        System.out.println("digite sua segunda nota");
        double nota2 = entrada.nextDouble();
        System.out.println("digite sua terceira nota");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("sua media é:" + media);
        entrada.close();
    }
    
}