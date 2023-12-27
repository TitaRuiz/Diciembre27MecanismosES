package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;

public class ProbarFileWriter {
    public static void main(String[] args) {
        //1. Declarar variables
        FileWriter fSalida = null;
        try {
            fSalida = new FileWriter("primer_ejemplo.txt");
            //2. Acciones e/S
            fSalida.write("Hola mundo desde java !!");
            //3. Cerrar los flujos
            fSalida.flush();
            fSalida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
