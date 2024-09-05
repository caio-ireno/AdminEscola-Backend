package com.admin.escola.domain.professor;

import com.admin.escola.domain.pagination.Pagination;

import java.util.Optional;

public interface ProfessorGateway {

    Professor create(Professor aPofessor);

    void deleteById(ProfessorID anId);

    Professor update(Professor aProfessor);

    Optional<Professor> findById(ProfessorID anId);

    Pagination<Professor> findAll(ProfessorSearchQuery aQuery);

}
