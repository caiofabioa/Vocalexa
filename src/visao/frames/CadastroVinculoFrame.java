package visao.frames;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import utils.CfaBotao;
import utils.CfaCampoTexto;

@SuppressWarnings("serial")
public class CadastroVinculoFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroVinculoFrame frame = new CadastroVinculoFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroVinculoFrame() {
		setResizable(false);
		setTitle("Vocalexa 2.0 - Cadastro de V\u00EDnculos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 730, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 724, 88);
		contentPane.add(panel);
		
		JLabel lblCadastroDeVnculos = new JLabel("Cadastro de V\u00EDnculos");
		lblCadastroDeVnculos.setIcon(new ImageIcon(CadastroVinculoFrame.class.getResource("/imagens/LOGO_pequeno.fw.png")));
		lblCadastroDeVnculos.setFont(new Font("Rockwell", Font.BOLD, 16));
		lblCadastroDeVnculos.setBounds(10, 11, 629, 60);
		panel.add(lblCadastroDeVnculos);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Dados B\u00E1sicos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(14, 147, 341, 240);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Raz\u00E3o Social");
		lblNewLabel_1.setBounds(14, 20, 111, 14);
		
		JLabel lblNewLabel_2 = new JLabel("Nome Fantasia");
		lblNewLabel_2.setBounds(14, 45, 111, 14);
		
		JLabel lblNewLabel_3 = new JLabel("CNPJ");
		lblNewLabel_3.setBounds(14, 70, 111, 14);
		
		textField = new JTextField();
		textField.setBounds(135, 20, 190, 20);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Telefone");
		lblNewLabel.setBounds(14, 95, 111, 14);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(14, 120, 111, 14);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(14, 145, 111, 14);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(14, 170, 111, 14);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(14, 195, 111, 14);
		panel_2.setLayout(null);
		panel_2.add(lblEstado);
		panel_2.add(lblCidade);
		panel_2.add(lblCep);
		panel_2.add(lblEndereo);
		panel_2.add(lblNewLabel);
		panel_2.add(lblNewLabel_3);
		panel_2.add(lblNewLabel_1);
		panel_2.add(lblNewLabel_2);
		panel_2.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(135, 45, 190, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(135, 70, 190, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(135, 95, 190, 20);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(135, 120, 190, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(135, 145, 190, 20);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(135, 167, 190, 20);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(135, 192, 190, 20);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(10, 99, 226, 23);
		contentPane.add(panel_1);
		
		CfaBotao btnPrimeiro = new CfaBotao("");
		btnPrimeiro.setBounds(0, 0, 23, 23);
		btnPrimeiro.setIcon(new ImageIcon(
				CadastroPessoaFrame.class
				.getResource("/imagens/vocalexa16x16/Arrows-Left-circular-icon.png")));
		panel_1.add(btnPrimeiro);
		
		CfaBotao btnAnterior = new CfaBotao("");
		btnAnterior.setIcon(new ImageIcon(
				CadastroPessoaFrame.class
				.getResource("/imagens/vocalexa16x16/Arrows-Left-round-icon.png")));
		btnAnterior.setBounds(23, 0, 23, 23);
		panel_1.add(btnAnterior);
		
		CfaCampoTexto ctxtAtual = new CfaCampoTexto();
		ctxtAtual.setHorizontalAlignment(SwingConstants.CENTER);
		ctxtAtual.setEnabled(false);
		ctxtAtual.setEditable(false);
		ctxtAtual.setColumns(10);
		ctxtAtual.setBorder(null);
		ctxtAtual.setBounds(46, 0, 53, 23);
		panel_1.add(ctxtAtual);
		
		CfaCampoTexto cfaCampoTexto_1 = new CfaCampoTexto();
		cfaCampoTexto_1.setText("/");
		cfaCampoTexto_1.setHorizontalAlignment(SwingConstants.CENTER);
		cfaCampoTexto_1.setEnabled(false);
		cfaCampoTexto_1.setEditable(false);
		cfaCampoTexto_1.setColumns(3);
		cfaCampoTexto_1.setBorder(null);
		cfaCampoTexto_1.setBounds(99, 0, 16, 23);
		panel_1.add(cfaCampoTexto_1);
		
		CfaCampoTexto ctxtTotal = new CfaCampoTexto();
		ctxtTotal.setHorizontalAlignment(SwingConstants.CENTER);
		ctxtTotal.setEnabled(false);
		ctxtTotal.setEditable(false);
		ctxtTotal.setColumns(10);
		ctxtTotal.setBorder(null);
		ctxtTotal.setBounds(115, 0, 53, 23);
		panel_1.add(ctxtTotal);
		
		CfaBotao btnProximo = new CfaBotao("");
		btnProximo.setIcon(new ImageIcon(
				CadastroPessoaFrame.class
				.getResource("/imagens/vocalexa16x16/Arrows-Right-round-icon.png")));
		btnProximo.setBounds(168, 0, 23, 23);
		panel_1.add(btnProximo);
		
		CfaBotao btnUltimo = new CfaBotao("");
		btnUltimo.setIcon(new ImageIcon(
				CadastroPessoaFrame.class
				.getResource("/imagens/vocalexa16x16/Arrows-Right-circular-icon.png")));
		btnUltimo.setBounds(191, 0, 23, 23);
		panel_1.add(btnUltimo);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Parametriza\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(371, 147, 333, 140);
		contentPane.add(panel_3);
		
		JLabel lblSituao = new JLabel("Data");
		lblSituao.setBounds(6, 20, 87, 14);
		
		JLabel lblData = new JLabel("Situa\u00E7\u00E3o");
		lblData.setBounds(6, 43, 87, 14);
		
		JLabel lblVinculados = new JLabel("Vinculados");
		lblVinculados.setBounds(6, 70, 87, 14);
		
		textField_8 = new JTextField();
		textField_8.setBounds(103, 20, 190, 20);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(103, 45, 190, 20);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(103, 70, 190, 20);
		textField_10.setColumns(10);
		
		JLabel lblPermiteAlterao = new JLabel("Permite Altera\u00E7\u00E3o");
		lblPermiteAlterao.setBounds(6, 95, 87, 14);
		
		textField_11 = new JTextField();
		textField_11.setBounds(103, 95, 190, 20);
		textField_11.setColumns(10);
		panel_3.setLayout(null);
		panel_3.add(lblSituao);
		panel_3.add(lblData);
		panel_3.add(lblVinculados);
		panel_3.add(lblPermiteAlterao);
		panel_3.add(textField_8);
		panel_3.add(textField_9);
		panel_3.add(textField_10);
		panel_3.add(textField_11);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		toolBar.setBounds(556, 386, 158, 39);
		contentPane.add(toolBar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(CadastroVinculoFrame.class.getResource("/imagens/vocalexa32x32/ico_pessoa (6).png")));
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(CadastroVinculoFrame.class.getResource("/imagens/vocalexa32x32/ico_pessoa (7).png")));
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(CadastroVinculoFrame.class.getResource("/imagens/vocalexa32x32/ico_pessoa (5).png")));
		toolBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(CadastroVinculoFrame.class.getResource("/imagens/vocalexa32x32/Actions-system-shutdown-icon.png")));
		toolBar.add(btnNewButton_3);
	}
}
