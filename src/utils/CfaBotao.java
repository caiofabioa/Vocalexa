package utils;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class CfaBotao extends JButton{
	
	public CfaBotao(String titulo){
		super(titulo);
		
		this.setContentAreaFilled(false);
		this.setBorderPainted(false);
	}

}
