package oo.composicao;

//Importa��o das bibliotecas de lista
import java.util.ArrayList;
import java.util.List;

public class Curso {

	final String nome; // Constante nome do tipo String
	
	final List<Aluno> alunos = new ArrayList<>(); //Vari�vel alunos, do tipo lista constante, que receber� a classe Aluno
	
	//Construtor Curso receber� um par�metro, que � a vari�vel nome, do tipo String
	Curso(String nome){
		this.nome=nome; // A Constante nome, do tipo String, ser� igual ao par�metro nome, do m�todo construtor Curso
	}
	
	
	//M�todo que adicionar� aluno
	void adicionarAluno(Aluno aluno){ //Este m�todo receber� um par�metro, que � a vari�vel aluno, que apontar� para a classe Aluno 
		this.alunos.add(aluno); // A vari�vel alunos, que � do tipo lista, receber� o par�metro aluno, que aponta para a classe Aluno 
		aluno.cursos.add(this); // Rela��o bidirecional, entre aluno e curso
		// A vari�vel aluno, do m�todo adicionarAluno, acessa o campo cursos, que � uma vari�vel do tipo lista, da classe Aluno,
		// que aponta para a esta classe, Curso.
		
	}


}
