package visao;

import java.awt.Component;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import visao.frames.CadastroExameFrame;

@SuppressWarnings("serial")
public class CadastroExameVisao extends CadastroExameFrame {
	
	public CadastroExameVisao(){
		super();
		getFrames();
		setVisible(true);
		setLocationRelativeTo(null);
		this.setLocationRelativeTo(null);
		desabilitaHabilitaCampos(false);
	}
	
	public void desabilitaHabilitaCampos(Boolean set){
		Component[] componente = this.jtpExame.getComponents();
		Component[] campo;
		for(int i = 0 ; i < componente.length ; i++){
			if(componente[i] instanceof JPanel){
				JPanel painel = (JPanel) componente[i];
				campo = painel.getComponents();
				for(int c = 0 ; c < campo.length ; c++){
					if(campo[c] instanceof JPanel){
						JPanel novoPainel = (JPanel) campo[c];
						Component[] novoCampo = novoPainel.getComponents();
						for(int a=0 ; a < novoCampo.length ; a++){
							if(novoCampo[a] instanceof JTextField ||
									novoCampo[a] instanceof JCheckBox ||
									novoCampo[a] instanceof JRadioButton ||
									novoCampo[a] instanceof JComboBox ||
									novoCampo[a] instanceof JFormattedTextField) {
								novoCampo[a].setEnabled(set);
							}
						}
					}
				}
			}
			
		}
	}

}
