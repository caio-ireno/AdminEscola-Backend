package com.admin.escola.domain.professor;

import com.admin.escola.domain.Identifier;

import java.util.Objects;
import java.util.UUID;

public class ProfessorID extends Identifier {
    private final String value;

    private ProfessorID(String value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    // utilizado para criar um novo ID
    public static ProfessorID unique() {
        return  ProfessorID.from(UUID.randomUUID());
    }

    public static ProfessorID from(final String anId){
        return new ProfessorID(anId);
    }

    public static ProfessorID from(final UUID  anId){
        return new ProfessorID(anId.toString().toLowerCase());
    }
    @Override
    public String getValue() {
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfessorID that = (ProfessorID) o;
        return Objects.equals(getValue(), that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getValue());
    }
}
