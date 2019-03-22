package dominionzada;

import java.util.Date;

public class Application {
	public static void main(String[] args) {
		
		Professor thammy = new Professor();
		thammy.setNome("Thammy");
		thammy.setCpf("12036104401");
		thammy.imprimir();
		
		thammy.setAdmissao(new Date());
	}

}
