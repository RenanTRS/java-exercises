public class Friend {
    String name;
    static int numberOfFriends; //Valor estático que se mudado será mudado em todos os objetos

    Friend(String name) {
        this.name = name;
        numberOfFriends++; //atualiza a variável estática
    }

    static void displayFriends() {
        System.out.println("You have "+numberOfFriends+" friends");
    }
}
