package modelo;

import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

import controle.ControleEntidade;
import controle.ControleTeste;
import controle.DataBaseManager;
import visao.frames.FrmPessoaCadastro;

@SuppressWarnings("serial")
public class GetDadosFrmCadastroPessoa extends FrmPessoaCadastro{
	
	public GetDadosFrmCadastroPessoa() throws ParseException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static ControleEntidade controleEntidade = new ControleEntidade();
	
	
	public static void salvarPessoa(){
		DataBaseManager dbm = new DataBaseManager();
		Pessoa p = new Pessoa();
		
		p.setId(controleId());
		p.setNomeCompleto(tfNomeRS.getText());
		p.setDataNascimento(tfDataNascimento.getText());
		p.setRg(tfRg.getText());
		p.setSexo(cbSexo.getSelectedItem().toString());
		p.setTelefone(tfTelefone.getText());
		p.setVinculo(TipoVinculoCombo);
		if(cbTipoVinculo.getSelectedItem() != null){
			p.setTipoVinculo(cbTipoVinculo.getSelectedItem().toString());
		}else{
			p.setTipoVinculo("");
		}
		if(tfCracha.getText().equals(null)){
			p.setCracha(tfCracha.getText());
		}else{
			p.setCracha("");
		}
		if(tfFuncao.getText().equals(null)){
			p.setFuncao(tfFuncao.getText());
		}else{
			p.setFuncao("");
		}
		if(tfSetor.getText().equals(null)){
			p.setSetor(tfSetor.getText());
		}else{
			p.setSetor("");
		}
		if(tfLider.getText().equals(null)){
			p.setLider(tfLider.getText());
		}else{
			p.setLider("");
		}
		if(tfGerencia.getText().equals(null)){
			p.setGerencia(tfGerencia.getText());
		}else{
			p.setGerencia("");
		}
		
		dbm.gravarPessoa(p);
		
	}
	
	public static Integer controleId(){
		Integer id = 1;
		return id;
	}
	
	/**
	 * Listar no console os registro no banco da tabela Pessoa
	 */
	public static void listar(){
		List lista = new DataBaseManager().listarPessoa();
		
		for (int i = 0 ; i<lista.size() ; i++) {
			Pessoa pessoa = (Pessoa) lista.get(i);
			StringBuilder sb = new StringBuilder();
			sb.append(pessoa.getNomeCompleto()+"\n");
			sb.append(pessoa.getDataNascimento()+"\n");
			sb.append(pessoa.getRg()+"\n");
			sb.append(pessoa.getSexo()+"\n");
			System.out.println(sb.toString()+"\n");
		}
	}
	
	public static void populaCampo(){
		List pessoaLista = new DataBaseManager().listarPessoa();
		if(pessoaLista!=null && pessoaLista.size()>0){
			sbTxtTotal.setText(String.valueOf(pessoaLista.size()));
			Pessoa pessoa = (Pessoa) pessoaLista.get(indice);
				tfNomeRS.setText(pessoa.getNomeCompleto());
				tfDataNascimento.setText(pessoa.getDataNascimento());
				tfRg.setText(pessoa.getRg());
				cbSexo.setSelectedItem(pessoa.getSexo());
		}else if(pessoaLista.size()==0){
			sbTxtTotal.setText(String.valueOf(pessoaLista.size()));
		}
	}
	
	public static int anterior(){
		if(indice>0)
			return indice += -1;
		else
			return indice;
	}
	public static int proximo(){
		if(indice<Integer.parseInt(sbTxtTotal.getText()))
			return indice += 1;
		else
			return indice;
	}
	public static int primeiro(){
		return 0;
	}
	public static int ultimo(){
		return 0;
	}

}
