import java.util.Date;
import java.text.SimpleDateFormat;

public class HelloWorld {
	
	Date data = new Date();
	SimpleDateFormat formatar = new SimpleDateFormat("H:m:s");
	String df = formatar.format(data);
	
	private String nome;
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void imprimir( ) {
		System.out.println(df + " - Olá " + this.getNome() + " você acabou de fazer seu primeiro Hello World em java.");
	}
}
