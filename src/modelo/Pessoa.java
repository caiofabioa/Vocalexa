package modelo;

public class Pessoa {
	
	public static final Integer tipoVinculoPF = 1;
	public static final Integer tipoVinculoPJ = 2;
	
	private Integer Id;
	
	private String NomeCompleto;
	
	private String DataNascimento;
	
	private String Rg;
	
	private String Sexo;
	
	private String Telefone;
	
	private Integer Vinculo;
	
	private String tipoVinculo;
	
	private String Cracha;
	
	private String Funcao;
	
	private String Setor;
	
	private String Lider;
	
	private String Gerencia;

	public Integer getId() {
		return Id;
	}

	public String getNomeCompleto() {
		return NomeCompleto;
	}

	public String getDataNascimento() {
		return DataNascimento;
	}

	public String getRg() {
		return Rg;
	}

	public String getSexo() {
		return Sexo;
	}

	public String getTelefone() {
		return Telefone;
	}

	public Integer getVinculo() {
		return Vinculo;
	}

	public String getTipoVinculo() {
		return tipoVinculo;
	}

	public String getCracha() {
		return Cracha;
	}

	public String getFuncao() {
		return Funcao;
	}

	public String getSetor() {
		return Setor;
	}

	public String getLider() {
		return Lider;
	}

	public String getGerencia() {
		return Gerencia;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public void setNomeCompleto(String nomeCompleto) {
		NomeCompleto = nomeCompleto;
	}

	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}

	public void setRg(String rg) {
		Rg = rg;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public void setVinculo(Integer vinculo) {
		Vinculo = vinculo;
	}

	public void setTipoVinculo(String tipoVinculo) {
		this.tipoVinculo = tipoVinculo;
	}

	public void setCracha(String cracha) {
		Cracha = cracha;
	}

	public void setFuncao(String funcao) {
		Funcao = funcao;
	}

	public void setSetor(String setor) {
		Setor = setor;
	}

	public void setLider(String lider) {
		Lider = lider;
	}

	public void setGerencia(String gerencia) {
		Gerencia = gerencia;
	}
	
}
