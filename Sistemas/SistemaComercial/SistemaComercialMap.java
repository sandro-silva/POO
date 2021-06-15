package br.ufpb.dcx.sistemacomercial;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SistemaComercialMap implements SistemaComercial {
	private Map<String, Cliente> clientes;
	private Map<String, Produto> produtos;

	public SistemaComercialMap() {
		this.clientes = new HashMap<String, Cliente>();
		this.produtos = new HashMap<String, Produto>();
	}

	@Override
	public boolean existeProduto(Produto produto) {
		if (this.produtos.containsKey(produto.getCodigo())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Produto pesquisaProduto(String codigoProduto) throws ProdutoNaoExisteException {
		if (this.produtos.containsKey(codigoProduto)) {
			return this.produtos.get(codigoProduto);
		}
		throw new ProdutoNaoExisteException("Não foi encontrado produto"

				+ " com o código " + codigoProduto);
	}
	
	@Override
	public Collection<Produto> pesquisaProdutosDaCategoria(CategoriaProduto categoria) {
		Collection<Produto> produtosCategoria = new ArrayList<>();
		for (Produto p : produtos.values()) {
			if (p.getCategoria().equals(categoria)) {
				produtosCategoria.add(p);
			}
		}
		return produtosCategoria;
	}

	@Override
	public boolean cadastraProduto(Produto produto) {
		if (existeProduto(produto)) {
			return false;
		} else {
			this.produtos.put(produto.getCodigo(),produto);
			return true;
		}
	}
	
	@Override
	public boolean existeCliente(Cliente cliente) {
		if (this.clientes.containsKey(cliente.getId())) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public Cliente pesquisaCliente(String getId) throws ClienteNaoExisteException {
		if (this.clientes.containsKey(getId)) {
			return this.clientes.get(getId);
		}
		throw new ClienteNaoExisteException("Não foi encontrado cliente"
			+ " com o id " + getId);
	}

	public Map<String, Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Map<String, Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public Collection<Produto> pesquisaProdutosEmFaixaDePreco(double limiteInferior, double limiteSuperior) {
		Collection<Produto> produtosAchados = new ArrayList<Produto>();
		for (Produto p: produtos.values()) {
			if (p.getPrecoVenda()>=limiteInferior && p.getPrecoVenda()<=limiteSuperior) {
				produtosAchados.add(p);
			}
		}
		return produtosAchados;
	}

	@Override
	public Collection<Produto> pesquisaProdutosComDescricaoComecandoCom(String prefixo) {
		Collection<Produto> produtosAchados = new ArrayList<Produto>();
		for (Produto p: produtos.values()) {
			if (p.getDescricao().startsWith(prefixo)) {
				produtosAchados.add(p);
			}
		}
		return produtosAchados;
	}
	
	public boolean cadastraCliente(Cliente cliente) {
		if (existeCliente(cliente)) {
			return false;
		} else {
			this.clientes.put(cliente.getId(), cliente);
		}
		return true;
	}
	
}
