package solid.lsp.solution;

public class Main {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		
		quadrado.setAltura(10);
		quadrado.setLargura(5);
		
		System.out.println("Área: " + quadrado.getArea());
	}

}
