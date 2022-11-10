package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Paciente {
	// atributos
	private String nome;
	private LocalDate dataDeNascimento;
	private String telefone;
	private String email;
	private String tipoSanguineo;
	private PlanoDeSaude planoDeSaude;

	// métodos de acesso
	// ***Pegar nome do Paciente***
	public void setNome(String nome) {

		this.nome = nome;

	}

	// ***Retornar nome do Paciente***
	public String getNome() {

		return this.nome;

	}

	// ***Pegar a data de nascimento do paciente***
	public void setDataDeNascimento(LocalDate dataDeNascimento) {

		this.dataDeNascimento = dataDeNascimento;

	}

	// ***retornar data de nascimento do aciente***
	public LocalDate getDataDeNascimento() {

		return dataDeNascimento;

	}

	// ***pegar telefone do cliente***
	public void setTelefone(String telefone) {

		this.telefone = telefone;

	}

	// ***retornar telefone do cliente***
	public String getTelefone() {

		return telefone;

	}

	// ***Pegar email do Paciente***
	public void setEmail(String email) {

		this.email = email;

	}

	// ***Retornar email do Paciente***
	public String getEmail() {

		return this.email;

	}

	// ***pegar tipo sanguineo do cliente
	public void setTipoSanguineo(String tipoSanguineo) {

		this.tipoSanguineo = tipoSanguineo;

	}

	// ***reotrnar tipo sanguineo do cliente
	public String getTipoSanguineo() {

		return tipoSanguineo;

	}

	// ***Pegar Plano de Saúde do Paciente***
	public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {

		this.planoDeSaude = planoDeSaude;

	}

	// ***Retornar Plano de Saúde do Paciente***
	public PlanoDeSaude getPlanoDeSaude() {

		return this.planoDeSaude;

	}

}
