package aluno;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import com.sun.prism.paint.Color;

public class TelaPesquisa extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ActionListener action;
	private Cadastro sisCadastro;
	
	JLabel txCodigoConsulta= new JLabel(" Filtrar por Codigo");
	JLabel txNomeConsulta = new JLabel("Filtrar por Nome:");// texto
	JLabel txCodigo= new JLabel("Codigo");
	JLabel txNome = new JLabel("Nome:");// texto
	JLabel txTelefone =new JLabel("Telefone de Contato:");// texto
	JLabel txCpf =new JLabel("Cpf:");
	JLabel txCep =new JLabel("Cep:");
	JLabel txRua =new JLabel("Rua:");
	JLabel txNumero =new JLabel("Numero:");
	JLabel txBairro =new JLabel("Bairro:");
	JLabel txSenha =new JLabel("Senha Wifi:");
	JLabel txDataNascimento =new JLabel("Data de Nasc:");
	JLabel txDataInstalacao =new JLabel("Data de Instalação");
	
	JTextField cxCodigoConsulta = new JTextField();
	JTextField cxNomeConsulta = new JTextField();
	JTextField cxCodigo = new JTextField();	
	JTextField cxNome = new JTextField(); //caixa de texto
	JTextField cxTelefone = new JTextField();
	JTextField cxCpf = new JTextField();
	JTextField cxCep = new JTextField();	
	JTextField cxRua = new JTextField();
	JTextField cxNumero = new JTextField();
	JTextField cxBairro = new JTextField();
	JTextField cxSenha = new JTextField();
	JTextField cxDataNascimento = new JTextField();
	JTextField cxDataInstalacao = new JTextField();
	
	JButton botaoPesquisa = new JButton("Pesquisa");
	
	JMenuBar menuBar = new JMenuBar(); //barra menu	
	JMenuItem menuSalvar = new JMenuItem("Salvar");	
	
	JPanel panel = new JPanel();
	
	public TelaPesquisa  (Cadastro sisCadastro ) { // menu ou caixa  construtor		
		setTitle("Pesquisa");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(610,450);
		setLocation(350,150);//centralizar janela
		//setLocationRelativeTo(null);
		this.sisCadastro =  sisCadastro;
		
		getContentPane().setLayout(new BorderLayout(0, 0));//borderLayoutborderLayout
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);//JTabbedPane
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		//------------------aba-Dados Pessoais---------------------------------				
		tabbedPane.addTab("Dados Pessoais", null, panel, null);
		panel.setLayout(null); //deixa solto cx texto
	
	
		//                        ED  SD  TH  TV	
		txCodigoConsulta.setBounds(70,30,146, 14);// "Digite seu nome"
		add(txCodigoConsulta);
		cxCodigoConsulta.setBounds(70,50,100,23);//tamanho e posição caixa de texto 
		add(cxCodigoConsulta);
		
		txNomeConsulta.setBounds(195,30,146, 14);// "Digite seu nome"
		add(txNomeConsulta);// faz aparecer o texto aacima da caixa de texto
		cxNomeConsulta.setBounds(190,50,330,23);//tamanho e posição caixa de texto 
		add(cxNomeConsulta);
		
		cxCodigo.setBounds(50,50,100,23);//tamanho e posição caixa de texto 
		add(cxCodigo);
		txCodigo.setBounds(80,80,146, 14);// "Digite seu nome"
		add(txCodigo);
		
		cxNome.setBounds(190,50,330,23);//tamanho e posição caixa de texto 
		add(cxNome);
		cxCodigo.setBounds(70,100,100,23);//tamanho e posição caixa de texto 
		add(cxCodigo);
		
		txNome.setBounds(195,80,146, 14);// "Digite seu nome"
		add(txNome);// faz aparecer o texto aacima da caixa de texto
		cxNome.setBounds(190,100,330,23);//tamanho e posição caixa de texto 
		add(cxNome);
		
		txTelefone.setBounds(80,130,146, 14);//Digite nome a consultar
		add(txTelefone);
		cxTelefone.setBounds(70,150,200,23);//tamanho e posição caixa de texto 
		add(cxTelefone);
		
		txCpf.setBounds(330,130,146, 14);//Digite nome a consultar
		add(txCpf);	
		cxCpf.setBounds(320,150,200,23);
		add(cxCpf);
		
		txCep.setBounds(80,180,146, 14);
		add(txCep);
		cxCep.setBounds(70,200,120,23);
		add(cxCep);
		
		txSenha.setBounds(410,180,146,14);//Digite nome a consultar
		add(txSenha);
		cxSenha.setBounds(370,200,150,23);//tamanho e posição caixa de texto 
		add(cxSenha);
		
		txRua.setBounds(80,230,146, 14);//Digite nome a consultar
		add(txRua);
		cxRua.setBounds(70,250,350,23);
		add(cxRua);
		
		txNumero.setBounds(440,230,146,14);//Digite nome a consultar
		add(txNumero);
		cxNumero.setBounds(430,250,90,23);//tamanho e posição caixa de texto 
		add(cxNumero);
		
		txBairro.setBounds(80,280,140, 14);//Digite nome a consultar
		add(txBairro);
		cxBairro.setBounds(70,300,165,23);
		add(cxBairro);
		
		txDataNascimento.setBounds(280,280,146, 14);//Digite nome a consultar
		add(txDataNascimento);
		cxDataNascimento.setBounds(270,300,110,23);
		add(cxDataNascimento);
		
		txDataInstalacao.setBounds(410,280,146, 14);//Digite nome a consultar
		add(txDataInstalacao);
		cxDataInstalacao.setBounds(410,300,110,23);
		add(cxDataInstalacao);
		
		
		botaoPesquisa.setBounds(385,350,130,23);//botão pesquisar
		add(botaoPesquisa);
		
		
		botaoPesquisa.addActionListener((ae)->{//expressao lambda
			String nomeContato = new String(cxNomeConsulta.getText());//dentro da caixa de texto
			Contato c = sisCadastro.pesquisaContato(nomeContato);
			if (c == null) {
			JOptionPane.showMessageDialog(null,"contato não encontrado" );	
			}else {
				JOptionPane.showMessageDialog(null,"contato encontrado"+c.toString() );
				cxNome.setText(c.toString());
			}
			cxNomeConsulta.setText("");
		});
		
		
				
		JPanel p = new JPanel();
		add(p);//adiciona botao ok
	}
	

}

