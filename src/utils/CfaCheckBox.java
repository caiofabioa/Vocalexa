package utils;

import javax.swing.JCheckBox;

@SuppressWarnings("serial")
public class CfaCheckBox extends JCheckBox{
	
	public CfaCheckBox(String titulo) {
		super(titulo);
	}

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	


}
