/* O problema do c�digo � que apenas uma classe est� exercendo 
 * diversas fun��es e por isso iremos utilizar o primeiro
 * acr�nimo do SOLID: [S]ingle Responsibility Principle (Princ�pio da Responsabilidade �nica) */

package solid.srp.solution;

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

}
