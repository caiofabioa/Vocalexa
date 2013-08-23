package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import controle.ControleTelaComponentes;
import visao.frames.PessoaCadastroFrame;

@SuppressWarnings("serial")
public class CadastroPessoaVisao extends PessoaCadastroFrame{
	private ControleTelaComponentes control = new ControleTelaComponentes();
	
	public CadastroPessoaVisao() throws Exception{
		super();
		getFrames();
		setVisible(true);
		setLocationRelativeTo(null);
		this.setLocationRelativeTo(null);
		
		btnNovoRegistro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				habilitaConteudo(formularioPane, true);
			}

		});

		btnAlterarRegistro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				imprimeCamposConteudo(formularioPane);
			}
			
		});

		btnSalvarRegistro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				habilitaConteudo(formularioPane, false);
			}
			
		});

		btnSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
			
		});
	}

	private void habilitaConteudo(JComponent formularioPane, boolean b) {
		control.habilitaCampos(formularioPane, b);
	}

	private void imprimeCamposConteudo(JComponent formularioPane) {
		control.imprimeCampos(formularioPane);
	}
}
