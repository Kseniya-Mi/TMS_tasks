package Tasks_9_lesson;

public class Director implements Workers{
    private String name;

    Director(String name){
        this.name = name;
    }

    @Override
    public void printJobTittle() {
        System.out.println("This is director.");
    }

    @Override
    public String getInfo() {
        return "Name: " + this.name + ": ";
    }
}
