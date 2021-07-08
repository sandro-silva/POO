
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
public class TelaCadastro extends JFrame implements ActionListener {
	private ActionListener action;
	private Cadastro sisCadastro ;
	
	JMenuBar menuBar = new JMenuBar(); //barra menu 
	JMenu arquivo = new JMenu("Arquivo");
	JMenuItem menuSalvar = new JMenuItem("Salvar");
	
	JLabel txCodigo= new JLabel("Código");	
	JLabel txNome = new JLabel("Nome:");// texto
	JLabel txTelefone =new JLabel("Telefone de Contato:");// texto
	JLabel txCpf =new JLabel("CPF:");
	JLabel txCep =new JLabel("Cep:");
	JLabel txRua =new JLabel("Rua:");
	JLabel txNumero =new JLabel("Número:");
	JLabel txBairro =new JLabel("Bairro:");
	JLabel txSenha =new JLabel("Senha Wi-fi:");
	JLabel txDataNascimento =new JLabel("Data de Nascimento:");
	JLabel txDataInstalacao =new JLabel("Data de Instalação:");
	
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
	
	JButton botaoCadastrar = new JButton("Adicionar Cliente"); // nome no botão (ok)
	//JButton botaoPesquisa = new JButton("Salvar");
	JPanel panel = new JPanel();
	
	public TelaCadastro  (Cadastro sisCadastro) { // menu ou caixa  construtor
		setTitle("cadastro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//fecha só a janela atual
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha tudo
		//setBounds(50,300,600,630);//posição, (size)tamanho(largura , altura); da janela
		setSize(610,450);//só tamanho
		setLocation(350,150);//só posição da janela
		//setLocationRelativeTo(null);//centralizar posição da janela
		
		this.sisCadastro =  sisCadastro;
		//----------------------------------------------------
		getContentPane().setLayout(new BorderLayout(0, 0));//borderLayoutborderLayout
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);//JTabbedPane
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		//------------------aba-Dados Pessoais---------------------------------				
		tabbedPane.addTab("Dados Pessoais", null, panel, null);
		panel.setLayout(null); //deixa solto cx texto
		//----------------------------------------------------
		
		//               ED  SD  TH  TV	
		txCodigo.setBounds(80, 30,146, 14);// "Digite seu nome"
		panel.add(txCodigo);
		cxCodigo.setBounds(70,50,100,23);//tamanho e posição caixa de texto 
		panel.add(cxCodigo);
		
		txNome.setBounds(195, 30,146, 14);// "Digite seu nome"
		panel.add(txNome);// faz aparecer o texto aacima da caixa de texto
		cxNome.setBounds(190,50,330,23);//tamanho e posição caixa de texto 
		panel.add(cxNome);
		
		txTelefone.setBounds(80,80,146, 14);//Digite nome a consultar
		panel.add(txTelefone);
		cxTelefone.setBounds(70,100,200,23);//tamanho e posição caixa de texto 
		panel.add(cxTelefone);
		
		txCpf.setBounds(330,80,146, 14);//Digite nome a consultar
		panel.add(txCpf);	
		cxCpf.setBounds(320,100,200,23);
		panel.add(cxCpf);
		
		txCep.setBounds(80,130,146, 14);
		panel.add(txCep);
		cxCep.setBounds(70,150,120,23);
		panel.add(cxCep);
		
		txRua.setBounds(80,180,146, 14);//Digite nome a consultar
		panel.add(txRua);
		cxRua.setBounds(70,200,350,23);
		panel.add(cxRua);
		
		txNumero.setBounds(440,180,146,14);//Digite nome a consultar
		panel.add(txNumero);
		cxNumero.setBounds(430,200,90,23);//tamanho e posição caixa de texto 
		panel.add(cxNumero);
		
		txBairro.setBounds(80,230,140, 14);//Digite nome a consultar
		panel.add(txBairro);
		cxBairro.setBounds(70,250,165,23);
		panel.add(cxBairro);
		
		txSenha.setBounds(410,130,146,14);//Digite nome a consultar
		panel.add(txSenha);
		cxSenha.setBounds(370,150,150,23);//tamanho e posição caixa de texto 
		panel.add(cxSenha);

		txDataNascimento.setBounds(280,230,146, 14);//Digite nome a consultar
		panel.add(txDataNascimento);
		cxDataNascimento.setBounds(270,250,110,23);
		panel.add(cxDataNascimento);
		
		txDataInstalacao.setBounds(410,230,146, 14);//Digite nome a consultar
		panel.add(txDataInstalacao);
		cxDataInstalacao.setBounds(410,250,110,23);
		panel.add(cxDataInstalacao);


		botaoCadastrar.setBounds(385,300, 130, 23);//
		panel.add(botaoCadastrar);
		botaoCadastrar.addActionListener(this);
		
		
		menuBar.add(arquivo);         //aparece na barra
		setJMenuBar(menuBar);
		arquivo.add(menuSalvar);
		menuSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					sisCadastro.salvarDados();
					JOptionPane.showMessageDialog(null,"dados salvo com sucesso");
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null,"problema ao salvar dados");
					e1.printStackTrace();
				}
			}
		});
		//-----------------------------------------------------------
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
				
		Contato contato = new Contato(cxNome.getText());//contato
		boolean cadastrou = this.sisCadastro.cadastraContato(contato);//cadastro
		if (cadastrou == true) { 
			JOptionPane.showMessageDialog(null,"Foi adicionado " + contato.getNome());
			
		}else {
			JOptionPane.showMessageDialog(null, contato.getNome()+" Já Existe");
		}
		cxNome.setText("");//limpa caixa
	}

}

