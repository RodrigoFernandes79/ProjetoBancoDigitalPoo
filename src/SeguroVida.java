
public class SeguroVida implements Tributavel {
	
	 private CalculadorDeImposto imp;

	public SeguroVida() {
		
		imp = new CalculadorDeImposto();
	}

	@Override
	public double getValorImposto() {
		
		return 42;
	}

}
