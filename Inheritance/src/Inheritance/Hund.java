package Inheritance;

public class Hund extends Tier {
	
	private int preis;

	
	  public Hund(String name, int age, char cinsiyet, int preis) {
	  
	  super(name, age, cinsiyet); this.preis=preis; }
	 

	public void showInfos() {
		
		super.showInfos();
		System.out.println("Hayvanın fiyatı: "+ preis);
	}

	

	public int getPreis() {
		return preis;
	}

	public void setPreis(int preis) {
		this.preis = preis;
	}

	public void speak() {
		System.out.println("Köpek havlıyor");
	}

}
