package view;

import controller.ThreadSapo;

public class Principal {

	public static void main(String[] args) {
		int tamanhoCorrida = 100;
		int tamanhoPulo = 10;
		
		for(int i =0; i<5;i++) {
			Thread ts = new ThreadSapo(tamanhoCorrida, tamanhoPulo);
			ts.start();
		}
	}

}
