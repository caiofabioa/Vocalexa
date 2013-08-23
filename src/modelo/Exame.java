package modelo;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import modelo.exames.Ex03;
import modelo.exames.Ex05;
import modelo.exames.Ex11;
import modelo.exames.Ex13;
import modelo.exames.Ex14;
import modelo.exames.Ex15;
import modelo.exames.Ex16;
import modelo.exames.Ex22;
import modelo.exames.Ex24;
import modelo.exames.Ex28;
import modelo.exames.Ex30;
import modelo.exames.Ex31;
import modelo.exames.Ex32;
import modelo.exames.Ex37;
import modelo.exames.Ex39;
import modelo.exames.Ex40;
import modelo.exames.Ex41;
import modelo.exames.Ex42;
import modelo.exames.Ex43;
import modelo.exames.Ex44;
import modelo.exames.Ex45;
import modelo.exames.Ex46;
import modelo.exames.Ex47;
import modelo.exames.Ex48;
import modelo.exames.Ex49;
import modelo.exames.Ex50;
import modelo.exames.Ex51;
import modelo.exames.Ex52;
import modelo.exames.Ex53;
import modelo.exames.Ex55;
import modelo.exames.Ex56;
import modelo.exames.Ex57;
import modelo.exames.Ex58;
import modelo.exames.Ex60;
import modelo.exames.Ex61;
import modelo.exames.Ex62;
import modelo.exames.Ex63;
import modelo.exames.Ex64;
import modelo.exames.Ex68;


public class Exame {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_exame;
    
	@OneToMany(mappedBy="id")
	@JoinColumn(name="id_pessoa")
	private Pessoa pessoa;
	
	@Temporal(TemporalType.DATE)
    private Date ex_data;
    
    private String ex_01;

    //As variações de humor alteram a voz
    private String ex_02;

    //Ao fim do dia, sua voz esta
    private Ex03 ex03;

    //os gargarejos melhoram a voz //TEXTO
    private String ex04;
    
    //As pessoas costumam dizer que / OPÇÕES
    private Ex05 ex05;
    
    //Como você ouve sua voz
    private String ex06;
    
    //Gosta dela? Porquê?
    private String ex07;
    
    //Alguem em sua família apresenta algum problema vocal? Qual?
    private String ex08;
    
    //A sua voz parece mais com
    private String ex09;
    
    //Observação
    private String Ex10;

    //Ao falar sente // OPÇÃO
    private Ex11 ex11;

    //pratica atividades físicas?
    private Boolean ex12;
    
    //Ja apresentou quadros de
    private Ex13 ex13;

    //Hábitos de vida diária (alteram a voz) 
    
    private Ex14 ex14;

    //Em casa
    
    private Ex15 ex15;

    //No trabalho
    
    private Ex16 ex16;
    
    //Observação
    
    private String ex17;
    
    //Frequenta festas, bailes, lugares que tocam musicas altas? com que frequencia?
    
    private String ex18;
    
    //Gosta de cantar, já participou de atividade que envolvam canto? Cite
    
    private String ex19;
    
    //Uso de medicamentos contínuos
    
    private String ex20;
    
    //No caso de ser profissional da voz, fala, em media, quantas horas por dia?
    
    private String ex21;
    
    //Características pessoais
    
    private Ex22 ex22;
    
    //Fica Exposto ao ar condicionado fora do ambiente lavoral?
    
    private String ex23;
    
    //Antecedentes Pessoais
    
    private Ex24 ex24;
     
    //Traumas recentes
    
    private String ex25;
     
    //Alguma associação do trauma com a voz
    
    private String ex26;
     
    //outras relações do emocional com a voz
    
    private String ex27;
     
    //Hábitos alimentares
    
    private Ex28 ex28;
     
    //Ao ter que se apresentar/debater um assunto frente a um gurpo/platéia
    //qual a sua reação vocal
    
    private String ex29;
    
    //Convivência Social
    
    private Ex30 ex30;
     
    //Sono
    
    private Ex31 ex31;
    
    //Relaxa
    
    private Ex32 ex32;
     
    //Vestuário
    
