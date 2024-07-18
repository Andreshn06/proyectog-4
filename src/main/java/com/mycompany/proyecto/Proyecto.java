// com/mycompany/proyecto/Proyecto.java
package com.mycompany.proyecto;

import Subclase.Deportista;
import Subclase.Doctor;

public class Proyecto {

    public static void main(String[] args) {
        Deportista deportista = new Deportista();
        Doctor doctor = new Doctor();
        
        System.out.println("Datos de la persona 1");
        doctor.imprimirInformacion();
        System.out.println("===============");
        System.out.println("Datos de la persona 2");
        deportista.imprimirInformacion();
        System.out.println("===============");
    }
}
