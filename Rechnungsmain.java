public class Rechnungsmain {
    public static void main(String[] args) {
        Artikel a1 = new Artikel("A1", "T-Shirt");
Artikel a2 = new Artikel("A2", "Jeans");
Artikel a3 = new Artikel("A3", "Hoodie");

Bestelltposition bp1 = new Bestelltposition("B1", 1, a1, 20.0, 2);
Bestelltposition bp2 = new Bestelltposition("B1", 2, a2, 50.0, 1);
Bestelltposition[] bps1 = {bp1, bp2};
Bestellung b1 = new Bestellung("B1", "2023-05-14", new Rechnung("R1", "2023-05-14"), bps1);

Bestelltposition bp3 = new Bestelltposition("B2", 1, a3, 30.0, 1);
Bestelltposition[] bps2 = {bp3};
Bestellung b2 = new Bestellung("B2", "2023-05-13", new Rechnung("R2", "2023-05-13"), bps2);

Bestelltposition bp4 = new Bestelltposition("B3", 1, a1, 20.0, 1);
Bestelltposition bp5 = new Bestelltposition("B3", 2, a2, 50.0, 2);
Bestelltposition[] bps3 = {bp4, bp5};
Bestellung b3 = new Bestellung("B3", "2023-05-12", new Rechnung("R3", "2023-05-12"), bps3);

Bestelltposition bp6 = new Bestelltposition("B4", 1, a3, 30.0, 2);
Bestelltposition[] bps4 = {bp6};
Bestellung b4 = new Bestellung("B4", "2023-05-11", new Rechnung("R4", "2023-05-11"), bps4);

Bestelltposition bp7 = new Bestelltposition("B5", 1, a1, 20.0, 3);
Bestelltposition bp8 = new Bestelltposition("B5", 2, a2, 50.0, 1);
Bestelltposition[] bps5 = {bp7, bp8};
Bestellung b5 = new Bestellung("B5", "2023-05-10", new Rechnung("R5", "2023-05-10"), bps5);

Bestelltposition bp9 = new Bestelltposition("B6", 1, a3, 30.0, 3);
Bestelltposition[] bps6 = {bp9};
Bestellung b6 = new Bestellung("B6", "2023-05-09", new Rechnung("R6", "2023-05-09"), bps6);

Bestellung[] bestellungen1 = {b1, b2, b3};
Kunde kunde1 = new Kunde("K1", "Max Mustermann", "Musterstraße 1", "12345", "Musterstadt", bestellungen1, 0.1);

Bestellung[] bestellungen2 = {b4, b5, b6};
Kunde kunde2 = new Kunde("K2", "Erika Musterfrau", "Musterweg 2", "54321", "Musterort", bestellungen2, 0.05);

RechnungsDruck.rechnungsausgabe(kunde1);
    }
}
