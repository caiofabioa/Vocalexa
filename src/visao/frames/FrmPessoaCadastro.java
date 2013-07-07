package visao.frames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

import controle.ControleEntidade;
import controle.GetDadosFrmCadastroPessoa;
import controle.messages.I18NMessages;

import modelo.Pessoa;
import javax.swing.DefaultComboBoxModel;


@SuppressWarnings("serial")
public class FrmPessoaCadastro extends JFrame {
public static I18NMessages cfaMessages = new I18NMessages();

	public static int indice = 0;

	final JPanel contentPane;
	final JPanel panel_1 = new JPanel();
	final JRadioButton rdbtnPessoaFisica = new JRadioButton(cfaMessages.appGetMessage("frame.cadastro.pessoa.pf"));
	final JRadioButton rdbtnPessoaJurdica = new JRadioButton(cfaMessages.appGetMessage("frame.cadastro.pessoa.pj"));

	public final static JTextField tfId = new JTextField();
	public final static JTextField tfNomeRS = new JTextField();
	public final static JTextField sbTxtAtual = new JTextField();
	public final static JTextField sbTxtBarra = new JTextField();
	public final static JTextField sbTxtTotal = new JTextField();
	public final static JTextField tfCracha = new JTextField();
	public final static JTextField tfFuncao = new JTextField();
	public final static JTextField tfSetor = new JTextField();
	public final static JTextField tfLider = new JTextField();
	public final static JTextField tfGerencia = new JTextField();
	public final static JFormattedTextField tfDataNascimento = new JFormattedTextField();
	public final static JFormattedTextField tfTelefone = new JFormattedTextField();
	public final static JFormattedTextField tfRg = new JFormattedTextField();
	public final static JComboBox cbTipoVinculo = new JComboBox();
	public final static JComboBox cbSexo = new JComboBox();
	
	public static Integer TipoVinculoCombo;

	public final static ButtonGroup tipoPessoa = new ButtonGroup();

	public static JLabel lblId = new JLabel(cfaMessages.appGetMessage("frame.cadastro.pessoa.id"));
	public static JLabel lblTipo = new JLabel(cfaMessages.appGetMessage("frame.cadastro.pessoa.tipo.vinculo"));
	public static JLabel lblNome = new JLabel(cfaMessages.appGetMessage("frame.cadastro.pessoa.nome"));
	public static JLabel lblCadastroDePessoas;
	final static JLabel lblRg = new JLabel(cfaMessages.appGetMessage("frame.cadastro.pessoa.rg"));
	final static JLabel lblCracha = new JLabel(cfaMessages.appGetMessage("frame.cadastro.pessoa.cracha"));
	final static JLabel lblGerente = new JLabel(cfaMessages.appGetMessage("frame.cadastro.pessoa.funcao"));
	final static JLabel lblSetor = new JLabel(cfaMessages.appGetMessage("frame.cadastro.pessoa.setor"));
	final static JLabel lblLider = new JLabel(cfaMessages.appGetMessage("frame.cadastro.pessoa.lider"));
	final static JLabel lblGerencia = new JLabel(cfaMessages.appGetMessage("frame.cadastro.pessoa.gerencia"));
	final static JLabel lblTipoVinculo = new JLabel(cfaMessages.appGetMessage("frame.cadastro.pessoa.vinculo"));

	final static JToolBar tbControle = new JToolBar();
	final static JToolBar tbBotoes = new JToolBar();

	final static JButton sbBtnPrimeiro = new JButton("");
	final static JButton sbBtnProximo = new JButton("");
	final static JButton sbBtnUltimo = new JButton("");
	final static JButton btnNovoRegistro = new JButton("");
	final static JButton sbBtnAnterior = new JButton("");
	final static JButton btnSalvarRegistro = new JButton("");
	final static JButton btnFecharJanela = new JButton("");
	
