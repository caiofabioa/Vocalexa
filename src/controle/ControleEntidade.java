package controle;

import java.util.List;

import modelo.Pessoa;

import com.db4o.ext.Db4oException;

public class ControleEntidade {
	
	public static DataBaseManager dbm;
	public static List<Pessoa> List;
	public static ControleTeste teste;
	
	public void gravaPessoa(Object entidade){
		try {
			dbm.gravarPessoa(entidade);
			teste.imprime();
		} catch (Db4oException e) {
			System.out.println(e);
		}
	}
	
	public List<Pessoa> consultaPessoa(){
		try {
			return List = dbm.listarPessoa();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
