package br.com.generation.lista2;
import java.util.Scanner;
public class EX02 {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite três numeros para colocar em ordem crescente.");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		if(num1>=num2 && num1>=num3 && num2>=num3) {
			System.out.printf("Ordem crescente: %d,%d,%d",num3,num2,num1);
		}
		else if(num1>=num2 && num1>=num3 && num3>=num2) {
			System.out.printf("Ordem crescente: %d,%d,%d",num2,num3,num1);
		}
		else if(num2>=num1 && num2>=num3 && num1>=num3) {
			System.out.printf("Ordem crescente: %d,%d,%d",num3,num1,num2);
		}
		else if(num2>=num1 && num2>=num3 && num3>=num1) {
			System.out.printf("Ordem crescente: %d,%d,%d",num1,num3,num2);
		}
		else if(num3>=num2 && num3>=num1 && num2>=num1) {
			System.out.printf("Ordem crescente: %d,%d,%d",num1,num2,num3);
		}
		else if(num3>=num2 && num3>=num1 && num1>=num2) {
			System.out.printf("Ordem crescente: %d,%d,%d",num2,num1,num3);
		}
		
		scan.close();
	}

}

	}

}
