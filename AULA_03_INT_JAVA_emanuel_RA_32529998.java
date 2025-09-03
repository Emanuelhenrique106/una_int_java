import java.util.Scanner;

public class OperacoesDoisNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Lendo os dois números
        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        // Operações com os números
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;

        // Imprimir operações
        System.out.println("A subtração do primeiro pelo segundo é: " + subtracao);
        System.out.println("A multiplicação do primeiro pelo segundo é: " + multiplicacao);

        // Divisão com verificação para evitar divisão por zero
        if (numero2 != 0) {
            double divisao = (double) numero1 / numero2;
            System.out.println("A divisão do primeiro pelo segundo é: " + divisao);
        } else {
            System.out.println("Não é possível dividir por zero!");
        }

        entrada.close();
    }
}