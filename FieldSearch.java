package org.uiowa.cs2820.engine;

import org.uiowa.cs2820.engine.Database;
import org.uiowa.cs2820.engine.Field;

import java.util.ArrayList;
import java.util.HashMap;

public class FieldSearch {
	
	
	private ArrayList<String> Result; 
	private Database<Field,Field> DB;

	// Constructor
	public FieldSearch() {
		DB = new Database<Field, Field>();
	}
	// Method to return result
	public ArrayList<String> getResult() {
		return Result;
	}
	// Returns all the 'documents' with matching field
	public ArrayList<String> FindEquals(Field f) {
		HashMap<String,String> HM = DB.get();
		for ( String i: HM.keySet()) {
			if (HM.get(i).contains(f.getFieldName()) && HM.get(i).contains(f.getFieldValue())) {
				Result.add(i);
			}
		}	
		return Result;
	}
}
