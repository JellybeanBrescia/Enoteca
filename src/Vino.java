public class Vino {
	private String name;
	private double prezzo;
	private int data;
	private String localit�;
	private String produttore;
	private String valuta;
	private int cont;
	
	//COSTRUTTORI
	public Vino(String name, double prezzo, int data, String localit�, String produttore, String valuta, int cont) {
		super();
		this.name = name;
		this.prezzo = prezzo;
		this.data = data;
		this.localit� = localit�;
		this.produttore = produttore;
		this.valuta = valuta;
		this.cont = cont;
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
	public String getLocalit�() {
		return localit�;
	}
	public void setLocalit�(String localit�) {
		this.localit� = localit�;
	}
	public String getProduttore() {
		return produttore;
	}
	public void setProduttore(String produttore) {
		this.produttore = produttore;
	}
	public String getValuta() {
		return valuta;
	}
	public void setValuta(String valuta) {
		this.valuta = valuta;
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}	
	public String toString(){
		 String tmp = "Il " +name+ " di valore " +prezzo+valuta+ " prodotto nel " +data+ " in " +localit�+ " da " +produttore+ " in quantit� di " +cont+ " bottiglie";
		 return tmp;
	}
	
}
