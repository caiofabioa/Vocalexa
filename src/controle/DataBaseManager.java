package controle;

import java.util.List;

import modelo.Exame;
import modelo.Pessoa;
import modelo.TipoVinculo;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ext.Db4oException;

public class DataBaseManager {

	protected static ObjectContainer db;
	private List<TipoVinculo> listVinculo;

	public DataBaseManager() {
		if(db==null){
			db = Db4oEmbedded.openFile("bancoVocalexa.xdata");
		}
	}

	public void gravarPessoa(Object entidade) {
		if (entidade != null) {
			// Realizar a gravação na DataBase
			try {
				db.store(entidade);
			}catch(Exception e){
				System.out.println(e);
			}finally {
				db.close();
			}
		}
	}

	public void atualizar(Object entidade) throws Throwable {
		if (entidade != null) {
			// Rela a atualização na DataBase
			try {
				db.store(entidade);
			} finally {
				db.close();
			}
		} else {
			throw new Db4oException().getCause();
		}
	}
	
	public void remove(Object entidade) throws Throwable {
		if (entidade != null) {
			// Rela a atualização na DataBase
			try {
				db.delete(entidade);
			} finally {
				db.close();
			}
		} else {
			throw new Db4oException().getCause();
		}
	}
	
	public List listarPessoa(){
			// Rela a atualização na DataBase
				return db.queryByExample(Pessoa.class);
	}

	public List<Exame> listarExame(Exame entidade) throws Throwable{
		if (entidade != null) {
			// Rela a atualização na DataBase
			try {
				return db.queryByExample(entidade);
			} finally {
				db.close();
			}
		} else {
			throw new Db4oException().getCause();
		}
	}
	
	public List listaVinculos(){
			return db.queryByExample(TipoVinculo.class);
	}
	
}
