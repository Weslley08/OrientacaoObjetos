package solid.dip.solution;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

	private DbConnection dbConnection;

	public ProdutoRepository() {
		this.dbConnection = dbConnection;
	}
	
	public List<Produto> buscarProdutos() {
		return new ArrayList<>();
	}

	public void salvarOrdemCompra(Produto produto) {
	}

}
