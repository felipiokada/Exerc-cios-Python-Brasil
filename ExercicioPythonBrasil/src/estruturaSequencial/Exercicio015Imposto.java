package estruturaSequencial;

import java.math.BigDecimal;

public enum Exercicio015Imposto {
	
	//Testando ENUM
	//É mais organizado
	IMPOSTO_DE_RENDA{
		@Override
		public BigDecimal valorPercentual() {
			return new BigDecimal("0.03");
		}
	}, INSS{
		@Override
		public BigDecimal valorPercentual() {
			return new BigDecimal("0.08");
		}
	}, SINDICATO{
		@Override
		public BigDecimal valorPercentual() {
			return new BigDecimal("0.05");
		}
	};
	
	public abstract BigDecimal valorPercentual();

}
