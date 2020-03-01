package controller;

public class ThreadSapo extends Thread {
	private int tamanhoCorrida;
	private int tamanhoPulo;

	public ThreadSapo(int tamanhoCorrida, int tamanhoPulo) {
		this.tamanhoCorrida = tamanhoCorrida;
		this.tamanhoPulo = tamanhoPulo;
	}

	@Override
	public void run() {
		pula();
	}

	private void pula() {
		int qtPulos = 0;
		int qtPulada = 0;
		do {
			qtPulos++;
			int qtPuladaTemp;
			qtPuladaTemp = (int) (Math.random() * (tamanhoPulo + 1));
			qtPulada+=qtPuladaTemp;
			System.out.println("O SAPO "+getId()+" PULOU "+qtPuladaTemp+" COM O TOTAL DE "
					+qtPulada+" METROS PERCORRIDOS");
		} while (qtPulada < tamanhoCorrida);
		System.out.println("COM " + qtPulos + " PULOS O SAPO " + getId() +
				" PERCORREU " + qtPulada + " METROS");
	}

}
