package Entrega3;

public class EstructurasDeControl {
    public static void main(String[] args) {

        String[] nombres = {"Juan", "Roberto", "German", "Adrian", "Damian", "Maria"};

        System.out.println(concatenar(nombres));

    }

    static String concatenar(String[] nombres){
        String concatenado = "";
        for (int c=1; c < nombres.length; c++){
            concatenado = concatenado+" "+nombres[c];
        }
            return concatenado;
    }
}