    private String ex33;
     
    //Observações
    
    private String ex34;
     
    //Contato Visual
    
    private String ex35;
     
    //Impressões Pessoais
    
    private String ex36;
     
    //Tipo de voz
    
    private Ex37 ex37;
     
    //Alteração da voz com movimento de cabeça
    
    private Boolean ex38;;
     
    //Sistema de ressonancia
    
    private Ex39 ex39;
    
    //Ataque vocal
    
    private Ex40 ex40;
    
    //Qualidade de emissão
    
    private Ex41 ex41;
    
    //Pitch
    
    private Ex42 ex42;
    
    //Loudness (Sensação psicofísica da intensidade vocal)
    
    private Ex43 ex43;
    
    //modulação da intensidade
    
    private Ex44 ex44;
    
    //Articulação
    
    private Ex45 ex45;
    
    //Distúrbios articulatório
    
    private Ex46 ex46;
    
    //CPFA
    
    private Ex47 ex47;
    
    //Pronuncia
    
    private Ex48 ex48;
    
    //Velocidade de fala
    
    private Ex49 ex49;
    
    //Ritmo
    
    private Ex50 ex50;
    
    //Energia da emissão
    
    private Ex51 ex51;
    
    //Entonação
    
    private Ex52 ex52;
    
    //Resistência vocal (não mantém)
    
    private Ex53 ex53;
    
    //Parou o teste ante do fim?
    
    private String ex54;
     
    //Dinâmica respiratória
    
    private Ex55 ex55;
     
    //Tipo
    
    private Ex56 ex56;
     
    //Modo
    
    private Ex57 ex57;
     
    //Estrutura de fonação
    
    private Ex58 ex58;
     
    //Apresenta alteração vocal após a manipulação digital de laringe?
    
    private Boolean ex59;
     
    //Avaliação Corporal - hipertonicidade
    
    private Ex60 ex60;
     
    //Fluência da Fala
    
    private Ex61 ex61;
     
    //Construção Sintática
    
    private Ex62 ex62;
     
    //Tempo maximo de fonação
   
    private Ex63 ex63;
    
    //Sugestivo de
    private Ex64 ex64;
    
    //Parecer Fonoaudiológico
    private String ex65;
    
    //Conduta
    private String ex66;
    
	//Resultado
    private String Ex67;
   
	//Resultado
    private Ex68 ex68;
    
    /*
     * MÉTODOS GETTERS AND SETTERS
     */

	public Integer getId_exame() {
		return id_exame;
	}

