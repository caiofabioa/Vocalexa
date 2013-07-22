package visao.frames;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import visao.AbrirFramesBotoes;
import visao.CadastroExameVisao;
import visao.CadastroPessoaVisao;
import visao.CadastroVinculoVisao;
import controle.messages.I18NMessages;

@SuppressWarnings("serial")
public class PrincipalFrame extends JFrame {

	private JPanel contentPane;
	public AbrirFramesBotoes abrirFrame;
	static I18NMessages CfaMessage = new I18NMessages();

	/**
	 * Create the frame.
	 * @param cfaMessage 
	 */
	public PrincipalFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(PrincipalFrame.class.getResource("/imagens/LOGO_pequeno_icon.fw.png")));
		setTitle(CfaMessage.appGetMessage("vocalexa.titulo"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 1691, 744);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1366, 21);
		contentPane.add(menuBar);
		
		JMenu mnInicio = new JMenu("Inicio");
		menuBar.add(mnInicio);
		
		JMenuItem btnMenuInicioSair = new JMenuItem("Sair");
		btnMenuInicioSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnInicio.add(btnMenuInicioSair);
		
		JMenu mnNewMenu = new JMenu("Cadastros");
		menuBar.add(mnNewMenu);
		
		JMenuItem btnMnCadastrosPessoas = new JMenuItem("Pessoas");
		btnMnCadastrosPessoas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					new CadastroPessoaVisao();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível abrir Cadastro de Pessoa\n"+e.getMessage());
				}
			}
		});
		mnNewMenu.add(btnMnCadastrosPessoas);
		
		JMenuItem btnMnCadastrosVínculos = new JMenuItem("V\u00EDnculos");
		btnMnCadastrosVínculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					new CadastroVinculoVisao();
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Não foi possível abrir Cadastro de Vínculo\n"+e.getMessage());
				}
			}
		});
		mnNewMenu.add(btnMnCadastrosVínculos);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem btnMnCadastrosExames = new JMenuItem("Exames");
		mnNewMenu.add(btnMnCadastrosExames);
		
		JMenuItem btnMnCadastrosAgenda = new JMenuItem("Agenda");
		mnNewMenu.add(btnMnCadastrosAgenda);
		
		JMenuItem btnMnCadastrosTelefone = new JMenuItem("Telefone");
		mnNewMenu.add(btnMnCadastrosTelefone);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 21, 1366, 67);
		contentPane.add(toolBar);
		
		JButton btnInicialAddPessoa = new JButton("");
		btnInicialAddPessoa.setContentAreaFilled(false);
		btnInicialAddPessoa.setBorderPainted(false);
		btnInicialAddPessoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					new CadastroPessoaFrame();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Não foi possível abrir Cadastro de Pessoa\n"+e.getMessage());
				}
			}
		});
		btnInicialAddPessoa.setIcon(new ImageIcon(PrincipalFrame.class.getResource("/imagens/vocalexa64x64/ico_pessoa (3).png")));
		btnInicialAddPessoa.setBorder(null);
		toolBar.add(btnInicialAddPessoa);
		
		
		JButton btnInicialAddExame = new JButton("");
		btnInicialAddExame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					new CadastroExameVisao();
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Não foi possível abrir a tela de exames\n"+e.getMessage());
				}
			}
		});
		btnInicialAddExame.setContentAreaFilled(false);
		btnInicialAddExame.setBorderPainted(false);
		btnInicialAddExame.setIcon(new ImageIcon(PrincipalFrame.class.getResource("/imagens/vocalexa64x64/ico_new_book.png")));
		btnInicialAddExame.setBorder(null);
		toolBar.add(btnInicialAddExame);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		toolBar.add(separator);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(PrincipalFrame.class.getResource("/imagens/background.jpg")));
		background.setBounds(0, 0, 1366, 768);
		contentPane.add(background);
		
		setVisible(true);
	}
}
