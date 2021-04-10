package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) { // Classe com o método principal

		//Método construtor Aluno, sendo recebida no objeto aluno1, que está instanciando a classe Aluno com o valor João e assim por diante.
		Aluno aluno1=new Aluno("João");	
		Aluno aluno2=new Aluno("Maria");
		Aluno aluno3=new Aluno("Pedro");

//Método construtor Curso, sendo recebida no objeto curso1, que está instanciando a classe Curso com o valor Java Completo e assim por diante.
		Curso curso1=new Curso("Java Completo");
		Curso curso2=new Curso("Web 2023");
		Curso curso3=new Curso("React Native");

//Variável curso1, utilizando o método da classe Curso, adicionarAluno, recebendo a variável aluno1 e assim por diante.
		curso1.adicionarAluno(aluno1); //Isso fará com que o aluno1 faça parte do curso 1
		curso1.adicionarAluno(aluno2); //Isso fará com que o aluno2 faça parte do curso 1

//Variável curso2, utilizando o método da classe Curso, adicionarAluno, recebendo a variável aluno2 e assim por diante.
		curso2.adicionarAluno(aluno1); // Isso fará com que o aluno1 faça parte do curso2
		curso2.adicionarAluno(aluno3); // Isso fará com que o aluno3 faça parte do curso2


		curso1.adicionarAluno(aluno3); // Isso fará com que o aluno3 faça parte do curso1
		curso2.adicionarAluno(aluno3); // Isso fará com que o aluno3 faça parte do curso2
		curso3.adicionarAluno(aluno3); // Isso fará com que o aluno3 faça parte do curso3


		//Laço de repetição For, com a variável do tipo aluno, que receberá a classe Aluno, acessando o campo curso1, da classe
		//CursoTeste, que aponta para variável do tipo lista alunos, da classe Curso.
		//Isso fará com que todos os alunos do curso1 seja exibido.
		
		for (Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso 1..."+ curso1.nome + "...");
			System.out.println("...e o meu nome é "+aluno.nome);
			System.out.println(); // Syso sem conteúdo serve também para pular linha.
		}
		
		//Laço de repetição For, com a variável do tipo aluno, que receberá a classe Aluno, acessando o campo curso2, da classe
		//CursoTeste, que aponta para variável do tipo lista alunos, da classe Curso.
		//Isso fará com que todos os alunos do curso2 seja exibido.		
		for (Aluno aluno: curso2.alunos) {
			System.out.println("Estou matriculado no curso 2..."+ curso2.nome + "...");
			System.out.println("...e o meu nome é "+aluno.nome);
			System.out.println(); // Syso sem conteúdo serve também para pular linha.
		}
		
		//Laço de repetição For, com a variável do tipo aluno, que receberá a classe Aluno, acessando o campo curso3, da classe
		//CursoTeste, que aponta para variável do tipo lista alunos, da classe Curso.
		//Isso fará com que todos os alunos do curso3 seja exibido.		
		for (Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso 3..."
					+ curso3.nome + "...");
			System.out.println("...e o meu nome é "+aluno.nome);
			System.out.println(); // Syso sem conteúdo serve também para pular linha.
		}

		System.out.println(aluno1.cursos.get(0). alunos); //Syso para exibição do laço a cada interação da variável alunos

	//Encontrando os alunos através do nome do curso, como o método obterCursoPorNome,
		//Neste caso, estamos vendo os alunos do curso Java Completo.
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
	//Classe Curso = ao método cursoEncontrado, recebendo o aluno1, da classe CursoTeste e utilizando o método obterCursoPorNome,
		// da classe Aluno

		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);

		}

	}

}
