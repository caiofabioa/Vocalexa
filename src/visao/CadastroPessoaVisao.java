package visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.frames.PessoaCadastroFrame;

@SuppressWarnings("serial")
public class CadastroPessoaVisao extends PessoaCadastroFrame{
	
	public CadastroPessoaVisao() throws Exception{
		super();
		this.setLocationRelativeTo(null);
		
		btnNovoRegistro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				habilitaCampos(true);
			}
		});
	}
	
	/**
	 * METODOS
	 */
	public void habilitaCampos(Boolean set) {
		this.rdbtnPessoaFisica.setEnabled(set);
		this.rdbtnPessoaJurdica.setEnabled(set);
		this.tfCracha.setEnabled(set);
		this.tfDataNascimento.setEnabled(set);
		this.tfFuncao.setEnabled(set);
		this.tfGerencia.setEnabled(set);
		this.tfLider.setEnabled(set);
		this.tfNomeRS.setEnabled(set);
		this.tfRg.setEnabled(set);
		this.tfSetor.setEnabled(set);
		this.tfTelefone.setEnabled(set);
		this.cbSexo.setEnabled(set);
	} 

}
