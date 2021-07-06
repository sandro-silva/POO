package br.ufpb.dcx.provedor;

import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadastroTest {

	private static final String nomeArquivo = "arquivo.txt";
	Cadastro sistema;

	@BeforeEach
	void setUp() throws Exception {
		this.sistema = new Cadastro();
	}

	@Test
	public void testCadastroSimples() {

		File cadastraContatos = new File(nomeArquivo);
		assertFalse(cadastraContatos.exists());
		Contato contato = new Contato("Sandro");
		try {
			this.sistema.cadastraContato(contato);
			this.sistema.salvarDados();
			cadastraContatos = new File(nomeArquivo);
			assertTrue(cadastraContatos.exists());
		} catch (IOException e) {
			fail("Não deveria lançar exceção ao cadastrar os contatos");
		}
		cadastraContatos.delete();
	}

	@Test
	public void testRecuperaContatos() {
		File recuperaContatos = new File(nomeArquivo);
		assertFalse(recuperaContatos.exists());
		Contato contato = new Contato("Sandro");
		try {
			this.sistema.cadastraContato(contato);
			this.sistema.salvarDados();
			// this.cadastrar.recuperaContatos(contato);
			recuperaContatos = new File(nomeArquivo);
			assertTrue(recuperaContatos.exists());
			this.sistema.recuperaContatos();
			assertTrue(sistema.pesquisaContato("Sandro") != null);
		} catch (IOException e) {
			fail("Não deveria lançar exceção ao gravar os contatos");
		}
		recuperaContatos.delete();
	}

}
