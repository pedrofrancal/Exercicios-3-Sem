package controller;

public class ThreadMatriz extends Thread{
	private int[] linha = new int[5];
	private int nlinha;
	
	public ThreadMatriz(int coluna[][], int nlinha) {
		for(int i = 0; i<5; i++) {
			this.linha[i] = coluna[nlinha][i];
		}
		this.nlinha = nlinha;
	}
	
	@Override
	public void run() {
		calculaSoma();
	}

	private void calculaSoma() {
		int soma = 0;
		for(int i = 0; i<5; i++) {
			soma+=linha[i];
		}
		System.out.println("LINHA "+nlinha+" RESULTA EM "+soma);
	}
}
