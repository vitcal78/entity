package MainPackage;

import Business.PersonaManager;


public class MainClass {
	
	public static void main(String args[]) {
		new MainClass();
	}

	public MainClass() {
		
		PersonaManager pm = new PersonaManager();
		
		pm.addPersona("CLBVTR78R03L328R", "Calabrese Vittorio", "03/10/1978");
		pm.addPersona("LFFPRZ84L47A669E", "Loffredo Patrizia Carmela", "07/07/1984");
		
		System.out.println("Classe istanziata correttamente");
		
	}
	
}
