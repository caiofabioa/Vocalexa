package utils;

import javax.swing.JButton;

import controle.messages.I18NMessages;

@SuppressWarnings("serial")
public class CfaBotao extends JButton{
	static I18NMessages getMessage = new I18NMessages();
	
	public CfaBotao(String titulo){
		super(getMessage.appGetMessage(titulo));
		this.setContentAreaFilled(false);
		this.setBorderPainted(false);
	}
	
	public CfaBotao(String titulo, Boolean border){
		super(getMessage.appGetMessage(titulo));
		this.setContentAreaFilled(border);
		this.setBorderPainted(border);
	}

}
