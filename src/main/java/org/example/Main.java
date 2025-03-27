package org.example;



public class Main {
    public static void main(String[] args) {

        Payable mitarbeiter1 = new Mitarbeiter("Jan", "Schmidt", 15.0);
        Payable manager1 = new Manager("Klara", "Müller", 27.0);
        Payable intern1 = new Intern("Marius", "Löwe");

        mitarbeiter1.berechneGehalt(148);
        manager1.berechneGehalt(160);
        intern1.berechneGehalt(140);

        intern1.mitarbeiterEntlassen();

    }
}