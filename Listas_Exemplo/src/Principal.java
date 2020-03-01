import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList vetor = new ArrayList();
		
		//O new é uma alocação dinamica de dados
		Aluno aluno1 = new Aluno("Raizer","101518",20);
		Aluno aluno2 = new Aluno("Ana","111619",18);
		Aluno aluno3 = new Aluno("Pedro","133769",19);
		
		vetor.add(aluno1);
		vetor.add(aluno2);
		vetor.add(0, aluno3);
		
		int tamanho = vetor.size();
		
		if(tamanho != 3) {
			System.out.println("Erro: Tamanho da lista está errado");
		}
		
		if(!vetor.contains(aluno1)) {
			System.out.println("Erro: Não foi encontrado um dos alunos");
		}
		
		vetor.remove(0);
		tamanho = vetor.size();
		
		if(tamanho != 2) {
			System.out.println("Erro: O tamanho da lista está errado");
		}
		
		if(vetor.contains(aluno3)) {
			System.out.println("Erro: Encontrou um aluno que não deveria estar na lista");
		}
	}

}
