package aluno;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cadastro {   // varios contatos(quantidade, lista)
	private List<Contato> contatos;        //  array de contato      
	private static BufferedReader br;
	
	public Cadastro () { // construtor cadastro
		this.contatos = new ArrayList<>();     //cria Lista de contatos
		this.recuperaContatos();
	}
	public void recuperaContatos() {//pega lista de nome do arquivo cria
		//cada contato e coloca na lista contato
		try {
			List<String>dados = this.lerLinhasDeArquivo();
			for(String s : dados) {
				Contato c =  new Contato(s);
				this.contatos.add(c);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public boolean cadastraContato(Contato c) { //cadastro
		if(this.pesquisaContato(c.getNome())==null) {//se pequisa contato passando o nome for igual nulo
			this.contatos.add(c);                    //se não tiver o nome adicione e retorne true 
			return true;
		} else {
			return false;
		}
		
	}
	public Contato pesquisaContato(String nomeContato) { //pesquisa
		for (int k=0; k<this.contatos.size(); k++) { // varre o numeros de elementos
			Contato c = this.contatos.get(k);
			if(c.getNome().equalsIgnoreCase(nomeContato)) {
				return c;
			}
		}
		return null;
		
	} 
	
	public List<String> lerLinhasDeArquivo() throws IOException {
		List<String> linhasLidas = new ArrayList<String>();
		try {
			FileInputStream criadorDeArquios = new FileInputStream("arquivo.txt");
			InputStreamReader input = new InputStreamReader(criadorDeArquios);
			br = new BufferedReader(input);
			
			String linha;
			
			do {
				linha = br.readLine();
				if(linha == null) {
					
					
					
				}else {
					linhasLidas.add(linha);
					//System.out.println(linha);//se tiver nome
				}
			}while (linha!=null);
			
		}finally {
			if (br != null) {
				br.close();
			}
		}
		return linhasLidas;
	}
		
	public void salvarDados()  throws IOException{
		List<String> dadosContatos = new LinkedList<String>();
		for(Contato c:this.contatos) {
			dadosContatos.add(c.getNome());
		}
		gravarTexto(dadosContatos);
	}
	
	                 // nome metodo         nome do arquio        texto
	public void gravarTexto(List<String> pTextoAEscrever) throws IOException {
		BufferedWriter escritor = null;
		try {
								
				FileWriter criadorDeArquios = new FileWriter("arquivo.txt");//
				escritor = new BufferedWriter(criadorDeArquios);
				for(String s:pTextoAEscrever ) {
					escritor.write(s+"\n");
					
					
				}
				
		}
		finally {
			if(escritor != null) {
				escritor.close();
			}
		}
		
	
	}
	
	
	
}
