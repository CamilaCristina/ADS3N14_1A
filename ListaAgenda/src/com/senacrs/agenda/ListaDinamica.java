package com.senacrs.agenda;

import java.io.File;
import java.io.FileWriter;

public class ListaDinamica {
	Lista primeiro;
	Lista ultimo;
	int tamanho;
	
	public ListaDinamica(){
		primeiro = null;
		ultimo = primeiro;
	}
	
	public void add (String nome, String fone){
		if(primeiro == null){
			primeiro = new Lista();
			ultimo = primeiro;
			Lista novo = new Lista();
			novo.setNome(nome);
			novo.setFone(fone);
			novo.setProx(null);
			ultimo.setProx(novo);
			ultimo = novo;
			tamanho++;
		}
		else{
			Lista novo = new Lista();
			novo.setNome(nome);
			novo.setFone(fone);
			novo.setProx(null);
			ultimo.setProx(novo);
			ultimo = novo;
			tamanho++;
		}
		salvar();
	}
	public void imprimeLista(){
		Lista percorre = primeiro.getProx();
		while(percorre != null){
			System.err.println(percorre.getNome() + percorre.getFone());
			percorre = percorre.getProx();
		}
	}
	public void removeItem(String nomeParaRemover, String foneParaRemover){
		Lista remove = primeiro.getProx();
		Lista sentinela = primeiro;
		if(!(primeiro == null)){
			while(remove != null){
				if((remove.getNome().equals(nomeParaRemover)) && (remove.getFone().equals(foneParaRemover))){		
					if(remove.getProx()== null){
						ultimo = sentinela;
						ultimo.setProx(null);
						remove = null;
						tamanho--;
						break;
					}
					else{
						sentinela.setProx(remove.getProx());
						remove.setProx(null);
						remove = null;
						tamanho--;
						break;
					}
					remove = remove.getProx();
					sentinela = sentinela.getProx();
					}
			}
	    }
	}
	public String salvar(){
		File fl = new File("C:\\Camila\\ADS3N14_1A\\agenda.txt");
		if(!fl.exists()){
			try{
				fl.createNewFile();
				FileWriter writer = new FileWriter(fl);
				writer.write(getNome + " - " + getFone);
				writer.flush();
				writer.close();
			}catch(Exception ex){
				return "Erro. Msg: " + ex.getMessage(); 
			}
		}
		
	}
}
