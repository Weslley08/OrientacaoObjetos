package solid.ocp.solution;

public class DescontoLivroAutoAjuda implements DescontoLivro {

	@Override
	public float ValorDesconto() {
		return 0.5F;
	}
}
