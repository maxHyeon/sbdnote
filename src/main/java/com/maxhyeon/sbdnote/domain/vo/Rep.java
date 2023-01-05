package com.maxhyeon.sbdnote.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class Rep {
    @NotNull
    private Unit unit;
    private float value;

    public Rep(float value) {
        this.unit = Unit.REP;
        this.value = value;
    }

    public Rep(Unit unit, float value) {
        this.unit = unitValidationCheck(unit);
        this.value = value;
    }

    public Rep() {
        this.unit = unitValidationCheck(null);
    }

    private Unit unitValidationCheck(Unit unit) {
        if (unit == null) {
            unit = Unit.REP;
        }
        return unit;
    }

}
