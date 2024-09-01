package Tasks_9_lesson.task2;

public class Circle extends Figures{
    private double r;

    Circle(double r){
        this.r = r;
    }

    @Override
    double getPerimeter() {
        return 2 * 3.14 * this.r;
    }

    @Override
    double getArea() {
        return 3.14 * this.r * this.r;
    }
}
