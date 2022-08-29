public class Main {
    public static void main(String[] args) {
        String name = "Rex";
        int age = 16;
        int x = 3;
        int y = 4;

        hello(name, age);
        int soma = add(x, y);
        System.out.println(soma);
    }

    static void hello(String name, int age) {
        System.out.println("Hello "+name);
        System.out.println("you are "+age+" years old");
    }

    static int add(int a, int b) {
        return a + b;
    }
}
