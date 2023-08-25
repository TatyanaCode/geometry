package org.example.service;

import org.example.model.Line;
import org.example.model.Point;

public interface LineService {
    double calcSlopeLine(Point p1, Point p2);
    double calcAngleLine(double tangent1, double tangent);
    double distanceParallelLine(Point p1, Point p2, Point p3, Point p4 );

    double calcAngleOrParallel();

//    double calcConfluenceLine(Line l1, Line l2, double slope);
//    double calcParallelLine(Line l1,Line l2);
}
