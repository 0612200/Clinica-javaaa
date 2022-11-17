package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico extends Pessoa {
	// atributos
        private String   descricao;
        private static int contador = 100;
        private Integer codigo;
	private String nome;
	private ArrayList<Especialidade>especialidades;
	private String crm;
        
        //Metodo construtor
        public Medico(){
            this.codigo = codigo;
            this.nome = nome;
            this.especialidades = especialidades;
            this.crm = crm;
            this.contador = this.codigo;
        }
        
        // Construtor de classes
        public Medico(String nome){
            this.nome = nome;
            atualizarCodigo();
        }
        
        public Medico(String nome, String descricao){
            this.nome = nome;
            this.descricao = descricao;
            atualizarCodigo();
        }
        
        private void atualizarCodigo(){
            contador++;
            this.codigo = contador;
        }
        
        public String getMedicoSeparadorPorPontoEVirgula(){
            String especialidadeStr = this.codigo + ";" + this.nome + ";" +
             this.descricao;
            return especialidadeStr;
        }

        
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Medico.contador = contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

     
}
