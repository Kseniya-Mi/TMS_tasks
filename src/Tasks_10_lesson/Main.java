package Tasks_10_lesson;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        User Katya = new User("Katya", "Ivanova", 22);
        User Katserina = new User("Katya", "Ivanova", 22);
        User Sasha = new User("Sasha", "Sidorov", 25);
        User dep = Katserina;
        Sasha.getDeepCopy(Katya);

        System.out.println("Compare two similar objects");
        System.out.println(Katya.equals(Katserina));
        System.out.println(Katserina.hashCode());
        System.out.println(Katya.hashCode());

        System.out.println("--------------------------------------");
        //Deep copy
        System.out.println("Deep copy");
        System.out.println(Sasha.toString());
        System.out.println();
        Sasha.setInfo("sasha","polyakov", 23);
        System.out.println(Sasha.toString());
        System.out.println();
        System.out.println(Katya.toString());

        System.out.println("--------------------------------------");
        //Shallow copy
        System.out.println("Shallow copy");
        System.out.println(dep.toString());
        System.out.println();
        System.out.println(Katserina.toString());
        System.out.println();
        dep.setInfo("Deep", "Goosman", 34);
        System.out.println(dep.toString());
        System.out.println();
        System.out.println(Katserina.toString());

    }
}
