package Inheritance;

public class Katze extends Tier {
	
	private String art; 

	public Katze(String name, int age, char cinsiyet, String art) {
		super(name, age, cinsiyet);
		
		this.art=art;
		
	}

	public void showInfos() {
		
		super.showInfos();
		
		System.out.println("Kedinin Türü: " + art);
	}

	public void speak() {
		
		System.out.println("Kedi miyavlıyor...");

}
}