package org.kyfd;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Map<Integer, String> diccionario = new HashMap<Integer, String>();

        diccionario.put(1, "Joan");
        diccionario.put(2, "Silvio");
        diccionario.put(3, "Andres");
        diccionario.put(4, "Douglas");
        diccionario.put(5, "Hagzaelt");
        diccionario.put(6, "Gabriel");

        System.out.println(diccionario.get(22020330));

        Map<String, String> diccionario2 = new HashMap<String, String>();
        diccionario2.put("Joan", "Reyes");
        diccionario2.put("Silvio", "Mora");
        diccionario2.put("Andres", "Martinez");
        diccionario2.put("Douglas", "Gomez");

        System.out.println(diccionario2.get("Joan"));



        Map<String, Person> list = new HashMap<String, Person>();
        list.put("Joan", new Person("Joan", "Reyes"));
        list.put("Silvio", new Person("Silvio", "Mora"));
        list.put("Andres", new Person("Andres", "Martinez"));
        list.put("Douglas", new Person("Douglas", "Gomez"));
        list.put("Hagzaelt", new Person("Hagzaelt", "Gomez"));

        System.out.println(list.get("Andres").getFullName());

    }







}