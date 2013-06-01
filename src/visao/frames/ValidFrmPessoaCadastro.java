package visao.frames;

import java.text.ParseException;
import java.util.List;

import controle.ControleEntidade;

import modelo.Pessoa;

@SuppressWarnings("serial")
public class ValidFrmPessoaCadastro extends FrmPessoaCadastro{

	public static ControleEntidade ctrlEntidade = new ControleEntidade();
	
	public ValidFrmPessoaCadastro() throws ParseException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void validaTipoPessoa(boolean valida){
			tfFuncao.setEditable(valida);
			tfGerencia.setEditable(valida);
			tfLider.setEditable(valida);
			tfSetor.setEditable(valida);
			tfCracha.setEditable(valida);
			cbTipoVinculo.setEnabled(valida);
			TipoVinculoCombo = new Pessoa().tipoVinculoPF;
	}
	
}
