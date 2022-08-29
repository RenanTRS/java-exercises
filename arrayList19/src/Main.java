import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>(); //array de string

        food.add("pizza"); //adiciona um item a lista
        food.add("hamburger"); //adiciona um item a lista
        food.add("hotdog"); //adiciona um item a lista

        food.set(0, "sushi"); //adiciona um elemento em um item específico
        food.remove(2); //remove um item específico
        food.clear(); //limpa o array

        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i)); //wrapper array
        }
    }
}
