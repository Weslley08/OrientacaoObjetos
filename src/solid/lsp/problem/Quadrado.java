package solid.lsp.problem;

public class Quadrado extends Retangulo {

	@Override
	public void setAltura(float altura) {
		super.setAltura(altura);
		super.setLargura(altura);
	}

	@Override
	public void setLargura(float largura) {
		super.setLargura(largura);
		super.setAltura(largura);
	}

}