	public void setId_exame(Integer id_exame) {
		this.id_exame = id_exame;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Date getEx_data() {
		return ex_data;
	}

	public void setEx_data(Date ex_data) {
		this.ex_data = ex_data;
	}

	public String getEx_01() {
		return ex_01;
	}

	public void setEx_01(String ex_01) {
		this.ex_01 = ex_01;
	}

	public String getEx_02() {
		return ex_02;
	}

	public void setEx_02(String ex_02) {
		this.ex_02 = ex_02;
	}

	public Ex03 getEx03() {
		return ex03;
	}

	public void setEx03(Ex03 ex03) {
		this.ex03 = ex03;
	}

	public String getEx04() {
		return ex04;
	}

	public void setEx04(String ex04) {
		this.ex04 = ex04;
	}

	public Ex05 getEx05() {
		return ex05;
	}

	public void setEx05(Ex05 ex05) {
		this.ex05 = ex05;
	}

	public String getEx06() {
		return ex06;
	}

	public void setEx06(String ex06) {
		this.ex06 = ex06;
	}

	public String getEx07() {
		return ex07;
	}

	public void setEx07(String ex07) {
		this.ex07 = ex07;
	}

	public String getEx08() {
		return ex08;
	}

	public void setEx08(String ex08) {
		this.ex08 = ex08;
	}

	public String getEx09() {
		return ex09;
	}

	public void setEx09(String ex09) {
		this.ex09 = ex09;
	}

	public String getEx10() {
		return Ex10;
	}

	public void setEx10(String ex10) {
		Ex10 = ex10;
	}

	public Ex11 getEx11() {
		return ex11;
	}

	public void setEx11(Ex11 ex11) {
		this.ex11 = ex11;
	}

	public Boolean getEx12() {
		return ex12;
	}

	public void setEx12(Boolean ex12) {
		this.ex12 = ex12;
	}

	public Ex13 getEx13() {
		return ex13;
	}

	public void setEx13(Ex13 ex13) {
		this.ex13 = ex13;
	}

	public Ex14 getEx14() {
		return ex14;
	}

	public void setEx14(Ex14 ex14) {
		this.ex14 = ex14;
	}

	public Ex15 getEx15() {
		return ex15;
	}

	public void setEx15(Ex15 ex15) {
		this.ex15 = ex15;
	}

	public Ex16 getEx16() {
		return ex16;
	}

	public void setEx16(Ex16 ex16) {
		this.ex16 = ex16;
	}

	public String getEx17() {
		return ex17;
	}

	public void setEx17(String ex17) {
		this.ex17 = ex17;
	}

	public String getEx18() {
		return ex18;
	}

	public void setEx18(String ex18) {
		this.ex18 = ex18;
	}

	public String getEx19() {
		return ex19;
	}

	public void setEx19(String ex19) {
		this.ex19 = ex19;
	}

	public String getEx20() {
		return ex20;
	}

	public void setEx20(String ex20) {
		this.ex20 = ex20;
	}

	public String getEx21() {
		return ex21;
	}

	public void setEx21(String ex21) {
		this.ex21 = ex21;
	}

	public Ex22 getEx22() {
		return ex22;
	}

	public void setEx22(Ex22 ex22) {
		this.ex22 = ex22;
	}

	public String getEx23() {
		return ex23;
	}

	public void setEx23(String ex23) {
		this.ex23 = ex23;
	}

	public Ex24 getEx24() {
		return ex24;
	}

	public void setEx24(Ex24 ex24) {
		this.ex24 = ex24;
	}

	public String getEx25() {
		return ex25;
	}

	public void setEx25(String ex25) {
		this.ex25 = ex25;
	}

	public String getEx26() {
		return ex26;
	}

	public void setEx26(String ex26) {
		this.ex26 = ex26;
	}

	public String getEx27() {
		return ex27;
	}

	public void setEx27(String ex27) {
		this.ex27 = ex27;
	}

	public Ex28 getEx28() {
		return ex28;
	}

	public void setEx28(Ex28 ex28) {
		this.ex28 = ex28;
	}

	public String getEx29() {
		return ex29;
	}

	public void setEx29(String ex29) {
		this.ex29 = ex29;
	}

	public Ex30 getEx30() {
		return ex30;
	}

	public void setEx30(Ex30 ex30) {
		this.ex30 = ex30;
	}

	public Ex31 getEx31() {
		return ex31;
	}

	public void setEx31(Ex31 ex31) {
		this.ex31 = ex31;
	}

	public Ex32 getEx32() {
		return ex32;
	}

	public void setEx32(Ex32 ex32) {
		this.ex32 = ex32;
	}

	public String getEx33() {
		return ex33;
	}

	public void setEx33(String ex33) {
		this.ex33 = ex33;
	}

	public String getEx34() {
		return ex34;
	}

	public void setEx34(String ex34) {
		this.ex34 = ex34;
	}

	public String getEx35() {
		return ex35;
	}

	public void setEx35(String ex35) {
		this.ex35 = ex35;
	}

	public String getEx36() {
		return ex36;
	}

	public void setEx36(String ex36) {
		this.ex36 = ex36;
	}

	public Ex37 getEx37() {
		return ex37;
	}

	public void setEx37(Ex37 ex37) {
		this.ex37 = ex37;
	}

	public Boolean getEx38() {
		return ex38;
	}

	public void setEx38(Boolean ex38) {
		this.ex38 = ex38;
	}

	public Ex39 getEx39() {
		return ex39;
	}

	public void setEx39(Ex39 ex39) {
		this.ex39 = ex39;
	}

	public Ex40 getEx40() {
		return ex40;
	}

	public void setEx40(Ex40 ex40) {
		this.ex40 = ex40;
	}

	public Ex41 getEx41() {
		return ex41;
	}

	public void setEx41(Ex41 ex41) {
		this.ex41 = ex41;
	}

	public Ex42 getEx42() {
		return ex42;
	}

	public void setEx42(Ex42 ex42) {
		this.ex42 = ex42;
	}

	public Ex43 getEx43() {
		return ex43;
	}

	public void setEx43(Ex43 ex43) {
		this.ex43 = ex43;
	}

	public Ex44 getEx44() {
		return ex44;
	}

	public void setEx44(Ex44 ex44) {
		this.ex44 = ex44;
	}

	public Ex45 getEx45() {
		return ex45;
	}

	public void setEx45(Ex45 ex45) {
		this.ex45 = ex45;
	}

	public Ex46 getEx46() {
		return ex46;
	}

	public void setEx46(Ex46 ex46) {
		this.ex46 = ex46;
	}

	public Ex47 getEx47() {
		return ex47;
	}

	public void setEx47(Ex47 ex47) {
		this.ex47 = ex47;
	}

	public Ex48 getEx48() {
		return ex48;
	}

	public void setEx48(Ex48 ex48) {
		this.ex48 = ex48;
	}

	public Ex49 getEx49() {
		return ex49;
	}

	public void setEx49(Ex49 ex49) {
		this.ex49 = ex49;
	}

	public Ex50 getEx50() {
		return ex50;
	}

	public void setEx50(Ex50 ex50) {
		this.ex50 = ex50;
	}

	public Ex51 getEx51() {
		return ex51;
	}

	public void setEx51(Ex51 ex51) {
		this.ex51 = ex51;
	}

	public Ex52 getEx52() {
		return ex52;
	}

	public void setEx52(Ex52 ex52) {
		this.ex52 = ex52;
	}

	public Ex53 getEx53() {
		return ex53;
	}

	public void setEx53(Ex53 ex53) {
		this.ex53 = ex53;
	}

	public String getEx54() {
		return ex54;
	}

	public void setEx54(String ex54) {
		this.ex54 = ex54;
	}

	public Ex55 getEx55() {
		return ex55;
	}

	public void setEx55(Ex55 ex55) {
		this.ex55 = ex55;
	}

	public Ex56 getEx56() {
		return ex56;
	}

	public void setEx56(Ex56 ex56) {
		this.ex56 = ex56;
	}

	public Ex57 getEx57() {
		return ex57;
	}

	public void setEx57(Ex57 ex57) {
		this.ex57 = ex57;
	}

	public Ex58 getEx58() {
		return ex58;
	}

	public void setEx58(Ex58 ex58) {
		this.ex58 = ex58;
	}

	public Boolean getEx59() {
		return ex59;
	}

	public void setEx59(Boolean ex59) {
		this.ex59 = ex59;
	}

	public Ex60 getEx60() {
		return ex60;
	}

	public void setEx60(Ex60 ex60) {
		this.ex60 = ex60;
	}

	public Ex61 getEx61() {
		return ex61;
	}

	public void setEx61(Ex61 ex61) {
		this.ex61 = ex61;
	}

	public Ex62 getEx62() {
		return ex62;
	}

	public void setEx62(Ex62 ex62) {
		this.ex62 = ex62;
	}

	public Ex63 getEx63() {
		return ex63;
	}

	public void setEx63(Ex63 ex63) {
		this.ex63 = ex63;
	}

	public Ex64 getEx64() {
		return ex64;
	}

	public void setEx64(Ex64 ex64) {
		this.ex64 = ex64;
	}

	public String getEx65() {
		return ex65;
	}

	public void setEx65(String ex65) {
		this.ex65 = ex65;
	}

	public String getEx66() {
		return ex66;
	}

	public void setEx66(String ex66) {
		this.ex66 = ex66;
	}

	public String getEx67() {
		return Ex67;
	}

	public void setEx67(String ex67) {
		Ex67 = ex67;
	}

	public Ex68 getEx68() {
		return ex68;
	}

	public void setEx68(Ex68 ex68) {
		this.ex68 = ex68;
	}
}
