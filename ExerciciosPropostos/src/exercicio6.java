import javax.swing.JOptionPane;

/*
6. Desenvolva um algoritmo que receba 10 valores numéricos
inteiros num vetor Num, calcule e mostre
os números primos e suas respectivas posições. 
*/

public class exercicio6 {
	public static void main(String[] args) {
		int[] Num = new int[10];
		for(int cta = 0; cta<10; cta++) {
			Num[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));
		}
		for(int cta = 0; cta<10; cta++) {
			int divisores = 0;
			for(int cta2 = Num[cta]; cta2>0; cta2--) {
				if(Num[cta]%cta2==0) {
					divisores++;
				}
			}
			if(divisores==2) {
				System.out.println("O");
			}
		}
	}
}
