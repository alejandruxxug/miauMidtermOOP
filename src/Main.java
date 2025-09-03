import accidentes.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void options() {
        System.out.print("1. Most Sold brand");
        System.out.print("2. Brand with most accidents");
        System.out.print("3. Incidents of each owner");
        System.out.print("4. Exit");
    }

    public static void main(String[] args) {
        //todo menu y las consultas

        boolean done = false;
        Scanner input = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        int option;
        ArrayList<Carro> carros = new ArrayList<>();
        ArrayList<Dueno> duenos = new ArrayList<>();
        ArrayList<Comentario> comentarios = new ArrayList<>();
        ArrayList<Incidente> incidentes = new ArrayList<>();
        ArrayList<Marca> marcas = new ArrayList<>();

        // Sample data

        Carro c1 = new Carro("LFO215", "Arkana", 2026);
        Carro c2 = new Carro("LKO567", "Mustang", 2018);
        Carro c3 = new Carro("HJU890", "Civic", 2019);
        Carro c4 = new Carro("LST650", "Picanto", 2019);
        Carro c5 = new Carro("NHW914", "Koleos", 2019);
        carros.add(c1);
        carros.add(c2);
        carros.add(c3);

        Dueno dueno = new Dueno(123456789, "Seb", "Zap", "555-1234");
        Dueno dueno2 = new Dueno(987654321, "Jane", "Smith", "555-5678");
        Dueno dueno3 = new Dueno(1283991, "Alejo", "Urrego", "555-5678");

        duenos.add(dueno);
        duenos.add(dueno2);
        duenos.add(dueno3);

        carros.get(0).vincularDueno(dueno);
        carros.get(1).vincularDueno(dueno2);
        carros.get(2).vincularDueno(dueno3);
        carros.get(3).vincularDueno(dueno3);
        carros.get(4).vincularDueno(dueno3);

        c1.agregarComentario("Chimba de nave mano, chiiimba de nave", "2023-11-15");
        c1.agregarComentario("Tenemos la misma marca de carro zapatica -miao", "2023-11-15");
        c3.agregarComentario("Increiblemente bueno.", "2024-01-20");
        c2.agregarComentario("Needs maintenance.", "2023-11-15");
        c3.agregarComentario("Very reliable.", "2024-01-20");
        c4.agregarComentario("El carro 1 de alejo jajjasj", "2024-01-20");
        c5.agregarComentario("El carro 2 de alejo que carro mas tragonn", "2024-01-20");

        Incidente i1 = new Incidente(1, "Collision", "2023-10-05", "555-1234");



        while (!done) {
            options();
            option = number.nextInt();
            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    done = true;
                    System.out.println("Slay... See you again next time!~");
                    break:
                default:
                    System.out.println("Hey bitch is you dumb?? Place a correct number..");
            }

        }
    }
}
