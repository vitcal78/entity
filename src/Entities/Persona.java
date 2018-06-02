package Entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Integration.Field;
import Integration.Tuple;

public class Persona {
	
	private String CF;
	private String Nome;
	private Date Data_nasc;
	
	public Persona(Tuple t) {		
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
			CF = t.getValue("CF");
			Nome = t.getValue("NOME");
			Data_nasc = sdf.parse(t.getValue("DATA_NASC"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getKey() {
		return CF;
	}
	
	public Tuple getPersona() {
		
		Tuple tp = new Tuple();
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		Field f_CF = new Field(), f_nome = new Field(), f_data_nasc = new Field();
		
		f_CF.FieldName = "CF";
		f_CF.Label = "Codice fiscale";
		f_CF.Value = this.CF;
		
		
		f_nome.FieldName = "NOME";
		f_nome.Label = "Nome di battesimo";
		f_nome.Value = this.Nome;
		
		f_data_nasc.FieldName = "DATA_NASC";
		f_data_nasc.Label = "Data di nascita";
		f_data_nasc.Value = sdf.format(this.Data_nasc);
		
		tp.Update("CF", f_CF);
		tp.Update("NOME",f_nome);
		tp.Update("DATA_NASC",f_data_nasc);
		
		return tp;
		
	}

}
