package org.hibernate.bugs;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class EntityWithStatus {

    @Id
    @GeneratedValue
    private Long id;

    @Convert(converter = StatusConverter.class)
    private Status status;

    public Long getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }
}
