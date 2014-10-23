package org.uiowa.cs2820.engine;

import java.util.HashMap; // imaginary storage??
import java.util.Set;     // for method showallPath()
//import org.uiowa.cs2820.engine.String;
// University of Iowa 
// CS:2820:AAA Object-Oriented Software Development
// Fall 2014 
// Fourth Project Assignment
// Database for SearchEngine

// Team 4
// Austin Washburn - StringSearch
// Tim Miller      - String
// Carter Davis    - Indexer
// Chong Meng Chua - Database


public class Database<E,T> {	  
	private HashMap<String,String> storage;    
	// Constructor
	public Database() {
		storage = new HashMap<String,String>();	
	}	
	// insert word to path
	public void add(String path, String word) {
		storage.put(path, word);
	}
	// remove word
	public void remove(String path, String word) {		
		storage.put(path, null);
	}
	// format the database, use with care
	public void reset() {
		storage.clear();
	}
	// search for word, returning (path, word)
	public HashMap<String,String> get() {
		return storage;
	}
		
	// show all Path in database
	public Set<String> showallPath() {
		// throw exception if empty
		return storage.keySet();
	}
	// check whether database is empty
	public boolean isEmpty() {
		return storage.isEmpty();
	}
	// check whether path in database
	public boolean containsPath(String path) {
		return storage.containsKey(path);
	}
	// return size of database
	public int size() {
		return storage.size();
	}
	
	public static void main(String[] args) {}
}