package Tasks_10_lesson;

import jdk.jfr.Category;

import java.util.Objects;

public class User implements Cloneable{
    private String name;
    private String surname;
    private int age;

    User(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setInfo(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name: " + this.name + '\n' +
                "Surname: " + this.surname + '\n' +
                "Age: " + this.age;
    }

    @Override
    public int hashCode() {
        int result = surname == null ? 0 : surname.hashCode();
       // result = 31 * result + Integer.parseInt(name);
        result = 31 * result + age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || (this.getClass() != obj.getClass())) return false;

        User that = (User) obj;

        if(!Objects.equals(that.name, this.name)) return false;
        if(that.age != this.age) return false;

        return surname.equals(that.surname);
    }

    public void getDeepCopy(User user){
        this.name = user.name;
        this.surname = user.surname;
        this.age = user.age;
    }

}
