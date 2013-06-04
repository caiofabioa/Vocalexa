package controle;

import java.util.List;

import modelo.Pessoa;
import modelo.TipoVinculo;

import com.db4o.ext.Db4oException;

public class ControleEntidade {
	
	private static DataBaseManager dbm;
	public static List<Pessoa> ListPessoa;
	public static List<TipoVinculo> ListVinculo;
	public static ControleTeste teste;
	
	public void gravaPessoa(Object entidade){
		try {
			dbm.gravarPessoa(entidade);
			teste.imprime();
		} catch (Db4oException e) {
			System.out.println(e);
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Pessoa> conListPessoaaPessoa(){
		try {
			return ListPessoa = dbm.listarPessoa();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<TipoVinculo> listaVinculo(){
		try {
			ListVinculo  = dbm.listaVinculos();
			if(ListVinculo!=null){
				return ListVinculo;
			}
		}catch(Throwable e) {
			e.printStackTrace();
		}
		return null;
	}

}
