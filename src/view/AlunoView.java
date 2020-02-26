package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.AlunoController;
import model.Aluno;
import model.Data;

public class AlunoView {

	// ======= DECLARAR VARIAVEIS====

	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JLabel lblEscolha;
	private JPanel painelDaJanela;
	private JRadioButton rbtMasculino;
	private JRadioButton rbtFeminino;
	private ButtonGroup grpRadio;
	private JTextField txtMatricula;
	private JTextField txtNome;
	private JTextField txtRg;
	private JTextField txtCpf;
	private JTextField txtSenha;
	private JTextField txtDtNasc;
	private JTextField txtTelefone;
	private JTextField txtSexo;
	private JTextField txtLougradouro;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtEstado;
	private JTextField txtCep;
	private JPanel painel1;

	
	
	
	
	public void iniciaGui() {
			

	
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
		txtMatricula = new JTextField();
		txtMatricula.setBounds(530, 30, 90, 20);

		JLabel lblMatricula = new JLabel();
		lblMatricula.setText("Matricula:");
		lblMatricula.setBounds(460, 30, 85, 20);

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

		txtSenha = new JTextField();
		txtSenha.setBounds(410, 80, 100, 20);

		JLabel lblSenha = new JLabel();
		lblSenha.setText("Senha:");
		lblSenha.setBounds(360, 80, 85, 20);

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
		janela.setTitle("Cadastro Aluno");
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
		janela.getContentPane().add(lblMatricula);
		janela.getContentPane().add(lblNome);
		janela.getContentPane().add(lblDtNasc);
		janela.getContentPane().add(lblSexo);
		janela.getContentPane().add(lblLougradouro);
		janela.getContentPane().add(lblNumero);
		janela.getContentPane().add(lblRg);
		janela.getContentPane().add(lblCpf);
		janela.getContentPane().add(lblTelefone);
		janela.getContentPane().add(lblComplemento);
		janela.getContentPane().add(lblSenha);
		janela.getContentPane().add(lblBairro);
		janela.getContentPane().add(lblCidade);
		janela.getContentPane().add(lblEstado);
		janela.getContentPane().add(lblCep);
		janela.getContentPane().add(txtMatricula);
		janela.getContentPane().add(txtNome);
		janela.getContentPane().add(txtDtNasc);
		janela.getContentPane().add(txtLougradouro);
		janela.getContentPane().add(txtRg);
		janela.getContentPane().add(txtCpf);
		janela.getContentPane().add(txtTelefone);
		janela.getContentPane().add(txtComplemento);
		janela.getContentPane().add(txtSenha);
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
	
	     //=========PASSAGEM DE PARAMENTRO====	
	
	public class CadastroListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Aluno a1 = new Aluno();
			AlunoController ac = new AlunoController();
			boolean registra = true;

			try {
				a1.setMatricula(txtMatricula.getText());
				a1.setNome(txtNome.getText()); 
				String data = txtDtNasc.getText();
				String sexo = txtSexo.getText().toUpperCase();
				
				char aux = sexo.charAt(0);
				a1.setSexo(aux); 
				
				
				
				String aux1 = a1.getNome().trim(); 
				String aux2 = a1.getMatricula().trim();

				int cont1 = aux1.length();
				int cont2 = aux2.length();
				int cont3 = sexo.length();

				if (aux != 'M' && aux != 'F') {
					registra = false;
				}
				if ((cont1 <= 0) || (cont2 <= 0) || (cont3 != 1)) { 
					registra = false;
				}

				String data1[] = data.split("/"); 

				if (data1.length != 3) {
					registra = false;
				}

				int dia = Integer.parseInt(data1[0]);
				int mes = Integer.parseInt(data1[1]);
				int ano = Integer.parseInt(data1[2]);

				if ((mes == 2) && (dia > 29)) { 
					registra = false;
				}
				if ((dia > 31) || (dia < 1) || (mes < 1) || (mes > 12) || (ano > 2020) || (ano < 1800)) {
					registra = false;
				}
				// FIM DAS VALIDAÇÕES
				
				Data data2 = new Data(dia, mes, ano); 
				a1.setDataNasc(data2); 

				if (registra) {
					ac.inserirAluno(a1.getMatricula(), a1.getNome(), a1.getDataNasc(), a1.getSexo());

					JOptionPane.showMessageDialog(null, " Cadastrado com sucesso");
				} else {
					JOptionPane.showMessageDialog(null, "Voce digitou alguma coisa errado. tente novamente");
				}

			} catch (NumberFormatException N) { 
				JOptionPane.showMessageDialog(null, "Verifique o que voce digitou\n\n");
			} catch (java.lang.ArrayIndexOutOfBoundsException A) {
				JOptionPane.showMessageDialog(null, "A data precisa ser em formato de data");
			} catch (java.lang.StringIndexOutOfBoundsException C) {
				JOptionPane.showMessageDialog(null, "Digite o sexo");
			}

			
			txtMatricula.setText("");
			txtNome.setText("");
			txtDtNasc.setText("");
			txtSexo.setText("");
		}

	}
	public class CancelaListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			janela.setVisible(false);
		}
	}
}

}
