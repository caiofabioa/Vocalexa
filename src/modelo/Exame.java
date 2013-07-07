package modelo;

import java.util.Date;

public class Exame {
	
    int id;

    Pessoa pessoa;
    
    Date Ex_data;
    public static final String Ex01 = "Histórico Pessoal:";
    /*------------------------------------------------------------------------*/
    //As variações de humor alteram a voz
    public static final String Ex02 = "As variações de humor alteram a voz:";
    /*------------------------------------------------------------------------*/ 
    //Ao fim do dia, sua voz esta
    public static final String Ex03 = "";
    /*------------------------------------------------------------------------*/ 
    //os gargarejos melhoram a voz
    public static final String Ex04 = "";
    /*------------------------------------------------------------------------*/ 
    //As pessoas costumam dizer que
    public static final String Ex05 = "";
    /*------------------------------------------------------------------------*/ 
    //Como você ouve sua voz
    public static final String Ex06 = "";
    /*------------------------------------------------------------------------*/ 
    //Gosta dela? Porquê?
    public static final String Ex07 = "";
    /*------------------------------------------------------------------------*/ 
    //Alguem em sua família apresenta algum problema vocal? Qual?
    public static final String Ex08 = "";
    /*------------------------------------------------------------------------*/ 
    //A sua voz parece mais com
    public static final String Ex09 = "";
    /*------------------------------------------------------------------------*/ 
    //Observação
    public static final String Ex10 = "";
    /*------------------------------------------------------------------------*/ 
    //Ja apresentou quadros de
    //Laringite
    public static final String Ex11_01_01 = "";
    //Quando
    public static final String Ex11_01_02 = "";
    //Frequencia
    public static final String Ex11_01_03 = "";
    //Providencias
    public static final String Ex11_01_04 = "";
    //Faringite
    public static final String Ex11_02_01 = "";
    //Quando
    public static final String Ex11_02_02 = "";
    //Frequencia
    public static final String Ex11_02_03 = "";
    //Providencias
    public static final String Ex11_02_04 = "";
    //Amigdalite
    public static final String Ex11_03_01 = "";
    //Quando
    public static final String Ex11_03_02 = "";
    //Frequencia
    public static final String Ex11_03_03 = "";
    //Providencias
    public static final String Ex11_03_04 = "";
    //Alergia
    public static final String Ex11_04_01 = "";
    //Quando
    public static final String Ex11_04_02 = "";
    //Frequencia
    public static final String Ex11_04_03 = "";
    //Providencias
    public static final String Ex11_04_04 = "";
    //Distúrbios glandulares e ou hormonais
    public static final String Ex11_05_01 = "";
    //Quando
    public static final String Ex11_05_02 = "";
    //Frequencia
    public static final String Ex11_05_03 = "";
    //Providencias
    public static final String Ex11_05_04 = "";
    //Afonia Total
    public static final String Ex11_06_01 = "";
    //Quando
    public static final String Ex11_06_02 = "";
    //Frequencia
    public static final String Ex11_06_03 = "";
    //Providencias
    public static final String Ex11_06_04 = "";
    //Problemas têmporo-mandibulares
    public static final String Ex11_07_01 = "";
    //Quando
    public static final String Ex11_07_02 = "";
    //Frequencia
    public static final String Ex11_07_03 = "";
    //Providencias
    public static final String Ex11_07_04 = "";
    //Disfônia com duração de mais de 03 dias
    public static final String Ex11_08_01 = "";
    //Quando
    public static final String Ex11_08_02 = "";
    //Frequencia
    public static final String Ex11_08_03 = "";
    //Providencias
    public static final String Ex11_08_04 = "";
    //Rouquidão após um longo período de fala (jogos/shows...)
    public static final String Ex11_09_01 = "";
    //Quando
    public static final String Ex11_09_02 = "";
    //Frequencia
    public static final String Ex11_09_03 = "";
    //Providencias
    public static final String Ex11_09_04 = "";
    //Resfriados frequentes
    public static final String Ex11_10_01 = "";
    //Quando
    public static final String Ex11_10_02 = "";
    //Frequencia
    public static final String Ex11_10_03 = "";
    //Providencias
    public static final String Ex11_10_04 = "";
    /*------------------------------------------------------------------------*/ 
    //Ao falar sente
    
