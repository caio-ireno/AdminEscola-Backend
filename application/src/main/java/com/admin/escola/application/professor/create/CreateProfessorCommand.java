package com.admin.escola.application.professor.create;

/***
 * Representa os dados de entrada para o caso de uso de criação de uma nova
 * categoria. Seria o objeto que carrega os parâmetros (neste caso, as informações do professor)
 * necessários para o comando de criação.
 *
 * @param nome
 * @param idade
 * @param materia
 * @param observacao
 */
public record CreateProfessorCommand (
        String nome,
        int idade,
        String materia,
        String observacao
){

    public static CreateProfessorCommand with(
            final String aNome,
            final int aIdade,
            final String aMateria,
            final String aObservacao
    ){
        return new CreateProfessorCommand(aNome, aIdade, aMateria, aObservacao);
    }
}
