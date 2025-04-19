import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Conversor de Moedas!");
        System.out.println("Escolha uma opção de conversão:");
        System.out.println("1 - Dólar para Real");
        System.out.println("2 - Real para Dólar");
        System.out.println("3 - Euro para Real");
        System.out.println("4 - Real para Euro");
        System.out.println("5 - Libra para Real");
        System.out.println("6 - Real para Libra");

        int opcao = scanner.nextInt();
        System.out.print("Digite o valor a ser convertido: ");
        double valor = scanner.nextDouble();

        double resultado = 0;
        switch (opcao) {
            case 1: resultado = valor * 4.86; break; // Cotação fictícia
            case 2: resultado = valor / 4.86; break;
            case 3: resultado = valor * 5.30; break;
            case 4: resultado = valor / 5.30; break;
            case 5: resultado = valor * 6.10; break;
            case 6: resultado = valor / 6.10; break;
            default: System.out.println("Opção inválida."); return;
        }

        System.out.printf("Valor convertido: %.2f\n", resultado);
        System.out.println("Programa encerrado.");
        
        scanner.close();
    }
}
