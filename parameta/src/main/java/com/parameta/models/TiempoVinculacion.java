package com.parameta.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Period;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TiempoVinculacion {
    private int años;
    private int meses;
    private int días;

    public TiempoVinculacion(Period period) {
        this.años = period.getYears();
        this.meses = period.getMonths();
        this.días = period.getDays();
    }
}
