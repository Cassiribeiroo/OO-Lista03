package estOOLista03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("Escolha o número do exercício da Lista 03!");
		System.out.println("Exercício 1 - Leitura de senha válida");
		System.out.println("Exercício 2 - Coordenadas X e Y");
		System.out.println("Exercício 3 - Posto de combustível");
		
		opcao = sc.nextInt();
		
		switch (opcao) {
        case 1:
            L03Ex01.leituraSenha();
            break;
        case 2:
        	L03Ex02.coordenadas();
            break;
        case 3:
        	L03Ex03.postoCombustivel();
            break;
            
        default:
            System.out.println("Opção inválida.");
		}
		
		sc.close();

	}

}
