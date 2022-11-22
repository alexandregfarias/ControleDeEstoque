package entities;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int escolha = -5;

		Item[] itens = new Item[5];

		itens[0] = new Acessorio("Machado de Batalha",10,5,15); //(Nome, Qtdestoq EstqMin, EstqMax);
		itens[1] = new Acessorio("Anel de Sauron",10,5,15);
		itens[2] = new RoupaTamanhoUnico("Cota de Lâminas",10,5,15);
		itens[3] = new RoupaTamanhoUnico("Armadura de Viking",10,5,15);
		itens[4] = new RoupaPMG("Capa de Invisibilidade",5,10,10,10,10);

		System.out.println("Bem vindo a Taverna do Dragão. Escolha qual item deseja comprar, ou tecle"
				+ " 5 para sair.");

		do {
			for(int i = 0; i < itens.length; i++) {
				System.out.println(i + " - " + itens[i].obterDescricaoDoProduto());
			}
			System.out.println("5 - Sair da taverna.");

			escolha = entrada.nextInt();

			if(escolha >= 0 && escolha <= 4) {
				itens[escolha].venda();
				itens[escolha].reposicaoEstoque();
			}

		} while(escolha!=5);

		System.out.println("A Taverna do Dragão agradece a preferência. Boas aventuras, volte sempre");
		System.out.println("          )                         *");
		System.out.println("        o = --->            [  /o\\ /");
		System.out.println("        | )		    | : | /");
		System.out.println("       / \\		    [  / \\");


		entrada.close();

	}

}
