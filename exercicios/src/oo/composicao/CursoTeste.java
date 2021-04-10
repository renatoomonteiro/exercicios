package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) { // Classe com o m�todo principal

		//M�todo construtor Aluno, sendo recebida no objeto aluno1, que est� instanciando a classe Aluno com o valor Jo�o e assim por diante.
		Aluno aluno1=new Aluno("Jo�o");	
		Aluno aluno2=new Aluno("Maria");
		Aluno aluno3=new Aluno("Pedro");

//M�todo construtor Curso, sendo recebida no objeto curso1, que est� instanciando a classe Curso com o valor Java Completo e assim por diante.
		Curso curso1=new Curso("Java Completo");
		Curso curso2=new Curso("Web 2023");
		Curso curso3=new Curso("React Native");

//Vari�vel curso1, utilizando o m�todo da classe Curso, adicionarAluno, recebendo a vari�vel aluno1 e assim por diante.
		curso1.adicionarAluno(aluno1); //Isso far� com que o aluno1 fa�a parte do curso 1
		curso1.adicionarAluno(aluno2); //Isso far� com que o aluno2 fa�a parte do curso 1

//Vari�vel curso2, utilizando o m�todo da classe Curso, adicionarAluno, recebendo a vari�vel aluno2 e assim por diante.
		curso2.adicionarAluno(aluno1); // Isso far� com que o aluno1 fa�a parte do curso2
		curso2.adicionarAluno(aluno3); // Isso far� com que o aluno3 fa�a parte do curso2


		curso1.adicionarAluno(aluno3); // Isso far� com que o aluno3 fa�a parte do curso1
		curso2.adicionarAluno(aluno3); // Isso far� com que o aluno3 fa�a parte do curso2
		curso3.adicionarAluno(aluno3); // Isso far� com que o aluno3 fa�a parte do curso3


		//La�o de repeti��o For, com a vari�vel do tipo aluno, que receber� a classe Aluno, acessando o campo curso1, da classe
		//CursoTeste, que aponta para vari�vel do tipo lista alunos, da classe Curso.
		//Isso far� com que todos os alunos do curso1 seja exibido.
		
		for (Aluno aluno: curso1.alunos) {
			System.out.println("Estou matriculado no curso 1..."+ curso1.nome + "...");
			System.out.println("...e o meu nome � "+aluno.nome);
			System.out.println(); // Syso sem conte�do serve tamb�m para pular linha.
		}
		
		//La�o de repeti��o For, com a vari�vel do tipo aluno, que receber� a classe Aluno, acessando o campo curso2, da classe
		//CursoTeste, que aponta para vari�vel do tipo lista alunos, da classe Curso.
		//Isso far� com que todos os alunos do curso2 seja exibido.		
		for (Aluno aluno: curso2.alunos) {
			System.out.println("Estou matriculado no curso 2..."+ curso2.nome + "...");
			System.out.println("...e o meu nome � "+aluno.nome);
			System.out.println(); // Syso sem conte�do serve tamb�m para pular linha.
		}
		
		//La�o de repeti��o For, com a vari�vel do tipo aluno, que receber� a classe Aluno, acessando o campo curso3, da classe
		//CursoTeste, que aponta para vari�vel do tipo lista alunos, da classe Curso.
		//Isso far� com que todos os alunos do curso3 seja exibido.		
		for (Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso 3..."
					+ curso3.nome + "...");
			System.out.println("...e o meu nome � "+aluno.nome);
			System.out.println(); // Syso sem conte�do serve tamb�m para pular linha.
		}

		System.out.println(aluno1.cursos.get(0). alunos); //Syso para exibi��o do la�o a cada intera��o da vari�vel alunos

	//Encontrando os alunos atrav�s do nome do curso, como o m�todo obterCursoPorNome,
		//Neste caso, estamos vendo os alunos do curso Java Completo.
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
	//Classe Curso = ao m�todo cursoEncontrado, recebendo o aluno1, da classe CursoTeste e utilizando o m�todo obterCursoPorNome,
		// da classe Aluno

		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);

		}

	}

}
