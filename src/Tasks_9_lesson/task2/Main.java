package Tasks_9_lesson.task2;

public class Main {
    public static void main(String[] args) {

        Figures[] figures = new Figures[]{
            new Circle(5),
            new Triangle(3,4,5),
            new Rectangle(2,5),
            new Circle(2),
            new Triangle(6,8,10)
        };

        double sum = 0;

        for (Figures counter: figures){
            sum += counter.getPerimeter();
        }

        System.out.printf("%.3f", sum);
    }
}
