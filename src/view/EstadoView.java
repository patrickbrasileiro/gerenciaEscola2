package view;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EstadoView {
	
	// desclaracao de variaveis
		private JFrame janela;
		private JPanel painelDaJanela;
		private JPanel painel1;
		private JTextField txtEstado;
		private JLabel lblEstado;
		private JButton botao1;
		private JButton botao2;
		private JTextField txtUf;
		private JLabel lblUf;

		public void iniciaGui() {
			
				
				// CRIAR AS INSTANCIAS
				janela= new JFrame("Estado");
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
				botao1.setBounds(80, 120, 100, 20);
				botao2 = new JButton();
				botao2.setText("Cancelar");
				botao2.setBounds(200, 120, 100, 20);
				
				
				//=========ESTADO==========
			
				txtEstado = new JTextField();
				txtEstado.setBounds(80, 55, 190, 20);

				JLabel lblEstado = new JLabel();
				lblEstado.setText("Estado:");
				lblEstado.setBounds(20, 55, 85, 20);
				janela.setVisible(true);
				
				//=========UF==========
				
				txtUf = new JTextField();
				txtUf.setBounds(320, 55, 40, 20);

				JLabel lblUf = new JLabel();
				lblUf.setText("UF:");
				lblUf.setBounds(280, 55, 90, 20);
				janela.setVisible(true);
				
				// CONFIGURAÇÃO DA TELA
				janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				janela.setSize(new Dimension(422,246));
				janela.setLocationRelativeTo(null);
				janela.setVisible(true);
				
				// ===========COLOCANDO NA TELA=============
				painelDaJanela.add(painel1);
				janela.getContentPane().add(lblEstado);
				janela.getContentPane().add(txtEstado);
				janela.getContentPane().add(botao1);
				janela.getContentPane().add(botao2);
				janela.getContentPane().add(lblUf);
				janela.getContentPane().add(txtUf);
				
				
				// =======visibilidade da tela===========
				
				janela.setVisible(true);
				

} }
