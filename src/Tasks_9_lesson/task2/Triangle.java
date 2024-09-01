package Tasks_9_lesson.task2;

import static java.lang.Math.sqrt;

public class Triangle extends Figures {
    private double a;
    private double b;
    private double c;

    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getPerimeter() {
        return this.a + this.b + this.c;
    }

    @Override
    double getArea() {
        double p;
        p = getPerimeter()/2;

        return sqrt(p*(p - this.a)*(p - this.b)*(p - this.c));
    }
}
