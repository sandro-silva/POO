package br.ufpb.dcx.provedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;//JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class TelaPrincipal extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel p = new JPanel();  // botão ok
	JButton ok = new JButton("ok");
	JPanel panel = new JPanel();//Jpanel(abas)
	JMenuBar menuBar = new JMenuBar(); //barra menu  instânciado
	JMenu arquivo = new JMenu("Arquivo");
	JMenuItem itemCadastrar = new JMenuItem("Novo Cadastro"); //sub menu
	JMenuItem itemPesquisar = new JMenuItem("consulta Cadastro");
	JMenuItem itemSair = new JMenuItem("Sair");
	//JButton oi = new JButton("ok");
	public TelaPrincipal  (Cadastro sisCadastro2, TelaCadastro telaCadastro) { // menu ou caixa  construtor
		setTitle("Tela princippal");
		setSize(1370,770);//size tamanho(largura , altura); da janela
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//this.setLocation(100,100);
		setLocationRelativeTo(null);//centralizar janela
		
		//----------------------------------------------------
		p.add(ok);
		///oi.setBounds(295, 49, 49, 23);
		//panel.add(oi);
		
		//p.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(p);
		//p.setLayout(null);
		
		//JButton ok = new JButton("ok");
		//ok.setBounds(242, 159, 89, 23);
		
		//-------------------atalhos-------------------------
		//arquivo.setMnemonic('A');   //atalhos    alt A
		//itemCadastrar.setMnemonic('N'); //atalhos    alt N
		//itemSair.setMnemonic('S');      //atalhos    alt S
		//-------------------Barra Menu----------------------
		//menuBar.add(arquivo);         //aparece na barra
		//arquivo.add(itemCadastrar); //aparece cadastrar 
		//arquivo.add(itemPesquisar);
		//arquivo.add(itemSair);      //aparece sair
		//--------- texto comentario ------------------------
		
		//.....................faz funcionar su menu cadastrar...................
		itemCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				TelaCadastro  tela1 = new TelaCadastro (sisCadastro2);
				tela1.setVisible(true);
			}
		});
		arquivo.add(itemCadastrar);
		//-------------------- faz funcionar sub menu arquivo--------------------
		itemPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				TelaPesquisa  tela2 = new TelaPesquisa (sisCadastro2);
				tela2.setVisible(true);
			}
		});
		arquivo.add(itemPesquisar);
		//------------------------ação menu item sair-----------------------------
		itemSair.addActionListener(new ActionListener() { // ação pra sair
			public void actionPerformed(ActionEvent e) { // qnd clicar no botao executa abaixo comando
				System.exit(0);
			}
		}); 
		arquivo.add(itemSair); 
		//----------------------------ação botão sair-----------------------------
		menuBar.add(arquivo);
		setJMenuBar(menuBar);
		
	}
	
}
