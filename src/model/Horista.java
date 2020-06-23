package model;

public class Horista extends Funcionario{
	
	private float valorHora;
	private int numeroHoras;
	
	public Horista(int numRegistro, String nome, float valorHora, int numeroHoras) {
		super(numRegistro,nome);
		
		if (valorHora < 0 || numeroHoras < 0) {
			throw new RuntimeException("O valor da hora ou o numero de horas não podem ser negativos!");
		} else {
			this.valorHora = valorHora;
			this.numeroHoras = numeroHoras;
		}
		
	}
	
	public float calcularSalario() {
		return valorHora * numeroHoras;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		try {
		this.valorHora = valorHora;
		} catch (RuntimeException e) {
			System.out.println("Só pode ser numero --" + e.getMessage());
		}
	}

	public int getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}
	
	
	
}
