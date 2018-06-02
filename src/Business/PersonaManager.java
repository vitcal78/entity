package Business;

import java.util.ArrayList;
import java.util.Collection;

import Entities.Persona;
import Integration.Field;
import Integration.Tuple;

public class PersonaManager {

	private Collection<Persona> pers;
	
	public PersonaManager() {
		
		pers = new ArrayList<Persona>();
		
	}	
	
	public void addPersona(String CF,String Name,String data_nasc) {
		
        Field f_nome = new Field(),f_CF = new Field(),f_data_nasc = new Field();		
		
		f_CF.FieldName = "CF";
		f_CF.Label = "Codice fiscale";
		f_CF.Label = CF;
		
		
		f_nome.FieldName = "NOME";
		f_nome.Label = "Nome di battesimo";
		f_nome.Value = Name;
		
		f_data_nasc.FieldName = "DATA_NASC";
		f_data_nasc.Label = "Data di nascita";
		f_data_nasc.Value = data_nasc;
		
		Tuple tp = new Tuple();
		
		tp.Update("CF", f_CF);
		tp.Update("NOME",f_nome);
		tp.Update("DATA_NASC",f_data_nasc);
		
		pers.add(new Persona(tp));
		
	}
	
}
