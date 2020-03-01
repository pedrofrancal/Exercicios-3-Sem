package view;

import javax.swing.JOptionPane;

import controller.RedesController;

public class Main {
	public static void main(String[] args) {
//		System.out.println(System.getProperty("os.name"));
		int opc = 0;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - IP\n2 - PING\n9 - SAIR"));
			switch (opc) {
			case 1:
				RedesController rc = new RedesController();
				rc.ip(System.getProperty("os.name"));
				break;
			case 2:
				RedesController rc1 = new RedesController();
				rc1.ping(System.getProperty("os.name"));
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
