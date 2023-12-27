package com.corenetworks.presentacion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ProbarFileReader {
    public static void main(String[] args) {
        //1. Definir variables
        FileReader fEntrada = null;
        char[] buffer = new char[128];
        int longitudLeida = 0;
        //2. Acciones de E/S
        try {
            fEntrada = new FileReader("primer_ejemplo.txt");
            longitudLeida= fEntrada.read(buffer);
            System.out.println("El buffer tiene -> " + Arrays.toString(buffer));
            System.out.println("La longitud es -> " + longitudLeida);
        ;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //3. Cerrar las clases que gestionan stream

    }
}
