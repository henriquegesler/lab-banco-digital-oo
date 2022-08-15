import java.util.Map;
import java.util.TreeMap;

import interfaces.IPessoa;

public abstract class Pessoa implements IPessoa{
    
    protected String nome, cpf;
    protected Map<Integer, Conta> contas = new TreeMap<>();

    public Pessoa(){

    }

    public Pessoa(String n, String cpf){
        this.nome = n;
        this.cpf = cpf;
    }

    public Map<Integer, Conta> getContas(){
        return contas;
    }

    public void addConta(Conta c){
        Integer number = c.getNumero();
        contas.put(number, c);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
