// Lucas Sales Martins dos Anjos
import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o ano que voce nasceu");
        int anoNascimento = entrada.nextInt();
        System.out.println("digite o ano atual");
        int anoAtual = entrada.nextInt();
        System.out.println("voce tem " + (anoAtual - anoNascimento) + " anos e tera " + (anoAtual - anoNascimento + (2030 - anoAtual) )+ " anos em 2030");

    }
    
}