/*
    Nome: Gabriel Sotero Mendonça
    Objetivo: Crie um programa que leia e armazene o nome (no máximo 10 caracteres), o valor de compra e o valor de
    venda de 10 produtos. Os valores de compra e venda devem ser armazenados em uma única matriz de números reais,
    enquanto os nomes devem ficar em uma matriz de caracteres. Após a leitura, o programa deve ficar disponível para o
    usuário digitar o valor do índice para que seja exibido o nome do produto armazenado nesse índice e o lucro obtido
    com a venda desse produto. Para encerrar o programa, o usuário deve informar um índice inválido.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int numProdutos = 10;
        String[] nomeProdutos = new String[numProdutos];
        double [][] valorCompraVenda = new double[2][numProdutos];
        for (int i = 0; i < nomeProdutos.length; i++) {
            System.out.println("Digite o nome do produto");
            nomeProdutos[i] = scanner.nextLine();
            System.out.println("Digite o preco de compra do produto");
            valorCompraVenda[0][i] = scanner.nextDouble();;
            System.out.println("Digite o preco de venda do produto");
            valorCompraVenda[1][i] = scanner.nextDouble();
            scanner.nextLine();
        }
        System.out.println();
        int escolhaIndice = 0;
        while (true) {
            System.out.println("Digite um indice para acessar seu valor");
            escolhaIndice = scanner.nextInt();
            if (escolhaIndice < 0 || escolhaIndice >= nomeProdutos.length) {
                System.out.println("Indice invalido");
                System.out.println("Saindo");
                break;

            }
            double lucro = valorCompraVenda[1][escolhaIndice] - valorCompraVenda[0][escolhaIndice];
            System.out.println("Produto no indice " + escolhaIndice + ": " + nomeProdutos[escolhaIndice]);
            System.out.println("Lucro do produto: " + df.format(lucro));
            System.out.println();


        }
    }
}
