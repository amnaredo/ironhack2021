package com.ironhack.main;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World :D");

        System.out.println(productFormatter(" Esto es un producto", "11/01/2020"));

    }


//    Create a method named productFormatter that receives
//      a String name productName and
//      a String date as parameters.
//    This method should return the productName trimmed,
//      change spaces by _ and
//      append the date at the end of the string.
//      The result must be given in uppercase.

    public static String productFormatter(String productName, String date) {
        return (productName.trim().replace(' ', '_').concat(date)).toUpperCase();
    }



}
