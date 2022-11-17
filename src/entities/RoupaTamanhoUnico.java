package entities;

public class RoupaTamanhoUnico extends Peca implements Item{

	public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
	}

	@Override
	public void venda() {
		System.out.println("Uma peça foi vendida.");
		this.quantidade--;
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
