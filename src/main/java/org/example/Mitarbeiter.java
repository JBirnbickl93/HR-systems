package org.example;


public class Mitarbeiter implements Payable {
   String vorname;
   String nachname;
   private double gehalt;
   MitarbeiterRolle mitarbeiterRolle;
   private Arbeitsvertrag vertrag;

    public class Adresse{
        private String strasseUnummer;
        private int plz;
        private String stadt;

        public Adresse(String strasseUnummer, int plz, String stadt){
            this.strasseUnummer = strasseUnummer;
            this.plz = plz;
            this.stadt = stadt;
        }

        public String getStrasseUnummer() {
            return strasseUnummer;
        }
        public int getPlz() {
            return plz;
        }
        public String getStadt() {
            return stadt;
        }

        public void setStrasseUnummer(String strasseUnummer) {
            this.strasseUnummer = strasseUnummer;
        }
        public void setPlz(int plz) {
            this.plz = plz;
        }
        public void setStadt(String stadt) {
            this.stadt = stadt;
        }

    }

    public Mitarbeiter(){
       this.vorname = "John";
       this.nachname = "Doe";
       this.gehalt = 13.0;
       this.mitarbeiterRolle = MitarbeiterRolle.MITARBEITER;
    }

    public Mitarbeiter(String vorname, String nachname, double gehalt) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.gehalt = gehalt;
        this.mitarbeiterRolle = MitarbeiterRolle.MITARBEITER;
    }

    public String getVollerName(){
        String vollerName = vorname + " " + nachname;
        return vollerName;
    }

    public String getVorname(){
        return this.vorname;
    }

    public String getNachname(){
        return this.nachname;
    }

    public void setVorname(String vorname){
        this.vorname = vorname;
    }

    public void setNachname(String nachname){
        this.nachname = nachname;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public void berechneGehalt(float stunden){
        System.out.println("Das Gehalt des Mitarbeiters beträgt " + (this.gehalt*stunden) + ".");
    }

    public void mitarbeiterEntlassen(){
       this.vorname = "";
       this.nachname = "";
       this.gehalt = 0;
       this.mitarbeiterRolle = null;
       System.gc();

    }
}
