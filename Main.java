

import java.util.ArrayList;

import Seleccion.SeleccionFutbol;
import Seleccion.Masajista;
import Seleccion.Entrenador;
import Seleccion.Futbolista;

public class Main {

    //Crear un arreglo del objeto SelecciónFutbol. Esto es independiente de las clases hijas
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {

        Entrenador perez = new Entrenador(1, "Antonio", "Perez", 40, "A90O15");
        Futbolista dosRios = new Futbolista(2, "Marco", "dosRios", 23, 6, "Interior Derecho");
        Masajista martinez = new Masajista(3, "Raul", "Martinez", 30, "Terapeuta", 10);

        integrantes.add(perez);
        integrantes.add(dosRios);
        integrantes.add(martinez);

        //Concentracion
        System.out.println("Todos los integrantes comienzan una concentración. (Todos ejecutan el mismo método)");

        for(SeleccionFutbol integrante : integrantes){

            System.out.println(integrante.getNombre()+ " " +integrante.getApellidos()+ "--->");
            integrante.Concentrarse();
        }

        //Viajar
        System.out.println("Todos los integrantes viajan al momento de un partido. (Todos ejecutan el mismo método)");
        for(SeleccionFutbol integrante : integrantes){

            System.out.println(integrante.getNombre()+ " " +integrante.getApellidos()+ "--->");
            integrante.Viajar();
        }

        //Entrenamiento
        System.out.println("\nEntrenamiento: Solamente el entrenador y el futbolista tienen métodos para entrenar: ");
        System.out.println(perez.getNombre()+ " "+perez.getApellidos()+"---> ");
        perez.dirigirEntrenamiento();
        System.out.println(dosRios.getNombre()+ " "+dosRios.getApellidos()+"---> ");
        dosRios.entrenar();

        //Masaje
        System.out.println("\nMasaje: Solo el masajista tiene el método para dar un masaje");
        System.out.println(martinez.getNombre()+" " + martinez.getApellidos()+"--->");
        martinez.darMasaje();

        //Partido de Futbol
        System.out.println("\nPartido: Solamente el entrenador y el futbolista tienen métodos para el partido de futbol: ");
        System.out.println(perez.getNombre()+ " "+perez.getApellidos()+"---> ");
        perez.dirigirPartido();
        System.out.println(dosRios.getNombre()+ " "+dosRios.getApellidos()+"---> ");
        dosRios.jugarPartido();
    }
}