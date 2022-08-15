import interfaces.IConta;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int CONTAS = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;

	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = CONTAS++;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	protected void imprimirInfosComuns(String name) {
		System.out.println(String.format("Titular: %s", name));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
