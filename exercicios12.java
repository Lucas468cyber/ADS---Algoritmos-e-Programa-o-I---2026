// Lucas Sales Martins dos Anjos
import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o numero");
        int numero = entrada.nextInt();
        System.out.println("o numero elevado ao quadrado é: " + (numero * numero));
        System.out.println("o numero elevado ao cubo é: " + (numero * numero * numero));
        System.out.println("a raiz quadrada do numero é: " + Math.sqrt(numero));
        System.out.println("o numero elevado a 10 é: " + Math.pow(numero, 10));
        entrada.close();
    }
}