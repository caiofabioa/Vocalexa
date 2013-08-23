package utils;

import javax.swing.JRadioButton;

import controle.messages.I18NMessages;

@SuppressWarnings("serial")
public class CfaUnicaEscolha extends JRadioButton{
	
	static I18NMessages getMessage = new I18NMessages();
	private String campo;
	private String tabela;
	private Boolean isObrigatorio;
	
	private String value;

	public CfaUnicaEscolha(String appGetMessage) {
		this.setText(getMessage.appGetMessage(appGetMessage));
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the campo
	 */
	public String getCampo() {
		return campo;
	}

	/**
	 * @param campo the campo to set
	 */
	public void setCampo(String campo) {
		this.campo = campo;
	}

	/**
	 * @return the isObrigatorio
	 */
	public Boolean isObrigatorio() {
		return isObrigatorio;
	}

	/**
	 * @param isObrigatorio the isObrigatorio to set
	 */
	public void setObrigatorio(Boolean isObrigatorio) {
		this.isObrigatorio = isObrigatorio;
	}

	public String getTabela() {
		return tabela;
	}

	public void setTabela(String tabela) {
		this.tabela = tabela;
	}
	
}
