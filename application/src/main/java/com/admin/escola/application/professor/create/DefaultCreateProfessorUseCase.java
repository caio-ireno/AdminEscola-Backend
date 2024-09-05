package com.admin.escola.application.professor.create;

import com.admin.escola.application.professor.update.UpdateProfessorOutput;
import com.admin.escola.application.professor.update.UpdateProfessorUseCase;
import com.admin.escola.domain.professor.Professor;
import com.admin.escola.domain.professor.ProfessorGateway;

import java.util.Objects;

public class DefaultCreateProfessorUseCase extends CreateProfessorUseCase {

   private final ProfessorGateway professorGateway;

    public DefaultCreateProfessorUseCase(final ProfessorGateway professorGateway) {
        this.professorGateway = Objects.requireNonNull(professorGateway);
    }

    @Override
    public CreateProfessorOutput execute(final CreateProfessorCommand aCommand){
        final var aName = aCommand.nome();
        final var aIdade = aCommand.idade();
        final var aMateria = aCommand.materia();
        final var aObservacao = aCommand.observacao();

        final var aProfessor = Professor.newProfessor(aName, aIdade, aMateria, aObservacao);

        this.professorGateway.create(aProfessor);
        return CreateProfessorOutput.from(aProfessor);
    }
}
