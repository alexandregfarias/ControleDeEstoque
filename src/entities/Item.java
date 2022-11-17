package entities;

public interface Item {

	public void venda() throws Exception;
	public void reposicaoEstoque();
	public String obterDescricaoDoProduto();
	public int obterQuantidadeEmEstoque();

}
