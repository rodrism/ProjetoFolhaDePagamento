package model;

public class Chefe extends Funcionario {
	private float salarioBase;
	private float adicionalFuncao;
	private float beneficioTerno;
	
	public Chefe(int numRegistro, String nome, float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(numRegistro, nome);
		
		if (salarioBase < 0) {
			throw new RuntimeException("Salario Base não pode ser negativo!");
		} else if (adicionalFuncao < 0){ 
			throw new RuntimeException("Adicional Funcao não pode ser negativo!");
		} else if (beneficioTerno < 0) {
			throw new RuntimeException("Beneficio terno não pode ser negativo!");
		}
		
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}
	
	// aqui defino o "como", ou seja, assumo a responsabilidade de implementar a lógica definida no método abstrato da classe-pai
	public float calcularSalario() {
		return salarioBase + salarioBase*adicionalFuncao/100 + beneficioTerno;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}

	public float getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(float beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}
	
	
	

}
