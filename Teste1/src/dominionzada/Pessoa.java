package dominionzada;

public class Pessoa {
	
	private String nome;
	public void setNome(String nome) {
		this.nome = nome;
		}
	
	private String cpf;
	public void setCpf(String cpf) {
		this.cpf = cpf;
		}
	
	public String getCpf() {
		return this.cpf;
		}
	
	public String getNome() {
		return this.nome;
		}
	
	public void imprimir () {
		System.out.println("Nome: "+ this.getNome() + "   CPF: " + this.getCpf());
	}
	
}
