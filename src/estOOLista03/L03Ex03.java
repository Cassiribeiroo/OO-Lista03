/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível. */

package estOOLista03;

import java.util.Scanner;

public class L03Ex03 {

	public static void postoCombustivel() {
		Scanner sc = new Scanner(System.in);
		
		int cod, alcool=0, gasolina=0, diesel=0;
		
		System.out.println("==== Posto de combustível");
		System.out.println("1. Álcool");
		System.out.println("2. Gasolina");
		System.out.println("3. Diesel");
		System.out.println("4. Fim");
		
		System.out.println("Informe a operação desejada: ");
		cod = sc.nextInt();
		
		while (cod != 4) {
			switch (cod) {
				case 1:
					System.out.println("Abasteceu com Álcool!");
					alcool++;
					break;
				
				case 2:
					System.out.println("Abasteceu com Gasolina!");
					gasolina++;
					break;
				
				case 3:
					System.out.println("Abasteceu com Diesel!");
					diesel++;
					break;
					
				default:
					System.out.println("Código inválido!");
					break;
				}
			
			System.out.println("Informe a operação desejada: ");
			cod = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}
