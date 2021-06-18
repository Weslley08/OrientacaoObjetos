package solid.dip.problem;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

	private MySqlConnection mySqlConnection;

	public ProdutoRepository() {
		this.mySqlConnection = new MySqlConnection();
	}
	
	public List<Produto> buscarProdutos() {
		return new ArrayList<>();
	}

	public void salvarOrdemCompra(Produto produto) {
	}

}
