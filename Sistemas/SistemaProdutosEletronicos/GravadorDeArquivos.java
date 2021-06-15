import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class GravadorDeArquivos {
	
	public static final String ARQUIVO_ELETRONICO = "arquivo.txt";
	
	public GravadorDeArquivos() {
		
	}
	
	public void gravarProdutos(List<Produto> produto) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARQUIVO_ELETRONICO))) {
			out.writeObject(produto);
		} catch (Exception e) {
			throw new IOException(e);
		}
	}
	
	public List<Produto> recuperarProdutos() throws IOException {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARQUIVO_ELETRONICO))) {
			return (List<Produto>) in.readObject();
		} catch (Exception e) {
			throw new IOException(e);
		}
	}

}
