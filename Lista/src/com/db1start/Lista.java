package com.db1start;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Lista {
	private List<String> listacores = new ArrayList<>();
	
	//construtor
	Lista(){
		this.listacores.add("azul");
		this.listacores.add("vermelho");
		this.listacores.add("cinza");
		this.listacores.add("amarelo");
	}
	
    //M�todo que retorne os nomes das cores que voc� mais gosta
	public List<String> cores() {
		return this.listacores;
	}	
    
    //M�todo que dado uma lista retorne a quantidade de itens
    public Integer quantidadeItem(List<String> lista) {
    	return lista.size();
    }
	
    //M�todo que receba 3 String, adicione todos em uma lista e remova a segunda posi��o
    public List<String> removeSegundoItem(List<String> lista) {
    	lista.remove(1);
    	return lista;
    }
    
    //M�todo que imprima a lista de cores do primeiro m�todo
    
    //M�todo que imprima as cores do primeiro m�todo em ordem alfab�tica
    public List<String> ordemAlfabetica() {
    	Collections.sort(this.listacores);
    	return this.listacores;
    }
    
   //Sobrecarga* M�todo que receba a lista de cores que voc� gosta e imprima em ordem decrescente (alfab�tica)
    public List<String> ordemAlfabetica(List<String> minhaListaCores) {
    	Collections.sort(minhaListaCores);
    	return minhaListaCores;
    }
    
    //M�todo que receba uma lista das cores que voc� mais gosta e o nome de uma cor a ser removida
	public List<String> removeCor(String cor) {
		this.listacores.remove(cor);
		return this.listacores;
	}	
	
    
    //M�todo que receba uma lista de n�meros e retorne um mapa com listas de n�meros pares e impares
	public Map<Integer, String> mapeiaNumeros(Map<Integer, String> mapa, Integer[] valores) {
		Integer i= 0;
		
		for(i = 0; i < 4; i++) {
			if(valores[i] % 2 == 0)
				mapa.put(valores[i], "PAR");
			else
				mapa.put(valores[i], "IMPAR"); 
		}
		
		return mapa;
	}	
	
}
