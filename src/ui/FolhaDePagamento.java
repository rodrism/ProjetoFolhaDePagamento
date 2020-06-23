package ui;

import java.util.ArrayList;
import model.Chefe;
import model.Funcionario;
import model.Comissionado;
import model.Horista;
import model.Empreiteiro;

public class FolhaDePagamento {
	public static void main(String args[]) {
		
		ArrayList<Funcionario> lista;
		
		lista = new ArrayList<Funcionario>();
		
		lista.add(new Chefe(1,"Mario",5000.0f, 10.0f, 800.0f));
		lista.add(new Comissionado(2,"Rodrigo",6000.0f,22.5f));
		lista.add(new Horista(3,"Joao",120.0f,172));
		lista.add(new Empreiteiro(4, "Maria", 10000.0f));
	
		
		System.out.println("           Nome:");
		
		for (int i=0; i < lista.size(); i++) {
			
			System.out.println("Salario do " + lista.get(i).getNome() + " R$" + lista.get(i).calcularSalario());
		}
		
		
				
		
	}

}
