package model;

public abstract class Funcionario {
	protected String nome;
	protected int    numRegistro;
	
	public Funcionario(int numRegistro, String nome) {
		if (numRegistro < 0 || nome == "") {
			throw new RuntimeException("Número de Registro e nome não podem estar em branco! ou negativo");
		}
		this.numRegistro = numRegistro;
		this.nome        = nome;
	}
	
	// aqui defino o "o que" (toda a descendência de Funcionario DEVE ter uma implementação para este método)
	public abstract float calcularSalario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}
}
