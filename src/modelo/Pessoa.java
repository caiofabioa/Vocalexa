package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	@Column(nullable = false, length = 100)
	private String NomeCompleto;
	
	@Temporal(TemporalType.DATE)
	private String DataNascimento;
	
	@Column(length=13, unique=true)
	private Integer Rg;
	
	@Column(length=1)
	private String Sexo;
	
	@Column(name="telefone")
	private String Telefone;
	
	@Column(length=2)
	private String tipoVinculo;
	
	@OneToOne(mappedBy = "id_dadosvinculo")
	@JoinColumn(name="id_dadosvinculo")
	private dadosVinculo dadosVinculo;
	
	@OneToOne(mappedBy = "id_vinculo")
	@JoinColumn(name="id_vinculo")
	private Vinculo vinculo;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNomeCompleto() {
		return NomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		NomeCompleto = nomeCompleto;
	}

	public String getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}

	public Integer getRg() {
		return Rg;
	}

	public void setRg(Integer rg) {
		Rg = rg;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getTipoVinculo() {
		return tipoVinculo;
	}

	public void setTipoVinculo(String tipoVinculo) {
		this.tipoVinculo = tipoVinculo;
	}

	public dadosVinculo getDadosVinculo() {
		return dadosVinculo;
	}

	public void setDadosVinculo(dadosVinculo dadosVinculo) {
		this.dadosVinculo = dadosVinculo;
	}

	public Vinculo getVinculo() {
		return vinculo;
	}

	public void setVinculo(Vinculo vinculo) {
		this.vinculo = vinculo;
	}
	
}
