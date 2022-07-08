package estruturaDeDecisao.modelo;

import java.math.BigDecimal;

public class Colaborador {
	BigDecimal salario = null;
	
	public BigDecimal getSalario() {
		return this.salario;
	}
	
	public void setSalario(BigDecimal salario) {
		if(salario == null || salario.compareTo(new BigDecimal("0")) <= 0) {
			throw new IllegalArgumentException("Não é permitido o valor null ou salário igual ou menor a 0");
		}
		this.salario = salario;
	}
	
}
