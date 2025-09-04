import accidentes.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void options() {
        System.out.println("1. Create Owner");
        System.out.println("2. Create Brand");
        System.out.println("3. Create Car");
        System.out.println("4. Create Accident");
        System.out.println("5. Find the most Sold brand");
        System.out.println("6. Brand with most accidents");
        System.out.println("7. Incidents of each owner");
        System.out.println("8. Origin country & how many cars");
        System.out.println("9. Exit");
        System.out.print("Select an option my dear: ");
    }

    public static void main(String[] args) {
        //todo menu y las consultas

        boolean done = false;
        Scanner input = new Scanner(System.in);
        Scanner number = new Scanner(System.in);

        int option;
        ArrayList<Carro> carros = new ArrayList<>();
        ArrayList<Dueno> duenos = new ArrayList<>();
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
        Dueno dueno2 = new Dueno(987654321, "Majo", "sussy", "555-5678");
        Dueno dueno3 = new Dueno(1283991, "Alejo", "Urrego", "213-5678");

        duenos.add(dueno);
        duenos.add(dueno2);
        duenos.add(dueno3);

        c1.vincularDueno(dueno);
        c2.vincularDueno(dueno2);
        c3.vincularDueno(dueno3);
        c4.vincularDueno(dueno3);
        c5.vincularDueno(dueno3);

        c1.agregarComentario("Chimba de nave mano, chiiimba de nave", "2023-11-15");
        c1.agregarComentario("Tenemos la misma marca de carro zapatica -miao", "2023-11-15");
        c3.agregarComentario("Increiblemente bueno.", "2024-01-20");
        c2.agregarComentario("Needs maintenance.", "2023-11-15");
        c3.agregarComentario("Very reliable.", "2024-01-20");
        c4.agregarComentario("El carro 1 de alejo jajjasj", "2024-01-20");
        c5.agregarComentario("El carro 2 de alejo que carro mas tragonn", "2024-01-20");

        Marca m1 = new Marca(1, "Renault", "France");
        Marca m2 = new Marca(2, "Ford", "USA");
        Marca m3 = new Marca(3, "Honda", "Japan");
        Marca m4 = new Marca(4, "Kia", "South Korea");

        marcas.add(m1);
        marcas.add(m2);
        marcas.add(m3);
        marcas.add(m4);

        m1.agregarCarro(c1);
        m1.agregarCarro(c5);
        m2.agregarCarro(c2);
        m3.agregarCarro(c3);
        m4.agregarCarro(c4);


        Incidente i1 = new Incidente(1, "Collision", "2023-10-05", "555-1234");
        Incidente i2 = new Incidente(2, "Exploto", "2023-10-05", "5we55-1234");
        Incidente i3 = new Incidente(3, "Devoro el carro", "2023-10-05", "552345-1234");
        Incidente i4 = new Incidente(4, "Miau", "2023-10-05", "555234-12354");

        incidentes.add(i1);
        incidentes.add(i2);
        incidentes.add(i3);
        incidentes.add(i4);

        i1.setDueno(dueno);
        i2.setDueno(dueno2);
        i3.setDueno(dueno3);
        i4.setDueno(dueno3);

        dueno.agregarIncidente(i1);
        dueno2.agregarIncidente(i2);
        dueno3.agregarIncidente(i3);
        dueno3.agregarIncidente(i4);

        while (!done) {
            options();
            option = number.nextInt();
            switch (option) {

                case 1:

                    //long cedula, String nombre, String apellido, String telefono

                    System.out.println("Enter the govermentId");
                    long govID = number.nextLong();
                    System.out.println("Enter the name of the owner");
                    String nameOwner = input.nextLine();
                    System.out.println("Enter the surname of the owner");
                    String surnameOwner = input.nextLine();
                    System.out.println("Enter the telephone of the owner");
                    String telephoneOwner = input.nextLine();

                    Dueno duenoCreated = new Dueno(govID, nameOwner, surnameOwner, telephoneOwner);
                    duenos.add(duenoCreated);

                    System.out.println("Owner: " + duenoCreated.getNombre() + " " + duenoCreated.getApellido() + " Created successfully!~");
                    break;

                case 2:
                    System.out.println("Enter the ID of the Brand");
                    long brandID = number.nextLong();
                    System.out.println("Enter the name of the Brand");
                    String brandName = input.nextLine();
                    System.out.println("Enter the country of the Brand");
                    String brandCountry = input.nextLine();

                    Marca brand = new Marca(brandID, brandName, brandCountry);
                    marcas.add(brand);
                    System.out.println("Brand: " + brand.getNombre() + " Succesfully created!~");
                    break;

                case 3:
                    //String placa, String modelo, int anioLanzamiento)



                    break;
                case 4:
                    break;
                case 5:
                    //Most Sold Brand
                    Marca mostSold = null;
                    int maxCars = 0;
                    for (Marca marca : marcas) {
                        int carCount = marca.getCarros().size();
                        if (carCount > maxCars) {
                            maxCars = carCount;
                            mostSold = marca;
                        }
                    }

                    System.out.println("Most Sold Brand: " + mostSold.getNombre());
                    break;
                case 6:

                    //brand with the most accidents
                    Marca mostAccidents = null;
                    int brandAccident = 0;
                    int maxAccidents = -1;

                    for (int i = 0; i < marcas.size(); i++) {
                        Marca marca = marcas.get(i);

                        for (int j = 0; j < incidentes.size(); j++) {
                            Dueno duenoCar = incidentes.get(j).getDueno();

                            for (int k = 0; k< duenoCar.getCarros().size(); k++) {

                                if (duenoCar.getCarros().get(k).getMarca().equals(marca)) {
                                    brandAccident ++;
                                }
                            }
                        }
                        if (brandAccident>maxAccidents) {
                           maxAccidents = brandAccident;
                           mostAccidents = marcas.get(i);
                       }
                        brandAccident = 0;
                    }

                    System.out.println("Most Accident Brand: " + mostAccidents.getNombre() + " (" + maxAccidents + ")");


                    //System.out.println("Most Accident Brand: " + MostAccidents.getNombre());
                    break;
                case 7:
                    for (Dueno d : duenos) {
                        System.out.println("Dueno: " + d.getIncidentes().toString());
                    }
                    break;

                case 8:
                    //Most common origin country and how many cars
                    Marca mostCountry = null;
                    int maxCountry = 0;
                    for (Marca marca : marcas) {
                        int carCount = marca.getCarros().size();
                        if (carCount > maxCountry) {
                            maxCountry = carCount;
                            mostCountry = marca;
                        }
                    }

                    System.out.println("Most Country: " + mostCountry.getPais() + " with " + maxCountry + " cars");
                    break;
                case 9:
                    done = true;
                    System.out.println("Slay... See you again next time!~");
                    break;
                default:
                    System.out.println("Hey bitch is you dumb?? Place a correct number..");
            }

        }
    }
}
