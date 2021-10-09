
public abstract class Conta  {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	private static int total =0;
	

	
	public Conta() {
		
	}
	
	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Criando uma conta..."+this.numero);
		
		
	
	}
	
	public static int getTotal() {
		return total;
	}


	public Conta(double saldo, int agencia, int numero) {
		Conta.total++;
		System.out.println("total da conta é: "+Conta.total);
		
		this.saldo = 100;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Conta criada com sucesso!");
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public abstract void deposita(double valor);

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

}
