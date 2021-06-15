import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SistemaControleProdutos {
	private GravadorDeArquivos gravador;
	private List<Produto> produto;
	
	public SistemaControleProdutos() {
		this.gravador = new GravadorDeArquivos();
		this.recuperarProdutos();  	
	}
	
	public void recuperarProdutos() {
		try {
			this.produto = this.gravador.recuperarProdutos(); 
		} catch (IOException e) {
			this.produto = new ArrayList<Produto>();
			System.out.println("Erro ao recuperar arquivos:"+e.getMessage());
		}
	}
	
	public void salvarProdutos() {
		try {
			this.gravador.gravarProdutos(produto);
		} catch (IOException e) {
			System.out.println("Erro ao salvar:"+e.getMessage());
		}
	}

}
