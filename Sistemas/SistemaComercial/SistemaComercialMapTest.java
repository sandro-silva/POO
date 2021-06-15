package br.ufpb.dcx.sistemacomercial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;

import org.junit.jupiter.api.Test;

public class SistemaComercialMapTest {
	@Test
	public void testaCadastroProdutos() {
		SistemaComercialMap sistema = new SistemaComercialMap();
		Collection<Produto> alimentos = sistema.pesquisaProdutosDaCategoria(CategoriaProduto.ALIMENTO);
		assertTrue(alimentos.size() == 0);
		sistema.cadastraProduto(new Produto("333","Calça Boca de Sino", 100.00, 100, CategoriaProduto.ROUPA));
		Collection<Produto> produtosNoPreco =
				sistema.pesquisaProdutosEmFaixaDePreco(50, 150);
		assertTrue(produtosNoPreco.size()==1);
		Collection<Produto> produtosCalca = 
				sistema.pesquisaProdutosComDescricaoComecandoCom("Calça");
		assertTrue(produtosCalca.size()==1);
	}
}
