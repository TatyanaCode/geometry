package org.example.service;

import org.example.model.Point;

public interface LineService {
    double calcK(Point p1, Point p2);
    double calcTg(double k1, double k2);


}
