package com.company;

import java.time.LocalDate;

public class Main {

    String[] alleMåneder = {"Januar", "Februar", "Marts", "April", "Maj", "Juni", "Juli", "August", "September", "Oktober", "November", "December"};
    String[] alleDage = {"Mandag","Tirsdag","Onsdag", "Torsdag", "Fredag", "Lørdag", "Søndag"};

    public String dagsDato(int weekDay, int day, int month, int year){

        String ugeDag = alleDage[weekDay-1];
        String månedsNavn = alleMåneder[month-1];
        String nutiden = "\t I dag er det " + ugeDag + " d." + day + " " + månedsNavn + " " + year;

        return nutiden;
    }

    public static void main(String[] args) {

        Main obj = new Main();

        LocalDate today = LocalDate.now();

        int numberForDayName = today.getDayOfWeek().getValue();

        int numberForDay = today.getDayOfMonth();

        int numberForMonth = today.getMonthValue();

        int numberForYear = today.getYear();

        System.out.println(obj.dagsDato(numberForDayName, numberForDay, numberForMonth, numberForYear));
    }
}
