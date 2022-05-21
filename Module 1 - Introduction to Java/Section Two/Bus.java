public class Bus {

    public static void main(String[] args) {

        int passangers = 0;
        String announcement = "Passengers remaining on the bus: ";

        passangers += 9;
        System.out.println(announcement + passangers);

        passangers -= 5;
        System.out.println(announcement + passangers);

        passangers -= 4;
        System.out.println(announcement + passangers);
    }
}