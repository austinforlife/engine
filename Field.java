package org.uiowa.cs2820.engine;

public class Field {

	private String Name;
	private String Value;

	Field(String FieldName, String FieldValue) {
		Name = FieldName;
		Value = FieldValue;
	}

	String getFieldName() {
		return Name;
	}

	String getFieldValue() {
		return Value;
	}

	void setFieldName(String a) {
		Name = a;
	}

	void setFieldValue(String b) {
		Value = b;

	}
}