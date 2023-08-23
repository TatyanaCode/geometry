package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


//@Data
//@NoArgsConstructor
//@RequiredArgsConstructor
public class Line {
    public Line(double k, double tg) {
        this.k = k;
        this.tg = tg;
    }

    private double k;
    private double tg;

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public double getTg() {
        return tg;
    }

    public void setTg(double tg) {
        this.tg = tg;
    }




}
