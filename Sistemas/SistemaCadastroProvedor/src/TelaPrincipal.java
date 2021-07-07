package br.ufpb.dcx.provedor;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;//JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	JMenuBar menuBar = new JMenuBar(); //barra menu  instanciado
	JMenu arquivo = new JMenu("Arquivo");
	JMenuItem itemCadastrar = new JMenuItem("Novo Cadastro"); //sub menu
	JMenuItem itemPesquisar = new JMenuItem("Consulta Cadastro");
	JMenuItem itemSair = new JMenuItem("Sair");
	//JButton oi = new JButton("ok");
	public TelaPrincipal  (Cadastro sisCadastro2, TelaCadastro telaCadastro) { // menu ou caixa  construtor
		setTitle("Tela principal");
		setSize(1370,770);//size tamanho(largura, altura); da janela
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
			public void actionPerformed(ActionEvent e) { // qnd clicar no botão executa abaixo comando
				System.exit(0);
			}
		}); 
		arquivo.add(itemSair); 
		//----------------------------ação botão sair-----------------------------
		menuBar.add(arquivo);
		setJMenuBar(menuBar);
		
		
		JLabel linha1, linha2;
			ImageIcon eletroImg = new ImageIcon("./imgs/Image1.jpg");
		    	setTitle("Provedor");
		        setSize(1600,1200); //tamanho da janela
		        setLocation(0, 0);
		        setResizable(false);
		        getContentPane().setBackground(Color.blue);
		        linha1 = new JLabel("Provedor", JLabel.CENTER);
		        linha1.setForeground(Color.black);
		        linha1.setFont(new Font("Serif", Font.BOLD, 24));
		        linha2 = new JLabel(eletroImg, JLabel.CENTER);
		        getContentPane().setLayout(new GridLayout(3,1));
		        getContentPane().add(linha1);
		        getContentPane().add(linha2);
	    }
	
}
