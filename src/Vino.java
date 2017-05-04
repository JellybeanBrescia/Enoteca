
public class Vino {
	String name;
	double prezzo;
	int data;
	String località;
	String produttore;
	String valuta;
	
	//COSTRUTTORI
	public Vino(String name, double prezzo, int data, String località, String produttore) {
		super();
		this.name = name;
		this.prezzo = prezzo;
		this.data = data;
		this.località = località;
		this.produttore = produttore;
	}
	public Vino() {
		super();
		
	}
	
	//GETTESR AND SETTERS
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String getLocalità() {
		return località;
	}
	public void setLocalità(String località) {
		this.località = località;
	}
	public String getProduttore() {
		return produttore;
	}
	public void setProduttore(String produttore) {
		this.produttore = produttore;
	}
	
	
	
}
