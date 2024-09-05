package com.admin.escola.infrastructure.professor;

import com.admin.escola.domain.professor.Professor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/***
 * Professor
 * ● Id
 * ● nome
 * ● idade
 * ● matéria
 * ● observações
 */
public class ProfessorTest {

    @Test
    public void givenAvalidPrams_whenCallNewProfessor_thenInstantiateAProfessor() {
        final var expectedNome = "Professor";
        final var expectedIdade = 0;
        final var expectedMateria = "Materia";
        final var expectedObservacoes = "Observacoes";

        final var actualProfessor = Professor.newProfessor(expectedNome,expectedIdade,expectedMateria,expectedObservacoes);

        Assertions.assertNotNull(actualProfessor);
        Assertions.assertNotNull(actualProfessor.getId());
        Assertions.assertEquals(expectedNome,actualProfessor.getNome());
        Assertions.assertEquals(expectedIdade,actualProfessor.getIdade());
        Assertions.assertEquals(expectedMateria,actualProfessor.getMateria());
        Assertions.assertEquals(expectedObservacoes,actualProfessor.getObservacao());
    }
}
