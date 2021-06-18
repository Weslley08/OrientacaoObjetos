/* O problema do código é que apenas uma classe está exercendo 
 * diversas funções e por isso iremos utilizar o primeiro
 * acrônimo do SOLID: [S]ingle Responsibility Principle (Princípio da Responsabilidade Única) */

package solid.srp.problem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdemDeCompra {

	private List<Produtos> produtos = new ArrayList<>();

	public void adicionarProduto(Produtos produto) {
		produtos.add(produto);
	}

	public void removerProduto(Produtos produto) {
		produtos.remove(produto);
	}

	public BigDecimal calcularTotal() {
		return (BigDecimal) produtos.stream()
			.map(Produtos::getValor)
			.reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	
	public List<OrdemDeCompra> buscarOrdensDeCompra() {
		return new ArrayList<>();
	}
	
	public void salvarOrdemCompra() {}
	
	public void enviarEmail(String email) {}
	
	public void imprimirOrdemCompra() {}
	
	
	
	
}