    public static final String Ex12 = "";
    /*------------------------------------------------------------------------*/ 
    //pratica atividades físicas?
    
    public static final String Ex13 = "";
    /*------------------------------------------------------------------------*/ 
    //Hábitos de vida diária (alteram a voz)
    
    public static final String Ex14 = "";
    /*------------------------------------------------------------------------*/ 
    //Observação
    
    public static final String Ex15 = "";
    /*------------------------------------------------------------------------*/ 
    //Frequenta festas, bailes, lugares que tocam musicas altas? com que frequencia?
    
    public static final String Ex16 = "";
    /*------------------------------------------------------------------------*/ 
    //Gosta de cantar, já participou de atividade que envolvam canto? Cite
    
    public static final String Ex17 = "";
    /*------------------------------------------------------------------------*/ 
    //Uso de medicamentos contínuos
    
    public static final String Ex17_1 = "";
    /*------------------------------------------------------------------------*/ 
    //Em casa
    
    public static final String Ex18 = "";
    /*------------------------------------------------------------------------*/ 
    //No trabalho
    
    public static final String Ex19 = "";
    /*------------------------------------------------------------------------*/ 
    //No caso de ser profissional da voz, fala, em media, quantas horas por dia?
    
    public static final String Ex20 = "";
    /*------------------------------------------------------------------------*/ 
    //Características pessoais
    
    public static final String Ex21 = "";
    /*------------------------------------------------------------------------*/ 
    //Fica Exposto ao ar condicionado fora do ambiente lavoral?
    
    public static final String Ex22 = "";
    /*------------------------------------------------------------------------*/ 
    //Antecedentes Pessoais
    
    public static final String Ex23 = "";
     /*------------------------------------------------------------------------*/
    //Traumas recentes
    
    public static final String Ex24 = "";
     /*------------------------------------------------------------------------*/
    //Alguma associação do trauma com a voz
    
    public static final String Ex25 = "";
     /*------------------------------------------------------------------------*/
    //outras relações do emocional com a voz
    
    public static final String Ex26 = "";
     /*------------------------------------------------------------------------*/
    //Hábitos alimentares
    
    public static final String Ex27 = "";
     /*------------------------------------------------------------------------*/
    //Ao ter que se apresentar/debater um assunto frente a um gurpo/platéia
    //qual a sua reação vocal
    
    public static final String Ex28 = "";
    /*------------------------------------------------------------------------*/
    //Convivência Social
    
    public static final String Ex29 = "";
     /*------------------------------------------------------------------------*/
    //Relaxa
    
    public static final String Ex30 = "";
     /*------------------------------------------------------------------------*/
    //Sono
    
    public static final String Ex31 = "";
     /*------------------------------------------------------------------------*/
    //Vestuário
    
    public static final String Ex32 = "";
     /*------------------------------------------------------------------------*/
    //Observações
    
    public static final String Ex33 = "";
     /*------------------------------------------------------------------------*/
    //Contato Visual
    
    public static final String Ex34 = "";
     /*------------------------------------------------------------------------*/
    //Impressões Pessoais
    
    public static final String Ex35 = "";
     /*------------------------------------------------------------------------*/
    //Tipo de voz
    
    public static final String Ex36 = "";
     /*------------------------------------------------------------------------*/
    //Alteração da voz com movimento de cabeça
    
    public static final String Ex37 = "";
     /*------------------------------------------------------------------------*/
    //Sistema de ressonancia
    
    public static final String Ex38 = "";
    /*------------------------------------------------------------------------*/
    //Ataque vocal
    
    public static final String Ex39 = "";
    /*------------------------------------------------------------------------*/
    //Qualidade de emissão
    
    public static final String Ex40 = "";
    /*------------------------------------------------------------------------*/
    //Pitch
    
    public static final String Ex41 = "";
    /*------------------------------------------------------------------------*/
    //Loudness (Sensação psicofísica da intensidade vocal)
    
    public static final String Ex42 = "";
    /*------------------------------------------------------------------------*/
    //modulação da intensidade
    
