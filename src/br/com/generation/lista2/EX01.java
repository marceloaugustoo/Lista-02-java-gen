package br.com.generation.lista2;
import java.util.Scanner;
public class EX01 {

	public static void main(String[] args) {
		
		int num1,num2,num3,maior=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite três numeros para saber qual o maior.");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		if(num1>num2 && num1>num3) {
			maior = num1;
		}
		if(num2>num1 && num2>num3) {
			maior = num2;
		}
		if(num3>num2 && num3>num1) {
			maior = num3;
		}
		
		System.out.printf("Maior numero: %d",maior);
		
		scan.close();
	}

}
