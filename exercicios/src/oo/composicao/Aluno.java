package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome; //Constante nome do tipo String
	//Variável cursos, receberá a lista da classe Curso
	List <Curso> cursos = new ArrayList<>();

	//Método construtor da classe Aluno, receberá um parâmetro, que é uma variável do tipo String, nome 
	Aluno(String nome){
		this.nome=nome; // A variável nome, da classe Aluno, será igual ao parâmetro do construtor Aluno, 
		//que também é uma variável nome 
	}

	void adicionarCurso(Curso curso) { //Método adicionarCurso, receberá a variável curso que apontará para a classe Curso 
		this.cursos.add(curso); // Adicionando uma lista cursos na variável curso
		curso.alunos.add(this); // Adicionando uma lidta de alunos ao curso
	}

	//Criando o método obterCursoPorNome, que apontará para a classe Curso, e recebe o parâmetro nome, 
	Curso obterCursoPorNome(String nome) {
		for(Curso curso: this.cursos){ // Laço de repetição For, que receberá o objeto Classe Curso, representado pela variável curso, que
			// aponta para a lista cursos, da classe Aluno
			if(curso.nome.equalsIgnoreCase(nome)) { // Se a variável nome, da classe Aluno for igual a variável nome do método obterCursoPorNome
				//Retorne o curso.
				return curso;
			}
		}
		return null;
	}
//Método público, do tipo String, que fará com que a variável nome, seja retornada convertida para String, através do toString 
	public String toString(){
		return nome; 
	}	
}
