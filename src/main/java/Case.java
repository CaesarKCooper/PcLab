import java.awt.*;

public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    Dimensions dimensions;


    public void pressPowerButton() {
        System.out.println("PowerButton Pressed");
    }


    @Override
    public String toString() {
        return "Case{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", dimensions=" + dimensions +
                '}' + " ";
    }
}
