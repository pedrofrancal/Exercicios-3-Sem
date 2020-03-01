package controller;

public class ThreadCarro extends Thread {
	private int x;
	private int y;
	private int tamanhoPista;

	public ThreadCarro(int x, int y, int tamanhoPista) {
		this.x = x;
		this.y = y;
		this.tamanhoPista = tamanhoPista;
	}

	@Override
	public void run() {
		corre();
	}

	private void corre() {
		int tamanhoPercorrido = 0;
		do {
			try {
				this.sleep(100);
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
			}
			
		} while (tamanhoPercorrido < tamanhoPista);
	}
}
