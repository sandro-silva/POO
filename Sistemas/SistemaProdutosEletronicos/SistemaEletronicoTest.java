import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaEletronicoTest {

	Produto novoProduto;
	SistemaEletronico sistema;
	
	
	@BeforeEach
	void setUp() throws Exception {
		this.novoProduto = new Produto("Celular","Motorola");
		this.sistema = new SistemaEletronico();
	}

	@Test
	void test() {
		assertTrue(novoProduto.getNome().equals("Celular"));
		assertEquals("Celular",novoProduto.getNome());
		//this.sistema.  Continuar
	}

}
