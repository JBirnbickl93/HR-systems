package org.example;

public class Manager extends Mitarbeiter {

    private static double bonus = 10500;

    public Manager() {
        super();
        this.setGehalt(19.0);
        this.mitarbeiterRolle = MitarbeiterRolle.MANAGER;
    }

    public Manager(String vorname, String nachname, double gehalt) {
        super(vorname, nachname, gehalt);
        this.mitarbeiterRolle = MitarbeiterRolle.MANAGER;
    }

    @Override
    public void berechneGehalt(float stunden){
        double gehaltManager = this.getGehalt() * stunden;
        gehaltManager += bonus;
        System.out.println("Das Gehalt des Managers beträgt " + gehaltManager + ".");
    }
}
