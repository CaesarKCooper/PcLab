public class Main {

    public static void main(String[] args) {

        Case aCase = new Case();
        Motherboard motherboard = new Motherboard();
        Monitor monitor = new Monitor();

        PC pc = new PC(aCase, motherboard, monitor);

        pc.description(monitor);
        System.out.println();
        pc.powerUp();


    }

}
