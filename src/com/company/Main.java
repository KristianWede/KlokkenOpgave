package com.company;

import java.time.LocalDate;

public class Main {

    public int dagsDato(int weekDay, int date, int month, int year){
        return 0;
    }

    public int getDayOfWeek(LocalDate today){

        String tekstForDate = today.toString();

        int part1OfDay = tekstForDate.lastIndexOf("-");

        int part2OfDay = tekstForDate.length();

        String tekstForToday = tekstForDate.substring(part1OfDay+1,part2OfDay);

        int value = Integer.parseInt(tekstForToday);

        return value;
    }

    public void getMonth (){

    }

    public void getDayOfMonth(){

    }

    public void getYear(){

    }

    public int getValue(int value){

        return value;
    }

    public static void main(String[] args) {

        Main obj = new Main();


        String[] alleMåneder = {"Januar", "Februar", "Marts", "April", "Maj", "Juni", "Juli", "August", "September", "Oktober", "November", "December"};
        String[] alleDage = {"Mandag","Tirsdag","Onsdag", "Torsdag", "Fredag", "Lørdag", "Søndag"};

        LocalDate today = LocalDate.now();

        String tekstToday = today.toString();

        System.out.println(today);

        System.out.println();obj.getDayOfWeek(today);

        System.out.println(tekstToday.indexOf("-"));
        System.out.println(tekstToday.lastIndexOf("-"));

        int år = Integer.parseInt(tekstToday.substring(0,4));
        int måned = Integer.parseInt(tekstToday.substring(5,7));


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
