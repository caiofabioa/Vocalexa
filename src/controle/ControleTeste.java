package controle;

import java.util.Iterator;
import java.util.List;

import modelo.Pessoa;

public class ControleTeste {

	ControleEntidade ControlEntity;
	
	public void imprime(){
		List<Pessoa> listaPessoa = new ControleEntidade().conListPessoaaPessoa();
		
		for (Iterator it = listaPessoa.iterator(); it.hasNext();) {
			Pessoa pessoa = (Pessoa) it.next();
			StringBuilder sb = new StringBuilder();
			sb.append(pessoa.getNomeCompleto()+"\n");
			sb.append(pessoa.getDataNascimento()+"\n");
			sb.append(pessoa.getRg()+"\n");
			sb.append(pessoa.getSexo()+"\n");
			System.out.println(sb.toString()+"\n");
		}
	}
	
}
