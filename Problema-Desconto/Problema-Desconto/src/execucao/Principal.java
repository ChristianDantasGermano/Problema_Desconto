package execucao;

import datas_comemorativas.AnoNovo;
import datas_comemorativas.Natal;
import datas_comemorativas.Pascoa;
import gerencia_produto.Produto;

public class Principal {
	
	public static void main(String[] args) {
		
		Natal desc = new Natal(50);
		Produto pd = new Produto("Playstation5", 10000, desc);
		System.out.println(pd.getValorFinal());
			
	}
}

