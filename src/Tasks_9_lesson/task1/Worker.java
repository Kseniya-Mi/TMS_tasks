package Tasks_9_lesson.task1;

public class Worker implements Workers{
    private String name;

    Worker(String name){
        this.name = name;
    }

    @Override
    public void printJobTittle() {
        System.out.println("This is worker.");
    }

    @Override
    public String getInfo() {
        return "Name: " + this.name + ": ";
    }
}
