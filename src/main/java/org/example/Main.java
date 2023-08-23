package org.example;

import org.example.model.Point;
import org.example.service.LineService;
import org.example.service.impl.LineServiceImpl;

/***
 * 1)
 * **/

public class Main {

    public static void main(String[] args) {
        //1 получение очек из текстового файла
        Point point = new Point(0, 0);
        Point point2 = new Point(1, 1);
        Point point3 = new Point(6,5);
        Point point4 = new Point(7,5);
        //2 расчет коэфициентов для каждой линии
        LineService lineService = new LineServiceImpl();
        double k1= lineService.calcK(point,point2);
        double k2 = lineService.calcK(point3, point4);
        //3 расчет углового коэффициента
        double tgA = lineService.calcTg(k1, k2);
        double arcTg = Math.atan(tgA);
        System.out.println(arcTg);


    }
}