package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
public class Point{
    private double x;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }





}
