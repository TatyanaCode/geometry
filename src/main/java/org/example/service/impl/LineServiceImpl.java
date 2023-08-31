package org.example.service.impl;

import org.example.model.Point;
import org.example.service.LineService;


public class LineServiceImpl implements LineService {
    private static final int EXTENT = 2; // степень уравнения

    @Override
    public double calcSlopeLine(Point p1, Point p2) {
        return Math.round((p1.getY() - p2.getY()) / (p1.getX() - p2.getX()));
    }

    // вычисление угла между пересекающимися прямыми
    @Override
    public double calcAngleLine(double tangent1, double tangent2) {
        double angle1 = Math.atan(tangent1);
        double angle2 = Math.atan(tangent2);
        return Math.round(Math.toDegrees(angle1 - angle2));
    }

    //  вычислеия растояния между прямыми
    @Override
    public double distanceParallelLine(Point p1, Point p2, Point p3, Point p4) {
        double round = Math.round(Math.sqrt(Math.pow((p3.getX() - p1.getX()), EXTENT) + Math.pow((p4.getY() - p2.getY()), EXTENT)) * 100);
        return round / 100;
    }

    @Override
    public boolean isParallelLine(double slopeA, double slopeB) {
        return slopeA == slopeB;
    }

    @Override
    // если коэффициент   не = -1, то прямая  не пересекает  координатные оси под прямым углом
    public boolean noCrossCoordinateAxis(double slope) {
        return slope != -1;
    }
    // если коэффициент    = -1, то прямая   пересекает  координатные оси под прямым углом
    @Override
    public boolean crossCoordinateAxis(double slope) {
        return slope == 1;
    }

    @Override
    public boolean line(Point p1, Point p2) {
        return p1 != p2;
    }


}





