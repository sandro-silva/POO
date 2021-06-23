package br.ufpb.dcx.projetoeletronico;
import java.io.Serializable;

public class Produto implements Serializable{

    private String nome;
    private String Fabricante;

    public Produto(String nome, String fabricante) {
        super();
        this.nome = nome;
        Fabricante = fabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String fabricante) {
        Fabricante = fabricante;
    }

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", Fabricante=" + Fabricante + "]";
	}
    

}
