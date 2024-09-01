package Tasks_9_lesson.task1;

public class Accountant implements Workers{
    private String name;

    Accountant(String name){
        this.name = name;
    }

    @Override
    public void printJobTittle() {
        System.out.println("This is accountant.");
    }

    @Override
    public String getInfo() {
        return "Name: " + this.name + ": ";
    }
}
