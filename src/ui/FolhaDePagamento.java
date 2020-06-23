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

		lista.add(new Chefe(1,"",1, 10.0f, 800.0f));
		lista.add(new Comissionado(2,"",6000.0f,22.5f));
		lista.add(new Horista(3,"Joao",0,0));		
		lista.add(new Empreiteiro(4, "Maria", 10000.0f));


		for (int i=0; i < lista.size(); i++) {
			try {
				lista.add(new Chefe(1, "Rodrigo", 18000.0f, 10.0f, 800.0f));
				lista.add(new Comissionado(2,"Rodrigo",6000.0f,22.5f));
				lista.add(new Horista(3,"Joao",0,-1));		
				lista.add(new Empreiteiro(4, "Maria", 10000.0f));
			} catch (RuntimeException e) {
				e.getMessage();
			}
		}

		System.out.println("           Nome:");

		for (int i=0; i < lista.size(); i++) {

			System.out.println("Salario do " + lista.get(i).getNome() + " R$" + lista.get(i).calcularSalario());
		}




	}

}
