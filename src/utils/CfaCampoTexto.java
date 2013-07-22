package utils;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CfaCampoTexto extends JTextField{
	
	public Boolean isNull(){
		if(this.getText()==null){
			return true;
		}else{
			return false;
		}
	}

}
