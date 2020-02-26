package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import model.Funcionario;

public class MenuView {

	private JFrame janela;
	private JMenuBar barraMenu;
	private JMenu menu01;
	private JMenu menu02;
	private JMenuItem itemMenu1;
	private JMenuItem itemMenu2;
	private JMenuItem itemMenu3;
	private JMenuItem itemMenu4;
	
	private JMenuItem itemMenu5;
	private JMenuItem itemMenu6;
	private JPanel painelDaJanela;
	
	
	
	public void iniciaGui() {
		
		//criar as instancias
	janela= new JFrame("Menu");
	barraMenu = new JMenuBar();
	menu01 = new JMenu("Cadastro");
	menu02 = new JMenu("Registro");
	itemMenu1 = new JMenuItem("Aluno");
	itemMenu2 = new JMenuItem("Funcionario");
	itemMenu3 = new JMenuItem("Cidade");
	itemMenu4 = new JMenuItem("Estado");
	
	itemMenu5 = new JMenuItem("Aluno");
	itemMenu6 = new JMenuItem("Funcionario");
	
	painelDaJanela = (JPanel) janela.getContentPane();
	

	//======== acrescentar menus na barra de menu=====
	
	barraMenu.add(menu01);
	barraMenu.add(menu02);
	
		
	//====== acrecentando itens no menu cadastro====
	menu01.add(itemMenu1);
	menu01.add(itemMenu2);
	menu01.add(itemMenu3);
	menu01.add(itemMenu4);
	
	//====== acrecentando itens no menu Registro====
	
	menu02.add(itemMenu5);
	menu02.add(itemMenu6);
	
	
	//configurando a ação do item de menu 1
	itemMenu1.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			
			
		}
	});
	
	
	//configurando a ação do item de menu 2
		itemMenu2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
	
	//configuracao do painel da tela
	painelDaJanela.setLayout(null);

	
	// configuraçoes da tela
	janela.setJMenuBar(barraMenu);
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setSize(300, 300);
	janela.setVisible(true);
	
	//=======chamar as telas=======
	
	Funcionario.addActionListener(new ActionListener() {
		
		public void actionPerforwed(ActionEvent e) {
			
			// TODO auto generated method stub
			// new MenuView().iniciaGui();
			// janela.dispose();
			new FuncionarioView();
		}
		
	
		
	}
	
}
