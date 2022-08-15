import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		banco.setNome("Banco Henrique");
		Conta cc = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		cc.depositar(100);
		cc.transferir(100, poupanca);
		venilton.addConta(cc);
		venilton.addConta(poupanca);
		banco.addClientes(venilton);
		System.out.println(String.format("Banco: %s", banco.getNome()));
		Iterator<Pessoa> iterator = banco.getClientes().iterator();
		while (iterator.hasNext()) {
			Pessoa p = iterator.next();
			System.out.println("Titular: " + p.getNome());
			for(Integer i : p.getContas().keySet()){
				p.getContas().get(i).imprimirExtrato(p.getNome());
			}
		}
	}
}
