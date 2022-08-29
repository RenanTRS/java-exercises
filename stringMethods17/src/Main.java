public class Main {
    public static void main(String[] args) {
        String name = "Rex";
        boolean teste = name.equals("rex"); //é igual a rex?
        boolean result = name.equalsIgnoreCase("rex"); //se é igual ignorando o case sensitive
        int qtd = name.length();
        char one = name.charAt(2); //pega uma letra de acordo com a posição do caractere
        int position = name.indexOf("e"); //retorna a poisição do elemento, caso sera -1 é pq não existe
        boolean empty = name.isEmpty(); //Retorna se for vazio
        boolean blank = name.isBlank(); //Retorna se for vazio mesmo com espaços vazios
        String upper = name.toUpperCase(); //Retorna em uppercase
        String lower = name.toLowerCase(); //Retorna em lowercase
        String trimresult = name.trim(); //Limpa os espaços em branco na frente e atrás
        String replaceresult = name.replace('e', 'i'); //Troca caracteres

        System.out.println(teste);
        System.out.println(result);
        System.out.println(qtd);
        System.out.println(one);
        System.out.println(position);
        System.out.println(empty);
        System.out.println(blank);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(trimresult);
        System.out.println(replaceresult);
    }
}
