// Lucas Sales Martins dos Anjos
import java.util.Scanner;

public class exercicio4 
{public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o numero1");
        int numero1 = entrada.nextInt();

        System.out.println("digite o numero2");
        int numero2 = entrada.nextInt();

        System.out.println("digite o numero3");
        int numero3 = entrada.nextInt();

        System.out.println("digite o numero4");
        int numero4 = entrada.nextInt();

        int resultado = (numero1 + numero2 + numero3 + numero4);
        System.out.println("Resultado:" + resultado);
        entrada.close();}
    
}