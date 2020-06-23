package model;

public class Comissionado extends Funcionario {

	
	private float salarioBase;
	private float comissao;
	
	
	public Comissionado(int numRegistro, String nome, float salarioBase, float comissao) {
		super(numRegistro, nome);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
		
	}


	@Override
	public float calcularSalario() {
		return salarioBase + salarioBase * comissao/100;
	}


	public float getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}


	public float getComissao() {
		return comissao;
	}


	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
}
