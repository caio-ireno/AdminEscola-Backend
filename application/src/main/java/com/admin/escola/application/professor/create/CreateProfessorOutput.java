package com.admin.escola.application.professor.create;

import com.admin.escola.domain.professor.Professor;
import com.admin.escola.domain.professor.ProfessorID;

/***
 * Armazena o resultado da execução do caso de uso. Pode ser usado para retornar
 * uma mensagem de sucesso, o ID do novo professor, ou outros dados que podem ser úteis.
 *
 * @param id
 */
public record CreateProfessorOutput(ProfessorID id) {
    public static CreateProfessorOutput from(final Professor aProfessor) {
        return new CreateProfessorOutput(aProfessor.getId());
    }

}
