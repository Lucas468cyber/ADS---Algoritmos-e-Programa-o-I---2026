package Números_aleatórios;

public class Exemplo2 {
    public static void main(String[] args) {
        System.out.println("Realizaremos o calculo de dois números.");
        calculo(50, 10);
        System.out.println("Depois de chamar o método");
    }

    public static void calculo(int N1,int N2) {
        int resultado = ((N1*N2) - (N1+N2))/(N1-N2);
        System.out.println("O resultado do cálculo é:" + resultado);
    }

}
