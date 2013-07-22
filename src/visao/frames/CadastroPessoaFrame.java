package visao.frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import modelo.Pessoa;
import utils.CfaCampoTexto;
import utils.CfaUnicaEscolha;
import controle.messages.I18NMessages;

@SuppressWarnings("serial")
public class CadastroPessoaFrame extends JFrame {
	private static final String RAWTYPES = "rawtypes";

	public static I18NMessages cfaMessages = new I18NMessages();

	public static int indice = 0;
	final static String PF = "Pessoa Física";
	final static String PJ = "Pessoa Jurídica";

	JPanel contentPane;
	final JPanel panel_1 = new JPanel();
	/**
	 * BOTÕES DE UNICA ESCOLHA
	 */
	protected final CfaUnicaEscolha rdbtnPessoaFisica = new CfaUnicaEscolha(
			cfaMessages.appGetMessage("frame.cadastro.pessoa.pf"));
	protected final CfaUnicaEscolha rdbtnPessoaJurdica = new CfaUnicaEscolha(
			cfaMessages.appGetMessage("frame.cadastro.pessoa.pj"));
	/**
	 * CAMPOS DE TEXTO
	 */
	protected final CfaCampoTexto tfId = new CfaCampoTexto();
	protected final CfaCampoTexto tfNomeRS = new CfaCampoTexto();
	protected final CfaCampoTexto sbTxtAtual = new CfaCampoTexto();
	protected final CfaCampoTexto sbTxtBarra = new CfaCampoTexto();
	protected final CfaCampoTexto sbTxtTotal = new CfaCampoTexto();
	protected final CfaCampoTexto tfCracha = new CfaCampoTexto();
	protected final CfaCampoTexto tfFuncao = new CfaCampoTexto();
	protected final CfaCampoTexto tfSetor = new CfaCampoTexto();
	protected final CfaCampoTexto tfLider = new CfaCampoTexto();
	protected final CfaCampoTexto tfGerencia = new CfaCampoTexto();
	/**
	 * CAMPOS DE TEXTOS FORMATADOS
	 */
	protected final JFormattedTextField tfDataNascimento = new JFormattedTextField();
	protected final JFormattedTextField tfTelefone = new JFormattedTextField();
	protected final JFormattedTextField tfRg = new JFormattedTextField();
	/**
	 * Campos ComboBox
	 */
	@SuppressWarnings(RAWTYPES)
	protected final JComboBox cbTipoVinculo = new JComboBox();
	@SuppressWarnings(RAWTYPES)
	protected final JComboBox cbSexo = new JComboBox();

	public static Integer TipoVinculoCombo;

	public final static ButtonGroup tipoPessoa = new ButtonGroup();
	/**
	 * LABELS / TÍTULOS
	 */
	public static JLabel lblId = new JLabel(
			cfaMessages.appGetMessage("frame.cadastro.pessoa.id"));
	public static JLabel lblTipo = new JLabel(
			cfaMessages.appGetMessage("frame.cadastro.pessoa.tipo.vinculo"));
	public static JLabel lblNome = new JLabel(
			cfaMessages.appGetMessage("frame.cadastro.pessoa.nome"));
	public static JLabel lblCadastroDePessoas;
	final static JLabel lblRg = new JLabel(
			cfaMessages.appGetMessage("frame.cadastro.pessoa.rg"));
	final static JLabel lblCracha = new JLabel(
			cfaMessages.appGetMessage("frame.cadastro.pessoa.cracha"));
	final static JLabel lblGerente = new JLabel(
			cfaMessages.appGetMessage("frame.cadastro.pessoa.funcao"));
	final static JLabel lblSetor = new JLabel(
			cfaMessages.appGetMessage("frame.cadastro.pessoa.setor"));
	final static JLabel lblLider = new JLabel(
			cfaMessages.appGetMessage("frame.cadastro.pessoa.lider"));
	final static JLabel lblGerencia = new JLabel(
			cfaMessages.appGetMessage("frame.cadastro.pessoa.gerencia"));
	final static JLabel lblTipoVinculo = new JLabel(
			cfaMessages.appGetMessage("frame.cadastro.pessoa.vinculo"));
	final static JToolBar tbBotoes = new JToolBar();
	/**
	 * BOTÕES
	 */
	protected static JButton sbBtnPrimeiro = new JButton("");
	protected static JButton sbBtnProximo = new JButton("");
	protected static JButton sbBtnUltimo = new JButton("");
	protected static JButton btnNovoRegistro = new JButton("");
	protected static JButton sbBtnAnterior = new JButton("");
	protected static JButton btnSalvarRegistro = new JButton("");
	protected static JButton btnFecharJanela = new JButton("");
	protected static JButton btnAlterarCadastro = new JButton("");

