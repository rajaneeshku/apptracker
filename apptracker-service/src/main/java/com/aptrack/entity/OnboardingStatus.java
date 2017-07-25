package com.aptrack.entity;

import com.aptrack.entity.converter.LocalDateTimeConverter;
import lombok.Data;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Murthy on 7/19/2017.
 */
@Data
@Entity
public class OnboardingStatus {
    @Id
    private Long aid;
    private Integer bgCheck;
    @Convert(converter = LocalDateTimeConverter.class)
    private String bgCheckUpdTm;
    private Integer demograph;
    @Convert(converter = LocalDateTimeConverter.class)
    private String demographUpdTm;
    private String comments;
    @Convert(converter = LocalDateTimeConverter.class)
    private String lastUpdTm;
    private String lastUpdBy;
}
