public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.go();
        car.stop();

        bicycle.go();
        bicycle.stop();

        System.out.println(car.doors);
        System.out.println(bicycle.pedals);
    }
}