	Pessoa pessoa = new Pessoa();
	private final JPanel panel_2 = new JPanel();
	private final JButton button = new JButton("...");

	/**
	 * Create the frame.
	 * 
	 * @throws Exception
	 */
	public CadastroPessoaFrame() throws Exception {
		super();
		setLocationRelativeTo(null);
		this.setLocationRelativeTo(null);
 		setTitle(cfaMessages.appGetMessage("frame.cadastro.pessoa.titulo"));
		setResizable(false);
		// seta a visibilidade da janela
		setVisible(true);
		getFrame();
	}

	@SuppressWarnings({ "unchecked", RAWTYPES })
	private void getFrame() throws Exception {
		tfGerencia.setEnabled(false);
		tfGerencia.setBounds(151, 320, 253, 20);
		tfGerencia.setColumns(10);
		tfLider.setEnabled(false);
		tfLider.setBounds(151, 295, 253, 20);
		tfLider.setColumns(10);
		tfSetor.setEnabled(false);
		tfSetor.setBounds(151, 270, 253, 20);
		tfSetor.setColumns(10);
		tfFuncao.setEnabled(false);
		tfFuncao.setBounds(151, 245, 253, 20);
		tfFuncao.setColumns(10);
		tfDataNascimento.setEnabled(false);
		tfDataNascimento.setBounds(151, 95, 253, 20);
		tfDataNascimento.setColumns(10);
		tfDataNascimento
				.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
						new javax.swing.text.MaskFormatter("##/##/####")));
		tfCracha.setEnabled(false);
		tfCracha.setBounds(151, 220, 253, 20);
		tfCracha.setColumns(10);
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				CadastroPessoaFrame.class
						.getResource("/imagens/LOGO_pequeno_icon.fw.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 440, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 440, 96);
		contentPane.add(panel);
		panel.setLayout(null);

		// Definindo a Label
		{
			lblCadastroDePessoas = new JLabel("Cadastro de Pessoas");
			lblCadastroDePessoas.setBounds(10, 11, 420, 60);
			lblCadastroDePessoas.setFont(new Font("Rockwell", Font.BOLD, 16));
			lblCadastroDePessoas.setIcon(new ImageIcon(CadastroPessoaFrame.class
					.getResource("/imagens/LOGO_pequeno.fw.png")));
			panel.add(lblCadastroDePessoas);
		}
		{
			panel_1.setBorder(new TitledBorder(new EtchedBorder(
					EtchedBorder.LOWERED, null, null), "Cadastro de Pessoas",
					TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setBounds(10, 139, 414, 361);
			contentPane.add(panel_1);
			panel_1.setLayout(null);

			tfId.setEditable(false);
			tfId.setBounds(151, 20, 253, 20);
			panel_1.add(tfId);
			tfId.setColumns(10);
		}
		{
			rdbtnPessoaFisica.setEnabled(false);
			rdbtnPessoaFisica.setSelected(true);
			rdbtnPessoaFisica.setName(String.valueOf(Pessoa.tipoVinculoPF));
			rdbtnPessoaFisica.setBounds(151, 170, 120, 23);
			panel_1.add(rdbtnPessoaFisica);
		}
		{
			rdbtnPessoaJurdica.setEnabled(false);
			rdbtnPessoaJurdica.setBounds(284, 170, 120, 23);
			rdbtnPessoaJurdica.setName(String.valueOf(Pessoa.tipoVinculoPJ));
			panel_1.add(rdbtnPessoaJurdica);
		}
		{
			tipoPessoa.add(rdbtnPessoaFisica);
			tipoPessoa.add(rdbtnPessoaJurdica);
			rdbtnPessoaFisica.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					TipoVinculoCombo = Pessoa.tipoVinculoPF;
				}
			});
			rdbtnPessoaJurdica.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					TipoVinculoCombo = Pessoa.tipoVinculoPJ;
				}
			});
		}
		tfNomeRS.setEnabled(false);

		tfNomeRS.setBounds(151, 45, 253, 20);
		panel_1.add(tfNomeRS);
		tfNomeRS.setColumns(10);

		lblTipo.setBounds(10, 175, 131, 14);
		panel_1.add(lblTipo);

		lblNome.setBounds(10, 50, 131, 15);
		panel_1.add(lblNome);

		lblId.setBounds(10, 25, 131, 15);
		panel_1.add(lblId);
		lblTipoVinculo.setBounds(10, 200, 131, 14);

		panel_1.add(lblTipoVinculo);
		cbTipoVinculo.setEnabled(false);
		cbTipoVinculo.setBounds(151, 195, 230, 20);

		panel_1.add(cbTipoVinculo);
		lblRg.setBounds(10, 75, 46, 14);

		panel_1.add(lblRg);
		lblCracha.setBounds(10, 225, 131, 14);

		panel_1.add(lblCracha);

		panel_1.add(tfCracha);
		tfRg.setEnabled(false);

		tfRg.setBounds(151, 70, 253, 20);
		try {
			tfRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
					new javax.swing.text.MaskFormatter("##.###.###-#")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		panel_1.add(tfRg);
		lblGerente.setBounds(10, 250, 131, 14);

		panel_1.add(lblGerente);
		lblSetor.setBounds(10, 275, 131, 14);

		panel_1.add(lblSetor);
		lblLider.setBounds(10, 300, 131, 14);

		panel_1.add(lblLider);
		lblGerencia.setBounds(10, 325, 131, 14);

		panel_1.add(lblGerencia);

		JLabel lblNewLabel_3 = new JLabel("Data nascimento:");
		lblNewLabel_3.setBounds(10, 100, 134, 14);
		panel_1.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Sexo:");
		lblNewLabel_4.setBounds(10, 125, 46, 14);
		panel_1.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Telefone:");
		lblNewLabel_5.setBounds(10, 150, 131, 14);
		panel_1.add(lblNewLabel_5);

		panel_1.add(tfDataNascimento);
		cbSexo.setEnabled(false);
		cbSexo.setModel(new DefaultComboBoxModel(new String[] { "Feminino",
				"Masculino" }));
		cbSexo.setBounds(151, 120, 253, 20);

		panel_1.add(cbSexo);
		tfTelefone.setEnabled(false);
		tfTelefone.setBounds(151, 145, 253, 20);
		tfTelefone
				.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
						new javax.swing.text.MaskFormatter("(##) ####-####")));

		panel_1.add(tfTelefone);

		panel_1.add(tfFuncao);

		panel_1.add(tfSetor);

		panel_1.add(tfLider);

		panel_1.add(tfGerencia);
		tbBotoes.setFloatable(false);
		tbBotoes.setBounds(255, 505, 169, 40);

		contentPane.add(tbBotoes);
		// Botão novo Registro
		btnNovoRegistro.setToolTipText("Adicionar mais um registro");
		btnNovoRegistro.setIcon(new ImageIcon(CadastroPessoaFrame.class
				.getResource("/imagens/vocalexa32x32/ico_pessoa (3).png")));
		tbBotoes.add(btnNovoRegistro);

		// Botão Fechar Janela
		btnFecharJanela.setToolTipText("Sair");

		btnAlterarCadastro.setIcon(new ImageIcon(CadastroPessoaFrame.class
				.getResource("/imagens/vocalexa32x32/ico_pessoa (8).png")));

		tbBotoes.add(btnAlterarCadastro);

		// Botão Salvar Registro
		btnSalvarRegistro.setToolTipText("Salvar registro");
		btnSalvarRegistro
				.setIcon(new ImageIcon(
						CadastroPessoaFrame.class
								.getResource("/imagens/vocalexa32x32/Actions-document-save-icon.png")));
		tbBotoes.add(btnSalvarRegistro);
		btnFecharJanela
				.setIcon(new ImageIcon(
						CadastroPessoaFrame.class
								.getResource("/imagens/vocalexa32x32/Actions-system-shutdown-icon.png")));
		tbBotoes.add(btnFecharJanela);

		rdbtnPessoaFisica.setValue(PF);
		rdbtnPessoaJurdica.setValue(PJ);
		button.setBounds(384, 194, 20, 20);
		
		panel_1.add(button);
		panel_2.setBounds(10, 105, 226, 23);

		contentPane.add(panel_2);
		panel_2.setLayout(null);
		sbBtnPrimeiro.setBounds(0, 0, 23, 23);
		sbBtnPrimeiro.setBorderPainted(false);
		sbBtnPrimeiro.setContentAreaFilled(false); 
		panel_2.add(sbBtnPrimeiro);
		sbBtnPrimeiro
				.setIcon(new ImageIcon(
						CadastroPessoaFrame.class
								.getResource("/imagens/vocalexa16x16/Arrows-Left-circular-icon.png")));
		sbBtnAnterior.setBounds(23, 0, 23, 23);
		sbBtnAnterior.setBorderPainted(false);
		sbBtnAnterior.setContentAreaFilled(false);
		panel_2.add(sbBtnAnterior);
		sbBtnAnterior
				.setIcon(new ImageIcon(
						CadastroPessoaFrame.class
								.getResource("/imagens/vocalexa16x16/Arrows-Left-round-icon.png")));
		sbTxtAtual.setBounds(46, 0, 53, 23);
		panel_2.add(sbTxtAtual);
		sbTxtAtual.setHorizontalAlignment(SwingConstants.CENTER);

		sbTxtAtual.setEnabled(false);

		sbTxtAtual.setEditable(false);

		sbTxtAtual.setColumns(10);

		sbTxtAtual.setBorder(null);
		sbTxtBarra.setBounds(99, 0, 16, 23);
		panel_2.add(sbTxtBarra);
		sbTxtBarra.setHorizontalAlignment(SwingConstants.CENTER);
		sbTxtBarra.setEnabled(false);
		sbTxtBarra.setEditable(false);
		sbTxtBarra.setColumns(3);

		sbTxtBarra.setText("/");
		sbTxtBarra.setBorder(null);
		sbTxtTotal.setBounds(115, 0, 53, 23);
		panel_2.add(sbTxtTotal);
		sbTxtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		sbTxtTotal.setEnabled(false);
		sbTxtTotal.setEditable(false);
		sbTxtTotal.setColumns(10);
		sbTxtTotal.setBorder(null);
		sbBtnProximo.setBounds(168, 0, 23, 23);
		sbBtnProximo.setBorderPainted(false);
		sbBtnProximo.setContentAreaFilled(false); 
		panel_2.add(sbBtnProximo);
		sbBtnProximo
				.setIcon(new ImageIcon(
						CadastroPessoaFrame.class
								.getResource("/imagens/vocalexa16x16/Arrows-Right-round-icon.png")));
		sbBtnUltimo.setBounds(191, 0, 23, 23);
		sbBtnUltimo.setBorderPainted(false);
		sbBtnUltimo.setContentAreaFilled(false); 
		panel_2.add(sbBtnUltimo);
		sbBtnUltimo
				.setIcon(new ImageIcon(
						CadastroPessoaFrame.class
								.getResource("/imagens/vocalexa16x16/Arrows-Right-circular-icon.png")));
		
	}

	/**
	 * METODOS
	 */
	public void habilitaCampos(Boolean set) {
		this.rdbtnPessoaFisica.setEnabled(set);
		this.rdbtnPessoaJurdica.setEnabled(set);
		this.tfCracha.setEnabled(set);
		this.tfDataNascimento.setEnabled(set);
		this.tfFuncao.setEnabled(set);
		this.tfGerencia.setEnabled(set);
		this.tfLider.setEnabled(set);
		this.tfNomeRS.setEnabled(set);
		this.tfRg.setEnabled(set);
		this.tfSetor.setEnabled(set);
		this.tfTelefone.setEnabled(set);
		this.cbSexo.setEnabled(set);
	}

	public void alterarCadastro() {
		habilitaCampos(true);
		if (rdbtnPessoaJurdica.isSelected()) {
			cbTipoVinculo.setEnabled(true);
		}
	}

	public void salvarCadastro() {

	}
}
