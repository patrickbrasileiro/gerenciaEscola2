package view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CidadeView {

	// desclaracao de variaveis
	private JFrame janela;
	private JPanel painelDaJanela;
	private JPanel painel1;
	private JTextField txtCidade;
	private JLabel lblCidade;
	private JButton botao1;
	private JButton botao2;

	public void iniciaGui() {
		
			
			// CRIAR AS INSTANCIAS
			janela= new JFrame("Cidade");
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
			
			
			//=========CIDADE==========
		
			txtCidade = new JTextField();
			txtCidade.setBounds(80, 55, 190, 20);

			JLabel lblCidade = new JLabel();
			lblCidade.setText("Cidade:");
			lblCidade.setBounds(20, 55, 85, 20);
			janela.setVisible(true);
			
			// CONFIGURAÇÃO DA TELA
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.setSize(new Dimension(422,246));
			janela.setLocationRelativeTo(null);
			janela.setVisible(true);
			
			// ===========COLOCANDO NA TELA=============
			painelDaJanela.add(painel1);
			janela.getContentPane().add(lblCidade);
			janela.getContentPane().add(txtCidade);
			janela.getContentPane().add(botao1);
			janela.getContentPane().add(botao2);
		
			// =======visibilidade da tela===========
			
			janela.setVisible(true);
			
			
		
			
			
			
			
			

	}
}
