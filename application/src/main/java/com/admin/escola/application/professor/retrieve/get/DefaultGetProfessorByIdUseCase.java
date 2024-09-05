package com.admin.escola.application.professor.retrieve.get;

import com.admin.escola.domain.professor.ProfessorGateway;
import com.admin.escola.domain.professor.ProfessorID;

import java.util.Objects;

public class DefaultGetProfessorByIdUseCase extends GetProfessorByIdUseCase {

    private final ProfessorGateway professorGateway;

    public DefaultGetProfessorByIdUseCase(ProfessorGateway professorGateway) {
        this.professorGateway = Objects.requireNonNull(professorGateway);
    }

    @Override
    public ProfessorOutput execute(final String anIn) {
        final var anCategoryID = ProfessorID.from(anIn);

        return this.professorGateway.findById(anCategoryID)
                .map(ProfessorOutput::from)
                .orElseThrow(() -> new RuntimeException("Professor não encontrado com o ID: " + anCategoryID));
    }
}
