package org.uiowa.cs2820.engine;

import java.util.ArrayList;

import static org.junit.Assert.*;

import org.uiowa.cs2820.engine.Field;
import org.junit.Test;




public class FieldSearchTest {

	@Test
	public void test0() {
		//test the constructor
		Database D = new Database();
		FieldSearch FS = new FieldSearch(D);
		ArrayList<String> S = new ArrayList<String>();
		assertEquals( FS.getResult(), S);
		
	}
	@Test
	public void test1() {
		//test that findEquals returns 
		Database D = new Database();
		FieldSearch T = new FieldSearch(D);
		Field F = new Field( "1", "Hello" );
		T.DB.add( F.getFieldName(), F.getFieldValue() );
		Field X = new Field( "2", "Hey" );
		T.DB.add( X.getFieldName(), X.getFieldValue() );
		Field Y = new Field( "3", "Hi" );
		T.DB.add( Y.getFieldName(), Y.getFieldValue() );
		Field P = new Field( "1", "HeyThere" );
		ArrayList<String> Result = T.findEquals(X);
		ArrayList<String> test = new ArrayList();
		test.add("Hey");
		assertEquals(Result, test);
		
	}	
}
 

