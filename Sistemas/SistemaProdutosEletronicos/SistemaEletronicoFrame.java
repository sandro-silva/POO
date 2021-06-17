package br.ufpb.dcx.projetoeletronico;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SistemaEletronicoFrame extends JFrame {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    SistemaEletronico sistema = new SistemaEletronico();
    GravadorDeArquivos gravador = new GravadorDeArquivos(); 
   
    Busca busca = new Busca(sistema);

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SistemaEletronicoFrame frame = new SistemaEletronicoFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public SistemaEletronicoFrame() {
    	addWindowListener(new WindowAdapter() {
    		@Override
    		public void windowOpened(WindowEvent e) {
    			try {
    				gravador.recuperarProdutos();
				} catch (IOException e1) {
				System.out.println(e1.getMessage());
				}
    		}
    	});
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu cadastroMenu = new JMenu("Cadastros");
        menuBar.add(cadastroMenu);

        JMenuItem mntmNewMenuItem = new JMenuItem("Produtos");
        mntmNewMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ProdutosEletronicos(sistema).setVisible(true);
            }
        });
        cadastroMenu.add(mntmNewMenuItem);
        
        JMenu Busca = new JMenu("Busca");
        menuBar.add(Busca);
        
        JMenuItem BuscaPorFabricante = new JMenuItem("Busca Por Fabricante");
        BuscaPorFabricante.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new Busca(sistema).setVisible(true);
        	}
        });
        Busca.add(BuscaPorFabricante);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        
        JLabel linha1, linha2;
	    ImageIcon eletroImg = new ImageIcon("./imgs/Image.jpg");
	        setTitle("Produtos Eletrônicos");
	        setSize(1600,1200); //tamanho da janela
	        setLocation(0, 0);
	        setResizable(false);
	        getContentPane().setBackground(Color.blue);
	        linha1 = new JLabel("Produtos Eletrônicos", JLabel.CENTER);
	        linha1.setForeground(Color.black);
	        linha1.setFont(new Font("Serif", Font.BOLD, 24));
	        linha2 = new JLabel(eletroImg, JLabel.CENTER);
	        getContentPane().setLayout(new GridLayout(3,1));
	        getContentPane().add(linha1);
	        getContentPane().add(linha2);
    }
      
}