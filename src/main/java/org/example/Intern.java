package org.example;

public class Intern extends Mitarbeiter{
    public Intern(){
        super();
        this.mitarbeiterRolle = MitarbeiterRolle.INTERN;
    }
    public Intern(String vorname, String nachname) {
        super(vorname, nachname, 900);
        this.mitarbeiterRolle = MitarbeiterRolle.INTERN;
    }

    @Override
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    @Override
    public String getVorname() {
        return this.vorname;
    }

    @Override
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public String getNachname() {
        return this.nachname;
    }

    @Override
    public void berechneGehalt(float stunden){
        System.out.println("Das Gehalt des Intern beträgt 900.");
    }
}
