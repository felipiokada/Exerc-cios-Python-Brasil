package estruturaDeDecisao.modelo;

import java.math.BigDecimal;

public class Produto {
	BigDecimal preco = new BigDecimal("0");
		
	public Produto(BigDecimal preco) {
		if(preco == null) {
			throw new IllegalArgumentException("Não é permitido null");
		}
		this.preco = preco;
	}
	
	public BigDecimal getPreco() {
		return this.preco;
	}
	
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
}
