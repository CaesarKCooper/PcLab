public class Monitor {
    
    String resolution;
    String model;
    String manufacturer;
    
    
    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing a pixel at " + x + ", " + y + "" + " in color" + color);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolution='" + resolution + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}' + " ";
    }
}
