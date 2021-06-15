package br.ufpb.dcx.sistemacomercial;

import javax.swing.JOptionPane;

public class TestaSistema {
	public static void main(String [] args) {
		boolean sair = false;
		SistemaComercialMap sistema = new SistemaComercialMap();
		while (!sair) {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite uma opção:\n1. Cadastrar Produto\n"
							+"2. Pesquisar Produto\n"
							+"3. Cadastrar Cliente\n"
							+"4. Pesquisar Cliente\n"
							+"5. Sair\n"));
			switch(opcao) {
			  case 1:
					String codigo = JOptionPane.showInputDialog("Qual o nome do produto? ");
					String descricao = JOptionPane.showInputDialog("Qual a descrição do produto? ");
					double precoVenda = Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do produto? "));
					int quantidadeEmEstoque = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade em estoque? "));
					String categoria = JOptionPane.showInputDialog("Qual a categoria do produto? ");
					if (categoria.equalsIgnoreCase("ALIMENTO")) {
						Produto novoProduto = new Produto(codigo, descricao, precoVenda, quantidadeEmEstoque, CategoriaProduto.ALIMENTO);
						sistema.cadastraProduto(novoProduto);					
					}
					if (categoria.equalsIgnoreCase("ROUPA")) {
						Produto novoProduto = new Produto(codigo, descricao, precoVenda, quantidadeEmEstoque, CategoriaProduto.ROUPA);
						sistema.cadastraProduto(novoProduto);
					}
					if (categoria.equalsIgnoreCase("PRODUTO_DE_LIMPEZA")) {
						Produto novoProduto = new Produto(codigo, descricao, precoVenda, quantidadeEmEstoque, CategoriaProduto.PRODUTO_DE_LIMPEZA);
						sistema.cadastraProduto(novoProduto);
					}
					if (categoria.equalsIgnoreCase("DEFAULT")) {
						Produto novoProduto = new Produto(codigo, descricao, precoVenda, quantidadeEmEstoque, CategoriaProduto.DEFAULT);
						sistema.cadastraProduto(novoProduto);
					}
					break;
					
			  case 2:
				   String codigoPesquisa = JOptionPane.showInputDialog("Qual o código da Pesquisa? ");
				   try {
					   Produto produtoAchado = sistema.pesquisaProduto(codigoPesquisa);
					   JOptionPane.showMessageDialog(null, produtoAchado.toString());
				   }
				   catch (ProdutoNaoExisteException e) {
					   JOptionPane.showMessageDialog(null, e.getMessage());
				   }
				   break;
					
			  case 3:
				  String tipoCliente = JOptionPane.showInputDialog("PF ou PJ? ");
				  String nome = JOptionPane.showInputDialog("Qual o nome do Cliente? ");
				  String endereco = JOptionPane.showInputDialog("Qual o endereço do Cliente? ");
				  String email = JOptionPane.showInputDialog("Qual o email do Cliente? ");
				  if (tipoCliente.equalsIgnoreCase("PF")) {
					  String CPF = JOptionPane.showInputDialog("Qual o CPF? ");
					  ClientePF novoClientePF = new ClientePF(nome, endereco, email, CPF);
					  sistema.cadastraCliente(novoClientePF);					
					}
				  if (tipoCliente.equalsIgnoreCase("PJ")) {
					  String CNPJ = JOptionPane.showInputDialog("Qual o CNPJ? ");
					  ClientePJ novoClientePJ = new ClientePJ(nome, endereco, email, CNPJ);
					  sistema.cadastraCliente(novoClientePJ);					
					}
					break;
					
			  case 4:
				  String getId = JOptionPane.showInputDialog("Qual o Id do Cliente? ");
				  try {
					  Cliente clienteAchado = sistema.pesquisaCliente(getId);
					  JOptionPane.showMessageDialog(null, clienteAchado.toString());
				  }
				  catch (ClienteNaoExisteException e) {
					  e.getMessage();
				  }
					
			  case 5:
					sair = true;
					break;					  
			}
				  
		}
		JOptionPane.showMessageDialog(null, "Até mais!");
			
	}

}
