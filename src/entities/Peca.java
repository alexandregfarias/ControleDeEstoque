package entities;

public abstract class Peca {

	protected String descricao;
	protected int quantidade;
	private int estoqueMinimo;
	private int estoqueMaximo;

	public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		this.descricao = descricao;

		this.quantidade = quantidade;
		if (quantidade < 0) {
			this.quantidade = 0;
		}

		this.estoqueMinimo = estoqueMinimo;
		if (estoqueMinimo < 0) {
			this.estoqueMinimo = 1;
		}

		this.estoqueMaximo = estoqueMaximo;
		if (estoqueMaximo <= 0) {
			this.estoqueMaximo = 50;
		}
	}

	public abstract void venda();

	public void reposicaoEstoque() {
		if(this.quantidade < this.estoqueMinimo) {
			System.out.println("Sua quantidade atual de " + this.descricao + " é: " + this.quantidade);
			System.out.println("Repondo estoque...");
			this.quantidade = this.estoqueMaximo;
			System.out.println("Estoque atualizado com sucesso.");
			System.out.println("Quantidade de itens atualizada: " + this.quantidade);
		}
	}

	public int getQuantidade() {
		return quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}

}
