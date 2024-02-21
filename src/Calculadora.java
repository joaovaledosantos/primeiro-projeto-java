import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner numero1Scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double numero1 = numero1Scanner.nextDouble();
        Scanner numero2Scanner = new Scanner(System.in);
        System.out.print("Digite o segundo numero: ");
        double numero2 = numero1Scanner.nextDouble();
        double resultado = numero1 + numero2;
        System.out.println("O resultado e: " + resultado);
    }
}
