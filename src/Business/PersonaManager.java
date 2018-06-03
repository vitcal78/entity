package Business;

import java.util.ArrayList;
import java.util.Collection;

import Entities.ConcreteEntity;

import Integration.Tuple;
import Integration.ConcreteTuple;

public class PersonaManager {

	private Collection<ConcreteEntity> pers;
	
	public PersonaManager() {
		
		pers = new ArrayList<ConcreteEntity>();
		
	}	
	
	public void addPersona(String CF,String Name,String data_nasc) {
		
        Tuple tp = new ConcreteTuple();
        
        tp.Update("CF", CF);
        tp.Update("NOME", Name);
        tp.Update("DATA_NASC", data_nasc);
		
		pers.add(new ConcreteEntity(tp));
		
	}
	
}
