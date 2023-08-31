package org.example.service.impl;


import org.example.model.Point;
import org.example.service.LineService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LineServiceImplTest {

    private final LineService lineService = new LineServiceImpl();

    @Test
    public void calcSlopeLineTest() {
        // создаем объект для проверки
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        // ожидаемый результат
        double expectedSlopeA = 1.0;
        //выполнении проверка ожидаемых результатов
        double actualSlopeA = lineService.calcSlopeLine(p1, p2);
        assertEquals(expectedSlopeA, actualSlopeA);
    }

    @Test
    public void calcAngleLineTest() {
        Point p1 = new Point(-2, 0);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(2, 5);
        Point p4 = new Point(-1, 4);
        double slopeA = lineService.calcSlopeLine(p1, p2);
        double slopeB = lineService.calcSlopeLine(p3, p4);

        // сравнение реального и фактического результата
        double actualAngle = lineService.calcAngleLine(slopeA, slopeB);
        assertEquals(45.0, actualAngle);
    }

    @Test
    public void distanceParallelLineTest() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(2, -1);
        Point p4 = new Point(4, 1);

        double slopeA = lineService.calcSlopeLine(p1, p2);
        double slopeB = lineService.calcSlopeLine(p3, p4);

        assertTrue(lineService.isParallelLine(slopeA, slopeB));

        double expectedParallelLine = 3.16;

        double actualParallelLine = lineService.distanceParallelLine(p1, p2,p3,p4);
        assertEquals(expectedParallelLine, actualParallelLine);
    }

    @Test
    public void notParallelLineTest(){
        Point p1 = new Point(-2, 0);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(2, 5);
        Point p4 = new Point(-1, 4);
        double slopeA = lineService.calcSlopeLine(p1, p2);
        double slopeB = lineService.calcSlopeLine(p3, p4);

        boolean actual = lineService.isParallelLine(slopeA, slopeB);
        assertFalse(actual);
    }

    @Test
    public void parallelLineTest(){
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(2, -1);
        Point p4 = new Point(4, 1);
        double slopeA = lineService.calcSlopeLine(p1, p2);
        double slopeB = lineService.calcSlopeLine(p3, p4);
        boolean actual = lineService.isParallelLine(slopeA, slopeB);
        assertTrue(actual);
    }
}