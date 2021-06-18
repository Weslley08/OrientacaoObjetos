package solid.ocp.problem;

public class ControladorDeDescontos {

	public void adicionaDescontoLivroInfantil(DescontoLivroInfantil descontoLivroInfantil) {
		descontoLivroInfantil.ValorDescontoLivroInfantil();
	}

	public void adicionaDescontoLivroAutoAjuda(DescontoLivroAutoAjuda descontoLivroAutoAjuda) {
		descontoLivroAutoAjuda.ValorDescontoLivroAutoAjuda();
	}

	public void adicionaDescontoLivroAcao(DescontoLivroAcao descontoLivroAcao) {
		descontoLivroAcao.ValorDescontoAcao();
	}
}
