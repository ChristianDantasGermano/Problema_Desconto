package gerencia_produto;

public class CalculadorPreco{
	
	Produto produto;
	
	public CalculadorPreco(Produto produto){
		this.produto = produto;
	}
	
	public double calcularDescontos() {
		return produto.valorProduto - produto.valorProduto*(produto.desconto.valorDesconto/100);
	}
}
