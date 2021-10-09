
public class TesteTributavel {

	public static void main(String[] args) {
		
		SeguroVida seg = new SeguroVida();
		
		ContaPoupanša poupanša = new ContaPoupanša(1222, 555222);
		
		
		seg.getValorImposto();
		poupanša.deposita(1000);
		poupanša.getValorImposto();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.impostoTotal(seg);
		calc.impostoTotal(poupanša);
		
		System.out.println(calc.getValorImposto());
		
		
	}

}
