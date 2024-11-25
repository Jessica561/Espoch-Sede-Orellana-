
package ec.espoch.edu.record;


public record Persona(String name, int age){
    public Persona{
        if (age<0){
            System.out.println("No existe edades negativas");
        }
    }
    //Metodo 
    public String displayInfo(){
        return "Nombre: " + name + " Edad: " + age;
    }

    
   
    
}
