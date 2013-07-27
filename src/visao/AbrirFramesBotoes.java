package visao;

import java.text.ParseException;

import visao.frames.PessoaCadastroFrame;

public class AbrirFramesBotoes {

	public PessoaCadastroFrame abreFramePessoa() throws ParseException {
		PessoaCadastroFrame fpc = null;
		try {
			fpc = new PessoaCadastroFrame();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fpc;
	}

}
