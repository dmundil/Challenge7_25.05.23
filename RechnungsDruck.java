
public class RechnungsDruck {
	
    public static void druckeSeitenKopf(int seite){
        System.out.println("Seite: "+ seite);
    }
    public static void druckeRechnungskopf(Kunde kunde, int bestellNr){
        String kd_nr = kunde.getKundenNr();
        String kd_name = kunde.getName();
        String adresse = kunde.getStrasse();
        String ort = kunde.getOrt();
        String plz = kunde.getOrt();
        
        System.out.println("Kundennummer: "+ kd_nr);
        System.out.println("Kundenname: "+ kd_name);
        System.out.println("Adresse: "+adresse+", "+plz+" "+ort);
        
    }


    public static double rechnungsausgabe(Kunde kunde) {
        
        double gesamtBetrag = 0.0;
        // hier kommt noch etwas
        return gesamtBetrag;
        
    }
}
 class Artikel {
 // hier kommt noch etwas
    String ArtikelNr;
    String Bezeichnung;

   public Artikel (String ArtikelNr, String Bezeichnung){
        this.ArtikelNr = ArtikelNr;
        this.Bezeichnung = Bezeichnung;
    }

    public String getArtikelNr() {
        return this.ArtikelNr;
    }

    public void setArtikelNr(String ArtikelNr) {
        this.ArtikelNr = ArtikelNr;
    }

    public String getBezeichnung() {
        return this.Bezeichnung;
    }

    public void setBezeichnung(String Bezeichnung) {
        this.Bezeichnung = Bezeichnung;
    }
}

class Bestelltposition {
 // hier kommt noch etwas
    Artikel artikel;
    String BestellNr;
    int PosNr;
    double EinzelPreis;
    int Menge;

    public Bestelltposition( String BestellNr, int PosNr,Artikel artikel, double EinzelPreis, int Menge) {
        this.artikel = artikel;
        this.BestellNr = BestellNr;
        this.PosNr = PosNr;
        this.EinzelPreis = EinzelPreis;
        this.Menge = Menge;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public String getBestellNr() {
        return BestellNr;
    }

    public int getPosNr() {
        return PosNr;
    }

    public double getEinzelPreis() {
        return EinzelPreis;
    }

    public int getMenge() {
        return Menge;
    }
    
}
 class Bestellung {
 public Bestellung(String bestellNr, String bestellDatum, Rechnung rechnung, Bestelltposition[] bestelltpositions) {
        BestellNr = bestellNr;
        BestellDatum = bestellDatum;
        Rechnung = rechnung;
        this.bestelltpositions = bestelltpositions;
    }
    // hier kommt noch etwas
    String BestellNr;
    String BestellDatum;
    Rechnung Rechnung;
    Bestelltposition[] bestelltpositions;
    public String getBestellNr() {
        return BestellNr;
    }
    public String getBestellDatum() {
        return BestellDatum;
    }
    public Rechnung getRechnung() {
        return Rechnung;
    }
    public Bestelltposition[] getBestelltpositions() {
        return bestelltpositions;
    }
    
}
 class Kunde {
 public Kunde(String kundenNr, String name, String strasse, String pLZ, String ort, Bestellung[] bestellungen,
            double rabatt) {
        KundenNr = kundenNr;
        Name = name;
        Strasse = strasse;
        PLZ = pLZ;
        Ort = ort;
        Bestellungen = bestellungen;
        Rabatt = rabatt;
    }
    // hier kommt noch etwas
    String KundenNr;
    String Name;
    String Strasse;
    String PLZ;
    String Ort;
    Bestellung[] Bestellungen;
    double Rabatt;
    public String getKundenNr() {
        return KundenNr;
    }
    public String getName() {
        return Name;
    }
    public String getStrasse() {
        return Strasse;
    }
    public String getPLZ() {
        return PLZ;
    }
    public String getOrt() {
        return Ort;
    }
    public Bestellung[] getBestellungen() {
        return Bestellungen;
    }
    public double getRabatt() {
        return Rabatt;
    }
}
 class Rechnung {
 
    // hier kommt noch etwas
    String RechnungsNr;
    String RechnungsDatum;
    public Rechnung(String rechnungsNr, String rechnungsDatum) {
        RechnungsNr = rechnungsNr;
        RechnungsDatum = rechnungsDatum;
    }
    public String getRechnungsNr() {
        return RechnungsNr;
    }
    public String getRechnungsDatum() {
        return RechnungsDatum;
    }
}
