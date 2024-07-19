package jtp.elementoCuringa;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

    abstract static class Shape {

        abstract void draw();

    }

    static class Rectangle extends Shape {

        void draw() {

            System.out.println("drawing rectangle");

        }

    }

    static class Circle extends Shape {

        void draw(){

            System.out.println("drawing circle");

        }

    }

    static class GenericTest {

        public static void drawShapes(List<? extends Shape> lists) {

            for(Shape s: lists){

                s.draw();

            }

        }

        public static void main(String []args){

            List<Rectangle> list1 = new ArrayList<>();
            list1.add(new Rectangle());

            List<Circle> list2 = new ArrayList<>();
            list2.add(new Circle());
            list2.add(new Circle());

            drawShapes(list1);
            drawShapes(list2);
        }
    }
}
