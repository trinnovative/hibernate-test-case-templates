package org.hibernate.bugs;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class StatusConverter implements AttributeConverter<Status, Integer> {

    @Override
    public Integer convertToDatabaseColumn(Status attribute) {
        return attribute == null ? null : attribute.getValue();
    }

    @Override
    public Status convertToEntityAttribute(Integer dbData) {
        return dbData == null ? null : Status.from(dbData);
    }
}
