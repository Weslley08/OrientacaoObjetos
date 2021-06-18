package solid.lsp.problem;

public class Retangulo {

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

	public float getArea() {
		return altura * largura;
	}

}
