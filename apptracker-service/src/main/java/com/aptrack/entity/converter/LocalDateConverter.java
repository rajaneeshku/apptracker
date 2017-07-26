package com.aptrack.entity.converter;

/**
 * Created by Murthy on 7/24/2017.
 */

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Date;

import static com.aptrack.utils.ApptrackerUtils.dbDateToString;
import static com.aptrack.utils.ApptrackerUtils.stringToDbDate;


@Converter(autoApply = false)
public class LocalDateConverter implements AttributeConverter<String, Date> {

    @Override
    public Date convertToDatabaseColumn(String attribute) {
        return attribute == null ? null : stringToDbDate(attribute);
    }

    @Override
    public String convertToEntityAttribute(Date dbData) {
        return dbData == null ? null : dbDateToString(dbData);
    }
}