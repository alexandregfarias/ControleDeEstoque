package entities;

import java.util.Scanner;

public class RoupaTamanhoUnico extends Peca implements Item{
	static Scanner entrada = new Scanner(System.in);

	public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
	}

	@Override
	public void venda() {
		System.out.println("Quantidade de " + descricao + ": " + quantidade);
		System.out.println("Informe quantidade a ser vendida:");
		int quantidadeVendida = entrada.nextInt();
		if (quantidadeVendida <=0 || quantidadeVendida > this.quantidade) {
			do {
				System.out.println("Quantidade informada inválida.");
				System.out.println("Quantidade de " + descricao + ": " + quantidade);
				System.out.println("Informe quantidade a ser vendida:");
				quantidadeVendida = entrada.nextInt();

			} while(quantidadeVendida <=0 || quantidadeVendida > this.quantidade);
		}
		this.quantidade -= quantidadeVendida;
		System.out.println("Foram vendidas " + quantidadeVendida + " peças do produto " + descricao );
	
	}
	
	@Override
	public String obterDescricaoDoProduto() {
		
		return this.getDescricao();
	}
	
	@Override
	public int obterQuantidadeEmEstoque() {
		
		return this.quantidade;
	}


}
