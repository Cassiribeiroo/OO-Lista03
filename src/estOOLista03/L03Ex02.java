/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

Sistema de Coordenadas Cartesiano com Quadrantes:

           Y
           ↑
           |
     Q2    |    Q1
           |
-----------+----------→ X
           |
     Q3    |    Q4
           |				    */

package estOOLista03;

import java.util.Scanner;

public class L03Ex02 {

	public static void coordenadas() {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Informe o ponto X: ");
		x = sc.nextInt();
		System.out.println("Informe o ponto Y: ");
		y = sc.nextInt();
		
		while (x != 0 && y!= 0 ) {
			if (x > 0 && y > 0) {
				System.out.println("A coordenada pertence ao primeiro quadrante!");
			}
			else if (x < 0 && y > 0) {
				System.out.println("A coordenada pertence ao segundo quadrante!");
			}
			else if (x < 0 && y < 0) {
				System.out.println("A coordenada pertence ao terceiro quadrante!");
			}
			else {
				System.out.println("A coordenada pertence ao quarto quadrante!");
			}
			
			System.out.println("Informe o ponto X: ");
			x = sc.nextInt();
			System.out.println("Informe o ponto Y: ");
			y = sc.nextInt();
		}
		
		sc.close();
	}
}
