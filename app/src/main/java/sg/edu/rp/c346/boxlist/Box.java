package sg.edu.rp.c346.boxlist;

/**
 * Created by 15055494 on 23/7/2018.
 */

public class Box {
    private String color;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Box(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Box{" +
                "color='" + color + '\'' +
                '}';
    }
}
