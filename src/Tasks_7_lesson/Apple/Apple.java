package Tasks_7_lesson.Apple;

public class Apple {
    private String color = "green";

    Apple(String color){
        this.color = color;
    }

    String setInfo(){
        return "Apple color: " + this.color;
    }
}
