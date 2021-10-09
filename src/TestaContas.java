
public class TestaContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1337, 55447);
		
		ContaPoupan�a cp = new ContaPoupan�a(1337, 56668);
		
		cc.deposita(120);
		System.out.println("O saldo da conta corrente � de R$: "+cc.getSaldo());
		System.out.println("O saldo da conta poupan�a � de R$: "+cp.getSaldo());
		
		cc.transfere(35, cp);
		
		System.out.println("O saldo da conta corrente � de R$: "+cc.getSaldo());
		System.out.println("O saldo da conta poupan�a � de R$: "+cp.getSaldo());
		
		
	}

}
