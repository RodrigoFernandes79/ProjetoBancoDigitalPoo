
public class TestaContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1337, 55447);
		
		ContaPoupança cp = new ContaPoupança(1337, 56668);
		
		cc.deposita(120);
		System.out.println("O saldo da conta corrente é de R$: "+cc.getSaldo());
		System.out.println("O saldo da conta poupança é de R$: "+cp.getSaldo());
		
		cc.transfere(35, cp);
		
		System.out.println("O saldo da conta corrente é de R$: "+cc.getSaldo());
		System.out.println("O saldo da conta poupança é de R$: "+cp.getSaldo());
		
		
	}

}
