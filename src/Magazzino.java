

import java.util.Vector;

public class Magazzino {
	private String name;
	private double prezzo;
	private int data;
	private String località;
	private String produttore;
	private String valuta;
	private int cont;
	private Vector<Vino> vino;
	private Vector<String> nomeVino;
	
	
	public  Magazzino(Vector<Vino> vino){
		this.vino=vino;
		 
	}
	
	
	public void ListaVini(String name){
		for(int i=0;i<vino.size();i++){
			String tmp=vino.get(i).getName();
			nomeVino.add(tmp);
		}
		for(int i=0;i<vino.size();i++){
			System.out.println(vino.get(i).getName());
		}
		
	}
	
	public void QuantBottVino(String name,int cont){
		for(int i=0;i<vino.size();i++){
			String tmp=vino.get(i).getName()+vino.get(i).getCont();
			nomeVino.add(tmp);
		}
		for(int i=0;i<vino.size();i++){
			System.out.println(vino.get(i).getName()+":"+vino.get(i).getCont());
		}
	
		
	}
	
	public void QuantBottProduttore(String produttore,int cont){
		for(int i=0;i<vino.size();i++){
			String tmp=vino.get(i).getProduttore()+vino.get(i).getCont();
			nomeVino.add(tmp);
		}
		for(int i=0;i<vino.size();i++){
			System.out.println(vino.get(i).getProduttore()+":"+vino.get(i).getCont());
		}
		
	}
	

}
