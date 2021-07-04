package aluno;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BotaoAction extends AbstractAction{
	private JTextField nome;
	private Cadastro sisCadastro;
	public BotaoAction(JTextField n,Cadastro sisCadastro) {
		this.nome = n;
		this.sisCadastro = sisCadastro;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { // qnd clicar no botao executa abaixo comando
					
		Contato c = new Contato(nome.getText());
		boolean cadastrou = sisCadastro.cadastraContato(c);
		//........................................................
		if(sisCadastro.cadastraContato(c) == true) {
			System.out.println(" já tem");
		}else {
			System.out.println("não tem");
			//JOptionPane.showMessageDialog(null,"Contato Ainda Não tem  ");
		}
		//........................................................
		JOptionPane.showMessageDialog(null,"foi adicionado " + nome.getText());//boolean
				
	}
}



		//JOptionPane.showMessageDialog(null,"com esse nome = "+ sisCadastro.cadastraContato(c));
		//nome.getText() //retorna texto digitado na caixa de texto acima
		//String nomeContato = JOptionPane.showInputDialog("Pesquisar qual o nome do contato?");
		// digitar o nome a pesquisar
		//JOptionPane.showMessageDialog(null, sisCadastro.pesquisaContato(nomeContato));
		// pesquisa acima
		//System.out.println("olá  "+ c.getNome().toString());
        // terminal
