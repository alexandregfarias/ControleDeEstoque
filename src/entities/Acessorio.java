package entities;

import java.util.Scanner;

public class Acessorio extends Peca implements Item {

	public Acessorio(String descricao, int qtdEstoque, int estoqueMinimo, int estoqueMaximo) {
		super(descricao, qtdEstoque, estoqueMinimo, estoqueMaximo);
	}

	@Override
	public void venda() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a quantidade vendida:");
		int quantidadeVendida = entrada.nextInt();
		this.quantidade -= quantidadeVendida;
		entrada.close();
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
