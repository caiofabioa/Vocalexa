package visao;

import java.text.ParseException;

import visao.frames.CadastroPessoaFrame;

public class AbrirFramesBotoes {

	public CadastroPessoaFrame abreFramePessoa() throws ParseException {
		CadastroPessoaFrame fpc = null;
		try {
			fpc = new CadastroPessoaFrame();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fpc;
	}

}
