package org.hibernate.bugs;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
