package solid.ocp.solution;

public class DescontoLivroInfantil implements DescontoLivro {

	@Override
	public float ValorDesconto() {
		return 0.3F;
	}
}
