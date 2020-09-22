package datas_comemorativas;

import gerencia_produto.Desconto;

public class AnoNovo extends Desconto{
	
	public AnoNovo(double valor) {
		this.valorDesconto = valor * 0.5;
		
	}
}
