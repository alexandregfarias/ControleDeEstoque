package application;

import java.util.Scanner;

import entities.Acessorio;
import entities.Item;
import entities.Peca;
import entities.RoupaPMG;
import entities.RoupaTamanhoUnico;

public class ControleDeEstoqueApp {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Item[] vect = new Item[5];
		vect[0] = new Acessorio("Machado", 10, 5, 20);
		vect[1] = new Acessorio("Katana", 10, 5, 20);
		vect[2] = new RoupaTamanhoUnico("Kimono", 10, 5, 100);
		vect[3] = new RoupaPMG("Camisa de força", 5, 15, 10, 10, 10);
		vect[4] = new RoupaPMG("Armadura medieval", 5, 15, 10, 10, 10);

		System.out.println(vect[3].obterQuantidadeEmEstoque());


		entrada.close();
	}

}
