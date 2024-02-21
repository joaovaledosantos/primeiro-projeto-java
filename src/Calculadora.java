import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner numero1Scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int numero1 = numero1Scanner.nextInt();
        Scanner numero2Scanner = new Scanner(System.in);
        System.out.print("Digite o segundo numero: ");
        int numero2 = numero2Scanner.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("o resultado e: " + resultado);
    }
}
