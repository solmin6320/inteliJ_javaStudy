package oop.Ex;

public class Rectangle {
    int width = 5;
    int height = 8;

    void area() {
        int widths = width * height;
        System.out.println("넓이: " + widths);
    }
    void perimeter() {
        int heights = 2* (width + height);
        System.out.println("둘레: " + heights);
    }
    void square() {
        boolean squares = true;
        if (width == height) {
            System.out.println("정사각형 여부: " + squares);
        } else {
            System.out.println("정사각형이 아닙니다.");
        }

    }

}

