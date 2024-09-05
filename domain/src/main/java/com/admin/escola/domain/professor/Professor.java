package com.admin.escola.domain.professor;

import com.admin.escola.domain.AggregateRoot;

import java.util.UUID;

public class Professor extends AggregateRoot<ProfessorID> {
    private String nome;
    private int idade;
    private String materia;
    private String observacao;

    private Professor(
           final ProfessorID anId,
           final String aNome,
           final int aIdade,
           final String aMateria,
           final String aBbservacao
    ) {
        super(anId);
        this.nome = aNome;
        this.idade = aIdade;
        this.materia = aMateria;
        this.observacao = aBbservacao;
    }

    public static Professor newProfessor(final String aNome, final int aIdade, final String aMateria, final String aObservacao){
        if (aNome == null || aNome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        final var id = ProfessorID.unique();
        return new Professor(id, aNome, aIdade, aMateria, aObservacao);
    }

    public Professor update(
            final String aNome,
            final int aIdade,
            final String aMateria,
            final String aObservacao
    ){
    this.nome = aNome;
    this.idade = aIdade;
    this.materia = aMateria;
    this.observacao = aObservacao;
    return this;
    }

    public ProfessorID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMateria() {
        return materia;
    }

    public String getObservacao() {
        return observacao;
    }
}
