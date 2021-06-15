import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProdutosEletronicos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomeINPUT;
	private JTextField fabricanteINPUT;
	static SistemaEletronico sistema;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProdutosEletronicos frame = new ProdutosEletronicos(sistema);
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ProdutosEletronicos(SistemaEletronico sistema) {
		this.sistema = sistema;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 573, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton CadastraBTN = new JButton("Cadastrar");
		CadastraBTN.setFont(new Font("Tahoma", Font.PLAIN, 15));
		CadastraBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean cadastrou = sistema.CadastrarProdutos(nomeINPUT.getText(),fabricanteINPUT.getText());
				if (cadastrou) {
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
				} else {
					JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
				}
			}
		});
		CadastraBTN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		CadastraBTN.setBounds(214, 372, 140, 21);
		contentPane.add(CadastraBTN);
		
		JLabel Nome = new JLabel("Nome:");
		Nome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Nome.setBounds(154, 160, 65, 13);
		contentPane.add(Nome);
		
		nomeINPUT = new JTextField();
		nomeINPUT.setBounds(291, 159, 96, 19);
		contentPane.add(nomeINPUT);
		nomeINPUT.setColumns(10);
		
		JLabel Fabricante = new JLabel("Fabricante:");
		Fabricante.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Fabricante.setBounds(154, 260, 109, 13);
		contentPane.add(Fabricante);
		
		fabricanteINPUT = new JTextField();
		fabricanteINPUT.setBounds(291, 259, 96, 19);
		contentPane.add(fabricanteINPUT);
		fabricanteINPUT.setColumns(10);
	}
	
	
}