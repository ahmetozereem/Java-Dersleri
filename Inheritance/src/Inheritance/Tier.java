package Inheritance;

public class Tier {
	
	private String name;
	private int age;
	private char cinsiyet;
	
	
	  public Tier(String name, int age, char cinsiyet) { super(); this.name = name;
	  this.age = age; this.cinsiyet = cinsiyet;
	 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(char cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public void showInfos () {
		
		System.out.println("Hayvanın Adı: "+ name);
		System.out.println("Hayvanın yaşı: "+ age);
		System.out.println("Hayvanın cinsiyeti: "+ cinsiyet);
	}
	
	public String writeName (String name) {
		
	return "Bu hayvanın adı: "+name;
	}
	
	public void speak () {
		System.out.println("Hayvan konuşuyor");
	}
}


