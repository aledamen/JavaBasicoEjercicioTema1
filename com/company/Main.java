package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("DATOS PRIMITIVOS");

        System.out.println("ENTEROS");

        System.out.println("byte");
        byte num1 = 127;
        System.out.println(num1);

        System.out.println("short");
        short num2 = 32767;
        System.out.println(num2);

        System.out.println("int");
        int num3 = 2147483647;
        System.out.println(num3);

        System.out.println("long");
        long num4 = 9223372036854775807L;
        System.out.println(num4);

        System.out.println("----------------------------------------------------------------");

        System.out.println("FLOTANTES");

        System.out.println("float");
        float num5 = 4.9f;
        System.out.println(num5);

        System.out.println("double");
        double num6 = 4.99d;
        System.out.println(num6);

        System.out.println("----------------------------------------------------------------");

        System.out.println("CARACTER");

        System.out.println("char");
        char caracter1 = 'a';
        System.out.println(caracter1);

        System.out.println("----------------------------------------------------------------");

        System.out.println("BOOLEANOS");

        System.out.println("boolean");
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(bool1);
        System.out.println(bool2);

        System.out.println("----------------------------------------------------------------");

        System.out.println("TIPOS ENVOLTORIOS");

        System.out.println("String");
        String cadena1 = "Hola";
        System.out.println(cadena1);

        System.out.println("----------------------------------------------------------------");

        System.out.println("Integer");
        Integer num7 = 10;
        System.out.println(num7);

        System.out.println("----------------------------------------------------------------");

        System.out.println("Long");
        Long num8 = 10L;
        System.out.println(num8);

        System.out.println("----------------------------------------------------------------");

        System.out.println("Character");
        Character caracter2 = null;
        System.out.println(caracter2);

        System.out.println("----------------------------------------------------------------");

        System.out.println("Boolean");
        Boolean bool3 = null;
        System.out.println(bool3);

        System.out.println("----------------------------------------------------------------");

        System.out.println("ARRAY");
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array1));

        System.out.println("----------------------------------------------------------------");

        System.out.println("LIST");
        List<String> nombres = new ArrayList<>();
        nombres.add("nombre1");
        nombres.add("nombre2");
        nombres.add("nombre3");
        nombres.add("nombre4");
        System.out.println(nombres);

        System.out.println("----------------------------------------------------------------");

        System.out.println("MAP");
        Map<String, String> personas = new HashMap<>();
        personas.put("DNI1", "Nombre Apellido1");
        personas.put("DNI2", "Nombre Apellido2");
        System.out.println(personas);
    }
}
