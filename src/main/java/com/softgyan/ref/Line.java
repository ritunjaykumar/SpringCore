package com.softgyan.ref;

public class Line {
    private Point point1;
    private Point point2;

    public Line() {
    }

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }


    public void setPoint1(Point point1) {
        this.point1 = point1;
    }


    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }

    public double getDistance() {
        double diffX = point1.getX() - point2.getX();
        double diffY = point1.getY() - point2.getY();
        return Math.sqrt((diffX * diffX) + (diffY * diffY));
    }
}
