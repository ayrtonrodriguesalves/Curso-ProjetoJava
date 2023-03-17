package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();

		String nome1 = JOptionPane.showInputDialog("Qual o seu nome:");
		String idade = JOptionPane.showInputDialog("Qual a sua idade:");
		String CPF = JOptionPane.showInputDialog("Qual o seu CPF:");
		String mae = JOptionPane.showInputDialog("Qual o nome da sua mãe:");
		String pai = JOptionPane.showInputDialog("Qual o nome do seu pai: ");
		String disciplina1Nome = JOptionPane.showInputDialog("discilina1");

		String disciplina2Nome = JOptionPane.showInputDialog("discilina2");

		aluno1.setNome(nome1);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setCpf(CPF);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Banco De Dados");
		disciplina.setNota(90);

		aluno1.getDisciplinas().add(disciplina);

		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina(disciplina1Nome);
		disciplina1.setNota(50);

		aluno1.getDisciplinas().add(disciplina1);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina(disciplina2Nome);
		disciplina2.setNota(80);

		aluno1.getDisciplinas().add(disciplina2);

		System.out.println(aluno1);
		System.out.println("Media Aluno" + aluno1.getMediaNota());
		System.out.println("Resultado: " + aluno1.getAlunoAprovado());

	}
}
