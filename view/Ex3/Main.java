package view.Ex3;
import model.Ex3.*;

public class Main {
    public static void main(String[] args) {
        Conversor conv = new Conversor();

        conv.converter(30.5);
        System.out.println("====================");
        conv.converter(12.5f);
        System.out.println("====================");
        conv.converter("oi");
    }
}