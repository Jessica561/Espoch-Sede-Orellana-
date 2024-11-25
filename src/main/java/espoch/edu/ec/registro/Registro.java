
package espoch.edu.ec.registro;

import ec.espoch.edu.record.Persona;
import ec.espoch.edu.record.Producto;
import java.util.ArrayList;


public class Registro {

    public static void main(String[] args) {
        //instanciar el registro
        /*Persona persona = new Persona("Ñefren",-10);
        //Imprimir los datos
        System.out.println(persona.name());
        System.out.println(persona.age());
        System.out.println(persona);
        System.out.println(persona.displayInfo());*/
        Producto producto1 = new Producto("Tomate", 2.0, "Fruta");
        Producto producto2 = new Producto("Sandia", 5.0, "Fruta");
        Producto producto3 = new Producto("Zanahoria", 1.0, "Vegetal");
        //Creacion de un arrayList de los prodcutos
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto2);
        //Recorrer el ArrayList
        for (Producto producto:productos){
            System.out.println(producto);
            
            System.out.println("Se va a pasar estructura");
            
        }
        
    } 
}
