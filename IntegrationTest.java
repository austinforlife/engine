package org.uiowa.cs2820.engine;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.uiowa.cs2820.engine.Database;
import org.uiowa.cs2820.engine.Field;
import org.uiowa.cs2820.engine.Indexer;
import org.uiowa.cs2820.engine.FieldSearch;

import java.util.List;
import java.util.ArrayList;

public class IntegrationTest {
    
    Field F;
	Indexer I;
    Database DB;
    FieldSearch FS;
	
	@Before
	public void initialize(){
		I = new Indexer("900");
        DB = new Database();
        FS = new FieldSearch(DB);
        F = new Field("amount", "900");
	}
	
	@Test
	public void addTest1() {
		Field Field1 = new Field("amount","900");
		DB.add(Field1.getFieldName(), Field1.getFieldValue());
		I.add(Field1);
		assertTrue(DB.containsPath(Field1.getFieldName()));
	}
	
	/**
    @Test
	public void removeTest1() {
        Field Field1 = new Field("amount","900");
		I.remove(Field1);
		assertTrue(DB.remove(null));
	}
	*/
	@Test
	public void closeTest1() {
		Field Field1 = new Field("amount","900");
		I.add(Field1);
        I.close();
        I.add(Field1);
		assertEquals(I.path, null); // there is no method id in Indexer
	}
	
	@Test
	public void resultTest1() {
		List fs = new ArrayList();
		assertEquals(FS.getResult(), fs);
	}
	
	@Test
	public void findEqualsTest1() {
		Field Field1 = new Field("amount","900");
		FS.DB.add(Field1.getFieldName(),Field1.getFieldValue());
		I.add(Field1);
		FS.findEquals(Field1);
		List fs = new ArrayList();
		fs.add("900");
		assertEquals(FS.getResult(), fs);
	}
}