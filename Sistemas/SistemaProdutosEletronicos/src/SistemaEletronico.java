package br.ufpb.dcx.projetoeletronico;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SistemaEletronico {

    private List<Produto> produto;
    private GravadorDeArquivos gravador = new GravadorDeArquivos();
    
    public SistemaEletronico() {
    	try {
			this.produto = this.gravador.recuperarProdutos();
		} catch (IOException e) {
			this.produto = new ArrayList<>();
			e.printStackTrace();
		}   
        
    }
    
    public void salvarArquivos() throws IOException {
    	this.gravador.gravarProdutos(this.produto);
    }
    

    public boolean CadastrarProdutos(String nome, String fabricante) {
        for (Produto p:this.produto) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return false;
            }
        }
        Produto novoProduto = new Produto(nome, fabricante);
        this.produto.add(novoProduto);
        return true;
    }
    
    public List<Produto> buscaProdutoPorFabricante(String fabricante) {
    	List<Produto> produtosEncontrados = new ArrayList<>();
    	for (Produto p:this.produto) {
    		if (p.getFabricante().equalsIgnoreCase(fabricante)) {
    			produtosEncontrados.add(p);
    		}
    	}
    	return produtosEncontrados;
    }

}