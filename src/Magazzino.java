

import java.lang.reflect.GenericArrayType;
import java.util.Scanner;
import java.util.Vector;

public class Magazzino {
	Scanner lettore=new Scanner(System.in);
	private Vector<Integer> dataVino;
	private String name;
	private double prezzo;
	private int data;
	private String località;
	private String produttore;
	private String valuta;
	private int cont;
	private Vector<Vino> vini;
	private Vector<String> nomeVino;
	private double guadagnoDollari=0;
	private double guadagnoEuro=0;


	Valuta euro = new Valuta("euro",1);
	Valuta dollaro = new Valuta("Dollaro",0.90);
	
	
	public  Magazzino(Vector<Vino> vino){
		this.vini=vino;

	}



	public void listaVini(){
		for(int i=0;i<vini.size();i++){
			System.out.println(vini.get(i).getName());
		}

	}

	public void quantBottVino(){
		for(int i=0;i<vini.size();i++){
			System.out.println("vino: "+vini.get(i).getName()+" : "+vini.get(i).getCont());
		}


	}

	public void quantBottProduttore(){
		for(int i=0;i<vini.size();i++){
			System.out.println("vino:"+vini.get(i).getProduttore()+" : "+vini.get(i).getCont());
		}

	}
	public void possGuadagno(String valuta){
		Valuta dollaro = new Valuta("Dollaro",0.9);
		Valuta euro = new Valuta("Euro",1.1);



		if(dollaro.equals(valuta)){
			for(int i=0;i<vini.size();i++){
				guadagnoDollari=guadagnoDollari+prezzo;
			}
			System.out.println("Guadagno: "+guadagnoDollari+"$");
		}
		else if (euro.equals(valuta)){
			for(int i=0;i<vini.size();i++){
				guadagnoEuro=guadagnoEuro+prezzo;
			}
			System.out.println("Guadagno: "+guadagnoEuro+"€");
		}
		else {
			System.out.println("ERRORE: Valuta sconosciuta");
		}
	


	}
	public void annata(int data,String name){
		int anno1=lettore.nextInt();
		int anno2=lettore.nextInt();
		int min=0;
		int max=0;
		if(anno1<anno2){//imposta anno Max e min
			min=anno1;
			max=anno2;
		}
		else{
			min=anno2;
			max=anno1;
		}
		for(int i=0;i<vini.size();i++){
			int temp=vini.get(i).getData();
			if(temp>min||temp<max)
				dataVino.add(temp);
		}

		for(int i=0;i<vini.size();i++){
			String temp=vini.get(i).getName();
			nomeVino.add(temp);
		}
		for(int i=0;i<vini.size();i++){
			System.out.println(vini.get(i).getName()+":"+vini.get(i).getData());
		}



	}


}
