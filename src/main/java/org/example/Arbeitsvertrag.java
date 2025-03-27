package org.example;

public record Arbeitsvertrag(int MitarbeiterID,
                             String vorname,
                             String nachname,
                             String datum,
                             double gehalt,
                             double stunden) {

}
