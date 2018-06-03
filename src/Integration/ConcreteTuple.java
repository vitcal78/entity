package Integration;

import java.util.HashMap;
import java.util.Map;

public  class ConcreteTuple implements Tuple {
	
	private Map<String,String> tuple;
	
	public ConcreteTuple() {
		tuple = new HashMap<String,String>();
	}

	@Override
	public void Update(String f, String v) {
		// TODO Auto-generated method stub
		tuple.put(f, v);
	}

	@Override
	public String GetValue(String f) {
		// TODO Auto-generated method stub
		return tuple.get(f);
	}

}
