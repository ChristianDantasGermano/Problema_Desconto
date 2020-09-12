package execucao;

import gerencia_produto.Desconto;
import gerencia_produto.Produto;

public class Principal {
	
	public static void main(String[] args) {
		Desconto desc = new Desconto(40);
		Produto pd = new Produto("Playstation5", 10000, desc);
		System.out.println(pd.getValorFinal());
		
		
		
	}
}
