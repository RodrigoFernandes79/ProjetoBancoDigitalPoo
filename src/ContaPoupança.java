
public class ContaPoupanša extends Conta implements Tributavel{
	
	

	private CalculadorDeImposto imp;

	public ContaPoupanša(int agencia, int numero) {
		super(agencia, numero);
		imp = new CalculadorDeImposto();
	
	}

	@Override
	public void deposita(double valor) {
		super.saldo+=valor+0.02;
		
	}

	
	public double getValorImposto() {
		return this.saldo*0.1 ;
	}
	
	

}
