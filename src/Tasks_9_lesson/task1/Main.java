package Tasks_9_lesson.task1;

public class Main {
    public static void main(String[] args) {

        Director director = new Director("Mr.John");
        Worker worker = new Worker("Bob");
        Accountant accountant = new Accountant("Mrs.Rose");

        System.out.println(director.getInfo());
        director.printJobTittle();
        System.out.println();

        System.out.println(worker.getInfo());
        worker.printJobTittle();
        System.out.println();

        System.out.println(accountant.getInfo());
        accountant.printJobTittle();
    }

}
