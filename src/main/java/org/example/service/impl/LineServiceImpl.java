package org.example.service.impl;

import org.example.model.Point;
import org.example.service.LineService;


public class LineServiceImpl implements LineService {
    private static final int EXTENT = 2; // степень уравнения

    @Override
    public double calcSlopeLine(Point p1, Point p2) {
        return Math.round((p1.getY() - p2.getY()) / (p1.getX() - p2.getX()));

    }

    // вычиление угла между пересекающимися прямыми
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

    @Override
    public double calcAngleOrParallel() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(2, -1);
        Point p4 = new Point(4, 1);

        //2 расчет коэфициентов для каждой линии
        LineService lineService = new LineServiceImpl();
        double slopeA = lineService.calcSlopeLine(p1, p2);
        double slopeB = lineService.calcSlopeLine(p3, p4);

        //3 расчет  угла  межжду пересекающимися  или растояния между паралельными прямыми
        if (Math.tan(slopeA) != Math.tan(slopeB)) {
            double angle = lineService.calcAngleLine(slopeA, slopeB);

        } else {
            double distance = lineService.distanceParallelLine(p1, p2, p3, p4);

        }
        return 0;
    }

}





