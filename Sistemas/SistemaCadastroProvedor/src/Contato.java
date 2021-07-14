
public class Contato {           // um contato 
	private String nome;
	private String telefone;
	private String cpf;
	private String cep;
	private String logradouro; //rua
	private String numero;
	private String bairro;
	private String senha;
	private String dataNascimento;
	private String dataInstalacao;
	
	public Contato (String nome,String telefone,String cpf,String cep, // construtor
			String logradouro, String numero,String bairro,String senha,
			String dataNascimento,String dataInstalacao ) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.cep = cep;
		this.logradouro = logradouro;;
		this.numero = numero;
		this.bairro = bairro;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
		this.dataInstalacao = dataInstalacao;
	}	

	public Contato (String nome) {
		this.nome = nome;           // construtor
	
	}
	public String getNome( ) {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String toString() {
		return "  "+ this.nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getDataInstalacao() {
		return dataInstalacao;
	}
	public void setDataInstalacao(String dataInstalacao) {
		this.dataInstalacao = dataInstalacao;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

}
