package controller;

public class ThreadNumero extends Thread {

	private int numero;

	public ThreadNumero(int n) {
		this.numero = n;
	}
	
	@Override
	public void run() {
		retornaNumero();
	}

	private void retornaNumero() {
		System.out.println("ID "+getId()+" e numero "+numero);
	}
}