	Pessoa pessoa = new Pessoa();
	

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public FrmPessoaCadastro() throws ParseException {
		super();
		setTitle(cfaMessages.appGetMessage("frame.cadastro.pessoa.titulo"));
		setResizable(false);
		GetDadosFrmCadastroPessoa.populaCampo();
		GetDadosFrmCadastroPessoa.populaComboVinculo();
		indice = Integer.parseInt(sbTxtTotal.getText());
		ValidFrmPessoaCadastro.validaTipoPessoa(false);
		tfGerencia.setBounds(151, 320, 253, 20);
		tfGerencia.setColumns(10);
		tfLider.setBounds(151, 295, 253, 20);
		tfLider.setColumns(10);
		tfSetor.setBounds(151, 270, 253, 20);
		tfSetor.setColumns(10);
		tfFuncao.setBounds(151, 245, 253, 20);
		tfFuncao.setColumns(10);
		tfDataNascimento.setBounds(151, 95, 253, 20);
		tfDataNascimento.setColumns(10);
		tfDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
				new javax.swing.text.MaskFormatter("##/##/####")));
		tfCracha.setBounds(151, 220, 253, 20);
		tfCracha.setColumns(10);
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				FrmPessoaCadastro.class
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

		{
			lblCadastroDePessoas = new JLabel("Cadastro de Pessoas");
			lblCadastroDePessoas.setBounds(10, 11, 232, 60);
			lblCadastroDePessoas.setFont(new Font("Rockwell", Font.BOLD, 16));
			lblCadastroDePessoas.setIcon(new ImageIcon(FrmPessoaCadastro.class
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
			rdbtnPessoaFisica.setSelected(true);
			rdbtnPessoaFisica.setName(String.valueOf(pessoa.tipoVinculoPF));
			rdbtnPessoaFisica.setBounds(151, 170, 120, 23);
			panel_1.add(rdbtnPessoaFisica);
		}
		{
			rdbtnPessoaJurdica.setBounds(284, 170, 120, 23);
			rdbtnPessoaJurdica.setName(String.valueOf(pessoa.tipoVinculoPJ));
			panel_1.add(rdbtnPessoaJurdica);
		}
		{
			tipoPessoa.add(rdbtnPessoaFisica);
			tipoPessoa.add(rdbtnPessoaJurdica);
			rdbtnPessoaFisica.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					ValidFrmPessoaCadastro.validaTipoPessoa(false);
					TipoVinculoCombo = pessoa.tipoVinculoPF;
				}
			});
			rdbtnPessoaJurdica.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ValidFrmPessoaCadastro.validaTipoPessoa(true);
					TipoVinculoCombo = pessoa.tipoVinculoPJ;
				}
			});
		}

		tfNomeRS.setBounds(151, 45, 253, 20);
		panel_1.add(tfNomeRS);
		tfNomeRS.setColumns(10);

		lblTipo.setBounds(10, 175, 131, 14);
		panel_1.add(lblTipo);

		lblNome.setBounds(10, 50, 131, 15);
		panel_1.add(lblNome);

		lblId.setBounds(13, 25, 131, 15);
		panel_1.add(lblId);
		lblTipoVinculo.setBounds(10, 200, 131, 14);

		panel_1.add(lblTipoVinculo);
		cbTipoVinculo.setBounds(151, 195, 253, 20);

		panel_1.add(cbTipoVinculo);
		lblRg.setBounds(10, 75, 46, 14);

		panel_1.add(lblRg);
		lblCracha.setBounds(10, 225, 131, 14);

		panel_1.add(lblCracha);

		panel_1.add(tfCracha);

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
		cbSexo.setModel(new DefaultComboBoxModel(new String[] {"Feminino", "Masculino"}));
		cbSexo.setBounds(151, 120, 253, 20);

		panel_1.add(cbSexo);
		tfTelefone.setBounds(151, 145, 253, 20);
		tfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
				new javax.swing.text.MaskFormatter("(##) ####-####")));

		panel_1.add(tfTelefone);

		panel_1.add(tfFuncao);

		panel_1.add(tfSetor);

		panel_1.add(tfLider);

		panel_1.add(tfGerencia);
		tbControle.setRollover(true);
		tbControle.setFloatable(false);

		tbControle.setBounds(10, 107, 218, 25);
		contentPane.add(tbControle);
		{
			sbBtnPrimeiro
					.setIcon(new ImageIcon(
							FrmPessoaCadastro.class
									.getResource("/imagens/vocalexa16x16/Arrows-Left-circular-icon.png")));
			tbControle.add(sbBtnPrimeiro);
			sbBtnAnterior
					.setIcon(new ImageIcon(
							FrmPessoaCadastro.class
									.getResource("/imagens/vocalexa16x16/Arrows-Left-round-icon.png")));
			tbControle.add(sbBtnAnterior);
		}
		{
			sbTxtAtual.setHorizontalAlignment(SwingConstants.CENTER);
			sbTxtAtual.setEnabled(false);
			sbTxtAtual.setEditable(false);
			tbControle.add(sbTxtAtual);
			sbTxtAtual.setColumns(10);
			sbTxtAtual.setBorder(null);
		}
		{
			sbTxtBarra.setHorizontalAlignment(SwingConstants.CENTER);
			sbTxtBarra.setEnabled(false);
			sbTxtBarra.setEditable(false);
			sbTxtBarra.setText("/");
			tbControle.add(sbTxtBarra);
			sbTxtBarra.setColumns(3);
			sbTxtBarra.setBorder(null);
		}
		{
			sbTxtTotal.setHorizontalAlignment(SwingConstants.CENTER);
			sbTxtTotal.setEnabled(false);
			sbTxtTotal.setEditable(false);
			tbControle.add(sbTxtTotal);
			sbTxtTotal.setColumns(10);
			sbTxtTotal.setBorder(null);
		}
		{
			sbBtnProximo
					.setIcon(new ImageIcon(
							FrmPessoaCadastro.class
									.getResource("/imagens/vocalexa16x16/Arrows-Right-round-icon.png")));
			tbControle.add(sbBtnProximo);
		}
		{
			sbBtnUltimo
					.setIcon(new ImageIcon(
							FrmPessoaCadastro.class
									.getResource("/imagens/vocalexa16x16/Arrows-Right-circular-icon.png")));
			tbControle.add(sbBtnUltimo);
			tbBotoes.setEnabled(false);
			tbBotoes.setRollover(true);
			tbBotoes.setBounds(294, 505, 130, 40);

			contentPane.add(tbBotoes);
			// Botão novo Registro
			btnNovoRegistro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GetDadosFrmCadastroPessoa.salvarPessoa();
				}
			});
			btnNovoRegistro.setToolTipText("Adicionar mais um registro");
			btnNovoRegistro.setIcon(new ImageIcon(FrmPessoaCadastro.class
					.getResource("/imagens/vocalexa32x32/ico_pessoa (3).png")));
			tbBotoes.add(btnNovoRegistro);
			btnSalvarRegistro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GetDadosFrmCadastroPessoa.listar();
				}
			});
			
			// Botão Salvar Registro
			btnSalvarRegistro.setToolTipText("Salvar registro");
			btnSalvarRegistro
					.setIcon(new ImageIcon(
							FrmPessoaCadastro.class
									.getResource("/imagens/vocalexa32x32/Actions-document-save-as-icon.png")));
			tbBotoes.add(btnSalvarRegistro);
			
			// Botão Fechar Janela
			btnFecharJanela.setToolTipText("Sair");
			btnFecharJanela.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnFecharJanela
					.setIcon(new ImageIcon(
							FrmPessoaCadastro.class
									.getResource("/imagens/vocalexa32x32/Actions-system-shutdown-icon.png")));
			tbBotoes.add(btnFecharJanela);

			// seta a visibilidade da janela
			setVisible(true);
		}
	}
}
