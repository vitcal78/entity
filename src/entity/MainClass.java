package entity;

import Entities.Persona;
import Integration.Field;
import Integration.Tuple;

public class MainClass {
	
	public static void main(String args[]) {
		new MainClass();
	}

	public MainClass() {
		
		Field f_nome = new Field(),f_CF = new Field(),f_data_nasc = new Field();		
		
		f_CF.FieldName = "CF";
		f_CF.Label = "Codice fiscale";
		f_CF.Label = "CLBVTR78R03L328R";
		
		
		f_nome.FieldName = "NOME";
		f_nome.Label = "Nome di battesimo";
		f_nome.Value = "Vittorio";
		
		f_data_nasc.FieldName = "DATA_NASC";
		f_data_nasc.Label = "Data di nascita";
		f_data_nasc.Value = "03/10/1978";
		
		Tuple tp = new Tuple();
		
		tp.Update("CF", f_CF);
		tp.Update("NOME",f_nome);
		tp.Update("DATA_NASC",f_data_nasc);
		
		Persona p = new Persona(tp);
		
		System.out.println("Classe istanziata correttamente");
		
	}
	
}
