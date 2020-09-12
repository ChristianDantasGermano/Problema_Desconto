package gerencia_produto;

public class Produto {
	protected CalculadorPreco calculadorPreco;
	protected Desconto desconto;
	
	protected String nome;
	protected double valorProduto;
	
	
	public Produto(String nome, double valorProduto, Desconto desconto) {
		this.nome = nome;
		this.valorProduto = valorProduto;
		this.desconto = desconto;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public double getValorProduto() {
		return valorProduto;
	}
	
	public double getValorFinal() {
		calculadorPreco = new CalculadorPreco(this);
		return calculadorPreco.calcularDescontos();
	}
	
}
