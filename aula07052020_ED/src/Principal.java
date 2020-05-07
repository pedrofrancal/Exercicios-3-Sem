
public class Principal {

	public static void main(String[] args) {
		ListaSequencial ls = new ListaSequencial();
		
		Pessoa[] p = new Pessoa[10];
		
		for(int i = 0; i<10; i++) {
			p[i] = new Pessoa();
			p[i].setNome(Integer.toString(i));
			ls.adiciona(p[i]); //parte 3
		}
		
		System.out.println("Tamanho da lista: "+ls.tamanhoLista()); //parte 4
		
		Pessoa[] p2 = new Pessoa[8];
		
		for(int i = 1; i<=8; i++) {
			p[i] = new Pessoa();
			p[i].setNome(Integer.toString(i*12));
			ls.adiciona(p[i]); //parte 5
		}
		
		int tamanho = ls.tamanhoLista();
		for(int i = 0; i<tamanho; i++) {
			Pessoa temp = new Pessoa();
			temp = (Pessoa) ls.getObjeto(i);
			System.out.println("NOME: "+temp.getNome()); //parte 6
		}
		
		Pessoa p3 = new Pessoa();
		
		p3.setNome("pedrão");
		
		ls.adiciona(3, p3); //parte 7
		
		tamanho = ls.tamanhoLista();
		for(int i = 0; i<tamanho; i++) {
			Pessoa temp = new Pessoa();
			temp = (Pessoa) ls.getObjeto(i);
			System.out.println("NOME: "+temp.getNome()); //parte 8
		}
		
		Pessoa antonio = new Pessoa();
		antonio.setNome("antonho");
		
		System.out.println("CONTEM Antonio? "+ls.contem(antonio)); //parte 9
		
		ls.adiciona(antonio);
		tamanho = ls.tamanhoLista();
		for(int i = 0; i<tamanho; i++) {
			Pessoa temp = new Pessoa();
			temp = (Pessoa) ls.getObjeto(i);
			System.out.println("NOME: "+temp.getNome()); //parte 8
		}
		
		System.out.println("E AGORA? "+ls.contem(antonio));
		
	}

}
