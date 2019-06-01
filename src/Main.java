public class Main {

    public static void main(String[] args) {


        Car[] car = new Car[4];


        car[0] = new Car("Ford", 50, 8.3, true);
        car[1] = new Car("Mercedes", 55, 11.2, true);
        car[2] = new Truck("Star", 150, 18.0, true, 350);
        car[3] = new Truck("Jelcz", 170, 21.2, true, 50);

        System.out.println(car[0].getInfo());
        System.out.println(car[0].range());
        System.out.println(car[1].getInfo());
        System.out.println(car[1].range());
        System.out.println(car[2].getInfo());
        System.out.println(car[2].range());
        System.out.println(car[3].getInfo());
        System.out.println(car[3].range());








    }


}
