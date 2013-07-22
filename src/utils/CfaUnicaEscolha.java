package utils;

import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class CfaUnicaEscolha extends JRadioButton{
	
	private String value;

	public CfaUnicaEscolha(String appGetMessage) {
		this.setText(appGetMessage);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
