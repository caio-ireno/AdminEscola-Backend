package com.admin.escola.application.professor.update;

import com.admin.escola.domain.professor.Professor;
import com.admin.escola.domain.professor.ProfessorID;

public record UpdateProfessorOutput(
        ProfessorID id
) {

    public static UpdateProfessorOutput from(final Professor aProfessor) {
        return new UpdateProfessorOutput(aProfessor.getId());
    }
}
