
public class ContaCorrente extends Conta {

	public ContaCorrente() {
		super();
	}

	@Override
	public void imprimirExtrato(String name) {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns(name);
	}
	
}
