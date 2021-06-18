package solid.isp.problem;

public class Pinguim implements Ave {

	@Override
	public void bicar() {
		// Ave bica
	}

	/* Infrigiu o acronimo Princípio da Segregação de Interfaces (ISP)
	*  muitas interfaces específicas são melhores do que uma interface geral */
	@Override
	public void voar() {
		// Ave não voa
	}
	
	@Override
	public void botarOvos() {
		// Ave choca ovos
	}
}
