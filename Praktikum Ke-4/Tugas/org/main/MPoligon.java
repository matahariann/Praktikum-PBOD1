package org.main;

import org.bangundatar.*;

public class MPoligon{
    public static void main(String[] args){
        Segitiga segitiga = new Segitiga(10, 10, 3);

        segitiga.printInfo();
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas());

    }
}