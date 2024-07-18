// Subclase/Persona.java
package Subclase;

public class Persona {
    private String Nombre;
    private String Apellido;
    private String Edad;
    public String Profecion;
    public String Sexo;

    public Persona() {
    }   
    
    public void establecerNombre(String Nombre) {
        this.Nombre = Nombre;   
    }
    
    public String ObtenerNombre() {
        return this.Nombre;
    }   
    
    public void establecerEdad(String Edad) {
        this.Edad = Edad;   
    }
    
    public String ObtenerEdad() {
        return this.Edad;
    }
       public void establecerApellido(String Apellido) {
        this.Apellido = Apellido;   
    }
    
    public String ObtenerApellido() {
        return this.Apellido;
    }
       public void establecerProfecion(String Profecion) {
        this.Profecion = Profecion;   
    }
    
    public String ObtenerProfecion() {
        return this.Profecion;
    }
          public void establecerSexo(String Sexo) {
        this.Sexo = Sexo;   
    }
    
    public String ObtenerSexo() {
        return this.Sexo;
    }
    public void imprimirInformacion() {
        System.out.println("Nombre: " + Nombre);   
        System.out.println("Apellido: " + Apellido);  
        System.out.println("Profecion: " + Profecion);
        System.out.println("Edad: " + Edad);
        System.out.println("Sexo: " + Sexo);
    }
}
