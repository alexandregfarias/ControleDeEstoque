package entities;

import java.util.Scanner;
// TRATAR ERRO NA LINHA 68
public class RoupaPMG implements Item{	
	static Scanner entrada = new Scanner(System.in);
	
	private String descricao;
	private int estoqueMinimo;
	private int estoqueMaximo;
	private int quantidadeP;
	private int quantidadeM;
	private int quantidadeG;


	public RoupaPMG(String descricao, int estoqueMinimo,
			int estoqueMaximo, int quantidadeP, int quantidadeM, int quantidadeG) {

		this.descricao = descricao;

		this.estoqueMinimo = estoqueMinimo;
		if(estoqueMinimo <= 0) {
			this.estoqueMinimo = 1;
		}	

		this.estoqueMaximo = estoqueMaximo;
		if (estoqueMaximo <= 0) {
			this.estoqueMaximo = 50;
		}

		this.quantidadeP = quantidadeP;
		if(quantidadeP < 0) {
			this.quantidadeP = 0;
		}

		this.quantidadeM = quantidadeM;
		if(quantidadeM < 0) {
			this.quantidadeM = 0;
		}

		this.quantidadeG = quantidadeG;
		if (quantidadeG < 0) {
			this.quantidadeG = 0;
		}
	}	

	public String getDescricao() {
		return descricao;
	}

	public int getQuantidadeP() {
		return quantidadeP;
	}

	public int getQuantidadeM() {
		return quantidadeM;
	}

	public int getQuantidadeG() {
		return quantidadeG;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}

	@Override
	public void venda() {
		System.out.println("Qual o tamanho do item? (P,M,G).");
		char tamanhoDoItem = entrada.next().charAt(0);
		if(tamanhoDoItem == 'p' || tamanhoDoItem == 'P') {
			System.out.println("Uma roupa tamanhoa P foi vendida.");
			this.quantidadeP--;
		} else if (tamanhoDoItem == 'm' || tamanhoDoItem == 'M') {
			System.out.println("Uma roupa tamanhoa M foi vendida.");
			this.quantidadeM--;
		} else if (tamanhoDoItem == 'g' || tamanhoDoItem == 'G'){
			System.out.println("Uma roupa tamanhoa G foi vendida.");
			this.quantidadeG--;
		} else {
			//Tratar Erro Aqui
			System.out.println("Tamanho informado inexistente.");
		}

	}

	@Override
	public void reposicaoEstoque() {
		System.out.println("Seu estoque atual: ");
		System.out.println("Tamanho P: " + this.quantidadeP);
		System.out.println("Tamanho M: " + this.quantidadeM);
		System.out.println("Tamanho G: " + this.quantidadeG);

		if(this.getQuantidadeP() < this.estoqueMinimo) {
			System.out.println("Repondo as peças tamanho P:");
			this.quantidadeP = this.estoqueMaximo;

		}
		if(this.getQuantidadeM() < this.estoqueMinimo) {
			System.out.println("Repondo as peças tamanho M:");
			this.quantidadeM = this.estoqueMaximo;
		}
		if(this.getQuantidadeG() < this.estoqueMinimo) {
			System.out.println("Repondo as peças tamanho G:");
			this.quantidadeG = this.estoqueMaximo;
		}
		System.out.println("Estoque atualizado:");
		System.out.println("Tamanho P: " + this.quantidadeP);
		System.out.println("Tamanho M: " + this.quantidadeM);
		System.out.println("Tamanho G: " + this.quantidadeG);
	}

	@Override
	public String obterDescricaoDoProduto() {

		return this.getDescricao();
	}

	@Override
	public int obterQuantidadeEmEstoque() {
		System.out.println("Deseja obter qual tamanho? [ P/M/G ]");
		String tamanho = entrada.nextLine().toLowerCase().trim();
		if(tamanho.charAt(0) == 'p') {
			return this.quantidadeP;

		}
		else if (tamanho.charAt(0) == 'm') {
			return this.quantidadeM;
		}
		else if (tamanho.charAt(0) == 'g'){

			return this.quantidadeG;
		}
		else { 
			return 0; // TRATAR ERRO AQUI. Não pode retornar 0.
		}

	}
}
