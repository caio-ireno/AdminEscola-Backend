package com.admin.escola.application.professor.retrieve.list;

import com.admin.escola.domain.professor.Professor;
import com.admin.escola.domain.professor.ProfessorID;

public record ProfessorListOutput (
        ProfessorID id,
        String name,
        int idade,
        String materia,
        String observavao
) {

    public static ProfessorListOutput from (final Professor aProfessor){
        return new ProfessorListOutput(
                aProfessor.getId(),
                aProfessor.getNome(),
                aProfessor.getIdade(),
                aProfessor.getMateria(),
                aProfessor.getObservacao()
        );
    }
}
