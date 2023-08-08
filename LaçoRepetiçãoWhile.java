package PacoteJava;

import java.util.Scanner;

public class LaçoRepetiçãoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero, somaPar=0,contImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um numero qualquer: ");
		numero = leia.nextInt();
		
		while(numero != 0) {
			if(numero % 2 == 0) {
				somaPar += numero;
			}else {
				contImpar++;
					
			}
			System.out.println("\nEntre com um numero qualquer: ");
			numero = leia.nextInt();
			
		}
		System.out.println("\nSomatorio dos numeros pares : "+somaPar);
		System.out.println("\nQuantidade de numeros impares : "+contImpar);
		
		
	}

}
