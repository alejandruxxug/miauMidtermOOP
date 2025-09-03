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
        Carro c4 = new Carro("LST650", "Civic", 2019);
        Carro c5 = new Carro("NHW9", "Civic", 2019);
        carros.add(c1);
        carros.add(c2);
        carros.add(c3);

        Dueno dueno = new Dueno(123456789, "John", "Doe", "555-1234");
        Dueno dueno2 = new Dueno(987654321, "Jane", "Smith", "555-5678");
        Dueno dueno3 = new Dueno(1283991, "Alejo", "Urrego", "555-5678");
        duenos.add(dueno);
        duenos.add(dueno2);
        duenos.add(dueno3);

        carros.get(0).vincularDueno(dueno);
        carros.get(1).vincularDueno(dueno2);
        carros.get(2).vincularDueno(dueno3);

        agregarComentario("Great car!", "2023-10-01", c1, comentarios);
        agregarComentario("Needs maintenance.", "2023-11-15", c2, comentarios);
        agregarComentario("Very reliable.", "2024-01-20", c3, comentarios);



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
