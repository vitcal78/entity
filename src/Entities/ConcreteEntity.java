package Entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Integration.ConcreteTuple;
import Integration.Tuple;

public class ConcreteEntity implements Entity {
	
	private String CF;
	private String Nome;
	private Date Data_nasc;
	
	public ConcreteEntity(Tuple tp) {		
		
		this.CF = "";
		this.Nome = "";
		this.Data_nasc = new Date();
		
	}

	@Override
	public Integration.ConcreteTuple GetTuple() {

		ConcreteTuple tp = new ConcreteTuple();
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		tp.Update("CF", this.CF);
		tp.Update("NOME", this.Nome);
		tp.Update("DATA_NASC", sdf.format(this.Data_nasc));
		
		return tp;
		
	}



	@Override
	public void SetTuple(Tuple t) {
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
			CF = t.GetValue("CF");
			Nome = t.GetValue("NOME");
			Data_nasc = sdf.parse(t.GetValue("DATA_NASC"));
		} catch (ParseException e) {		
			e.printStackTrace();
		}
		
	}

}
