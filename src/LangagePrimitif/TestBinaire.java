package LangagePrimitif;

import java.sql.SQLOutput;

public class TestBinaire {
    public static void main(String[] args) {
/*
        int a = 45;
        System.out.println(Integer.toBinaryString(a));                              //Convertit un int en binaire dans une String
        System.out.println(Integer.toBinaryString(-a));

        System.out.println(Integer.toHexString(a));                                 //Convertit un int en hexadécimal dans une String

        int b = 0b101101;                                                           //0b devant un nombre binaire permet de le stocker dans un int
        int c = 0b100111;
        System.out.println(c & b);
*/
        int possibilite = 0b111111111;

        System.out.println((possibilite & 0b000010000) != 0);
        System.out.println((possibilite & (1<<4)) != 0);                            //décale le 1 en binaire de 4 positions vers la gauche, 000000001 devient 000010000
        possibilite = possibilite | (1<<6);
        System.out.println(Integer.toBinaryString(possibilite));
        System.out.println(Integer.toBinaryString(~possibilite));                   //Permet d'inverser un binaire
        System.out.println(Integer.toBinaryString(possibilite ^ (1<<3)));        //XOR ou "ou strict"

        int x = 25;
        int y = 48;
        int z = x ^ y;
        System.out.println(z);
        System.out.println(z ^ y);

        //Inversion de deux variables
        System.out.println(x);
        System.out.println(y);

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println(x);
        System.out.println(y);
    }


}