    public static final String Ex43 = "";
    /*------------------------------------------------------------------------*/
    //Articulação
    
    public static final String Ex44 = "";
    /*------------------------------------------------------------------------*/
    //Distúrbios articulatório
    
    public static final String Ex45 = "";
    /*------------------------------------------------------------------------*/
    //CPFA
    
    public static final String Ex46 = "";
    /*------------------------------------------------------------------------*/
    //Pronuncia
    
    public static final String Ex47 = "";
    /*------------------------------------------------------------------------*/
    //Velocidade de fala
    
    public static final String Ex48 = "";
    /*------------------------------------------------------------------------*/
    //Ritmo
    
    public static final String Ex49 = "";
    /*------------------------------------------------------------------------*/
    //Energia da emissão
    
    public static final String Ex50 = "";
    /*------------------------------------------------------------------------*/
    //Entonação
    
    public static final String Ex51 = "";
    /*------------------------------------------------------------------------*/
    //Resistência vocal (não mantém)
    
    public static final String Ex52 = "";
    /*------------------------------------------------------------------------*/
    //Parou o teste ante do fim?
    
    public static final String Ex53 = "";
     /*------------------------------------------------------------------------*/
    //Dinâmica respiratória
    
    public static final String Ex54 = "";
     /*------------------------------------------------------------------------*/
    //Tipo
    
    public static final String Ex55 = "";
     /*------------------------------------------------------------------------*/
    //Modo
    
    public static final String Ex56 = "";
     /*------------------------------------------------------------------------*/
    //Estrutura de fonação
    
    public static final String Ex57 = "";
     /*------------------------------------------------------------------------*/
    //Apresenta alteração vocal após a manipulação digital de laringe?
    
    public static final String Ex58 = "";
     /*------------------------------------------------------------------------*/
    //Avaliação Corporal - hipertonicidade
    
    public static final String Ex59 = "";
     /*------------------------------------------------------------------------*/
    //Fluência da Fala
    
    public static final String Ex60 = "";
     /*------------------------------------------------------------------------*/
    //Construção Sintática
    
    public static final String Ex61 = "";
     /*------------------------------------------------------------------------*/
    //Expressão de Idéias
    
    public static final String Ex62 = "";
     /*------------------------------------------------------------------------*/
    //Tempo maximo de fonação
    
    // /a/
    public static final String Ex63_a1 = "";
    
    public static final String Ex63_a2 = "";
    
    public static final String Ex63_a3 = "";
    
    public static final String Ex63_a4 = "";
    
    // /i/
    public static final String Ex63_i1 = "";
    
    public static final String Ex63_i2 = "";
    
    public static final String Ex63_i3 = "";
    
    public static final String Ex63_i4 = "";
    
    // /u/
    public static final String Ex63_u1 = "";
    
    public static final String Ex63_u2 = "";
    
    public static final String Ex63_u3 = "";
    
    public static final String Ex63_u4 = "";
    
    // /s/
    public static final String Ex63_s1 = "";
    
    public static final String Ex63_s2 = "";
    
    public static final String Ex63_s3 = "";
    
    public static final String Ex63_s4 = "";
    
    // /z/
    public static final String Ex63_z1 = "";
    
    public static final String Ex63_z2 = "";
    
    public static final String Ex63_z3 = "";
    
    public static final String Ex63_z4 = "";
    
    //numero
    public static final String Ex63_n = "";
    
    //segundo
    public static final String Ex63_s = "";
    
    //Resultados
    public static final String Ex63 = "";
    /*----------------------------------------------------------------------*/
    
    //Sugestivo de
    public static final String Ex64 = "";
    /*----------------------------------------------------------------------*/
    
    //Parecer Fonoaudiológico
    public static final String Ex65 = "";
     /*----------------------------------------------------------------------*/
    
    //Conduta
    public static final String Ex66 = "";
     /*----------------------------------------------------------------------*/
    
	//Resultado
    public static final String Ex67 = "";
     /*----------------------------------------------------------------------*/
   
	//Resultado
    public static final String Ex68 = "";

    /**
     * ***************************
     * ***************************
     * **  GETTERS AND SETTERS  **
     * ***************************
     * ***************************
     */
}
