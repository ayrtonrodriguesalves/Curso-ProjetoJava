package cursojava.classes;
/*Está é uma classe/objeto que representa o aluno*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {

	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String cpf;
	private String nomePai;
	private String NomeMae;
	private String dataMatricula;
	private String serieAno;
	private String nomeEscola;

	private List<Disciplina> disciplinas = new ArrayList<>();

	public Aluno() { /* Cria os dados na memória - Sendo padrão java */
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return NomeMae;
	}

	public void setNomeMae(String nomeMae) {
		NomeMae = nomeMae;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getSerieAno() {
		return serieAno;
	}

	public void setSerieAno(String serieAno) {
		this.serieAno = serieAno;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", cpf=" + cpf + ", nomePai=" + nomePai + ", NomeMae=" + NomeMae + ", dataMatricula="
				+ dataMatricula + ", serieAno=" + serieAno + ", nomeEscola=" + nomeEscola + ", disciplinas="
				+ disciplinas + "]";
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	/* metódo de retorno e calculo de média */
	public double getMediaNota() {

		double somaNotas = 0.0;

		for (Disciplina disciplina : disciplinas) {

			somaNotas += disciplina.getNota();

		}

		return somaNotas / disciplinas.size();
	}
	/* Método de informar sobre a condição do aluno (aprovado ou não) */

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 50) {
			return true;
		} else {
			return false;
		}

	}

}
