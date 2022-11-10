package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico extends Pessoa {
	// atributos
	private String nome;
	private ArrayList<Especialidade>especialidades;
	private String crm;

	// métodos de acesso
	// nome
	public void setNome(String nome) {

		this.nome = nome;

	}

	public String getNome() {

		return nome;

	}

	// especialidades
	public ArrayList<Especialidade> getEspecialidades(){
            return especialidades;
        }

	public void setEspecialidades(ArrayList<Especialidade> especialidade){
            this.especialidades = especialidades;
	}

	// CRM
	public void setCrm(String crm) {

		this.crm = crm;

	}

	public String getCrm() {

		return crm;

	}
}
