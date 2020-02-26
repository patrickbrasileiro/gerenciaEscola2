package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FuncionarioView {
	
	// desclaracao de variaveis
		private JFrame janela;
		private JPanel painelDaJanela;
		private JPanel painel1;
		private JTextField txtCidade;
		private JLabel lblCidade;
		private JButton botao1;
		private JButton botao2;
		
		
		
		private JLabel lblEscolha;
		private JRadioButton rbtMasculino;
		private JRadioButton rbtFeminino;
		private ButtonGroup grpRadio;
		private JTextField txtId;
		private JTextField txtNome;
		private JTextField txtRg;
		private JTextField txtCpf;
		private JTextField txtSalario;
		private JTextField txtDtNasc;
		private JTextField txtTelefone;
		private JTextField txtSexo;
		private JTextField txtLougradouro;
		private JTextField txtNumero;
		private JTextField txtComplemento;
		private JTextField txtBairro;
		private JTextField txtEstado;
		private JTextField txtCep;
		

		public void iniciaGui() {
			
				
				// CRIAR AS INSTANCIAS
				janela= new JFrame("Funcionários");
				painelDaJanela = (JPanel) janela.getContentPane();
				painel1 = new JPanel();
				
				//===== CONFIGURAÇÃO DO PAINEL====
				
				painelDaJanela.setBounds(3,6,400,200);
				painelDaJanela.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
				painelDaJanela.setBorder(BorderFactory.createEtchedBorder());
				painelDaJanela.setLayout(null);
				
				// ============BOTAO================
				botao1 = new JButton();
				botao1.setText("Cadastrar");
				botao1.setBounds(50, 120, 100, 20);
				botao2 = new JButton();
				botao2.setText("Cancelar");
				botao2.setBounds(10, 120, 100, 20);
				
				
				// ========SEXO=============
				lblEscolha = new JLabel();
				rbtMasculino = new JRadioButton();
				rbtFeminino = new JRadioButton();
				grpRadio = new ButtonGroup();

				grpRadio.add(rbtMasculino);
				grpRadio.add(rbtFeminino);

				lblEscolha.setHorizontalTextPosition(SwingConstants.CENTER);
				lblEscolha.setBounds(10, 2, 700, 18);

				rbtMasculino.setText("Masculino");
				rbtMasculino.setBounds(410, 55, 100, 24);

				rbtFeminino.setText("Feminino");
				rbtFeminino.setBounds(508, 55, 150, 24);

				txtSexo = new JTextField();
				txtSexo.setBounds(180, 55, 350, 20);

				JLabel lblSexo = new JLabel();
				lblSexo.setText("Sexo:");
				lblSexo.setBounds(365, 55, 85, 20);

				// ============BOTAO================
				botao1 = new JButton();
				botao1.setText("Cadastrar");
				botao1.setBounds(180, 250, 100, 20);
				botao2 = new JButton();
				botao2.setText("Cancelar");
				botao2.setBounds(330, 250, 100, 20);

				// ========PESSOA================
				txtId = new JTextField();
				txtId.setBounds(500, 30, 90, 20);

				JLabel lblId = new JLabel();
				lblId.setText("ID:");
				lblId.setBounds(460, 30, 85, 20);

				txtNome = new JTextField();
				txtNome.setBounds(100, 30, 350, 20);

				JLabel lblNome = new JLabel();
				lblNome.setText("Nome:");
				lblNome.setBounds(10, 30, 85, 20);

				txtDtNasc = new JTextField();
				txtDtNasc.setBounds(100, 82, 80, 20);

				JLabel lblDtNasc = new JLabel();
				lblDtNasc.setText("Dt nascimento:");
				lblDtNasc.setBounds(10, 83, 85, 20);

				txtRg = new JTextField();
				txtRg.setBounds(100, 55, 100, 20);

				JLabel lblRg = new JLabel();
				lblRg.setText("RG:");
				lblRg.setBounds(10, 55, 85, 20);

				txtCpf = new JTextField();
				txtCpf.setBounds(250, 55, 100, 20);

				JLabel lblCpf = new JLabel();
				lblCpf.setText("CPF:");
				lblCpf.setBounds(220, 55, 85, 20);

				txtSalario = new JTextField();
				txtSalario.setBounds(410, 80, 100, 20);

				JLabel lblSalario = new JLabel();
				lblSalario.setText("Salário:");
				lblSalario.setBounds(360, 80, 85, 20);

				txtTelefone = new JTextField();
				txtTelefone.setBounds(250, 80, 100, 20);

				JLabel lblTelefone = new JLabel();
				lblTelefone.setText("Telefone:");
				lblTelefone.setBounds(190, 80, 85, 20);

				// ===========ENDERECO==================
				txtLougradouro = new JTextField();
				txtLougradouro.setBounds(100, 120, 350, 20);

				JLabel lblLougradouro = new JLabel();
				lblLougradouro.setText("Lougradouro:");
				lblLougradouro.setBounds(10, 120, 85, 20);

				txtNumero = new JTextField();
				txtNumero.setBounds(100, 185, 50, 20);

				JLabel lblNumero = new JLabel();
				lblNumero.setText("Número:");
				lblNumero.setBounds(10, 185, 85, 20);
				

				txtComplemento = new JTextField();
				txtComplemento.setBounds(550, 120, 100, 20);

				JLabel lblComplemento = new JLabel();
				lblComplemento.setText("Complemento:");
				lblComplemento.setBounds(460, 120, 85, 20);

				txtBairro = new JTextField();
				txtBairro.setBounds(100, 152, 150, 20);

				JLabel lblBairro = new JLabel();
				lblBairro.setText("Bairro:");
				lblBairro.setBounds(10, 152, 85, 20);

				txtCidade = new JTextField();
				txtCidade.setBounds(320, 152, 150, 20);

				JLabel lblCidade = new JLabel();
				lblCidade.setText("Cidade:");
				lblCidade.setBounds(265, 152, 85, 20);
				
				txtEstado = new JTextField();
				txtEstado.setBounds(510, 152, 50, 20);
				
				JLabel lblEstado = new JLabel();
				lblEstado.setText("UF:");
				lblEstado.setBounds(485, 152, 85, 20);
				
				txtCep = new JTextField();
				txtCep.setBounds(200, 185, 90, 20);
				
				JLabel lblCep = new JLabel();
				lblCep.setText("CEP:");
				lblCep.setBounds(160, 185, 85, 20);
				
				
				//=========== criar as instancias painel=====
				janela= new JFrame();
				painelDaJanela = (JPanel) janela.getContentPane();
				painel1 = new JPanel();
				
				painel1.setBounds(208,6,500,00);
				painel1.setLayout(new BorderLayout(0,0));
				painel1.setBorder(BorderFactory.createLoweredBevelBorder());
				
				
				// ========CONFIGURACAO TELA==============
				janela = new JFrame();
				janela.setTitle("Cadastro de Funcionário");
				janela.setSize(500, 400);
				janela.getContentPane().setLayout(null);
				janela.setLocationRelativeTo(null);

				janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				janela.setSize(new Dimension(690, 450));
				janela.setLocationRelativeTo(null);
				janela.setVisible(true);

				

				// ===========COLOCANDO NA TELA=============
				janela.getContentPane().add(painel1);
				janela.getContentPane().add(botao1);
				janela.getContentPane().add(botao2);
				janela.getContentPane().add(lblId);
				janela.getContentPane().add(lblNome);
				janela.getContentPane().add(lblDtNasc);
				janela.getContentPane().add(lblSexo);
				janela.getContentPane().add(lblLougradouro);
				janela.getContentPane().add(lblNumero);
				janela.getContentPane().add(lblRg);
				janela.getContentPane().add(lblCpf);
				janela.getContentPane().add(lblTelefone);
				janela.getContentPane().add(lblComplemento);
				janela.getContentPane().add(lblSalario);
				janela.getContentPane().add(lblBairro);
				janela.getContentPane().add(lblCidade);
				janela.getContentPane().add(lblEstado);
				janela.getContentPane().add(lblCep);
				janela.getContentPane().add(txtId);
				janela.getContentPane().add(txtNome);
				janela.getContentPane().add(txtDtNasc);
				janela.getContentPane().add(txtLougradouro);
				janela.getContentPane().add(txtRg);
				janela.getContentPane().add(txtCpf);
				janela.getContentPane().add(txtTelefone);
				janela.getContentPane().add(txtComplemento);
				janela.getContentPane().add(txtSalario);
				janela.getContentPane().add(txtCidade);
				janela.getContentPane().add(txtBairro);
				janela.getContentPane().add(txtEstado);
				janela.getContentPane().add(txtCep);
				janela.getContentPane().add(txtNumero);
				
				
				
				// =========PAINEL=================

				painelDaJanela = (JPanel) janela.getContentPane();
				painelDaJanela.setBorder(BorderFactory.createLoweredBevelBorder());
				painelDaJanela.setLayout(null);

				painelDaJanela.add(lblEscolha);
				painelDaJanela.add(rbtMasculino);
				painelDaJanela.add(rbtFeminino);
				janela.setVisible(true);
			}
				
				
				// =======visibilidade da tela===========
			
		}

