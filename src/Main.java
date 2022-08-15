import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		venilton.setCpf("123");
		banco.setNome("Banco Henrique");
		Conta cc = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		cc.depositar(100);
		cc.transferir(100, poupanca);
		venilton.addConta(cc);
		venilton.addConta(poupanca);
		Cliente maria = new Cliente("Maria", "111");
		Conta cm = new ContaCorrente();
		cm.depositar(500);
		maria.addConta(cm);
		banco.addClientes(venilton);
		banco.addClientes(maria);
		System.out.println(String.format("Banco: %s", banco.getNome()));
		Iterator<Pessoa> iterator = banco.getClientes().iterator();
		while (iterator.hasNext()) {
			Pessoa p = iterator.next();
			System.out.println("Nome do Cliente: " + p.getNome());
			System.out.println("CPF do Cliente: " + p.getCpf());
			for(Integer i : p.getContas().keySet()){
				p.getContas().get(i).imprimirExtrato(p.getNome());
			}
			System.out.println("------------------------------");
		}
	}
}
