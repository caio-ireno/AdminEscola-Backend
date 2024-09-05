package com.admin.escola.application.professor.update;

import com.admin.escola.domain.professor.ProfessorGateway;
import com.admin.escola.domain.professor.ProfessorID;

import java.util.Objects;

public class DefaultUpdateProfessorUseCase extends UpdateProfessorUseCase {

    private final ProfessorGateway professorGateway;

    public DefaultUpdateProfessorUseCase(final ProfessorGateway professorGateway) {
        this.professorGateway = Objects.requireNonNull(professorGateway);
    }

    @Override
    public UpdateProfessorOutput execute(final UpdateProfessorCommand aCommand){
        final var anId = ProfessorID.from(aCommand.id());
        final var aName = aCommand.nome();
        final var aIdade = aCommand.idade();
        final var aMateria = aCommand.materia();
        final var aObservacao = aCommand.observacao();

        final var aProfessor = this.professorGateway
                .findById(anId).orElseThrow(() -> new RuntimeException("Professor não encontrado com o ID: " + anId));

        aProfessor.update(aName,aIdade,aMateria,aObservacao);

        return UpdateProfessorOutput.from(aProfessor);

    }
}
