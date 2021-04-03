public class PC {

    Case aCase;
    Motherboard motherboard;
    Monitor monitor;


    public PC(Case aCase, Motherboard motherboard, Monitor monitor) {
        this.aCase = aCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }


    private void drawLogo(){
        monitor.drawPixel(1,2,"blue");

    }

    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today");
        System.out.println(aCase.toString() + monitor.toString() + motherboard.toString());

    }

    public void description(Monitor monitor){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today");
        System.out.println(motherboard.toString());

    }


    public void powerUp(){

        aCase.pressPowerButton();
        drawLogo();
        motherboard.loadProgram("Program");

    }




    @Override
    public String toString() {
        return "PC{" +
                "Case=" + aCase +
                ", Motherboard=" + motherboard +
                ", Monitor=" + monitor +
                '}';
    }
}

