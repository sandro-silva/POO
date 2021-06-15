import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class Busca extends JFrame {

	private JPanel contentPane;
	private static SistemaEletronico sistema;
	private JTextField FabricanteINPUT;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Busca frame = new Busca(sistema);
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Busca(SistemaEletronico sistema) {
		this.sistema = sistema;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		FabricanteINPUT = new JTextField();
		FabricanteINPUT.setBounds(44, 23, 96, 19);
		contentPane.add(FabricanteINPUT);
		FabricanteINPUT.setColumns(10);
		
		Button BuscaBotão = new Button("Buscar");
		BuscaBotão.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List<Produto> produto = sistema.buscaProdutoPorFabricante(FabricanteINPUT.getText());
				JOptionPane.showMessageDialog(null, produto);
			}
		});
		BuscaBotão.setBounds(158, 23, 96, 21);
		contentPane.add(BuscaBotão);
	}
}
