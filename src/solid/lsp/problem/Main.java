package solid.lsp.problem;

public class Main {

	public static void main(String[] args) {
		
		/* Um metodo sobreescreveu o outro
		 * Princ�pio da Substitui��o de Liskov (LSP)
		 * Os subtipos devem ser substitu�veis pelos seus tipos base*/
		
		Retangulo retangulo = new Quadrado();
		
		retangulo.setAltura(10);
		retangulo.setLargura(5);
		
		System.out.println("Area: " + retangulo.getArea());
	}

}
