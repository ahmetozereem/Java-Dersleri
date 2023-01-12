package Inheritance;

public class TierMain {
	
	public static void main(String[] args) {
		
		
		Tier tier1 = new Tier ("köpek", 12, 'w');
		  
		//tier1.showInfos(); 
		//System.out.println(tier1.writeName(tier1.getName()));
		  
		tier1.speak();
		
		 
		
		Tier tier2 = new Hund ("Kurtköpeği", 11, 'm',1000);
		
		tier2.speak();
		
		
		//tier2.showInfos();
		
		Tier tier3 = new Katze ("Limon", 3, 'w', "sokak kedisi");
		
		
		
		tier3.speak();
		tier3.showInfos();
		
		
		
		
		
		
		
		
		
	}

}
