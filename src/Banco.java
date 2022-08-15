import java.util.HashSet;
import java.util.Set;

public class Banco {

	private String nome;
	private Set<Pessoa> clientes = new HashSet<>();
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Pessoa> getClientes() {
		return clientes;
	}

	public void setCliente(Set<Pessoa> clientes) {
		this.clientes = clientes;
	}

	public void addClientes(Pessoa p){
		this.clientes.add(p);
	}
}
