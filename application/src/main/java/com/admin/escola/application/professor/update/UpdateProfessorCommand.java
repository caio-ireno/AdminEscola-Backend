package com.admin.escola.application.professor.update;


public record UpdateProfessorCommand(
        String id,
        String nome,
        int idade,
        String materia,
        String observacao
) {

    public static UpdateProfessorCommand with(
            final String anId,
            final String aNome,
            final int aIdade,
            final String aMateria,
            final String aObservacao
    ) {
        return new UpdateProfessorCommand(anId, aNome, aIdade, aMateria, aObservacao);
    }
}