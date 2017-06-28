package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        //IOException e = new IOException();
        BufferedReader Guardar = new BufferedReader((new InputStreamReader(System.in)));
        Especialista miEspecialista = new Especialista();
        int CantidadDeportes, Contador=0;

        System.out.println("Deportes con balon");
        System.out.println("");
        System.out.println("Por favor ingrese su nombre: ");

        miEspecialista.setNombre(Guardar.readLine());

        System.out.println("");
        System.out.println("Bienvenido " + miEspecialista.getNombre() + ", usted es nuestro especialista en deportes.");
        System.out.println("");
        System.out.println("¿Cuantos deportes desea? ");
        CantidadDeportes= Integer.parseInt(Guardar.readLine());
        System.out.println("Ingreso: "+CantidadDeportes);

        Deporte[] listadoDeporte = new Deporte[CantidadDeportes];

        for (int i=0; i<CantidadDeportes; i++){
            listadoDeporte[i] = new Deporte();
            System.out.println("Ingrese el nombre de un deporte: ");
            listadoDeporte[i].setNombre(Guardar.readLine());

            String Respuesta;

            System.out.println("¿"+listadoDeporte[0].getNombre()+" es un deporte en el que se usa balon (S/N)? ");
            Respuesta = Guardar.readLine();

            if ( Respuesta.equals("s") || Respuesta.equals("S") )
                listadoDeporte[i].setConBalon(Boolean.TRUE);
            }

         for (int i=CantidadDeportes-1; i>=0; i--) {
             if (listadoDeporte[i].getConBalon() == Boolean.TRUE) {
                 System.out.println(listadoDeporte[i].getNombre() + " " + listadoDeporte[i].getConBalon());
             }
         }
        }
    }
