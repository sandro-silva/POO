package br.ufpb.dcx.provedor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class CriadorDeArquivos {
	public static final String ARQUIVO_CONTATOS = "arquivo.txt";
	
	public CriadorDeArquivos() {
		
	}
	
	public void gravarContatos(List<Contato> contato) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARQUIVO_CONTATOS))) {
			out.writeObject(contato);
		} catch (Exception e) {
			throw new IOException(e);
		}
	}
	
	public List<Contato> recuperarContatos() throws IOException {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARQUIVO_CONTATOS))) {
			return (List<Contato>) in.readObject();
		} catch (Exception e) {
			throw new IOException(e);
		}
	}

}
