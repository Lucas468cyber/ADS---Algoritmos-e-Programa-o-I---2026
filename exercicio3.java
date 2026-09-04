// Lucas Sales Martins dos Anjos
import java.util.Scanner;


public class Exercicio3 { 
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite um numero q será somado");
        int numero1 = entrada.nextInt();

        System.out.println("digite o segundo numero q será somado");
        int numero2 = entrada.nextInt();

        int resultado = (numero1 + numero2);
        System.out.println(resultado);
        entrada.close();}
    }
