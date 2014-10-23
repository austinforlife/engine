package org.uiowa.cs2820.engine;

import org.uiowa.cs2820.engine.Database;
import org.uiowa.cs2820.engine.Field;

import java.util.ArrayList;

public class FieldSearch {
	private ArrayList<String> T;  //should be ArrayList<Field>

	public FieldSearch() {
		T = new ArrayList<String>();
	}
	
	public ArrayList<String> getT() {
		return T;
	}
	
//being passed a field
	public ArrayList<String> FindEquals(Field f) {
		Database<Field,Field> S = new Database<Field, Field>();
		T.add(S.get(f.getFieldValue())); 	
		return T;
	}
//should return an array of string/field results for matches found in database	
}
