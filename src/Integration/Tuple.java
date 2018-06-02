package Integration;

import java.util.HashMap;
import java.util.Map;

public  class Tuple {
	
	private Map<String,Field> tuple;
	
	public Tuple() {
		tuple = new HashMap<String,Field>();
	}	
	
	public void Update(String f,Field v) {
		tuple.put(f, v);
	}
	
	public String getValue(String c) {
		return tuple.get(c).Value;
	}
	
	public String getLabel(String c) {
		return tuple.get(c).Label;
	}

}
