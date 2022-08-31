public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = new Animal();

        dog.speak(); //Possui um Override
        animal.speak(); //Possui apenas o método padrão
    }
}
