package application;

import entities.Produto;

import java.util.Scanner;

public class ProgramaProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto A = new Produto();

        System.out.println(A);
        System.out.println("Este é o estoque atual! \n");

        System.out.println("Deseja adicionar ou retirar do estoque? \n");

        int opcao = 1;

        while (opcao != 3) {
            System.out.println("Digite 1 - Repor produto no estoque \n" +
                    "Digite 2 - Remover produto do estoque \n" +
                    "Digite 3 - Sair do sistema");

            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Nome do produto: ");
                String nomeProd = sc.next();
                System.out.println("Quantidade a repor: ");
                int repor = sc.nextInt();
                A.addProduto(repor, nomeProd);


            } else if (opcao == 2) {
                System.out.println("Nome do produto: \n");
                String name = sc.next();
                System.out.println("Quantidade a retirar: \n");
                int retirar = sc.nextInt();
                A.removeProduto(retirar, name);
            }
            System.out.println(A);
        }
        sc.close();
    }
}
