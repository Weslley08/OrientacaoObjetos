package solid.isp.problem;

public class Pinguim implements Ave {

	@Override
	public void bicar() {
		// Ave bica
	}

	/* Infrigiu o acronimo Princ�pio da Segrega��o de Interfaces (ISP)
	*  muitas interfaces espec�ficas s�o melhores do que uma interface geral */
	@Override
	public void voar() {
		// Ave n�o voa
	}
	
	@Override
	public void botarOvos() {
		// Ave choca ovos
	}
}
