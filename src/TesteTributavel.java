
public class TesteTributavel {

	public static void main(String[] args) {
		
		SeguroVida seg = new SeguroVida();
		
		ContaPoupança poupança = new ContaPoupança(1222, 555222);
		
		
		seg.getValorImposto();
		poupança.deposita(1000);
		poupança.getValorImposto();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.impostoTotal(seg);
		calc.impostoTotal(poupança);
		
		System.out.println(calc.getValorImposto());
		
		
	}

}
