package br.ufpb.dcx.provedor;

public class SistemaCadastroProvedor {

	public static void main(String[] args) {
		Cadastro sisCadastro =  new Cadastro ();
		TelaCadastro telaCadastro = new TelaCadastro(sisCadastro);
		//telaCadastro.setVisible(true);oi josinaldo silva
		
		TelaPrincipal  tela1 = new TelaPrincipal (sisCadastro,telaCadastro);
		tela1.setVisible(true);
	}

}
















/*JButton b = new JButton("ok"); // nome no botão ok
BotaoAction action = new BotaoAction();
b.addActionListener(action);
p.add(b);
*/