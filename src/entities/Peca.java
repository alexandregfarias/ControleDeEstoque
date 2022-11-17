package entities;

public abstract class Peca {

	private String descricao;
	protected int quantidade;
	private int estoqueMinimo;
	private int estoqueMaximo;

	public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}

	public abstract void venda();

	public void reposicaoEstoque() {
		if(this.quantidade < this.estoqueMinimo) {
			this.quantidade = this.estoqueMaximo;
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
