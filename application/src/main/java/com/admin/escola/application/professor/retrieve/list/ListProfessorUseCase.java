package com.admin.escola.application.professor.retrieve.list;

import com.admin.escola.application.UseCase;
import com.admin.escola.domain.pagination.Pagination;
import com.admin.escola.domain.professor.ProfessorSearchQuery;

public abstract class ListProfessorUseCase extends UseCase<ProfessorSearchQuery, Pagination<ProfessorListOutput>> {
}
