package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {

        int areaSum = 0;

        for (Rectangle r : rectangles) {
            areaSum += r.area();
        }

        return (float)areaSum / rectangles.length;

    }
}
