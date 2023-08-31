package org.example.service;

import org.example.model.Point;

public interface LineService {
    double calcSlopeLine(Point p1, Point p2);
    double calcAngleLine(double tangent1, double tangent);
    double distanceParallelLine(Point p1, Point p2, Point p3, Point p4 );

    boolean isParallelLine(double slopeA, double slopeB);
    boolean noCrossCoordinateAxis(double slope);
    boolean crossCoordinateAxis(double slope);
    boolean line(Point p1, Point p2);
}
