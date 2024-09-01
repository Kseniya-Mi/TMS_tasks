package Tasks_9_lesson.task2;

public class Rectangle extends Figures{
    private double a;
    private double b;

    Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    double getPerimeter() {
        return 2 * (this.a + this.b);
    }

    @Override
    double getArea() {
        return this.a * this.b;
    }
}
