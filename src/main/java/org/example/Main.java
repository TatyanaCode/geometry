package org.example;

import org.example.model.Line;
import org.example.model.Point;
import org.example.service.LineService;
import org.example.service.impl.LineServiceImpl;

/***
 * 1)
 * **/

public class Main {

    public static void main(String[] args) {
        System.out.println("22222222");
        //1 получение очек из текстового файла
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 1);
        Point p3 = new Point(6, 5);
        Point p4 = new Point(7, 5);
        Line lineA = new Line(p1, p2);
        Line lineB = new Line(p3, p4);
        //2 расчет коэфициентов для каждой линии
        LineService lineService = new LineServiceImpl();
        double slopeA = lineService.calcSlopeLine(p1, p2);
        double slopeB = lineService.calcSlopeLine(p3, p4);

        //3 расчет  угла  межжду пересекающимися  или растояния между паралельными прямыми
        if (Math.tan(slopeA) == Math.tan(slopeB)) {
          double angle =  lineService.calcAngleLine(Math.tan(slopeA), Math.tan(slopeB));
            System.out.println(angle);
        } else {
           double distance =  lineService.distanceParallelLine(slopeA,slopeB,p1,p2);

        }



    }
}