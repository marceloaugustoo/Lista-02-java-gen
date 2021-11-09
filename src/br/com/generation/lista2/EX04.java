package br.com.generation.lista2;
import java.util.Scanner;
import java.lang.Math;
public class EX04 {

	public static void main(String[] args) {
		
		double numero,raiz,potencia;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero para saber se é par ou ímpar.");
		
		numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			
			System.out.println("Numero par.");
			raiz = Math.sqrt(numero);
			System.out.printf("Raiz quadrada: %.2f",raiz);
			
		}
		
		else {
			System.out.println("Numero ímpar.");
			potencia = Math.pow(numero,2);
			System.out.printf("Quadrado: %.2f",potencia);
			
		}
		
		scan.close();
		
	}

}
