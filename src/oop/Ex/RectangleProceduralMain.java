package oop.Ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;

        int area = width * height;
        System.out.println("넓이: " + area);

        int perimeter = 2 *(width + height);
        System.out.println("둘레: " + perimeter);

        boolean square = width == height;
        System.out.println("정사각형 여부: " + square);
    }
}
