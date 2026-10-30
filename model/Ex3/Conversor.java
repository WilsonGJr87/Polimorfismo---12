package model.Ex3;

public class Conversor {
    public void converter(double cel) {
        double fah = cel * (9/5) + 32;
        System.out.println(fah + " °F");
    }
    public void converter(float km) {
        double mi = km * 0.621371;
        System.out.println(mi + " Milhas");
    }
    public void converter(String texto) {
        System.out.println(texto.toUpperCase());
    }
}