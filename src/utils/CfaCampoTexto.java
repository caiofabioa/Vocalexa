package utils;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CfaCampoTexto extends JTextField{
	private String campo;
	private Boolean isObrigatorio;
	private String tabela;
	
	public Boolean isNull(){
		if(this.getText()==null){
			return true;
		}else{
			return false;
		}
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
