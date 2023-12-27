package com.corenetworks.presentacion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProbarBufferedWriter {
    public static void main(String[] args) {
        //1. Declarar variables
        FileWriter fSalida=null;
        BufferedWriter buffer = null;

        //2. Acciones de E/S
        try {
            fSalida = new FileWriter("buffered_writer_ejemplo.txt");
            buffer = new BufferedWriter(fSalida);
            buffer.write("Usando BufferedWriter ...");
            //3. Cerrar los flujos
            buffer.flush();
            buffer.close();
            fSalida.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
