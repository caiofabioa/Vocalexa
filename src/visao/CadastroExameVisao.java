package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import visao.frames.ExameCadastroFrame;

@SuppressWarnings("serial")
public class CadastroExameVisao extends ExameCadastroFrame {
	
	private JTabbedPane _jtpExame = jtpExame;
	
	public CadastroExameVisao(){
		super();
		getFrames();
		setVisible(true);
		setLocationRelativeTo(null);
		this.setLocationRelativeTo(null);
		habilitaCampos(_jtpExame, false);
		
		btnEditar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				habilitaCampos(_jtpExame, true);
			}
		});
	}
	
	/**
	 *  \/ METODOS \/
	 *  
	 */
	
	/**
	 * Habilita ou desabilita todos os campos do Frame Exames
	 * @param componente
	 * @param habilitar
	 */
	public static void habilitaCampos(JComponent componente, boolean habilitar) {
		for (int x = 0; x < componente.getComponentCount(); x++) {
			if (componente.getComponent(x) instanceof JTextField
					|| componente.getComponent(x) instanceof JCheckBox
					|| componente.getComponent(x) instanceof JRadioButton
					|| componente.getComponent(x) instanceof JFormattedTextField
					|| componente.getComponent(x) instanceof JComboBox) {
				componente.getComponent(x).setEnabled(habilitar);
			}else if (componente.getComponent(x) instanceof JPanel){
				habilitaCampos((JComponent) componente.getComponent(x), habilitar);
			}
		}
	}
}
