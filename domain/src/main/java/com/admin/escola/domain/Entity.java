package com.admin.escola.domain;

import java.io.Serializable;
import java.util.Objects;

public class Entity <ID extends Identifier> {
    protected ID id;

    protected Entity(final ID id) {
        Objects.requireNonNull(id, "id must not be null");
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity<?> entity = (Entity<?>) o;
        return Objects.equals(getId(), entity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

}
