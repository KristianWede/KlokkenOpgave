package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        String[] alleMåneder = {"Januar", "Februar", "Marts", "April", "Maj", "Juni", "Juli", "August", "September", "Oktober", "November", "December"};
        String[] alleDage = {"Mandag","Tirsdag","Onsdag", "Torsdag", "Fredag", "Lørdag", "Søndag"};

        LocalDate today = LocalDate.now();

        String tekstToday = today.toString();

        int år = Integer.parseInt(tekstToday.substring(0,4));
        int måned = Integer.parseInt(tekstToday.substring(5,7));
        int dage = Integer.parseInt(tekstToday.substring(8,10));

        if( dage >= 7 ) {
            int konvertér = dage % 7;
            System.out.println(år);
            System.out.println(alleMåneder[måned-1]);
            System.out.println(alleDage[konvertér]);
        } else {
            System.out.println(år);
            System.out.println(alleMåneder[måned - 1]);
            System.out.println(alleDage[dage]);
        }



     //System.out.println("I dag er det måned: " + tekstVerMåned.substring());

        //Hvordan kan en String blive til en Int? Med Integer.parseInt
    }
}
