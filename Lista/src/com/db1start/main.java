package com.db1start;

import java.util.ArrayList;
import java.util.List; 

public class main {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		List<String> minhaListaCores = new ArrayList<String>();
		
		Lista minhaLista = new Lista();
		

		//preenche listas
		preencheLista(lista, "Bemvindo", "curso", "DB1", "Start");
		preencheLista(minhaListaCores, "laranja", "preto", "marron", "branco");

		
		//exercicios Lista
		System.out.println(minhaLista.cores());
		System.out.println(minhaLista.quantidadeItem(lista));
		System.out.println(minhaLista.removeSegundoItem(lista));
		System.out.println(minhaLista.ordemAlfabetica());
		System.out.println(minhaLista.removeCor("azul"));
		System.out.println(minhaLista.ordemAlfabetica(minhaListaCores));
	}
	
	
	public static List<String> preencheLista(List<String> lista, String item1, String item2, String item3, String item4){
			lista.add(item1);
			lista.add(item2);
			lista.add(item3);
			lista.add(item4);
			
			return lista;
	}
	
}

