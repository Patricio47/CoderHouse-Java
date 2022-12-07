package Paquete;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Persona p1 = new Persona("Lionel", "Messi");
        Persona p2 = new Persona("Indio", "Solari");
        Persona p3 = new Persona("Memo", "Ochoa");
        Persona p4 = new Persona("Gon", "Freecs");
        Persona p5 = new Persona("Killua", "Zoldyck");

        ArrayList<Persona> listaDePersonas = new ArrayList<Persona>();

        listaDePersonas.add(p1);
        listaDePersonas.add(p2);
        listaDePersonas.add(p3);
        listaDePersonas.add(p4);
        listaDePersonas.add(p5);

        imprimirPersonas(listaDePersonas, true);
        listaDePersonas.sort(Comparator.comparing(Persona :: getNombre));
        imprimirPersonas(listaDePersonas,  true);
        listaDePersonas.sort(Comparator.comparing(Persona :: getApellido));
        imprimirPersonas(listaDePersonas,  false);
        listaDePersonas.sort(Comparator.comparing(Persona :: getApellido).reversed());
        imprimirPersonas(listaDePersonas, false);
    }

    public static void imprimirPersonas(ArrayList<Persona> listaDePersonas, boolean mostrarPersona) {
        System.out.println("Las personas ordenadas alfabeticamente son: ");
        for (int i = 0; i < listaDePersonas.size(); i++) {
            if(mostrarPersona == true){
                System.out.println(listaDePersonas.get(i).getNombre());
            }
            else{
                System.out.println(listaDePersonas.get(i).getApellido());
            }
    }
    }


}






       /*

        Collection.sort(listaDePersonas,p1,p2,p3,p4,p5);
        p1.getNombre().compareTo(p2.getNombre());
        p1.getNombre().compareTo(p3.getNombre());
        */
