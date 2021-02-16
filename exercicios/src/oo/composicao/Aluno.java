package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome; //Constante nome do tipo String
	//Vari�vel cursos, receber� a lista da classe Curso
	List <Curso> cursos = new ArrayList<>();

	//M�todo construtor da classe Aluno, receber� um par�metro, que � uma vari�vel do tipo String, nome 
	Aluno(String nome){
		this.nome=nome; // A vari�vel nome, da classe Aluno, ser� igual ao par�metro do construtor Aluno, 
		//que tamb�m � uma vari�vel nome 
	}

	void adicionarCurso(Curso curso) { //M�todo adicionarCurso, receber� a vari�vel curso que apontar� para a classe Curso 
		this.cursos.add(curso); // Adicionando uma lista cursos na vari�vel curso
		curso.alunos.add(this); // Adicionando uma lidta de alunos ao curso
	}

	//Criando o m�todo obterCursoPorNome, que apontar� para a classe Curso, e recebe o par�metro nome, 
	Curso obterCursoPorNome(String nome) {
		for(Curso curso: this.cursos){ // La�o de repeti��o For, que receber� o objeto Classe Curso, representado pela vari�vel curso, que
			// aponta para a lista cursos, da classe Aluno
			if(curso.nome.equalsIgnoreCase(nome)) { // Se a vari�vel nome, da classe Aluno for igual a vari�vel nome do m�todo obterCursoPorNome
				//Retorne o curso.
				return curso;
			}
		}
		return null;
	}
//M�todo p�blico, do tipo String, que far� com que a vari�vel nome, seja retornada convertida para String, atrav�s do toString 
	public String toString(){
		return nome; 
	}	
}
