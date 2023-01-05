package com.maxhyeon.sbdnote.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter

public class Weight {
    private Unit unit;
    private float value;

    public Weight(float value) {
        this.unit = Unit.KG;
        this.value = value;
    }

    public Weight(Unit unit, float value) {
        this.unit = unitValidationCheck(unit);
        this.value = value;
    }

    public Weight() {
        this.unit = unitValidationCheck(null);
    }

    private Unit unitValidationCheck(Unit unit) {
        if (unit == null) {
            unit = Unit.KG;
        }
        return unit;
    }
}
