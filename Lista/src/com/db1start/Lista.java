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
	
    //Método que retorne os nomes das cores que você mais gosta
	public List<String> cores() {
		return this.listacores;
	}	
    
    //Método que dado uma lista retorne a quantidade de itens
    public Integer quantidadeItem(List<String> lista) {
    	return lista.size();
    }
	
    //Método que receba 3 String, adicione todos em uma lista e remova a segunda posição
    public List<String> removeSegundoItem(List<String> lista) {
    	lista.remove(1);
    	return lista;
    }
    
    //Método que imprima a lista de cores do primeiro método
    
    //Método que imprima as cores do primeiro método em ordem alfabética
    public List<String> ordemAlfabetica() {
    	Collections.sort(this.listacores);
    	return this.listacores;
    }
    
   //Sobrecarga* Método que receba a lista de cores que você gosta e imprima em ordem decrescente (alfabética)
    public List<String> ordemAlfabetica(List<String> minhaListaCores) {
    	Collections.sort(minhaListaCores);
    	return minhaListaCores;
    }
    
    //Método que receba uma lista das cores que você mais gosta e o nome de uma cor a ser removida
	public List<String> removeCor(String cor) {
		this.listacores.remove(cor);
		return this.listacores;
	}	
	
    
    //Método que receba uma lista de números e retorne um mapa com listas de números pares e impares
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
