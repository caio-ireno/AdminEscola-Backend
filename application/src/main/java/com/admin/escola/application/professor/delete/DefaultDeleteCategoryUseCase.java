package com.admin.escola.application.professor.delete;


import com.admin.escola.domain.professor.ProfessorGateway;
import com.admin.escola.domain.professor.ProfessorID;

import java.util.Objects;

public class DefaultDeleteCategoryUseCase extends DeleteProfessorUseCase {

    private final ProfessorGateway professorGateway;

    public DefaultDeleteCategoryUseCase(final ProfessorGateway professorGateway) {
        this.professorGateway = Objects.requireNonNull(professorGateway);
    }

    @Override
    public void execute(final String anIn) {
        this.professorGateway.deleteById(ProfessorID.from(anIn));
    }
}