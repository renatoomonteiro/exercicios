package oo.composicao;

//Importação das bibliotecas de lista
import java.util.ArrayList;
import java.util.List;

public class Curso {

	final String nome; // Constante nome do tipo String
	
	final List<Aluno> alunos = new ArrayList<>(); //Variável alunos, do tipo lista constante, que receberá a classe Aluno
	
	//Construtor Curso receberá um parâmetro, que é a variável nome, do tipo String
	Curso(String nome){
		this.nome=nome; // A Constante nome, do tipo String, será igual ao parâmetro nome, do método construtor Curso
	}
	
	
	//Método que adicionará aluno
	void adicionarAluno(Aluno aluno){ //Este método receberá um parâmetro, que é a variável aluno, que apontará para a classe Aluno 
		this.alunos.add(aluno); // A variável alunos, que é do tipo lista, receberá o parâmetro aluno, que aponta para a classe Aluno 
		aluno.cursos.add(this); // Relação bidirecional, entre aluno e curso
		// A variável aluno, do método adicionarAluno, acessa o campo cursos, que é uma variável do tipo lista, da classe Aluno,
		// que aponta para a esta classe, Curso.
		
	}


}
