//Tipo abstrato de dado (TAD)
public class Aluno {
	//Atributos
	String nome; //Variaveis de instancia, dados membros > o que os objetos da classe sabem
	String RA;
	int idade;
	
	public Aluno(String nome, String RA, int idade) {//Construtor para iniciar a classe
		this.nome = nome;
		this.RA = RA;
		this.idade = idade;
	}

	public void ImprimeDados() {
		System.out.println("Nome "+nome);
		System.out.println("RA "+RA);
		System.out.println("Idade "+idade);
	}
}
