package visao.frames;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import utils.CfaCheckBox;
import javax.swing.border.BevelBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Component;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;

@SuppressWarnings("serial")
public class CadastroExameFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField txtPessoaJurdica;
	private JTextField textField_12;
	protected final JTabbedPane jtpExame = new JTabbedPane(JTabbedPane.TOP);
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroExameFrame frame = new CadastroExameFrame();
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
	public CadastroExameFrame() {
		setResizable(false);
		setTitle("Vocalexa 2.0 - Cadastro de Exames");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 951, 679);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jtpExame.setBounds(0, 149, 945, 445);
		contentPane.add(jtpExame);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		jtpExame.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 450, 375);
		panel_1.add(panel_2);
		
		JLabel label = new JLabel("Histórico Pessoal:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label.setBounds(10, 14, 84, 14);
		
		textField = new JTextField();
		textField.setBounds(195, 11, 245, 20);
		
		JLabel label_1 = new JLabel("As variações de humor alteram a voz:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_1.setBounds(10, 40, 181, 14);
		
		textField_1 = new JTextField();
		textField_1.setBounds(195, 37, 245, 20);
		
		JLabel label_2 = new JLabel("Ao fim do dia sua voz está:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_2.setBounds(10, 68, 130, 14);
		
		CfaCheckBox checkBox = new CfaCheckBox("Igual ao início do dia");
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox.setBounds(195, 64, 245, 23);
		
		JLabel label_3 = new JLabel("Os gargarejos melhoram a voz:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_3.setBounds(10, 188, 150, 14);
		
		CfaCheckBox checkBox_1 = new CfaCheckBox("Mais fraca que no início do dia");
		checkBox_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_1.setBounds(195, 134, 245, 23);
		
		CfaCheckBox checkBox_2 = new CfaCheckBox("Mais agradável que no início do dia");
		checkBox_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_2.setBounds(195, 157, 245, 23);
		
		textField_2 = new JTextField();
		textField_2.setBounds(195, 185, 245, 20);
		
		JLabel label_4 = new JLabel("As pessoas costumam dizer que:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_4.setBounds(10, 208, 181, 14);
		
		CfaCheckBox checkBox_3 = new CfaCheckBox("Voc\u00EA fala alto");
		checkBox_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_3.setBounds(195, 212, 245, 23);
		
		CfaCheckBox checkBox_4 = new CfaCheckBox("Voc\u00EA tem voz estridente");
		checkBox_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_4.setBounds(195, 238, 245, 23);
		
		CfaCheckBox checkBox_5 = new CfaCheckBox("Mais rouca que no inicio do dia");
		checkBox_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_5.setBounds(195, 88, 245, 23);
		
		CfaCheckBox checkBox_6 = new CfaCheckBox("Mais cansada que no inicio do dia");
		checkBox_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_6.setBounds(195, 111, 245, 23);
		
		CfaCheckBox checkBox_7 = new CfaCheckBox("Quase n\u00E3o seu ouve o que voc\u00EA diz");
		checkBox_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_7.setBounds(195, 264, 245, 23);
		
		CfaCheckBox checkBox_8 = new CfaCheckBox("Voc\u00EA fala baixo");
		checkBox_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_8.setBounds(195, 290, 245, 23);
		
		CfaCheckBox checkBox_9 = new CfaCheckBox("Quase n\u00E3o se entende o que voc\u00EA diz");
		checkBox_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_9.setBounds(195, 316, 245, 23);
		
		CfaCheckBox checkBox_10 = new CfaCheckBox("N\u00E3o h\u00E1 coment\u00E1rios");
		checkBox_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_10.setBounds(195, 342, 245, 23);
		panel_2.setLayout(null);
		panel_2.add(label);
		panel_2.add(textField);
		panel_2.add(label_1);
		panel_2.add(textField_1);
		panel_2.add(label_2);
		panel_2.add(checkBox);
		panel_2.add(label_3);
		panel_2.add(checkBox_1);
		panel_2.add(checkBox_2);
		panel_2.add(textField_2);
		panel_2.add(label_4);
		panel_2.add(checkBox_3);
		panel_2.add(checkBox_4);
		panel_2.add(checkBox_5);
		panel_2.add(checkBox_6);
		panel_2.add(checkBox_7);
		panel_2.add(checkBox_8);
		panel_2.add(checkBox_9);
		panel_2.add(checkBox_10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(470, 11, 450, 375);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_5 = new JLabel();
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_5.setBounds(10, 10, 157, 14);
		label_5.setText("Como voc\u00EA ouve sua voz:");
		panel_3.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(177, 8, 267, 20);
		panel_3.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(177, 35, 267, 20);
		panel_3.add(textField_4);
		
		JLabel label_6 = new JLabel();
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_6.setBounds(10, 35, 157, 14);
		label_6.setText("Gosta dela?");
		panel_3.add(label_6);
		
		JLabel lblAlgumDaSua = new JLabel("<html><p>Alguém da sua família apresenta<br/>algum problema vocal? Quem?</html>");
		lblAlgumDaSua.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAlgumDaSua.setBounds(10, 60, 163, 30);
		panel_3.add(lblAlgumDaSua);
		
		textField_5 = new JTextField();
		textField_5.setBounds(177, 60, 267, 30);
		panel_3.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(177, 95, 267, 20);
		panel_3.add(textField_6);
		
		JLabel label_8 = new JLabel();
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_8.setBounds(10, 95, 127, 14);
		label_8.setText("A sua voz parce mais com:");
		panel_3.add(label_8);
		
		JLabel label_9 = new JLabel();
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_9.setBounds(10, 120, 67, 14);
		label_9.setText("Obsserva\u00E7\u00E3o:");
		panel_3.add(label_9);
		
		textField_7 = new JTextField();
		textField_7.setBounds(177, 120, 267, 20);
		panel_3.add(textField_7);
		
		JLabel label_10 = new JLabel();
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_10.setBounds(10, 145, 72, 14);
		label_10.setText("Ao falar sente:");
		panel_3.add(label_10);
		
		JLabel label_11 = new JLabel();
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_11.setBounds(10, 325, 121, 14);
		label_11.setText("Pratica atividades f\u00EDsicas:");
		panel_3.add(label_11);
		
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		textField_8.setBounds(279, 325, 121, 23);
		textField_8.setText("N\u00E3o");
		textField_8.setEditable(false);
		panel_3.add(textField_8);
		
		CfaCheckBox checkBox_12 = new CfaCheckBox("Sensa\u00E7\u00E3o de corpo estranho");
		checkBox_12.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_12.setBounds(177, 220, 163, 23);
		panel_3.add(checkBox_12);
		
		CfaCheckBox checkBox_13 = new CfaCheckBox("Pigarro");
		checkBox_13.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_13.setBounds(342, 220, 102, 23);
		panel_3.add(checkBox_13);
		
		CfaCheckBox checkBox_14 = new CfaCheckBox("Dor na garganta");
		checkBox_14.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_14.setBounds(177, 195, 163, 23);
		panel_3.add(checkBox_14);
		
		CfaCheckBox checkBox_15 = new CfaCheckBox("Tens\u00E3o em regi\u00E3o cervical");
		checkBox_15.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_15.setBounds(177, 170, 163, 23);
		panel_3.add(checkBox_15);
		
		CfaCheckBox checkBox_16 = new CfaCheckBox("Fadiga ao falar");
		checkBox_16.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_16.setBounds(177, 145, 163, 23);
		panel_3.add(checkBox_16);
		
		CfaCheckBox checkBox_17 = new CfaCheckBox("Aperto");
		checkBox_17.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_17.setBounds(343, 170, 101, 23);
		panel_3.add(checkBox_17);
		
		CfaCheckBox checkBox_18 = new CfaCheckBox("Ard\u00EAncia");
		checkBox_18.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_18.setBounds(177, 270, 163, 23);
		panel_3.add(checkBox_18);
		
		CfaCheckBox checkBox_19 = new CfaCheckBox("Secura");
		checkBox_19.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_19.setBounds(342, 245, 102, 23);
		panel_3.add(checkBox_19);
		
		CfaCheckBox checkBox_20 = new CfaCheckBox("Falta de ar");
		checkBox_20.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_20.setBounds(177, 295, 163, 23);
		panel_3.add(checkBox_20);
		
		CfaCheckBox checkBox_21 = new CfaCheckBox("Afli\u00E7\u00E3o");
		checkBox_21.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_21.setBounds(342, 270, 102, 23);
		panel_3.add(checkBox_21);
		
		CfaCheckBox checkBox_22 = new CfaCheckBox("Fisgadas");
		checkBox_22.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_22.setBounds(177, 245, 163, 23);
		panel_3.add(checkBox_22);
		
		CfaCheckBox checkBox_23 = new CfaCheckBox("Coceira");
		checkBox_23.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_23.setBounds(343, 145, 101, 23);
		panel_3.add(checkBox_23);
		
		CfaCheckBox checkBox_24 = new CfaCheckBox("Tosse");
		checkBox_24.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_24.setBounds(343, 195, 101, 23);
		panel_3.add(checkBox_24);

		CfaCheckBox checkBox_11 = new CfaCheckBox("Sim");
		checkBox_11.setFont(new Font("Tahoma", Font.PLAIN, 11));
		checkBox_11.setBounds(177, 325, 96, 23);
		panel_3.add(checkBox_11);
		
		JPanel panel = new JPanel();
		jtpExame.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 11, 920, 395);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(10, 11, 201, 115);
		panel_7.setBackground(Color.WHITE);
		panel_6.add(panel_7);
		
		JLabel label_12 = new JLabel();
		label_12.setText("Provid\u00EAncias:");
		
		textField_13 = new JTextField();
		textField_13.setText("N/A");
		textField_13.setEditable(false);
		textField_13.setBackground(Color.WHITE);
		
		JLabel label_13 = new JLabel();
		label_13.setText("Frequ\u00EAncia:");
		
		JLabel label_14 = new JLabel();
		label_14.setText("Quando:");
		
		JLabel label_15 = new JLabel();
		label_15.setText("Laringite:");
		
		JCheckBox checkBox_25 = new JCheckBox();
		checkBox_25.setText("Sim");
		checkBox_25.setBackground(Color.WHITE);
		
		textField_14 = new JTextField();
		textField_14.setText("N/A");
		textField_14.setEditable(false);
		textField_14.setBackground(Color.WHITE);
		
		textField_15 = new JTextField();
		textField_15.setText("N/A");
		textField_15.setEditable(false);
		textField_15.setBackground(Color.WHITE);
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGap(0, 201, Short.MAX_VALUE)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_7.createSequentialGroup()
							.addComponent(label_12)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_13, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
						.addGroup(gl_panel_7.createSequentialGroup()
							.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
								.addComponent(label_13)
								.addComponent(label_14)
								.addComponent(label_15))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
								.addComponent(checkBox_25)
								.addComponent(textField_14, 114, 114, 114)
								.addComponent(textField_15, 114, 114, 114))))
					.addContainerGap())
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGap(0, 115, Short.MAX_VALUE)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_15)
						.addComponent(checkBox_25))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_14)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_13)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_12)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_7.setLayout(gl_panel_7);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_8.setBounds(221, 11, 201, 115);
		panel_6.add(panel_8);
		
		JLabel label_16 = new JLabel();
		label_16.setText("Frequ\u00EAncia:");
		
		JLabel label_17 = new JLabel();
		label_17.setText("Quando");
		
		textField_16 = new JTextField();
		textField_16.setText("N/A");
		textField_16.setEditable(false);
		textField_16.setBackground(Color.WHITE);
		
		textField_17 = new JTextField();
		textField_17.setText("N/A");
		textField_17.setEditable(false);
		textField_17.setBackground(Color.WHITE);
		
		JLabel label_18 = new JLabel();
		label_18.setText("Amigdalite:");
		
		JCheckBox checkBox_26 = new JCheckBox();
		checkBox_26.setText("Sim");
		checkBox_26.setBackground(Color.WHITE);
		
		JLabel label_19 = new JLabel();
		label_19.setText("Provid\u00EAncias:");
		
		textField_18 = new JTextField();
		textField_18.setText("N/A");
		textField_18.setEditable(false);
		textField_18.setBackground(Color.WHITE);
		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGap(0, 201, Short.MAX_VALUE)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_8.createSequentialGroup()
							.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
								.addComponent(label_16)
								.addComponent(label_17))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_16, 114, 114, 114)
								.addComponent(textField_17, 114, 114, 114)))
						.addGroup(gl_panel_8.createSequentialGroup()
							.addComponent(label_18)
							.addGap(13)
							.addComponent(checkBox_26))
						.addGroup(gl_panel_8.createSequentialGroup()
							.addComponent(label_19)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGap(0, 115, Short.MAX_VALUE)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_18)
						.addComponent(checkBox_26))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_17)
						.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_16)
						.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_19)
						.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_8.setLayout(gl_panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(432, 11, 201, 115);
		panel_6.add(panel_9);
		
		JLabel label_20 = new JLabel();
		label_20.setText("Provid\u00EAncias:");
		
		textField_19 = new JTextField();
		textField_19.setText("N/A");
		textField_19.setEditable(false);
		textField_19.setBackground(Color.WHITE);
		
		JLabel label_21 = new JLabel();
		label_21.setText("Frequ\u00EAncia:");
		
		JLabel label_22 = new JLabel();
		label_22.setText("Quando:");
		
		JLabel label_23 = new JLabel();
		label_23.setText("Faringite:");
		
		JCheckBox checkBox_27 = new JCheckBox();
		checkBox_27.setText("Sim");
		checkBox_27.setBackground(Color.WHITE);
		
		textField_20 = new JTextField();
		textField_20.setText("N/A");
		textField_20.setEditable(false);
		textField_20.setBackground(Color.WHITE);
		
		textField_21 = new JTextField();
		textField_21.setText("N/A");
		textField_21.setEditable(false);
		textField_21.setBackground(Color.WHITE);
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGap(0, 201, Short.MAX_VALUE)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_9.createSequentialGroup()
							.addComponent(label_20)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_19, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
						.addGroup(gl_panel_9.createSequentialGroup()
							.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
								.addComponent(label_21)
								.addComponent(label_22)
								.addComponent(label_23))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_9.createParallelGroup(Alignment.LEADING)
								.addComponent(checkBox_27)
								.addComponent(textField_20, 114, 114, 114)
								.addComponent(textField_21, 114, 114, 114))))
					.addContainerGap())
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGap(0, 115, Short.MAX_VALUE)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_23)
						.addComponent(checkBox_27))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_22)
						.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_21)
						.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_9.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_20)
						.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_9.setLayout(gl_panel_9);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(0, 0, 945, 138);
		contentPane.add(panel_4);
		
		JLabel label_7 = new JLabel("Cadastro de V\u00EDnculos");
		label_7.setIcon(new ImageIcon(CadastroExameFrame.class.getResource("/imagens/LOGO_pequeno.fw.png")));
		label_7.setFont(new Font("Rockwell", Font.BOLD, 16));
		label_7.setBounds(10, 11, 629, 60);
		panel_4.add(label_7);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "Dados Pessoais", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(10, 73, 925, 54);
		panel_4.add(panel_5);
		
		JLabel lblCd = new JLabel("C\u00F3d.:");
		panel_5.add(lblCd);
		
		textField_9 = new JTextField();
		panel_5.add(textField_9);
		textField_9.setColumns(5);
		
		JLabel lblNome = new JLabel("Nome:");
		panel_5.add(lblNome);
		
		textField_10 = new JTextField();
		panel_5.add(textField_10);
		textField_10.setColumns(16);
		
		JLabel lblRg = new JLabel("RG:");
		panel_5.add(lblRg);
		
		textField_11 = new JTextField();
		textField_11.setText("9.857.744-0");
		panel_5.add(textField_11);
		textField_11.setColumns(8);
		
		JLabel lblVnculo = new JLabel("V\u00EDnculo:");
		panel_5.add(lblVnculo);
		
		txtPessoaJurdica = new JTextField();
		txtPessoaJurdica.setText("Empresa Limita & Cia Ltda");
		panel_5.add(txtPessoaJurdica);
		txtPessoaJurdica.setColumns(16);
		
		JLabel lblData = new JLabel("Data:");
		panel_5.add(lblData);
		
		textField_12 = new JTextField();
		textField_12.setText("12/12/2012");
		panel_5.add(textField_12);
		textField_12.setColumns(7);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(738, 605, 197, 34);
		contentPane.add(toolBar);
		toolBar.setFloatable(false);
		
		JButton btnSalvar = new JButton("");
		btnSalvar.setIcon(new ImageIcon(CadastroExameFrame.class.getResource("/imagens/vocalexa32x32/Actions-document-save-icon.png")));
		toolBar.add(btnSalvar);
		
		JButton btnEditar = new JButton("");
		btnEditar.setIcon(new ImageIcon(CadastroExameFrame.class.getResource("/imagens/vocalexa32x32/Actions-document-save-as-icon.png")));
		toolBar.add(btnEditar);
		
		JButton btnImprimir = new JButton("");
		btnImprimir.setIcon(new ImageIcon(CadastroExameFrame.class.getResource("/imagens/vocalexa32x32/Actions-document-print-icon.png")));
		toolBar.add(btnImprimir);
		
		JButton btnExcluir = new JButton("");
		btnExcluir.setIcon(new ImageIcon(CadastroExameFrame.class.getResource("/imagens/vocalexa32x32/Actions-edit-clear-list-icon.png")));
		toolBar.add(btnExcluir);
		
		JButton btnSair = new JButton("");
		btnSair.setIcon(new ImageIcon(CadastroExameFrame.class.getResource("/imagens/vocalexa32x32/Actions-system-shutdown-icon.png")));
		toolBar.add(btnSair);
	}
}
