package view;

import javax.swing.JOptionPane;

import controller.SistemaController;

public class Main {

	public static void main(String[] args) {
		int opc = 0;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - VER PROCESSOS\n2 - MATAR PROCESSO\n9 - SAIR"));
			switch (opc) {
			case 1:
				SistemaController sc = new SistemaController();
				sc.processRunning();
				break;
			case 2:
				String process;
				process = JOptionPane.showInputDialog("Digite o PID ou nome do processo para matar");
				SistemaController sc1 = new SistemaController();
				sc1.killProcess(process);
				break;
			case 9:
				System.out.println("Saindo");
				System.exit(0);
				break;
			default:
				System.out.println("Opção Inexistente");
				break;
			}
		} while (opc != 9);
	}

}
