
public class TesteTributavel {

	public static void main(String[] args) {
		
		SeguroVida seg = new SeguroVida();
		
		ContaPoupan�a poupan�a = new ContaPoupan�a(1222, 555222);
		
		
		seg.getValorImposto();
		poupan�a.deposita(1000);
		poupan�a.getValorImposto();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.impostoTotal(seg);
		calc.impostoTotal(poupan�a);
		
		System.out.println(calc.getValorImposto());
		
		
	}

}
