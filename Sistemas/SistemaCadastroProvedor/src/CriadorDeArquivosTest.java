package br.ufpb.dcx.provedor;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CriadorDeArquivosTest {
	
	CriadorDeArquivos cadastrar;
	
	Contato novoContato;
	Cadastro sistema;
	
	
	@BeforeEach
	void setUp() throws Exception {
		this.novoContato = new Contato("Sandro");
		this.sistema = new Cadastro();
	}

	@Test
	void test() {
		assertTrue(novoContato.getNome().equals("Sandro"));
		assertEquals("Sandro", novoContato.getNome());
		//this.sistema.  Continuar
	}

	//@BeforeEach
	//void setUp() throws Exception {
		//this.cadastrar = new CriadorDeArquivos();
	//}
/*
	@Test
	void testGravarContato() {
		File arquivoContatos = new File(CriadorDeArquivos.ARQUIVO_CONTATOS);
		assertFalse(arquivoContatos.exists());
		List<Contato> contato = new ArrayList<Contato>();
		contato.add(new Contato("Sandro"));
		try {
			this.cadastrar.gravarContatos(contato);
			arquivoContatos = new  File(CriadorDeArquivos.ARQUIVO_CONTATOS);
			assertTrue(arquivoContatos.exists());
		} catch (IOException e) {
			fail("Não deveria lançar exceção ao gravar os contatos");
		}
		arquivoContatos.delete();
	}
*/
	
}
