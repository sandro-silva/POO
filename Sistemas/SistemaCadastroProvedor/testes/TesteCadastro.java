import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteCadastro {

	Cadastro sistema;
	
	@BeforeEach
	void setUp() throws Exception {
		sistema = new Cadastro();
	}

	@Test
	void testCadastraCliente() {
		Contato cliente = new Contato("Sandro", "988880000", "333.333.333-33", "58.100-000", "Rua da Aurora", "151", "Água Fria", "1010", "20/10/2010", "07/07/2021");
		assertTrue(sistema.cadastraContato(cliente));
		
	}
	
	@Test
	void testPesquisaCliente() {
		Contato c = new Contato("Josinaldo", "999990000", "444.444.444-44", "58.000-000", "Rua da Paz", "115", "Torre", "1020", "20/10/2010", "07/07/2021");
		sistema.cadastraContato(c);
                Contato c1 = this.sistema.pesquisaContato("Josinaldo");
                assertEquals("Josinaldo",c1.getNome());
	}

}
