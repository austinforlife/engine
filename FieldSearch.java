package org.uiowa.cs2820.engine;

import org.uiowa.cs2820.engine.Database;
import org.uiowa.cs2820.engine.Field;
import java.util.ArrayList;
import java.util.HashMap;

// Austin Washburn
// 24 Oct 2014
// Project 4: FieldSearch

// Team 4
// Carter Davis    -   Indexer
// Chong Meng Chua -   Database
// Tim Miller      -   Field



public class FieldSearch {
	
	
	public ArrayList<String> Result; 
	public Database<Field,Field> DB;

	// Constructor
	public FieldSearch(Database<Field, Field> D) {
		this.DB = D;
		this.Result = new ArrayList<String>();
	}
	// Method to return result
	public ArrayList<String> getResult() {
		return Result;
	}
	// Returns all the 'documents' with matching field
	public ArrayList<String> findEquals(Field f) {
		HashMap<String,String> HM = DB.get();
		for ( String i: HM.keySet()) {
			if (HM.get(i) == (f.getFieldValue())) {
				Result.add(HM.get(i));
			}
		} 
		return Result;
	}

}
