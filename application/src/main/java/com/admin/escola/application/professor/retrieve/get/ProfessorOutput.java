package com.admin.escola.application.professor.retrieve.get;

import com.admin.escola.domain.professor.Professor;
import com.admin.escola.domain.professor.ProfessorID;

public record ProfessorOutput(
        ProfessorID id,
        String name,
        int idade,
        String materia,
        String observavao
) {

    public static ProfessorOutput from (final Professor aProfessor){
        return new ProfessorOutput(
                aProfessor.getId(),
                aProfessor.getNome(),
                aProfessor.getIdade(),
                aProfessor.getMateria(),
                aProfessor.getObservacao()
        );
    }
}
