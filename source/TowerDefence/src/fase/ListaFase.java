package fase;

import unidade.Inimigo;

public class ListaFase {

	private Fase inicio;

	public ListaFase() {
		Inimigo i1 = new Inimigo(5, 50, 1, 1, 1);
		Fase fase1 = new Fase(1, 2, 1, i1, null);
		inicio = fase1;
	}

	public Fase getInicio() {
		return inicio;
	}

	public void setInicio(Fase inicio) {
		this.inicio = inicio;
	}

}
