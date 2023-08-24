package org.example.service.impl;


import org.example.model.Point;
import org.example.service.LineService;


public class LineServiceImpl implements LineService {

    @Override
    public double calcSlopeLine(Point p1, Point p2) {
        return (p1.getY() - p2.getY()) / (p1.getX() - p2.getX());

    }

    @Override
    public double calcAngleLine(double tangent1, double tangent2) {
        double angle1 = Math.atan(tangent1);
        double angle2 = Math.atan(tangent2);
        return angle1 - angle2;
    }
 //  вычислеия растояния между прямыми по коэффициенту и двум точкам применялась следующая формула |(y2 - y1)- m * (х2-х1)| / корень( m^2+1)
    @Override
    public double distanceParallelLine( double slope,  double slope2, Point p1, Point p2) {
        return Math.abs((p2.getY() - p1.getY() - slope * (p2.getX() - p1.getX())) / Math.sqrt(Math.pow(slope,2)+1));

    }

}
