package org.uiowa.cs2820.engine;
import static org.junit.Assert.*;
import java.util.Set;
import java.util.HashSet;
import org.junit.Test;

public class DatabaseTest {

	@Test
	public void testConstructor() {
		// testing the Constructor and isEmpty
		Database T = new Database();
		assertEquals(T.isEmpty(),true);
	}
	
	@Test
	public void testContain() {
		// testing whether path in database
		Database T = new Database();
		T.add("amount", "900");
		assertEquals(T.containsPath("amount"),true);
	}
	
	@Test
	public void testAdd() {
		// testing the add and get
		Database T = new Database();
		T.add("amount", "900");
		assertEquals(T.get().get("amount"),"900");
	}	

	@Test
	public void testRemove() {
		// testing the remove
		Database T = new Database();
		T.add("amount", "900");
		T.add("sku", "12345");
		T.remove("amount", "900");
		assertEquals(T.get().get("amount"),null);
	}
	
	@Test
	public void testSize() {
		// testing the size
		Database T = new Database();
		T.add("amount", "900");
		assertEquals(T.size(),1);
	}
	
	@Test
	public void testReset() {
		// testing the reset
		Database T = new Database();
		T.add("amount", "900");
		T.add("sku", "12345");
		T.reset();
		assertEquals(T.size(),0);
	}
	
	@Test
	public void testShowAll() {
		// testing the show all
		Database T = new Database();
		T.add("amount", "900");
		T.add("sku", "12345");
		Set S = new HashSet();
		S.add("amount");
		S.add("sku");
		assertEquals(T.showallPath(),S);
	}
	
}
