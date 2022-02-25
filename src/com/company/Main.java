package com.company;

import java.time.LocalDate;

public class Main {

    String[] alleMåneder = {"Januar", "Februar", "Marts", "April", "Maj", "Juni", "Juli", "August", "September", "Oktober", "November", "December"};
    String[] alleDage = {"Mandag","Tirsdag","Onsdag", "Torsdag", "Fredag", "Lørdag", "Søndag"};

    public void dagsDato(int weekDay, int day, int month, int year){

        String ugeDag = alleDage[weekDay-1];
        String månedsNavn = alleMåneder[month-1];

        System.out.printf("\t " + "I dag er det %s d. %d %s %d.", ugeDag, day, månedsNavn, year);
    }

    public static void main(String[] args) {

        Main obj = new Main();

        LocalDate today = LocalDate.now();

        int numberForDayName = today.getDayOfWeek().getValue();

        System.out.println(numberForDayName);

        int numberForDay = today.getDayOfMonth();

        System.out.println(numberForDay);

        int numberForMonth = today.getMonthValue();

        System.out.println(numberForMonth);

        int numberForYear = today.getYear();

        System.out.println(numberForYear);

        obj.dagsDato(numberForDayName, numberForDay, numberForMonth, numberForYear);




/*
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
*/


     //System.out.println("I dag er det måned: " + tekstVerMåned.substring());

        //Hvordan kan en String blive til en Int? Med Integer.parseInt
    }
}
