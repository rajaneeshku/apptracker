package com.aptrack.entity.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;

import static com.aptrack.utils.ApptrackerUtils.dbTimestampToString;
import static com.aptrack.utils.ApptrackerUtils.stringToDbTimestamp;


/**
 * Created by Murthy on 7/24/2017.
 */
@Converter(autoApply = false)
public class LocalDateTimeConverter implements AttributeConverter<String, Timestamp> {

    @Override
    public Timestamp convertToDatabaseColumn(String attribute) {
        return attribute == null ? new Timestamp(System.currentTimeMillis()) : stringToDbTimestamp(attribute);
    }

    @Override
    public String convertToEntityAttribute(Timestamp dbData) {
        return dbData == null ? null : dbTimestampToString(dbData);
    }


}

