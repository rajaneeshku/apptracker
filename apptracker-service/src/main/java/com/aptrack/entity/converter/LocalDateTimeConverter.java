package com.aptrack.entity.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Murthy on 7/24/2017.
 */
@Converter(autoApply = false)
public class LocalDateTimeConverter implements AttributeConverter<String, Timestamp> {

    @Override
    public Timestamp convertToDatabaseColumn(String attribute) {
        return attribute == null ? null : Timestamp.valueOf(attribute);
    }

/*    @Override
    public LocalDateTime convertToEntityAttribute(Timestamp dbData) {
        return dbData == null ? null : dbData.toLocalDateTime();
    }*/

    @Override
    public String convertToEntityAttribute(Timestamp dbData) {

        LocalDateTime persisted = dbData.toLocalDateTime();

        return dbData == null ? null : persisted.format(DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss"));
    }
}
