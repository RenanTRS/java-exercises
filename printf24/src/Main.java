public class Main {
    public static void main(String[] args) {
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Rex";
        int myInt = 50;
        double mydouble = 1000;

        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%10s", myString); //escreve em dez caracteres, caso a string seja menor acrescenta um valor vazio antes da string
        System.out.printf("%-10s algo", myString); //alinha a string a esquerda
        System.out.printf("%d", myInt);
        System.out.printf("%f", mydouble);
        System.out.printf("%.2f", mydouble); //formata a quantidade de casas após a vírgula
    }
}
