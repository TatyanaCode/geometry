package org.example.service.impl;


import org.example.model.Line;
import org.example.model.Point;
import org.example.service.LineService;


public class LineServiceImpl implements LineService {

    @Override
    public double calcSlopeLine(Point p1, Point p2) {
        return Math.round((p1.getY() - p2.getY()) / (p1.getX() - p2.getX()));

    }

    @Override
    public double calcAngleLine(double tangent1, double tangent2) {
        double angle1 = Math.atan(tangent1);
        double angle2 = Math.atan(tangent2);
        return Math.round(Math.toDegrees(angle1 - angle2));
    }

    //  вычислеия растояния между прямыми
    @Override
    public double distanceParallelLine(Point p1, Point p2, Point p3, Point p4) {
        return Math.round(Math.sqrt(Math.pow((p3.getX() - p1.getX()), 2) + Math.pow((p4.getY() - p2.getY()), 2)));
    }

}





