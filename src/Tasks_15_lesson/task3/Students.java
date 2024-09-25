package Tasks_15_lesson.task3;

import java.util.List;

public class Students {
    private String name;
    private int group;
    private int course;
    private List<Integer> marks;

    Students(String name, int group, int course, List<Integer> marks){
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public double getAverageMark(){
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.size();
    }

    public void moveToNextCourse() {
        course++;
    }

    //remove and change course
    public static void removeStudents(List<Students> students) {
        students.removeIf(student -> student.getAverageMark() < 3);
        for (Students student : students) {
            student.moveToNextCourse();
        }
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    public static void printStudents(List<Students> students, int course) {
        System.out.println("Students on course " + course + ":");
        for (Students student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void printInfoStudents(List<Students> students) {
        System.out.println("Students: ");
        System.out.println();
        for (Students student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Course: " + student.getCourse());
            System.out.println("Group: " + student.getGroup());
            System.out.println();
        }
    }

}
