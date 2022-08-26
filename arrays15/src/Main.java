import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] cars = {"Camaro", "Corvette", "Tesla"};

        cars[0] = "Mustang";

        System.out.println(Arrays.toString(cars)); //Arrays.toString usado somente para imprimir o array
    }
}
