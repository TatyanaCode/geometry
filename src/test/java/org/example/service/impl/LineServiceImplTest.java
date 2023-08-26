package org.example.service.impl;


import org.example.model.Line;
import org.example.model.Point;
import org.example.service.LineService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LineServiceImplTest {


    @Test
    void calcSlopeLine() {
        // создаем объект для проверки
        LineService lineService = new LineServiceImpl();
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(2, -1);
        Point p4 = new Point(4, 1);
        // ожидаемый результат
        double expectedSlopeA = 1.0;
        double expectedSlopeB = 1.0;
        //выполнении проверка ожидаемых результатов
        double actualSlopeA = lineService.calcSlopeLine(p1, p2);
        double actualSlopeB = lineService.calcSlopeLine(p3, p4);

        Assertions.assertEquals(expectedSlopeA, actualSlopeA);
        Assertions.assertEquals(expectedSlopeB, actualSlopeB);
    }

    @Test
    void calcAngleLine() {
        LineService lineService = new LineServiceImpl();
        Point p1 = new Point(-2, 0);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(2, 5);
        Point p4 = new Point(-1, 4);
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);
        double slopeA = lineService.calcSlopeLine(p1, p2);
        double slopeB = lineService.calcSlopeLine(p3, p4);

        // ожидаемый результат  метода
        double expectedAngle = 45.0;

        // сравнение реального и фактического результата
        double actualAngle = lineService.calcAngleLine(slopeA, slopeB);
        Assertions.assertEquals(expectedAngle, actualAngle);
    }

    @Test
    void distanceParallelLine() {
        LineService lineService = new LineServiceImpl();
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(2, -1);
        Point p4 = new Point(4, 1);
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);

        double ParallelLine = lineService.distanceParallelLine( p1, p2, p3, p4);
        double expectedParallelLine = 3.16;

        double actualParallelLine = lineService.distanceParallelLine(p1, p2,p3,p4);
        Assertions.assertEquals(expectedParallelLine, actualParallelLine);


    }
}