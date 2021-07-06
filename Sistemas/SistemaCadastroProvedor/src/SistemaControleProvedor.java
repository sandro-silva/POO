package br.ufpb.dcx.provedor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SistemaControleProvedor {
	private CriadorDeArquivos cadastrar;
	private List<Contato> contato;
	
	public SistemaControleProvedor() {
		this.cadastrar = new CriadorDeArquivos();
		this.recuperarContatos();  	
	}
	
	public void recuperarContatos() {
		try {
			this.contato = this.cadastrar.recuperarContatos();
		} catch (IOException e) {
			this.contato = new ArrayList<Contato>();
			System.out.println("Erro ao recuperar arquivos:"+e.getMessage());
		}
	}

	public void salvarContatos() {
		try {
			this.cadastrar.gravarContatos(contato);
		} catch (IOException e) {
			System.out.println("Erro ao salvar:"+e.getMessage());
		}
	}

}
