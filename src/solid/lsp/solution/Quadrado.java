package solid.lsp.solution;

public class Quadrado implements Area {

	private float altura;
	private float largura;

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getLargura(float largura) {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	@Override
	public float getArea() {
		return altura * largura;
	}

}
