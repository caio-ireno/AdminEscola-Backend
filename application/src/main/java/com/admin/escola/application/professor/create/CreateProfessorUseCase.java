package com.admin.escola.application.professor.create;

import com.admin.escola.application.UseCase;

/***
 * Define o contrato da operação (caso de uso) de criar um professor. Esse contrato é importante
 * para que a implementação possa ser trocada ou modificada sem impactar outras partes do sistema.
 */
public abstract class CreateProfessorUseCase
        extends UseCase<CreateProfessorCommand, CreateProfessorOutput> {

}
