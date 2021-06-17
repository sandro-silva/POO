package br.ufpb.dcx.projetoeletronico;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GravadorDeArquivosTest {
	
	GravadorDeArquivos gravador;
	
	@BeforeEach
	void setUp() throws Exception {
		this.gravador = new GravadorDeArquivos();
	}

	@Test
	void testGravarProduto() {
		File arquivoProdutos = new File(GravadorDeArquivos.ARQUIVO_ELETRONICO);
		assertFalse(arquivoProdutos.exists());
		List<Produto> produto = new ArrayList<Produto>();
		produto.add(new Produto("Celular","Apple"));
		try {
			this.gravador.gravarProdutos(produto);
			arquivoProdutos = new  File(GravadorDeArquivos.ARQUIVO_ELETRONICO);
			assertTrue(arquivoProdutos.exists());
		} catch (IOException e) {
			fail("Não deveria lançar exceção ao gravar os produtos");
		}
		arquivoProdutos.delete();
	}
	
	@Test
	void testGravarERecuperarProdutos() {
		File arquivoProdutos = new File(GravadorDeArquivos.ARQUIVO_ELETRONICO);
		assertFalse(arquivoProdutos.exists());
		List<Produto> produto = new ArrayList<Produto>();
		produto.add(new Produto("Notebook","Dell"));
		try {
			this.gravador.gravarProdutos(produto);
			arquivoProdutos = new  File(GravadorDeArquivos.ARQUIVO_ELETRONICO);
			assertTrue(arquivoProdutos.exists());
			List<Produto> produtosRecuperados = this.gravador.recuperarProdutos();
			assertTrue(produtosRecuperados.size()==1);
			assertEquals("Notebook", produtosRecuperados.get(0).getNome());
		} catch (IOException e) {
			fail("Não deveria lançar exceção ao gravar os produtos");
		}
		arquivoProdutos.delete();
	}	
}
