
public class Cliente extends Pessoa{

	public Cliente(){
	}

	public Cliente(String n, String cpf){
		super(n, cpf);
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
