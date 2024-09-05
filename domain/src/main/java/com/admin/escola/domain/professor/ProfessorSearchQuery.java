package com.admin.escola.domain.professor;

public record ProfessorSearchQuery(
        int page,
        int perPage,
        String terms,
        String sort,
        String direction
) {

}
