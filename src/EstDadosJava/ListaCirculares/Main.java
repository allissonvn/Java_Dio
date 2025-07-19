package EstDadosJava.ListaCirculares;

public class Main {
    public static void main(String[] args) {
        ListaCirculares<String> minhaListacircular = new ListaCirculares<>();

        minhaListacircular.add("c1");
        System.out.println(minhaListacircular);

        minhaListacircular.remove(0);
        System.out.println(minhaListacircular);

        minhaListacircular.add("c2");
        minhaListacircular.add("c3");
        minhaListacircular.add("c4");

        System.out.println(minhaListacircular);

        System.out.println(minhaListacircular.get(0));
        System.out.println(minhaListacircular.get(1));
        System.out.println(minhaListacircular.get(2));
        System.out.println(minhaListacircular.get(3));



    }
}
