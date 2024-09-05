package com.admin.escola.application.professor.retrieve.list;

import com.admin.escola.domain.pagination.Pagination;
import com.admin.escola.domain.professor.ProfessorGateway;
import com.admin.escola.domain.professor.ProfessorSearchQuery;

import java.util.Objects;

public class DefaultListProfessorUseCase extends ListProfessorUseCase {

    private final ProfessorGateway professorGateway;

    public DefaultListProfessorUseCase(ProfessorGateway professorGateway) {
        this.professorGateway = Objects.requireNonNull(professorGateway);
    }

    @Override
    public Pagination<ProfessorListOutput> execute(final ProfessorSearchQuery aQuery) {
        return this.professorGateway.findAll(aQuery)
                .map(ProfessorListOutput::from);
    }

}
