package entities;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Teste:");
		String a = entrada.nextLine().toLowerCase().trim();
		if(a.charAt(0) == 'p') {
			System.out.println("p");
		} else if (a.charAt(0) == 'm') {
			System.out.println("m");
		} else {
			System.out.println("g");
		}
		
		
		
	}

}
