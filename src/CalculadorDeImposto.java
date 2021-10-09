
public class CalculadorDeImposto {
	
	private double somaImposto;
	
	public void impostoTotal(Tributavel tb) {
		somaImposto+=tb.getValorImposto();
	}

	public double getValorImposto() {
		return this.somaImposto;
		
	}
}
